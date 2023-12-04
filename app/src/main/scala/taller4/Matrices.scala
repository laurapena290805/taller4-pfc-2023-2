package taller4
import scala.util.Random

class Matrices {
  type Matriz = Vector[Vector[Int]]
  val random = new Random

  def matrizAlAzar(long: Int, vals: Int): Matriz = {
    val v = Vector.fill(long, long){random.nextInt(vals)}
    v
  }

  def vectorAlAzar(long: Int, vals: Int): Vector[Int] = {
    val v = Vector.fill(long){random.nextInt(vals)}
    v
  }

  def prodPunto(v1: Vector[Int], v2: Vector[Int]): Int = {
    (v1 zip v2).map({case (i,j) => (i*j)}).sum 
  }

  def transpuesta(m: Matriz): Matriz = {
    val l = m.length 
    Vector.tabulate(l, l)((i, j) => m(j)(i))
  }

  //1.1.1 Versión estándar secuencial 

  def multMatriz(m1: Matriz, m2: Matriz): Matriz = {
    val t_m2 = transpuesta(m2)
    val n = m1.length 
    Vector.tabulate(n, n)((i,j) => prodPunto(m1(i), t_m2(j)))
  }

  //1.1.2 Versión estándar paralela

  //1.2.1 Extrayendo submatrices 

  def subMatriz(m: Matriz, i: Int, j: Int, l: Int): Matriz = {
    Vector.tabulate(l, l)((x, y) => m(i + x)(j + y))
  }

  //1.2.2 Sumando matrices

  def sumMatriz(m1: Matriz, m2: Matriz): Matriz = {
    val n = m1.length
    Vector.tabulate(n, n)((i, j) => m1(i)(j) + m2(i)(j))
  }

  //1.2.3 Multiplicando matrices recursivamente, versión secuencial

  def multMatrizRec(m1: Matriz, m2:Matriz): Matriz = {
    val n = m1.length 
    val z = n/2
    n match {
      case 1 => Vector(Vector(m1(0)(0) * m2(0)(0)))
      case _ => {
        val m1_1 = subMatriz(m1, 0, 0, z)
        val m1_2 = subMatriz(m1, 0, z, z)
        val m1_3 = subMatriz(m1, z, 0, z)
        val m1_4 = subMatriz(m1, z, z, z)
        val m2_1 = subMatriz(m2, 0, 0, z)
        val m2_2 = subMatriz(m2, 0, z, z)
        val m2_3 = subMatriz(m2, z, 0, z)
        val m2_4 = subMatriz(m2, z, z, z)
        val suma_1 = sumMatriz(multMatrizRec(m1_1, m2_1), multMatrizRec(m1_2, m2_3))
        val suma_2 = sumMatriz(multMatrizRec(m1_1, m2_2), multMatrizRec(m1_2, m2_4))
        val suma_3 = sumMatriz(multMatrizRec(m1_3, m2_1), multMatrizRec(m1_4, m2_3))
        val suma_4 = sumMatriz(multMatrizRec(m1_3, m2_2), multMatrizRec(m1_4, m2_4))
        Vector.tabulate(n, n){ (i,j) =>
          if (i < z) {
            if (j < z) suma_1(i)(j) else suma_2(i)(j - z)
          } else {
            if (j < z) suma_3(i - z)(j) else suma_4(i - z)(j - z)
          }
        }
      }
    }
  }
}


 //Multiplicando matrices recursivamente, versión paralela