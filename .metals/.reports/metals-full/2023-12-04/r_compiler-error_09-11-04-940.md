file:///C:/Users/usuario/OneDrive/Escritorio/PROGRAMACION%20FUNCIONAL/taller4-pfc-2023-2/app/src/test/scala/taller4/test6MultStrassen.scala
### java.lang.AssertionError: assertion failed: denotation object language invalid in run 3. ValidFor: Period(1..2, run = 4)

occurred in the presentation compiler.

action parameters:
uri: file:///C:/Users/usuario/OneDrive/Escritorio/PROGRAMACION%20FUNCIONAL/taller4-pfc-2023-2/app/src/test/scala/taller4/test6MultStrassen.scala
text:
```scala
package taller4

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class test6MultStrassen extends AnyFunSuite{
    val obj = new Matrices()
    val obj1 = new Strassen()

    test("Prueba 1"){
        val m1: obj.Matriz = Vector(Vector(0, 1), Vector(0, 0))
        val m2: obj.Matriz = Vector(Vector(1, 0), Vector(0, 0))
        val result: obj.Matriz = obj1.multStrassen(m1, m2)
        assert(result == Vector(Vector(0,0), Vector(0,0)))
    }

    test("Prueba 2"){
        val m1: obj.Matriz = Vector(Vector(1, 0, 0, 0), Vector(1, 1, 1, 1), Vector(1, 1, 0, 1), Vector(0, 1, 0, 0))
        val m2: obj.Matriz = Vector(Vector(1, 0, 1, 1), Vector(0, 0, 0, 1), Vector(0, 0, 1, 0), Vector(1, 0, 0, 0))
        val result: obj.Matriz = obj1.multStrassen(m1, m2)
        assert(result == Vector(Vector(1, 0, 1, 1), Vector(2, 0, 2, 2), Vector(2, 0, 1, 2), Vector(0, 0, 0, 1)))
    }

    test("Prueba 3"){
        val m1: obj.Matriz = Vector(Vector(0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1), Vector(0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1), Vector(0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0), Vector(1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0), Vector(0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0), Vector(0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1), Vector(0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1), Vector(0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1), Vector(1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1), Vector(1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1), Vector(1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0), Vector(0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0), Vector(0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0), Vector(0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1), Vector(0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0), Vector(0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1))
        val m2: obj.Matriz = Vector(Vector(1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0), Vector(0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1), Vector(1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1), Vector(1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0), Vector(0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1), Vector(1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1), Vector(1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1), Vector(0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1), Vector(0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0), Vector(0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1), Vector(0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1), Vector(0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1), Vector(0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1), Vector(0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1), Vector(1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0), Vector(1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0))
        val result: obj.Matriz = obj1.multStrassen(m1, m2)
        assert(result == Vector(Vector(3, 3, 3, 2, 5, 2, 2, 3, 3, 1, 2, 4, 3, 0, 3, 3), Vector(4, 3, 3, 2, 4, 4, 3, 6, 2, 2, 3, 2, 1, 3, 4, 3), Vector(3, 6, 5, 1, 7, 3, 5, 5, 5, 1, 5, 6, 3, 1, 3, 6), Vector(6, 5, 6, 3, 7, 5, 5, 5, 9, 5, 7, 6, 6, 4, 6, 7), Vector(2, 2, 3, 2, 5, 3, 3, 4, 4, 4, 3, 4, 3, 3, 2, 5), Vector(3, 4, 4, 1, 6, 3, 5, 3, 5, 4, 4, 6, 3, 1, 4, 5), Vector(5, 5, 4, 2, 7, 5, 5, 4, 5, 3, 4, 6, 4, 0, 3, 5), Vector(3, 3, 4, 2, 8, 5, 6, 8, 5, 4, 6, 6, 3, 3, 6, 7), Vector(5, 3, 5, 2, 8, 6, 7, 7, 5, 4, 5, 6, 4, 4, 6, 5), Vector(3, 4, 6, 1, 7, 3, 4, 5, 6, 2, 5, 6, 5, 3, 4, 6), Vector(1, 3, 2, 0, 4, 1, 3, 3, 2, 1, 4, 3, 2, 2, 1, 4), Vector(3, 4, 3, 1, 7, 5, 5, 6, 5, 2, 7, 5, 3, 2, 3, 6), Vector(4, 3, 3, 2, 5, 4, 3, 4, 7, 5, 6, 4, 3, 3, 4, 6), Vector(2, 5, 5, 1, 7, 3, 5, 6, 3, 1, 4, 6, 3, 2, 4, 5), Vector(3, 3, 3, 2, 7, 5, 5, 6, 4, 4, 5, 6, 3, 3, 4, 5), Vector(4, 4, 4, 2, 7, 5, 4, 6, 5, 2, 5, 5, 4, 1, 3, 6)))
    }

    test("Prueba 4"){
        val m1: obj.Matriz = Vector(Vector(0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1), Vector(1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0), Vector(1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1), Vector(0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1), Vector(0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0), Vector(1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1), Vector(1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0), Vector(0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0), Vector(1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1), Vector(0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1), Vector(1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1), Vector(1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1), Vector(0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1), Vector(1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1), Vector(0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1), Vector(0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0), Vector(0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1), Vector(0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0), Vector(1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0), Vector(0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0), Vector(1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0), Vector(1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0), Vector(1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1), Vector(0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0), Vector(0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0), Vector(0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0), Vector(1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0), Vector(0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1), Vector(0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0), Vector(0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0), Vector(0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1), Vector(1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0))
        val m2: obj.Matriz = Vector(Vector(0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0), Vector(0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0), Vector(1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1), Vector(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1), Vector(0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0), Vector(0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0), Vector(1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1), Vector(1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0), Vector(1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1), Vector(1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1), Vector(0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1), Vector(0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1), Vector(1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1), Vector(1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 0), Vector(0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1), Vector(0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0), Vector(1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1), Vector(0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0), Vector(0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0), Vector(1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0), Vector(0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0), Vector(0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1), Vector(0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0), Vector(1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0), Vector(0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1), Vector(1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1), Vector(1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1), Vector(1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0), Vector(1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0), Vector(1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1), Vector(0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1), Vector(0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0))
        val result: obj.Matriz = obj1.multStrassen(m1, m2)
        assert(result == Vector(Vector(6, 7, 12, 9, 9, 9, 7, 7, 8, 8, 9, 8, 9, 7, 10, 6, 5, 7, 7, 6, 5, 9, 6, 8, 7, 6, 7, 6, 7, 10, 11, 8), Vector(8, 6, 10, 7, 4, 6, 8, 10, 8, 10, 8, 7, 9, 6, 8, 6, 8, 6, 8, 6, 6, 7, 7, 8, 7, 6, 7, 8, 8, 8, 11, 9), Vector(6, 10, 9, 7, 10, 7, 8, 7, 9, 10, 9, 10, 8, 8, 6, 6, 5, 6, 7, 7, 4, 12, 8, 8, 8, 6, 7, 7, 6, 8, 11, 5), Vector(5, 5, 7, 7, 5, 6, 7, 8, 4, 9, 6, 5, 9, 6, 9, 5, 4, 7, 6, 4, 5, 7, 6, 7, 6, 5, 5, 6, 6, 6, 8, 9), Vector(5, 5, 5, 4, 7, 5, 5, 5, 7, 7, 5, 8, 9, 7, 7, 4, 4, 5, 6, 5, 5, 7, 7, 4, 5, 4, 5, 4, 6, 6, 8, 6), Vector(8, 10, 10, 10, 8, 9, 8, 8, 9, 10, 11, 9, 10, 7, 9, 6, 6, 8, 10, 6, 9, 10, 8, 11, 11, 11, 11, 9, 8, 11, 10, 9), Vector(6, 9, 8, 5, 7, 6, 6, 6, 7, 9, 5, 8, 8, 7, 3, 4, 4, 6, 7, 6, 6, 8, 7, 6, 7, 6, 9, 6, 7, 6, 10, 6), Vector(5, 4, 5, 2, 4, 4, 3, 4, 5, 3, 3, 4, 4, 3, 2, 4, 3, 4, 2, 4, 2, 4, 2, 1, 3, 4, 3, 4, 3, 3, 3, 4), Vector(6, 10, 11, 11, 8, 9, 7, 8, 9, 9, 9, 8, 9, 6, 7, 8, 6, 9, 6, 5, 6, 9, 7, 10, 7, 5, 6, 10, 8, 6, 12, 8), Vector(6, 7, 8, 7, 8, 5, 6, 6, 10, 9, 7, 5, 5, 5, 5, 6, 7, 8, 8, 7, 5, 8, 9, 8, 7, 6, 5, 6, 5, 7, 10, 11), Vector(8, 9, 10, 10, 10, 8, 6, 11, 11, 13, 9, 10, 10, 8, 10, 7, 8, 9, 9, 9, 7, 13, 12, 13, 9, 8, 10, 10, 11, 13, 11, 9), Vector(5, 6, 9, 6, 7, 8, 9, 8, 10, 8, 10, 7, 6, 3, 6, 1, 7, 6, 7, 6, 6, 8, 7, 7, 9, 9, 10, 4, 6, 10, 7, 7), Vector(6, 6, 8, 4, 6, 6, 6, 6, 9, 9, 7, 8, 9, 7, 5, 5, 3, 6, 6, 5, 6, 8, 8, 6, 7, 9, 8, 6, 5, 6, 7, 8), Vector(6, 6, 6, 4, 8, 7, 6, 10, 10, 9, 6, 9, 7, 5, 6, 6, 6, 5, 6, 7, 7, 7, 6, 7, 5, 7, 6, 6, 8, 7, 8, 4), Vector(5, 3, 7, 5, 4, 5, 6, 9, 8, 7, 4, 6, 5, 3, 6, 5, 6, 6, 5, 6, 6, 5, 6, 7, 4, 7, 4, 3, 6, 5, 6, 6), Vector(8, 7, 11, 8, 10, 8, 9, 9, 9, 8, 8, 10, 11, 8, 11, 6, 9, 5, 10, 7, 5, 10, 7, 7, 7, 5, 9, 6, 10, 12, 11, 7), Vector(2, 1, 6, 5, 4, 6, 5, 8, 7, 4, 4, 5, 5, 3, 6, 4, 6, 6, 6, 6, 7, 6, 5, 6, 5, 7, 5, 4, 6, 6, 7, 6), Vector(7, 9, 11, 8, 7, 6, 6, 7, 8, 11, 7, 8, 10, 8, 9, 7, 5, 7, 8, 8, 5, 9, 9, 6, 9, 5, 7, 7, 7, 7, 12, 11), Vector(9, 6, 12, 7, 7, 8, 10, 10, 10, 10, 7, 9, 10, 6, 9, 4, 6, 7, 10, 6, 9, 8, 7, 9, 8, 9, 9, 7, 8, 10, 11, 8), Vector(11, 9, 10, 9, 9, 6, 6, 7, 8, 12, 7, 10, 13, 10, 9, 6, 7, 6, 9, 6, 5, 9, 10, 8, 9, 6, 9, 9, 11, 11, 11, 9), Vector(6, 9, 9, 8, 8, 8, 7, 7, 10, 8, 9, 8, 5, 4, 7, 6, 6, 7, 7, 7, 7, 9, 6, 8, 8, 5, 4, 7, 5, 7, 10, 5), Vector(8, 10, 11, 9, 11, 8, 8, 10, 9, 15, 10, 10, 11, 9, 9, 5, 7, 10, 9, 10, 8, 10, 10, 12, 7, 8, 10, 7, 9, 11, 13, 10), Vector(5, 5, 10, 7, 4, 9, 7, 10, 9, 5, 7, 8, 8, 5, 8, 7, 6, 8, 5, 6, 7, 9, 6, 7, 7, 9, 8, 7, 9, 8, 7, 5), Vector(5, 7, 7, 8, 9, 8, 7, 8, 6, 10, 5, 9, 9, 5, 7, 3, 6, 5, 7, 6, 9, 8, 7, 9, 8, 6, 8, 5, 6, 8, 9, 6), Vector(4, 4, 5, 3, 5, 2, 3, 5, 5, 6, 4, 5, 4, 5, 5, 4, 6, 4, 7, 6, 2, 6, 6, 5, 3, 3, 6, 3, 5, 8, 7, 6), Vector(7, 7, 11, 8, 8, 7, 8, 7, 8, 5, 8, 7, 7, 8, 8, 8, 7, 8, 8, 6, 6, 8, 6, 8, 9, 5, 6, 7, 8, 8, 11, 7), Vector(12, 11, 14, 10, 13, 11, 12, 12, 12, 13, 13, 13, 14, 11, 12, 8, 12, 9, 11, 10, 7, 13, 9, 10, 11, 10, 11, 10, 9, 15, 15, 12), Vector(9, 9, 9, 11, 7, 9, 6, 8, 7, 10, 7, 9, 9, 8, 9, 7, 6, 8, 10, 7, 8, 7, 6, 10, 7, 7, 8, 7, 9, 9, 11, 6), Vector(5, 5, 13, 9, 8, 12, 9, 7, 7, 6, 8, 9, 11, 8, 8, 6, 7, 8, 6, 5, 8, 11, 6, 10, 7, 8, 10, 8, 8, 11, 11, 6), Vector(8, 6, 7, 8, 6, 4, 6, 5, 7, 6, 7, 7, 7, 7, 5, 5, 7, 6, 9, 6, 5, 7, 7, 7, 7, 5, 6, 6, 8, 8, 10, 6), Vector(7, 5, 10, 7, 8, 8, 8, 7, 11, 8, 6, 8, 7, 3, 5, 5, 7, 6, 5, 7, 7, 7, 5, 7, 5, 9, 6, 7, 6, 6, 8, 6), Vector(7, 6, 7, 6, 7, 5, 8, 6, 8, 8, 8, 6, 5, 3, 7, 3, 7, 3, 6, 4, 4, 5, 4, 5, 6, 5, 5, 4, 4, 9, 6, 5)))
    }
}

```



