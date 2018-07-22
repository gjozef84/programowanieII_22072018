import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Grzesiek on 2018-07-22
 */
public class FizzBuzzTest {

    @Test
    public void show_numbers1and2(){
        assertEquals("1\n2", FizzBuzz.PrintRange(1,2));
    }

    @Test
    public void showNumbersFrom_To(){
        assertEquals("1\n2\n3\n4\n5\n6", FizzBuzz.PrintRange(1,6));
    }

}
