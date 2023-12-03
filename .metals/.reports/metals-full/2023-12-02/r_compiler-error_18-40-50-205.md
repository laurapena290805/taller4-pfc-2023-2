file:///C:/Users/usuario/OneDrive/Escritorio/PROGRAMACION%20FUNCIONAL/taller4-pfc-2023-2/app/src/main/scala/taller4/Matrices.scala
### java.lang.AssertionError: assertion failed: phase parser has already been used once; cannot be reused

occurred in the presentation compiler.

action parameters:
uri: file:///C:/Users/usuario/OneDrive/Escritorio/PROGRAMACION%20FUNCIONAL/taller4-pfc-2023-2/app/src/main/scala/taller4/Matrices.scala
text:
```scala
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

  //1.2.1 Extrayendo submatrices 

  def subMatriz(m: Matriz, i: Int, j: Int, l: Int): Matriz = {
    Vector.tabulate(l, l)((x, y) => m(i + x)(j + y))
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