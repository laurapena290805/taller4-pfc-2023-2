package taller4
import common.{parallel, task}
class Strassen {
  val obj = new Matrices()
  val obj1 = new Recursiva()

  //1.3.1. Restando matrices

  def restaMatriz(m1: obj.Matriz, m2: obj.Matriz): obj.Matriz ={
    val n: Int = m1.map(_ => 1).foldLeft(0)(_+_)
    Vector.tabulate(n, n)((i, j) => m1(i)(j) - m2(i)(j))
  }

  //1.3.2. Algoritmo de Strassen, versión secuencial

  def multStrassen(m1: obj.Matriz, m2: obj.Matriz): obj.Matriz ={
    val n: Int = m1.map(_ => 1).foldLeft(0)(_+_)
    val z = n/2
    n match {
      case 1 => Vector(Vector(m1(0)(0) * m2(0)(0)))
      case _ => {
        val m1_1 = obj1.subMatriz(m1, 0, 0, z)
        val m1_2 = obj1.subMatriz(m1, 0, z, z)
        val m1_3 = obj1.subMatriz(m1, z, 0, z)
        val m1_4 = obj1.subMatriz(m1, z, z, z)
        val m2_1 = obj1.subMatriz(m2, 0, 0, z)
        val m2_2 = obj1.subMatriz(m2, 0, z, z)
        val m2_3 = obj1.subMatriz(m2, z, 0, z)
        val m2_4 = obj1.subMatriz(m2, z, z, z)

        val p_1 = multStrassen(m1_1, restaMatriz(m2_2, m2_4))
        val p_2 = multStrassen(obj1.sumMatriz(m1_1, m1_2), m2_4)
        val p_3 = multStrassen(obj1.sumMatriz(m1_3, m1_4), m2_1)
        val p_4 = multStrassen(m1_4, restaMatriz(m2_3, m2_1))
        val p_5 = multStrassen(obj1.sumMatriz(m1_1, m1_4), obj1.sumMatriz(m2_1, m2_4))
        val p_6 = multStrassen(restaMatriz(m1_2, m1_4), obj1.sumMatriz(m2_3, m2_4))
        val p_7 = multStrassen(restaMatriz(m1_1, m1_3), obj1.sumMatriz(m2_1, m2_2))

        val c_1 = obj1.sumMatriz(restaMatriz(obj1.sumMatriz(p_5, p_4), p_2), p_6)
        val c_2 = obj1.sumMatriz(p_1, p_2)
        val c_3 = obj1.sumMatriz(p_3, p_4)
        val c_4 = restaMatriz(restaMatriz(obj1.sumMatriz(p_5, p_1), p_3), p_7)

        Vector.tabulate(n, n){ (i,j) =>
          if (i < z) {
            if (j < z) c_1(i)(j) else c_2(i)(j - z)
          } else {
            if (j < z) c_3(i - z)(j) else c_4(i - z)(j - z)
          }
        }
      }
    }
  }

  //Algoritmo de Strassen, version paralela

  def multStrassenPar(m1: obj.Matriz, m2: obj.Matriz): obj.Matriz = {
    val n: Int = m1.map(_ => 1).foldLeft(0)(_ + _)
    val z = n / 2
    n match {
      case 1 => Vector(Vector(m1(0)(0) * m2(0)(0)))
      case _ => {
        val m1_1 = obj1.subMatriz(m1, 0, 0, z)
        val m1_2 = obj1.subMatriz(m1, 0, z, z)
        val m1_3 = obj1.subMatriz(m1, z, 0, z)
        val m1_4 = obj1.subMatriz(m1, z, z, z)
        val m2_1 = obj1.subMatriz(m2, 0, 0, z)
        val m2_2 = obj1.subMatriz(m2, 0, z, z)
        val m2_3 = obj1.subMatriz(m2, z, 0, z)
        val m2_4 = obj1.subMatriz(m2, z, z, z)

        val p_1 = multStrassenPar(m1_1, restaMatriz(m2_2, m2_4))
        val p_2 = multStrassenPar(obj1.sumMatriz(m1_1, m1_2), m2_4)
        val p_3 = multStrassenPar(obj1.sumMatriz(m1_3, m1_4), m2_1)
        val p_4 = multStrassenPar(m1_4, restaMatriz(m2_3, m2_1))
        val p_5 = multStrassenPar(obj1.sumMatriz(m1_1, m1_4), obj1.sumMatriz(m2_1, m2_4))
        val p_6 = multStrassenPar(restaMatriz(m1_2, m1_4), obj1.sumMatriz(m2_3, m2_4))
        val p_7 = multStrassenPar(restaMatriz(m1_1, m1_3), obj1.sumMatriz(m2_1, m2_2))

        val (p1,p2,p3,p4) = parallel(obj1.sumMatriz(restaMatriz(obj1.sumMatriz(p_5, p_4), p_2), p_6),
        obj1.sumMatriz(p_1, p_2),
        obj1.sumMatriz(p_3, p_4),
        restaMatriz(restaMatriz(obj1.sumMatriz(p_5, p_1), p_3), p_7))

        Vector.tabulate(n, n) { (i, j) =>
          if (i < z) {
            if (j < z) p1(i)(j) else p2(i)(j - z)
          } else {
            if (j < z) p3(i - z)(j) else p4(i - z)(j - z)
          }
        }

      }
    }

    }
}
