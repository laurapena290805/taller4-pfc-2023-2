package taller4

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class test3SumMatriz extends AnyFunSuite{
  val obj = new Matrices()
  test("Prueba 1"){
    val m1: obj.Matriz = Vector(Vector(0, 0), Vector(1, 1))
    val m2: obj.Matriz = Vector(Vector(0, 1), Vector(0, 0))
    val result: obj.Matriz = obj.sumMatriz(m1, m2)
    assert(result == Vector(Vector(0, 1), Vector(1, 1)))
  }

  test("Prueba 2"){
    val m1: obj.Matriz = Vector(Vector(0, 0, 0, 0), Vector(0, 0, 0, 0), Vector(0, 0, 1, 1), Vector(0, 1, 1, 0))
    val m2: obj.Matriz = Vector(Vector(1, 0, 0, 0), Vector(1, 0, 1, 1), Vector(0, 0, 0, 0), Vector(1, 0, 0, 1))
    val result: obj.Matriz = obj.sumMatriz(m1, m2)
    assert(result == Vector(Vector(1, 0, 0, 0), Vector(1, 0, 1, 1), Vector(0, 0, 1, 1), Vector(1, 1, 1, 1)))
  }

  test("Prueba 3"){
    val m1: obj.Matriz = Vector(Vector(0, 0, 1, 0, 0, 1, 0, 0), Vector(1, 1, 0, 0, 0, 1, 0, 0), Vector(0, 1, 0, 0, 1, 1, 0, 0), Vector(1, 0, 0, 0, 1, 1, 1, 0), Vector(0, 1, 1, 0, 1, 0, 1, 0), Vector(0, 0, 1, 0, 1, 0, 0, 0), Vector(0, 1, 1, 1, 0, 1, 1, 1), Vector(0, 0, 0, 1, 0, 0, 0, 0))
    val m2: obj.Matriz = Vector(Vector(1, 1, 0, 0, 0, 1, 1, 0), Vector(0, 1, 0, 1, 0, 0, 1, 1), Vector(0, 1, 1, 0, 0, 1, 1, 1), Vector(0, 0, 0, 0, 0, 0, 1, 1), Vector(0, 0, 0, 1, 0, 0, 0, 0), Vector(1, 0, 1, 0, 1, 0, 0, 1), Vector(1, 0, 1, 0, 0, 1, 1, 1), Vector(0, 0, 0, 0, 1, 1, 0, 1))
    val result: obj.Matriz = obj.sumMatriz(m1, m2)
    assert(result == Vector(Vector(1, 1, 1, 0, 0, 2, 1, 0), Vector(1, 2, 0, 1, 0, 1, 1, 1), Vector(0, 2, 1, 0, 1, 2, 1, 1), Vector(1, 0, 0, 0, 1, 1, 2, 1), Vector(0, 1, 1, 1, 1, 0, 1, 0), Vector(1, 0, 2, 0, 2, 0, 0, 1), Vector(1, 1, 2, 1, 0, 2, 2, 2), Vector(0, 0, 0, 1, 1, 1, 0, 1)))
  }

  test("Prueba 4"){
    val m1: obj.Matriz = Vector(Vector(0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0), Vector(1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1), Vector(1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0), Vector(1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0), Vector(1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1), Vector(0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0), Vector(0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0), Vector(0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1), Vector(0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1), Vector(0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0), Vector(0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1), Vector(1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0), Vector(0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1), Vector(0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1), Vector(0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0), Vector(0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0))
    val m2: obj.Matriz = Vector(Vector(0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0), Vector(0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0), Vector(0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0), Vector(1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0), Vector(0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1), Vector(0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0), Vector(1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1), Vector(0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1), Vector(1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1), Vector(0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1), Vector(1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0), Vector(1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0), Vector(0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0), Vector(1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1), Vector(0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1), Vector(0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1))
    val result: obj.Matriz = obj.sumMatriz(m1, m2)
    assert(result == Vector(Vector(0, 0, 2, 1, 1, 2, 2, 2, 1, 0, 1, 1, 2, 2, 0, 0), Vector(1, 2, 0, 2, 1, 2, 2, 2, 1, 1, 2, 0, 0, 0, 1, 1), Vector(1, 2, 0, 2, 0, 1, 2, 1, 1, 0, 0, 0, 1, 2, 2, 0), Vector(2, 1, 0, 1, 1, 0, 2, 1, 1, 1, 2, 2, 1, 0, 0, 0), Vector(1, 1, 2, 1, 1, 1, 0, 1, 2, 0, 1, 1, 1, 1, 1, 2), Vector(0, 1, 2, 2, 0, 1, 1, 0, 1, 2, 1, 1, 2, 0, 1, 0), Vector(1, 2, 1, 1, 0, 0, 2, 2, 2, 0, 1, 2, 1, 2, 2, 1), Vector(0, 0, 1, 0, 0, 1, 1, 2, 1, 0, 2, 2, 1, 0, 1, 2), Vector(1, 1, 0, 0, 1, 1, 0, 1, 0, 2, 2, 1, 2, 1, 2, 2), Vector(0, 0, 1, 0, 0, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 1), Vector(1, 0, 0, 0, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 1), Vector(2, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0), Vector(0, 2, 0, 0, 0, 1, 2, 2, 0, 1, 2, 1, 1, 1, 1, 1), Vector(1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 0, 1, 1, 1, 2), Vector(0, 1, 1, 2, 1, 1, 0, 1, 0, 1, 2, 1, 2, 1, 2, 1), Vector(0, 1, 1, 2, 2, 2, 0, 2, 1, 0, 1, 0, 0, 0, 2, 1)))
  }
}
