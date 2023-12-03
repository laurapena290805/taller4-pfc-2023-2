file:///C:/Users/usuario/OneDrive/Escritorio/PROGRAMACION%20FUNCIONAL/taller4-pfc-2023-2/app/src/test/scala/taller4/test1MultMatriz.scala
### java.lang.AssertionError: assertion failed: phase parser has already been used once; cannot be reused

occurred in the presentation compiler.

action parameters:
uri: file:///C:/Users/usuario/OneDrive/Escritorio/PROGRAMACION%20FUNCIONAL/taller4-pfc-2023-2/app/src/test/scala/taller4/test1MultMatriz.scala
text:
```scala
package taller4

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class test1MultMatriz extends AnyFunSuite {
  test("Prueba 1") {
    val obj = new Matrices()
    val m1: obj.Matriz = Vector(Vector(0, 1), Vector(0, 0))
    val m2: obj.Matriz = Vector(Vector(1, 0), Vector(0, 0))
    val result: obj.Matriz = obj.multMatriz(m1, m2)
    assert(result == Vector(Vector(0,0), Vector(0,0)))
  }

  test("Prueba 2") {
    val obj = new Matrices()
    val m1: obj.Matriz = Vector(Vector(1, 0, 0, 0), Vector(1, 1, 1, 1), Vector(1, 1, 0, 1), Vector(0, 1, 0, 0))
    val m2: obj.Matriz = Vector(Vector(1, 0, 1, 1), Vector(0, 0, 0, 1), Vector(0, 0, 1, 0), Vector(1, 0, 0, 0))
    val result: obj.Matriz = obj.multMatriz(m1, m2)
    assert(result == Vector(Vector(1, 0, 1, 1), Vector(2, 0, 2, 2), Vector(2, 0, 1, 2), Vector(0, 0, 0, 1)))
  }

  test("Prueba 3"){
    val obj = new Matrices()
    val m1: obj.Matriz = Vector(Vector(0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1), Vector(0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1), Vector(0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0), Vector(1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0), Vector(0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0), Vector(0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1), Vector(0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1), Vector(0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1), Vector(1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1), Vector(1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1), Vector(1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0), Vector(0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0), Vector(0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0), Vector(0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1), Vector(0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0), Vector(0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1))
    val m2: obj.Matriz = Vector(Vector(1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0), Vector(0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1), Vector(1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1), Vector(1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0), Vector(0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1), Vector(1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1), Vector(1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1), Vector(0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1), Vector(0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0), Vector(0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1), Vector(0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1), Vector(0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1), Vector(0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1), Vector(0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1), Vector(1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0), Vector(1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0))
    val result: obj.Matriz = obj.multMatriz(m1, m2)
    assert(result == Vector(Vector(3, 3, 3, 2, 5, 2, 2, 3, 3, 1, 2, 4, 3, 0, 3, 3), Vector(4, 3, 3, 2, 4, 4, 3, 6, 2, 2, 3, 2, 1, 3, 4, 3), Vector(3, 6, 5, 1, 7, 3, 5, 5, 5, 1, 5, 6, 3, 1, 3, 6), Vector(6, 5, 6, 3, 7, 5, 5, 5, 9, 5, 7, 6, 6, 4, 6, 7), Vector(2, 2, 3, 2, 5, 3, 3, 4, 4, 4, 3, 4, 3, 3, 2, 5), Vector(3, 4, 4, 1, 6, 3, 5, 3, 5, 4, 4, 6, 3, 1, 4, 5), Vector(5, 5, 4, 2, 7, 5, 5, 4, 5, 3, 4, 6, 4, 0, 3, 5), Vector(3, 3, 4, 2, 8, 5, 6, 8, 5, 4, 6, 6, 3, 3, 6, 7), Vector(5, 3, 5, 2, 8, 6, 7, 7, 5, 4, 5, 6, 4, 4, 6, 5), Vector(3, 4, 6, 1, 7, 3, 4, 5, 6, 2, 5, 6, 5, 3, 4, 6), Vector(1, 3, 2, 0, 4, 1, 3, 3, 2, 1, 4, 3, 2, 2, 1, 4), Vector(3, 4, 3, 1, 7, 5, 5, 6, 5, 2, 7, 5, 3, 2, 3, 6), Vector(4, 3, 3, 2, 5, 4, 3, 4, 7, 5, 6, 4, 3, 3, 4, 6), Vector(2, 5, 5, 1, 7, 3, 5, 6, 3, 1, 4, 6, 3, 2, 4, 5), Vector(3, 3, 3, 2, 7, 5, 5, 6, 4, 4, 5, 6, 3, 3, 4, 5), Vector(4, 4, 4, 2, 7, 5, 4, 6, 5, 2, 5, 5, 4, 1, 3, 6)))
  }

  test("Prueba 4"){
    val obj = new Matrices()
    val m1: obj.Matriz = 
  }
}

```



#### Error stacktrace:

```
scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:8)
	dotty.tools.dotc.core.Phases$Phase.init(Phases.scala:406)
	dotty.tools.dotc.core.Phases$Phase.init(Phases.scala:420)
	dotty.tools.dotc.core.Phases$PhasesBase.usePhases(Phases.scala:168)
	dotty.tools.dotc.core.Phases$PhasesBase.usePhases$(Phases.scala:37)
	dotty.tools.dotc.core.Contexts$ContextBase.usePhases(Contexts.scala:842)
	dotty.tools.dotc.Run.compileUnits$$anonfun$1(Run.scala:231)
	dotty.tools.dotc.Run.compileUnits$$anonfun$adapted$1(Run.scala:279)
	dotty.tools.dotc.util.Stats$.maybeMonitored(Stats.scala:67)
	dotty.tools.dotc.Run.compileUnits(Run.scala:279)
	dotty.tools.dotc.Run.compileSources(Run.scala:194)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:165)
	scala.meta.internal.pc.MetalsDriver.run(MetalsDriver.scala:45)
	scala.meta.internal.pc.SemanticdbTextDocumentProvider.textDocument(SemanticdbTextDocumentProvider.scala:33)
	scala.meta.internal.pc.ScalaPresentationCompiler.semanticdbTextDocument$$anonfun$1(ScalaPresentationCompiler.scala:178)
```
#### Short summary: 

java.lang.AssertionError: assertion failed: phase parser has already been used once; cannot be reused