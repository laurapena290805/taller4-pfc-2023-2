package taller4;
import common.task

import scala.util.Random
import scala.collection.parallel.immutable.ParVector;
class Matrices {
  type Matriz = Vector[Vector[Int]];
  type MatrizPar = ParVector[ParVector[Int]];
  val random = new Random

  def matrizAlAzar(long: Int, vals: Int): Matriz = {
    val v = Vector.fill(long, long){random.nextInt(vals)}
    v
  }

  def matrizParAlAzar(long: Int, vals: Int): MatrizPar = {
    val v = ParVector.fill(long, long) {
      random.nextInt(vals)
    }
    v
  }
  def vectorAlAzar(long: Int, vals: Int): Vector[Int] = {
    val v = Vector.fill(long){random.nextInt(vals)}
    v
  }

  def prodPunto(v1: Vector[Int], v2: Vector[Int]): Int = {
    (v1 zip v2).map({case (i,j) => (i*j)}).sum 
  }

  def prodPuntoParD(v1: ParVector[Int], v2: ParVector[Int]): Int = {
    (v1 zip v2).map({case(i, j) => (i*j) }).sum
  }

  def transpuesta(m: Matriz): Matriz = {
    val l = m.length 
    Vector.tabulate(l, l)((i, j) => m(j)(i))
  }

  def transpuestaPar(m: Matriz): MatrizPar = {
    val l = m.length
    ParVector.tabulate(l, l)((i, j) => m(j)(i))
  }

  //1.1.1 Versión estándar secuencial 

  def multMatriz(m1: Matriz, m2: Matriz): Matriz = {
    val t_m2 = transpuesta(m2)
    val n = m1.length 
    Vector.tabulate(n, n)((i,j) => prodPunto(m1(i), t_m2(j)))
  }

  def multMatrizPar(m1: Matriz, m2:Matriz): Matriz = {
    val t_m2 = transpuesta(m2)
    val n = m1.length
    val m=Vector.tabulate(n, n){
      (i, j) => task{
        prodPunto(m1(i), t_m2(j))
      }
    }
    Vector.tabulate(n,n){
      (i,j)=>m(i)(j).join()}
  }

  //1.2.1 Extrayendo submatrices 

  def subMatriz(m: Matriz, i: Int, j: Int, l: Int): Matriz = {
    Vector.tabulate(l, l)((x, y) => m(i + x)(j + y))
  }

  //1.2.2 Sumando matrices

  def sumMatriz(m1: Matriz, m2: Matriz): Matriz = {
    val n = m1.length
    Vector.tabulate(n, n)((i, j) => m1(i)(j) + m2(i)(j))
  }


}

