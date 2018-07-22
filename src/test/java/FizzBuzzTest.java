import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Grzesiek on 2018-07-22
 */
public class FizzBuzzTest {

    @Test
    public void show_numbers1and2(){
        assertEquals("1\n2\n", FizzBuzz.PrintRange(1,2));
    }

    @Test
    public void showNumbersFrom_To(){
        assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n", FizzBuzz.PrintRange(1,6));
    }

    @Test
    public void showFizz(){
        assertEquals("1\n2\nFizz\n", FizzBuzz.PrintRange(1,3));
    }

    @Test
    public void showFizzFrom_1_To_9(){
        assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\n", FizzBuzz.PrintRange(1,9));
    }

    @Test
    public void showBuzz(){
        assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n", FizzBuzz.PrintRange(1,10));
    }

    @Test
    public void showFizzBuzz(){
        assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\nFizz\n14\nFizzBuzz!\n", FizzBuzz.PrintRange(1,15));
    }
    @Test
    public void showFizzWhenNumberContains3(){
        assertEquals("Fizz\nFizz\n14\nFizzBuzz!\n", FizzBuzz.PrintRange(12,15));
    }

    @Test
    public void showBuzzWhenNumberContains5(){
        assertEquals("Buzz\nFizz\n22\nFizz\nFizz\nBuzz\n", FizzBuzz.PrintRange(20,25));
    }

    @Test(expected = IllegalArgumentException.class)
    public void supportRangeFrom1to100(){
        FizzBuzz.PrintRange(101,103);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldFromLessTo(){
        FizzBuzz.PrintRange(105,103);
    }
}
