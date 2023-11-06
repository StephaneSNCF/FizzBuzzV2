import fizzBuzz.FizzBuzz

fun main() {

    val fizzBuzz = FizzBuzz()

    for(i in 1..100){
        println(fizzBuzz.fizzBuzzFun(i))
    }
}