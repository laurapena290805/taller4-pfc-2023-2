package taller4
  import org.scalameter.measure
  import org.scalameter.withWarmer
  import org.scalameter.Warmer

  import scala.collection.parallel.immutable.ParVector

  class Benchmark {

     val obj1= new Matrices()
    def compararAlgoritmos(Funcion1: (obj1.Matriz,obj1.Matriz) => obj1.Matriz, Funcion2: (obj1.Matriz, obj1.Matriz) => obj1.Matriz)(m1:obj1.Matriz, m2: obj1.Matriz): (Double, Double, Double) = {
      val timeF1 = withWarmer(new Warmer.Default) measure {
        Funcion1(m1, m2);
      }
      val timeF2 = withWarmer(new Warmer.Default) measure {
        Funcion2(m1, m2);
      }

      val promedio = timeF1.value / timeF2.value;
      (timeF1.value, timeF2.value, promedio);
    }

    def comparar(l:Int, Funcion1:(Vector[Int], Vector[Int]) =>Int, Funcion2: (ParVector[Int], ParVector[Int]) => Int): (Double, Double, Double) = {
      val v1 = obj1.vectorAlAzar(l, 2);
      val v2 = obj1.vectorAlAzar(l, 2);
      val v1par=ParVector(v1:_*);
      val v2par=ParVector(v2:_*);
      val timeF1 = withWarmer(new Warmer.Default) measure {
        Funcion1(v1, v2);
      }
      val timeF2 = withWarmer(new Warmer.Default) measure {
        Funcion2(v1par, v2par);
      }

      val promedio = timeF1.value / timeF2.value;
      (timeF1.value, timeF2.value, promedio);
    }
    def compararParAlgoritmos(Funcion1: (obj1.MatrizPar, obj1.MatrizPar) => obj1.MatrizPar, Funcion2: (obj1.MatrizPar, obj1.MatrizPar) =>
      obj1.MatrizPar)(m1: obj1.MatrizPar, m2: obj1.MatrizPar): (Double, Double, Double) = {
      val timeF1 = withWarmer(new Warmer.Default) measure {
        Funcion1(m1, m2);
      }
      val timeF2 = withWarmer(new Warmer.Default) measure {
        Funcion2(m1, m2);
      }

      val promedio = timeF1.value / timeF2.value;
      (timeF1.value, timeF2.value, promedio);
    }
}
