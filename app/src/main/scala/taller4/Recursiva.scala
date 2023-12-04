package taller4

class Recursiva {
  val obj = new Matrices()

  //1.2.1 Extrayendo submatrices 

  def subMatriz(m: obj.Matriz, i: Int, j: Int, l: Int): obj.Matriz = {
    Vector.tabulate(l, l)((x, y) => m(i + x)(j + y))
  }

  //1.2.2 Sumando matrices

  def sumMatriz(m1: obj.Matriz, m2: obj.Matriz): obj.Matriz = {
    val n: Int = m1.map(_ => 1).foldLeft(0)(_+_)
    Vector.tabulate(n, n)((i, j) => m1(i)(j) + m2(i)(j))
  }

  //1.2.3 Multiplicando matrices recursivamente, versión secuencial

  def multMatrizRec(m1: obj.Matriz, m2: obj.Matriz): obj.Matriz = {
    val n: Int = m1.map(_ => 1).foldLeft(0)(_+_)
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

  //1.2.4. Multiplicando matrices recursivamente, versión paralela
}
