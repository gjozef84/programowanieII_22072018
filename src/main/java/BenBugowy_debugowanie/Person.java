package BenBugowy_debugowanie;

/**
 * Created by Grzesiek on 2018-07-22
 */
public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean hasSameName(Person person){
        return person.name.equals(this.name);
    }

    @Override
    public String toString(){
        return "[Name: " + this.name + "]";
    }
}
