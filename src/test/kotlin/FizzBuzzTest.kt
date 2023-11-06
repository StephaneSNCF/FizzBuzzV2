import fizzBuzz.FizzBuzz
import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

class FizzBuzzTest {

    @Test
    fun given_a_number_then_it_returns_this_number_to_string(){
        val fizzBuzz = FizzBuzz()
        assertEquals("1", fizzBuzz.fizzBuzzFun(1))
    }

    @Test
    fun given_a_number_then_it_returns_this_number_to_string_2(){
        val fizzBuzz = FizzBuzz()
        assertEquals("2", fizzBuzz.fizzBuzzFun(2))
    }

    @Test
    fun given_any_number_then_it_returns_this_number_to_string(){
        val fizzBuzz = FizzBuzz()
        assertEquals("94", fizzBuzz.fizzBuzzFun(94))
    }

    @Test
    fun given_the_number_3_then_it_returns_fizz_to_string(){
        val fizzBuzz = FizzBuzz()
        assertEquals("Fizz", fizzBuzz.fizzBuzzFun(3))
    }
}