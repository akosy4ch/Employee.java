public class Student extends Person{
    static private int id_gen = 0;
    private int id;
    private String name;
    private String surname;
    private double gpa;
    public String toString(){
        return "Student: " + id + ". " + name + " " + surname;
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
    public double getGPA(){
        return gpa;
    }
    public void setGPA(double gpa){
        this.gpa = gpa;
    }

    public Student(){
        id = id_gen++;
    }
    public Student(String name, String surname, double gpa){
        this();
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public double getPaymentAmount() {
        if(gpa > 2.67) return 36660.00;
        return 0;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setName(String name){
        this.name = name;
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

