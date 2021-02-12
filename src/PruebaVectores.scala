import scala.io.StdIn._
import scala.util.Sorting

object PruebaVectores {
  
  //Metodo para llenar el vector
  def llenarVector(filas:Int, columnas:Int): Array[Array[Double]]={
    var numeros = Array.ofDim[Double](filas,columnas)
    for(f <- 0 until numeros.length; c <- 0 until numeros.length){
      println("Ingrese un numero para el espacio "+f+","+c)
       numeros(f)(c) = readDouble()
    }
    numeros
  }
  
  //Metodo para imprimir vector
  def imprimirVector(vector:Array[Array[Double]]):Unit={
    for(f <- 0 until vector.length; c <- 0 until vector.length){
      print(" "+vector(f)(c)+" ")
      if(c==vector.length-1)
        println()
    }
  }
  
  //Metodo para ordenar
  def ordenar(vector:Array[Array[Double]], n:Int, m:Int):Array[Array[Double]]={
    var t=0.0
     for(i <- 0 to n-1){
       for(j <- 0 to m-1){
         for(x <-0 to n-1){
           for(y <- 0 to m-1){
             if(vector(i)(j) < vector(x)(y)){
               t=vector(i)(j)
               vector(i)(j)=vector(x)(y)
               vector(x)(y)=t
             }
         }
     }
     }
     }
     vector
  }
  
  

  def main(args: Array[String]): Unit = {
    println("Ingrese el numero de filas del vector: ")
    var filas=readInt()
    println("Ingrese el numero de columnas del vector: ")
    var columnas=readInt()
    var vector=llenarVector(filas,columnas)  
    
    var menu=10
    while(menu>0){
      //Impresion de menu
     println("-----------------MENU-------------")
      println("Selecciona una opcion...")
      println("1) Imprimir vector")
      println("2) Ordenar vector")
      println("3) Calcular media")
      println("4) Calcular moda")
      println("5) Calcular mediana")
      println("6) Desviación respecto de la media")
      println("7) Desviación media")
      println("8) Varianza")
      println("9) Desviación estándar")
      println("0) Salir")
      menu=readInt()
      
      //Opcion impresion
      if(menu==1){
        imprimirVector(vector)
      }
     
     //Opcion ordenar
     if(menu==2){
       vector= ordenar(vector,filas, columnas)
     }
    }
    
  }
}