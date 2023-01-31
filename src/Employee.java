public class Employee extends Person{
    static private int id_gen = 0;
    private int id;
    private String name;
    private String surname;
    private String position;
    private double salary;

    public Employee(){
        id = id_gen++;
    }
    public Employee(String name, String surname, String position, double salary){
        this();
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
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
    public double getSalary(){
        return salary;
    }
    public String getPosition(){
        return position;
    }
    public String toString(){
        return "Employee: " + id + ". " + name + " " + surname;
    }
    public double getPaymentAmount() {
        return salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public int compareTo(Person person) {
        if(this.getPaymentAmount() == person.getPaymentAmount()){
            return 0;
        } else if(this.getPaymentAmount() > person.getPaymentAmount()){
            return 1;
        } else if(this.getPaymentAmount() < person.getPaymentAmount()){
            return -1;
        }
        return 0;
    }
}
