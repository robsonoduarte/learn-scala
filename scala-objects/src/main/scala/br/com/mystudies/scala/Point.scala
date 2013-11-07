package br.com.mystudies.scala

class Point(val x: Int , val y: Int){

}

object Point {
    def apply(x: Int, y: Int) = new Point(x,y)
}