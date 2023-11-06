package fizzBuzz

class FizzBuzz {

    fun fizzBuzzFun(nb: Int): String {
        when {
            nb % 3 == 0 && nb % 5 == 0 -> return "FizzBuzz"
            nb % 3 == 0 -> return "Fizz"
            nb % 5 == 0 -> return "Buzz"
        }
        return nb.toString()
    }
}