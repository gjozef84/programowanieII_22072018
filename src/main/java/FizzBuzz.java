/**
 * Created by Grzesiek on 2018-07-22
 */
public class FizzBuzz {

    public static String PrintRange(int from, int to) {
        String stringOut = "";

        if (!(from<100 && to > 1)) throw new IllegalArgumentException("Support range from 1 to 100");
        if (from > to) throw new IllegalArgumentException();

        for (int i = from; i <= to; i++) {
            if (i % 3 == 0 && i % 5 == 0) stringOut += "FizzBuzz!\n";
            else if (i % 3 == 0 || String.valueOf(i).contains("3")) stringOut += "Fizz\n";
            else if (i % 5 == 0 || String.valueOf(i).contains("5")) stringOut += "Buzz\n";
            else stringOut += i + "\n";
        }

        return stringOut;
    }
}