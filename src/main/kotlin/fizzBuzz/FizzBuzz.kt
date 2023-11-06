package fizzBuzz

class FizzBuzz {

    fun fizzBuzzFun(nb: Int): String {
        when {
            nb % 3 == 0 -> return "Fizz"
        }
        return nb.toString()
    }
}