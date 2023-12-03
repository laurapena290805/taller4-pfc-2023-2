file:///C:/Users/usuario/OneDrive/Escritorio/PROGRAMACION%20FUNCIONAL/taller4-pfc-2023-2/app/src/main/scala/taller4/Matrices.scala
### java.lang.UnsupportedOperationException: tail of empty list

occurred in the presentation compiler.

action parameters:
uri: file:///C:/Users/usuario/OneDrive/Escritorio/PROGRAMACION%20FUNCIONAL/taller4-pfc-2023-2/app/src/main/scala/taller4/Matrices.scala
text:
```scala
package taller4


class Matrices {
  type Matriz = Vector[Vector[Int]]

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
scala.collection.immutable.Nil$.tail(List.scala:664)
	scala.collection.immutable.Nil$.tail(List.scala:661)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:890)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.member(Types.scala:662)
	dotty.tools.dotc.core.Denotations$.select$1(Denotations.scala:1306)
	dotty.tools.dotc.core.Denotations$.recurSimple$1(Denotations.scala:1336)
	dotty.tools.dotc.core.Denotations$.recurSimple$1(Denotations.scala:1333)
	dotty.tools.dotc.core.Denotations$.recurSimple$1(Denotations.scala:1333)
	dotty.tools.dotc.core.Denotations$.recur$1(Denotations.scala:1338)
	dotty.tools.dotc.core.Denotations$.staticRef$$anonfun$1(Denotations.scala:1343)
	dotty.tools.dotc.util.GenericHashMap.getOrElseUpdate(GenericHashMap.scala:134)
	dotty.tools.dotc.core.Denotations$.staticRef(Denotations.scala:1343)
	dotty.tools.dotc.core.Symbols$.requiredClass(Symbols.scala:898)
	dotty.tools.dotc.core.Definitions.TargetNameAnnot(Definitions.scala:1039)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.targetName(SymDenotations.scala:573)
	dotty.tools.dotc.core.Denotations$SingleDenotation.matches(Denotations.scala:1006)
	dotty.tools.dotc.core.Denotations$Denotation.mergeDenot$1(Denotations.scala:409)
	dotty.tools.dotc.core.Denotations$Denotation.meet(Denotations.scala:499)
	dotty.tools.dotc.core.Denotations$DenotUnion.toDenot(Denotations.scala:1229)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2145)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.goThis$1(Types.scala:801)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:712)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.ContextOps$.denotNamed(ContextOps.scala:38)
	dotty.tools.dotc.typer.Typer.loop$1(Typer.scala:451)
	dotty.tools.dotc.typer.Typer.findRefRecur$1(Typer.scala:514)
	dotty.tools.dotc.typer.Typer.findRef(Typer.scala:517)
	dotty.tools.dotc.typer.Typer.typedIdent(Typer.scala:576)
	dotty.tools.dotc.typer.Typer.typedNamed$1(Typer.scala:3016)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3111)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3184)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3188)
	dotty.tools.dotc.typer.Typer.typedExpr(Typer.scala:3300)
	dotty.tools.dotc.typer.Typer.typedPackageDef(Typer.scala:2803)
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

java.lang.UnsupportedOperationException: tail of empty list