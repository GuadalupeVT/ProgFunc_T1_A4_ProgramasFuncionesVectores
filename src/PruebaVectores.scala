import scala.io.StdIn._


object PruebaVectores {
  //Metodo para llenar el vector
  def llenarVector(filas:Int, columnas:Int): Unit={
    var numeros = Array.ofDim[Int](filas,columnas)
    for(f <- 0 until numeros.length; c <- 0 until numeros.length){
      println("Ingrese un numero para el espacio "+f+","+c)
       numeros(f)(c) = readInt()
    }
  }
  
  
  
  def main(args: Array[String]): Unit = {
    println("Ingrese el numero de filas del vector: ")
    var filas=readInt()
    println("Ingrese el numero de columnas del vector: ")
    var columnas=readInt()
    llenarVector(filas,columnas)
    
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
    }
    
  }
}