package taller4

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class test1MultMatriz extends AnyFunSuite {
  val obj = new Matrices()
  test("Prueba 1") {
    val m1: obj.Matriz = Vector(Vector(0, 1), Vector(0, 0))
    val m2: obj.Matriz = Vector(Vector(1, 0), Vector(0, 0))
    val result: obj.Matriz = obj.multMatriz(m1, m2)
    assert(result == Vector(Vector(0,0), Vector(0,0)))
  }

  test("Prueba 2") {
    val m1: obj.Matriz = Vector(Vector(1, 0, 0, 0), Vector(1, 1, 1, 1), Vector(1, 1, 0, 1), Vector(0, 1, 0, 0))
    val m2: obj.Matriz = Vector(Vector(1, 0, 1, 1), Vector(0, 0, 0, 1), Vector(0, 0, 1, 0), Vector(1, 0, 0, 0))
    val result: obj.Matriz = obj.multMatriz(m1, m2)
    assert(result == Vector(Vector(1, 0, 1, 1), Vector(2, 0, 2, 2), Vector(2, 0, 1, 2), Vector(0, 0, 0, 1)))
  }

  test("Prueba 3"){
    val m1: obj.Matriz = Vector(Vector(0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1), Vector(0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1), Vector(0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0), Vector(1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0), Vector(0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0), Vector(0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1), Vector(0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1), Vector(0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1), Vector(1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1), Vector(1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1), Vector(1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0), Vector(0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0), Vector(0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0), Vector(0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1), Vector(0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0), Vector(0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1))
    val m2: obj.Matriz = Vector(Vector(1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0), Vector(0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1), Vector(1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1), Vector(1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0), Vector(0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1), Vector(1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1), Vector(1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1), Vector(0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1), Vector(0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0), Vector(0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1), Vector(0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1), Vector(0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1), Vector(0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1), Vector(0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1), Vector(1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0), Vector(1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0))
    val result: obj.Matriz = obj.multMatriz(m1, m2)
    assert(result == Vector(Vector(3, 3, 3, 2, 5, 2, 2, 3, 3, 1, 2, 4, 3, 0, 3, 3), Vector(4, 3, 3, 2, 4, 4, 3, 6, 2, 2, 3, 2, 1, 3, 4, 3), Vector(3, 6, 5, 1, 7, 3, 5, 5, 5, 1, 5, 6, 3, 1, 3, 6), Vector(6, 5, 6, 3, 7, 5, 5, 5, 9, 5, 7, 6, 6, 4, 6, 7), Vector(2, 2, 3, 2, 5, 3, 3, 4, 4, 4, 3, 4, 3, 3, 2, 5), Vector(3, 4, 4, 1, 6, 3, 5, 3, 5, 4, 4, 6, 3, 1, 4, 5), Vector(5, 5, 4, 2, 7, 5, 5, 4, 5, 3, 4, 6, 4, 0, 3, 5), Vector(3, 3, 4, 2, 8, 5, 6, 8, 5, 4, 6, 6, 3, 3, 6, 7), Vector(5, 3, 5, 2, 8, 6, 7, 7, 5, 4, 5, 6, 4, 4, 6, 5), Vector(3, 4, 6, 1, 7, 3, 4, 5, 6, 2, 5, 6, 5, 3, 4, 6), Vector(1, 3, 2, 0, 4, 1, 3, 3, 2, 1, 4, 3, 2, 2, 1, 4), Vector(3, 4, 3, 1, 7, 5, 5, 6, 5, 2, 7, 5, 3, 2, 3, 6), Vector(4, 3, 3, 2, 5, 4, 3, 4, 7, 5, 6, 4, 3, 3, 4, 6), Vector(2, 5, 5, 1, 7, 3, 5, 6, 3, 1, 4, 6, 3, 2, 4, 5), Vector(3, 3, 3, 2, 7, 5, 5, 6, 4, 4, 5, 6, 3, 3, 4, 5), Vector(4, 4, 4, 2, 7, 5, 4, 6, 5, 2, 5, 5, 4, 1, 3, 6)))
  }

  test("Prueba 4"){
    val m1: obj.Matriz = Vector(Vector(0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1), Vector(1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0), Vector(1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1), Vector(0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1), Vector(0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0), Vector(1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1), Vector(1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0), Vector(0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0), Vector(1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1), Vector(0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1), Vector(1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1), Vector(1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1), Vector(0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1), Vector(1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1), Vector(0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1), Vector(0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0), Vector(0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1), Vector(0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0), Vector(1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0), Vector(0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0), Vector(1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0), Vector(1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0), Vector(1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1), Vector(0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0), Vector(0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0), Vector(0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0), Vector(1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0), Vector(0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1), Vector(0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0), Vector(0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0), Vector(0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1), Vector(1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0))
    val m2: obj.Matriz = Vector(Vector(0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0), Vector(0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0), Vector(1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1), Vector(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1), Vector(0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0), Vector(0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0), Vector(1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1), Vector(1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0), Vector(1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1), Vector(1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1), Vector(0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1), Vector(0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1), Vector(1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1), Vector(1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 0), Vector(0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1), Vector(0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0), Vector(1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1), Vector(0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0), Vector(0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0), Vector(1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0), Vector(0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0), Vector(0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1), Vector(0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0), Vector(1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0), Vector(0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1), Vector(1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1), Vector(1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1), Vector(1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0), Vector(1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0), Vector(1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1), Vector(0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1), Vector(0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0))
    val result: obj.Matriz = obj.multMatriz(m1, m2)
    assert(result == Vector(Vector(6, 7, 12, 9, 9, 9, 7, 7, 8, 8, 9, 8, 9, 7, 10, 6, 5, 7, 7, 6, 5, 9, 6, 8, 7, 6, 7, 6, 7, 10, 11, 8), Vector(8, 6, 10, 7, 4, 6, 8, 10, 8, 10, 8, 7, 9, 6, 8, 6, 8, 6, 8, 6, 6, 7, 7, 8, 7, 6, 7, 8, 8, 8, 11, 9), Vector(6, 10, 9, 7, 10, 7, 8, 7, 9, 10, 9, 10, 8, 8, 6, 6, 5, 6, 7, 7, 4, 12, 8, 8, 8, 6, 7, 7, 6, 8, 11, 5), Vector(5, 5, 7, 7, 5, 6, 7, 8, 4, 9, 6, 5, 9, 6, 9, 5, 4, 7, 6, 4, 5, 7, 6, 7, 6, 5, 5, 6, 6, 6, 8, 9), Vector(5, 5, 5, 4, 7, 5, 5, 5, 7, 7, 5, 8, 9, 7, 7, 4, 4, 5, 6, 5, 5, 7, 7, 4, 5, 4, 5, 4, 6, 6, 8, 6), Vector(8, 10, 10, 10, 8, 9, 8, 8, 9, 10, 11, 9, 10, 7, 9, 6, 6, 8, 10, 6, 9, 10, 8, 11, 11, 11, 11, 9, 8, 11, 10, 9), Vector(6, 9, 8, 5, 7, 6, 6, 6, 7, 9, 5, 8, 8, 7, 3, 4, 4, 6, 7, 6, 6, 8, 7, 6, 7, 6, 9, 6, 7, 6, 10, 6), Vector(5, 4, 5, 2, 4, 4, 3, 4, 5, 3, 3, 4, 4, 3, 2, 4, 3, 4, 2, 4, 2, 4, 2, 1, 3, 4, 3, 4, 3, 3, 3, 4), Vector(6, 10, 11, 11, 8, 9, 7, 8, 9, 9, 9, 8, 9, 6, 7, 8, 6, 9, 6, 5, 6, 9, 7, 10, 7, 5, 6, 10, 8, 6, 12, 8), Vector(6, 7, 8, 7, 8, 5, 6, 6, 10, 9, 7, 5, 5, 5, 5, 6, 7, 8, 8, 7, 5, 8, 9, 8, 7, 6, 5, 6, 5, 7, 10, 11), Vector(8, 9, 10, 10, 10, 8, 6, 11, 11, 13, 9, 10, 10, 8, 10, 7, 8, 9, 9, 9, 7, 13, 12, 13, 9, 8, 10, 10, 11, 13, 11, 9), Vector(5, 6, 9, 6, 7, 8, 9, 8, 10, 8, 10, 7, 6, 3, 6, 1, 7, 6, 7, 6, 6, 8, 7, 7, 9, 9, 10, 4, 6, 10, 7, 7), Vector(6, 6, 8, 4, 6, 6, 6, 6, 9, 9, 7, 8, 9, 7, 5, 5, 3, 6, 6, 5, 6, 8, 8, 6, 7, 9, 8, 6, 5, 6, 7, 8), Vector(6, 6, 6, 4, 8, 7, 6, 10, 10, 9, 6, 9, 7, 5, 6, 6, 6, 5, 6, 7, 7, 7, 6, 7, 5, 7, 6, 6, 8, 7, 8, 4), Vector(5, 3, 7, 5, 4, 5, 6, 9, 8, 7, 4, 6, 5, 3, 6, 5, 6, 6, 5, 6, 6, 5, 6, 7, 4, 7, 4, 3, 6, 5, 6, 6), Vector(8, 7, 11, 8, 10, 8, 9, 9, 9, 8, 8, 10, 11, 8, 11, 6, 9, 5, 10, 7, 5, 10, 7, 7, 7, 5, 9, 6, 10, 12, 11, 7), Vector(2, 1, 6, 5, 4, 6, 5, 8, 7, 4, 4, 5, 5, 3, 6, 4, 6, 6, 6, 6, 7, 6, 5, 6, 5, 7, 5, 4, 6, 6, 7, 6), Vector(7, 9, 11, 8, 7, 6, 6, 7, 8, 11, 7, 8, 10, 8, 9, 7, 5, 7, 8, 8, 5, 9, 9, 6, 9, 5, 7, 7, 7, 7, 12, 11), Vector(9, 6, 12, 7, 7, 8, 10, 10, 10, 10, 7, 9, 10, 6, 9, 4, 6, 7, 10, 6, 9, 8, 7, 9, 8, 9, 9, 7, 8, 10, 11, 8), Vector(11, 9, 10, 9, 9, 6, 6, 7, 8, 12, 7, 10, 13, 10, 9, 6, 7, 6, 9, 6, 5, 9, 10, 8, 9, 6, 9, 9, 11, 11, 11, 9), Vector(6, 9, 9, 8, 8, 8, 7, 7, 10, 8, 9, 8, 5, 4, 7, 6, 6, 7, 7, 7, 7, 9, 6, 8, 8, 5, 4, 7, 5, 7, 10, 5), Vector(8, 10, 11, 9, 11, 8, 8, 10, 9, 15, 10, 10, 11, 9, 9, 5, 7, 10, 9, 10, 8, 10, 10, 12, 7, 8, 10, 7, 9, 11, 13, 10), Vector(5, 5, 10, 7, 4, 9, 7, 10, 9, 5, 7, 8, 8, 5, 8, 7, 6, 8, 5, 6, 7, 9, 6, 7, 7, 9, 8, 7, 9, 8, 7, 5), Vector(5, 7, 7, 8, 9, 8, 7, 8, 6, 10, 5, 9, 9, 5, 7, 3, 6, 5, 7, 6, 9, 8, 7, 9, 8, 6, 8, 5, 6, 8, 9, 6), Vector(4, 4, 5, 3, 5, 2, 3, 5, 5, 6, 4, 5, 4, 5, 5, 4, 6, 4, 7, 6, 2, 6, 6, 5, 3, 3, 6, 3, 5, 8, 7, 6), Vector(7, 7, 11, 8, 8, 7, 8, 7, 8, 5, 8, 7, 7, 8, 8, 8, 7, 8, 8, 6, 6, 8, 6, 8, 9, 5, 6, 7, 8, 8, 11, 7), Vector(12, 11, 14, 10, 13, 11, 12, 12, 12, 13, 13, 13, 14, 11, 12, 8, 12, 9, 11, 10, 7, 13, 9, 10, 11, 10, 11, 10, 9, 15, 15, 12), Vector(9, 9, 9, 11, 7, 9, 6, 8, 7, 10, 7, 9, 9, 8, 9, 7, 6, 8, 10, 7, 8, 7, 6, 10, 7, 7, 8, 7, 9, 9, 11, 6), Vector(5, 5, 13, 9, 8, 12, 9, 7, 7, 6, 8, 9, 11, 8, 8, 6, 7, 8, 6, 5, 8, 11, 6, 10, 7, 8, 10, 8, 8, 11, 11, 6), Vector(8, 6, 7, 8, 6, 4, 6, 5, 7, 6, 7, 7, 7, 7, 5, 5, 7, 6, 9, 6, 5, 7, 7, 7, 7, 5, 6, 6, 8, 8, 10, 6), Vector(7, 5, 10, 7, 8, 8, 8, 7, 11, 8, 6, 8, 7, 3, 5, 5, 7, 6, 5, 7, 7, 7, 5, 7, 5, 9, 6, 7, 6, 6, 8, 6), Vector(7, 6, 7, 6, 7, 5, 8, 6, 8, 8, 8, 6, 5, 3, 7, 3, 7, 3, 6, 4, 4, 5, 4, 5, 6, 5, 5, 4, 4, 9, 6, 5)))
  }
}
