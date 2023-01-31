import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<Person> person = new ArrayList<>();
        person.add(new Student("Person1", "Person", 2.1));
        person.add(new Student("Person4", "Person", 2.8));
        person.add(new Student("Person3", "Person", 2.68));
        person.add(new Student("Person5", "Person", 2.0));
        person.add(new Employee("Person6", "Person", "Person", 100000.0));
        person.add(new Employee("Person7", "Person", "Person", 200000.0));
        person.add(new Employee("Person8", "Person", "Person", 300000.0));
        person.add(new Employee("Person9", "Person", "Person", 400000.0));
        Collections.sort(person);
        printData(person);
    }

    public static void printData(Iterable<Person> person){
        for (Person p: person) {
            System.out.println(p.toString() + " earns " + p.getPaymentAmount() + " tg.");
        }
    }
}
