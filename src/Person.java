public class Person implements Payable, Comparable<Person> {
    static private int id_gen = 0;
    private int id;
    private String name;
    private String surname;

    public Person(){
        id = id_gen++;
    }
    public Person(String name, String surname){
        this();
        this.name = name;
        this.surname = surname;
    }

    public String toString(){
        return id + " " + name + " " + surname;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getPosition(){
        return "Student";
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    @Override
    public double getPaymentAmount() {
        return 0;
    }
    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
