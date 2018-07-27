package DiamondKata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.reverse;
import static org.apache.commons.lang3.StringUtils.repeat;
import static org.apache.commons.lang3.StringUtils.startsWith;

/**
 * Created by Grzesiek on 2018-07-22
 */
public class Diamond {
    public static final char START_LETTER = 'A';

    public String diamondGenerator(char letter) {

        if (letter == 65) return String.valueOf(letter); // no braces here? you can compare it like: letter == 'A'
        else {

            String diamond = "";

            List<String> stringList = createRows(letter);
            List<String> rewersList = reversRows(stringList);
            stringList.addAll(rewersList);

            for (int i = 0; i < stringList.size(); i++) {
                if (i < stringList.size() - 1) diamond += stringList.get(i) + "\n";
                else diamond += stringList.get(i); // this might be a good place for a comment like 'do not add new line after last row'
            }
            System.out.println(diamond);
            return diamond;
        }
    }

    public static List<String> createRows(char letter) {

        List<String> rows = new ArrayList<>();
        int letterInterval = letter - START_LETTER;
        for (int letterIndex = 0; letterIndex <= letterInterval; letterIndex++) {
            rows.add(rowBuilder(letter, letterIndex));
        }
        return rows;
    }

    public static String rowBuilder(char letter, int whichRow) { //funciton names are usually verbs, nouns are used for classes
        String row = "";
        char aktualnaLetter = (char) (START_LETTER + whichRow); // maybe rename to currentLetter
        String outherDashes = dashes(letter - aktualnaLetter);

        row += outherDashes + aktualnaLetter + innerDashes(aktualnaLetter); //row could be declared here
        if (whichRow > 0) row += aktualnaLetter; // maybe if(letter != 'A') would be clearer? (don't really know)
        row += outherDashes;

        return row;
    }

    public static List<String> reversRows(List<String> toRevers) { // this is reverse + remove one line (the funciton name may be misleading)
        List<String> reversRows = new ArrayList<>(toRevers);
        reverse(reversRows); //cool
        reversRows.remove(0);
        return reversRows;
    }

    private static String innerDashes(int aktualnaLetter) {
        int lettersInterval = aktualnaLetter - START_LETTER;
        return dashes((lettersInterval * 2) - 1);
    }

    public static String dashes(int number) { //rename to spaces?
        return repeat(' ', number);
    }
}

