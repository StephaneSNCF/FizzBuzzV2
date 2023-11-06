import fizzBuzz.FizzBuzz
import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

class FizzBuzzTest {

    private val fizzBuzz = FizzBuzz()

    @Test
    fun given_a_number_then_it_returns_this_number_to_string(){
        assertEquals("1", fizzBuzz.fizzBuzzFun(1))
    }

    @Test
    fun given_a_number_then_it_returns_this_number_to_string_2(){
        assertEquals("2", fizzBuzz.fizzBuzzFun(2))
    }

    @Test
    fun given_any_number_then_it_returns_this_number_to_string(){
        assertEquals("94", fizzBuzz.fizzBuzzFun(94))
    }

    @Test
    fun given_the_number_3_then_it_returns_fizz_to_string(){
        assertEquals("Fizz", fizzBuzz.fizzBuzzFun(3))
    }

    @Test
    fun given_the_number_5_then_it_returns_buzz_to_string(){
        assertEquals("Buzz", fizzBuzz.fizzBuzzFun(5))
    }

    @Test
    fun given_the_number_15_then_it_returns_fizzBuzz_to_string(){
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzzFun(15))
    }
}