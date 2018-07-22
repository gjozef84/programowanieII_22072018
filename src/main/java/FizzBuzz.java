/**
 * Created by Grzesiek on 2018-07-22
 */
public class FizzBuzz {

    public static String PrintRange(int from, int to) {
        return "1\n2";
    }
}


    /*Fizz Buzz
    Forest Gump nie jest zbyt bystry.
        Jego nauczyciel matematyki wpadł na pomysł by zorganizować zabawę w klasie.
        Wskazuje kolejno osoby w klasie Foresta i każe im wykrzykiwać kolejne liczby.
        Jednak gdy liczba jest podzielna przez 3 osoba ma wykrzyczeć "Fizz!"
        Więc kolejni uczniowie krzyczą:
        1
        2
        Fizz
        4
        Jeżeli liczna jest podzielan przez 5 uczeń ma wykrzyczeć "Buzz!"
        więc uczniowie krzyczą dalej:
        1
        2
        Fizz
        4
        Buzz
        Fizz
        7
        8
        Fizz
        Buzz
        11
        Jeżeli liczba jest podzielna przez 3 i przez 5 uczeń ma wykrzyczeć "FizzBuzz!"
        1
        2
        Fizz
        4
        Buzz
        Fizz
        7
        8
        Fizz
        Buzz
        11
        Fizz
        13
        14
        FizzBuzz
        16
        17
        Fizz
        ...
        Napisz program dla Foresta dzięki któremu będzie wiedział co ma wykrzyczeć.
        Napisz klasę FizzBuzz z metodą PrintRange(int from, int to);
        PrintRange zwraca Stringa który zawiera kolejno liczby from aż do to
        Liczy będą oddzielone znakami nowej linii
        Przykład: FizzBuzz.PrintRange(1, 2):
        1
        2
        Przykład: FizzBuzz.PrintRange(7, 8):
        7
        8
        Jeżeli liczba jest podzielna przez 3 FizzBuzz.PrintRange() ma wypisać zamiast niej "Fizz"
        Przykład: FizzBuzz.PrintRange(1, 4):
        1
        2
        Fizz
        4
        Jeżeli liczba jest podzielna przez 5 FizzBuzz.PrintRange() ma wypisać zamiast niej "Buzz"
        Przykład: FizzBuzz.PrintRange(1, 10):
        1
        2
        Fizz
        4
        Buzz
        Fizz
        7
        8
        Fizz
        Buzz
        Jeżeli liczba jest podzielna prze 5 i przez 3 FizzBuzz.PrintRange() ma wypisać zamiast niej "FizzBuzz"
        Przykład: FizzBuzz.PrintRange(8, 20):
        8
        Fizz
        Buzz
        11
        Fizz
        13
        14
        FizzBuzz
        16
        17
        Fizz
        19
        Buzz
        Obsługujemy liczby od 1 do 100
        Przedział musi być podany od liczy mniejszej do większej
        Przedział podany w ten sposób jest niepoprawny: FizzBuzz.PrintRange(20, 10)
        W tym zadaniu nie są podane kroki jak przy StringCalculator.
        Sami musimy wymyślać testy i kolejne kroki by programować możliwie najmniejszymi krokami.
        _________________________________
        Dodatkowe wymaganie:
        wypisz Fizz jeżeli liczba jest podzielna przez 3 lub zawiera cyfrę 3
        Przykład:
        FizzBuzz.PrintRange(22, 24):
        22
        Fizz
        24
        wypisz Buzz jeżeli liczba jest podzielna przez 5 lub zweiera cyfrę 5
        Porada:
        Przydatne będzie potraktowanie liczby jako String
        Klasa String ma metodę .contains()*/