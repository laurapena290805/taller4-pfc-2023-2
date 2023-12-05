package taller4

import org.scalameter.measure
import org.scalameter.withWarmer
import org.scalameter.Warmer

object Taller4 {

  //def saludo() = "Taller 4 2023-II"

  def main(args: Array[String]): Unit = {

    val benchmark = new Benchmark();
    val matriz = new Matrices();
/*
    println(
      withWarmer(new Warmer.Default) measure {
        (1 to 100000000).toArray
      }
    );
    for {
      i <- 1 to 10
    } yield {
      println(s"Producto punto de Vector y ParVector de ${math.pow(2, i).toInt}x${math.pow(2, i).toInt}");
      val (t1, t2, aceleracion) = benchmark.comparar(
        math.pow(2, i).toInt,
        new Matrices().prodPunto,
        new Matrices().prodPuntoParD
      );
      println(s"Tiempo secuencial: $t1");
      println(s"Tiempo paralelo: $t2");
      println(s"Aceleración: $aceleracion");
*/

    for {
      i <- 1 to 10
      m1 = matriz.matrizAlAzar(math.pow(2, i).toInt, 2)
      m2 = matriz.matrizAlAzar(math.pow(2, i).toInt, 2)
    } yield {
      println(s"Multiplicando matrices de ${math.pow(2, i).toInt}x${math.pow(2, i).toInt}");
      val (t1, t2, aceleracion) = benchmark.compararAlgoritmos(
        new Strassen().multStrassen,
        new Strassen().multStrassenPar
      )(m1, m2);
      println(s"Tiempo secuencial: $t1");
      println(s"Tiempo paralelo: $t2");
      println(s"Aceleración: $aceleracion");


    }
  }
}