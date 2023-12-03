file:///C:/Users/usuario/OneDrive/Escritorio/PROGRAMACION%20FUNCIONAL/taller4-pfc-2023-2/app/src/test/scala/taller4/test1MultMatriz.scala
### dotty.tools.dotc.core.unpickleScala2.Scala2Unpickler$BadSignature: error reading Scala signature of class language from <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.10\scala-library-2.13.10.jar(scala/language.class):
error occurred at position 648: a runtime exception occurred: java.lang.NullPointerException: Cannot invoke "dotty.tools.dotc.core.Phases$Phase.start()" because "phase" is null

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
dotty.tools.dotc.core.unpickleScala2.Scala2Unpickler.errorBadSignature(Scala2Unpickler.scala:174)
	dotty.tools.dotc.core.unpickleScala2.Scala2Unpickler.handleRuntimeException(Scala2Unpickler.scala:181)
	dotty.tools.dotc.core.unpickleScala2.Scala2Unpickler$LocalUnpickler.complete(Scala2Unpickler.scala:650)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.completeFrom(SymDenotations.scala:174)
	dotty.tools.dotc.core.Denotations$Denotation.completeInfo$1(Denotations.scala:187)
	dotty.tools.dotc.core.Denotations$Denotation.info(Denotations.scala:189)
	dotty.tools.dotc.core.Denotations$Denotation.completeInfo$1(Denotations.scala:187)
	dotty.tools.dotc.core.Denotations$Denotation.info(Denotations.scala:189)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.ensureCompleted(SymDenotations.scala:393)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.flags(SymDenotations.scala:66)
	dotty.tools.dotc.core.SymDenotations$ModuleCompleter.complete(SymDenotations.scala:2777)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.completeFrom(SymDenotations.scala:174)
	dotty.tools.dotc.core.Denotations$Denotation.completeInfo$1(Denotations.scala:187)
	dotty.tools.dotc.core.Denotations$Denotation.info(Denotations.scala:189)
	dotty.tools.dotc.core.Denotations$.select$1(Denotations.scala:1306)
	dotty.tools.dotc.core.Denotations$.recurSimple$1(Denotations.scala:1336)
	dotty.tools.dotc.core.Denotations$.recur$1(Denotations.scala:1338)
	dotty.tools.dotc.core.Denotations$.staticRef$$anonfun$1(Denotations.scala:1343)
	dotty.tools.dotc.util.GenericHashMap.getOrElseUpdate(GenericHashMap.scala:134)
	dotty.tools.dotc.core.Denotations$.staticRef(Denotations.scala:1343)
	dotty.tools.dotc.core.Symbols$.requiredModule(Symbols.scala:928)
	dotty.tools.dotc.core.Definitions.LanguageExperimentalModule(Definitions.scala:788)
	dotty.tools.dotc.typer.Checking.checkLegalImportPath(Checking.scala:939)
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
	scala.meta.internal.pc.SemanticdbTextDocumentProvider.textDocument(SemanticdbTextDocumentProvider.scala:33)
	scala.meta.internal.pc.ScalaPresentationCompiler.semanticdbTextDocument$$anonfun$1(ScalaPresentationCompiler.scala:178)
```
#### Short summary: 

dotty.tools.dotc.core.unpickleScala2.Scala2Unpickler$BadSignature: error reading Scala signature of class language from <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.10\scala-library-2.13.10.jar(scala/language.class):
error occurred at position 648: a runtime exception occurred: java.lang.NullPointerException: Cannot invoke "dotty.tools.dotc.core.Phases$Phase.start()" because "phase" is null