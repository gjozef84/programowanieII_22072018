DEBUGOWANIE:

Ben Bugowy stworzył sobie klasę, która ma modelować ludzi. Jej kod znajduje się poniżej:

public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean hasSameName(Person person){
        return person.name == this.name;
    }

    @Override
    public String toString(){
        return "[Name: " + this.name + "]";
    }
}

Ben stwierdził, że tylko on może mieć na imie Ben, więc napisał klasę RemovePeople.java, która usuwa wszystkie obiekty klasy Person o imieniu „Ben”. Kod znajduje się poniżej:

public class RemovePeople {
    public static void main(String[] args) {
        Person ben = new Person("Ben");
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person(new String("Ben")));
        persons.add(new Person(new String("Alyssa")));
        persons.add(new Person(new String("Alice")));
        for (Person person : persons){
            if (person.hasSameName(ben)) {
                persons.remove(person);
            }
        }
        System.out.println(persons);
    }
}




1.	Niestety kod Bena nie usuwa ludzi o imieniu “Ben”. Karolina Hakerska zasugerowala mu, że może być coś nie tak z metodą hasSameName w klasie Person. Napraw tę metodę.
2.	Po naprawieniu metody Ben odpalił znowu kod, ale teraz rzuca on wyjątek. Jaki wyjątek jest rzucany? Dlaczego tak się dzieje? Napraw kod w klasie RemovePeople.java

Po sprawieniu, że wszystko działa, Ben zdecydował, że chce stworzyć klasę rozszerzającą klasę Person, która będzie nazywać się Student. Klasa będzie wyglądać jak poniżej:

public class Student extends Person {
        private String grade;
        private String daysAttended;

        public Student(String name, String grade, String daysAttended) {
                super(name);
                this.grade = grade;
                this.daysAttended = daysAttended;
        }

        public void inflateGrade(){
                this.grade.replace("-", "+");
        }
        
        public void boostAttendance(){
                this.daysAttended += 2;
        }

        @Override
        public String toString(){
                return "[Name: " + this.getName() + ", Grade: "+this.grade+ ", Days attended; " + this.daysAttended + "]";
        }
}

Klasa Student dodaje pole grade . grade to String, który zawiera literę po której może być opcjonalnie „+” albo „-” np. „B-”, albo „A”.
Ben jest oszustem, więc napisał funkcję zwiększającą oceny tzn. zamieniającą wszystkie minusy na plusy. „C-” zostanie zamienione na „C+”,
ale „A” pozostanie bez zmian.

3.	Niestety metoda inlflateGrage wydaje się nie zmieniać zmiennej grade. Napraw kod Bena i odpal metodę aby sprawdzić,
czy wszystko działa jak należy.


Klasa Student dodaje także pole daysAttended, które mówi ile dni w semestrze  osoba była obecna na zajęciach.
W tym przypadku Ben też chciał sobie ułatwić życie, więc dodał metodę boostAttendance(), która zwiększa liczbę obecności o 2.
4.	Niestety ta metoda też wydaje się nie działać. Napraw ją. Nie zmieniaj typu zmiennej daysAttended. Odpal wszystko I zweryfikuj,
że dziala w porządku.




Źródła:
http://www.mit.edu/~6.005/sp11/psets/ps1/assignment.html
