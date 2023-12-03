file:///C:/Users/usuario/OneDrive/Escritorio/PROGRAMACION%20FUNCIONAL/taller4-pfc-2023-2/app/src/main/scala/taller4/Matrices.scala
### java.lang.NullPointerException: tried to cast away nullability, but value is null

occurred in the presentation compiler.

action parameters:
uri: file:///C:/Users/usuario/OneDrive/Escritorio/PROGRAMACION%20FUNCIONAL/taller4-pfc-2023-2/app/src/main/scala/taller4/Matrices.scala
text:
```scala
package taller4
import scala.util.Random

class Matrices {
  type Matriz = Vector[Vector[Int]]
  val rand

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

  //1.2.1 Extrayendo submatrices 

  def subMatriz(m: Matriz, i: Int, j: Int, l: Int): Matriz = {
    Vector.tabulate(l, l)((x, y) => m(i + x)(j + y))
  }
}

```



#### Error stacktrace:

```
scala.runtime.Scala3RunTime$.nnFail(Scala3RunTime.scala:28)
	dotty.tools.dotc.core.Scopes$MutableScope.unlink(Scopes.scala:328)
	dotty.tools.dotc.core.SymDenotations$PackageClassDenotation.proceedWithEnter(SymDenotations.scala:2561)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.enter(SymDenotations.scala:2032)
	dotty.tools.dotc.core.Symbols$Symbol.entered(Symbols.scala:207)
	dotty.tools.dotc.typer.Namer.createPackageSymbol(Namer.scala:335)
	dotty.tools.dotc.typer.Namer.recur$1(Namer.scala:390)
	dotty.tools.dotc.typer.Namer.indexExpanded(Namer.scala:409)
	dotty.tools.dotc.typer.Namer.index(Namer.scala:381)
	dotty.tools.dotc.typer.TyperPhase.enterSyms$$anonfun$1(TyperPhase.scala:36)
	dotty.tools.dotc.typer.TyperPhase.enterSyms$$anonfun$adapted$1(TyperPhase.scala:38)
	scala.Function0.apply$mcV$sp(Function0.scala:42)
	dotty.tools.dotc.core.Phases$Phase.monitor(Phases.scala:440)
	dotty.tools.dotc.typer.TyperPhase.enterSyms(TyperPhase.scala:38)
	dotty.tools.dotc.typer.TyperPhase.runOn$$anonfun$1(TyperPhase.scala:76)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.immutable.List.foreach(List.scala:333)
	dotty.tools.dotc.typer.TyperPhase.runOn(TyperPhase.scala:76)
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

java.lang.NullPointerException: tried to cast away nullability, but value is null