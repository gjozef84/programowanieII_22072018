package BenBugowy_debugowanie;

import java.util.ArrayList;

/**
 * Created by Grzesiek on 2018-07-22
 */
public class RemovePeople {
    public static void main(String[] args) {

        Person ben = new Person("Ben");

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person(new String("Ben")));
        persons.add(new Person(new String("Alyssa")));
        persons.add(new Person(new String("Alice")));


        /*for (Person person : persons){
            if (person.hasSameName(ben)) {
                persons.remove(person);
            }
        }*/

        for(int i=0; i<persons.size(); i++){
            if (persons.get(i).hasSameName(ben)) {
                persons.remove(persons.get(i));
            }
        }
        System.out.println(persons);
    }
}