#### Error stacktrace:

```
scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:8)
	dotty.tools.dotc.core.Denotations$SingleDenotation.updateValidity(Denotations.scala:717)
	dotty.tools.dotc.core.Denotations$SingleDenotation.bringForward(Denotations.scala:742)
	dotty.tools.dotc.core.Denotations$SingleDenotation.toNewRun$1(Denotations.scala:799)
	dotty.tools.dotc.core.Denotations$SingleDenotation.current(Denotations.scala:870)
	dotty.tools.dotc.core.Symbols$Symbol.recomputeDenot(Symbols.scala:120)
	dotty.tools.dotc.core.Symbols$Symbol.computeDenot(Symbols.scala:114)
	dotty.tools.dotc.core.Symbols$Symbol.denot(Symbols.scala:107)
	dotty.tools.dotc.core.Symbols$.toDenot(Symbols.scala:494)
	dotty.tools.dotc.typer.Checking.checkLegalImportPath(Checking.scala:938)
	dotty.tools.dotc.typer.Checking.checkLegalImportPath$(Checking.scala:809)
	dotty.tools.dotc.typer.Typer.checkLegalImportPath(Typer.scala:116)
	dotty.tools.dotc.typer.Typer.typedImport(Typer.scala:2789)
	dotty.tools.dotc.typer.Typer.typedUnnamed$1(Typer.scala:3060)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3112)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3184)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3188)
	dotty.tools.dotc.typer.Typer.traverse$1(Typer.scala:3200)
	dotty.tools.dotc.typer.Typer.typedStats(Typer.scala:3256)
	dotty.tools.dotc.typer.Typer.typedPackageDef(Typer.scala:2812)
	dotty.tools.dotc.typer.Typer.typedUnnamed$1(Typer.scala:3081)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3112)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3184)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3188)
	dotty.tools.dotc.typer.Typer.typedExpr(Typer.scala:3300)
	dotty.tools.dotc.typer.TyperPhase.typeCheck$$anonfun$1(TyperPhase.scala:44)
	dotty.tools.dotc.typer.TyperPhase.typeCheck$$anonfun$adapted$1(TyperPhase.scala:54)
	scala.Function0.apply$mcV$sp(Function0.scala:42)
	dotty.tools.dotc.core.Phases$Phase.monitor(Phases.scala:440)
	dotty.tools.dotc.typer.TyperPhase.typeCheck(TyperPhase.scala:54)
	dotty.tools.dotc.typer.TyperPhase.runOn$$anonfun$3(TyperPhase.scala:88)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.immutable.List.foreach(List.scala:333)
	dotty.tools.dotc.typer.TyperPhase.runOn(TyperPhase.scala:88)
	dotty.tools.dotc.Run.runPhases$1$$anonfun$1(Run.scala:246)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.ArrayOps$.foreach$extension(ArrayOps.scala:1321)
	dotty.tools.dotc.Run.runPhases$1(Run.scala:262)
	dotty.tools.dotc.Run.compileUnits$$anonfun$1(Run.scala:270)
	dotty.tools.dotc.Run.compileUnits$$anonfun$adapted$1(Run.scala:279)
	dotty.tools.dotc.util.Stats$.maybeMonitored(Stats.scala:67)
	dotty.tools.dotc.Run.compileUnits(Run.scala:279)
	dotty.tools.dotc.Run.compileSources(Run.scala:194)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:165)
	scala.meta.internal.pc.MetalsDriver.run(MetalsDriver.scala:45)
	scala.meta.internal.pc.PcCollector.<init>(PcCollector.scala:42)
	scala.meta.internal.pc.PcSemanticTokensProvider$Collector$.<init>(PcSemanticTokensProvider.scala:60)
	scala.meta.internal.pc.PcSemanticTokensProvider.Collector$lzyINIT1(PcSemanticTokensProvider.scala:60)
	scala.meta.internal.pc.PcSemanticTokensProvider.Collector(PcSemanticTokensProvider.scala:60)
	scala.meta.internal.pc.PcSemanticTokensProvider.provide(PcSemanticTokensProvider.scala:81)
	scala.meta.internal.pc.ScalaPresentationCompiler.semanticTokens$$anonfun$1(ScalaPresentationCompiler.scala:99)
```
#### Short summary: 

java.lang.AssertionError: assertion failed: denotation object language invalid in run 3. ValidFor: Period(1..2, run = 4)