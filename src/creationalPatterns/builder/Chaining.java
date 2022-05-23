package creationalPatterns.builder;

class Student { // using final to create constants , prevent inheritence and prevent method overriding
    private int id;
    private String name;
    private String address;

    public Student setStudentId(int id) {
        this.id = id;
        return this;
    }
    public Student setStudentName(String name)
    {
        this.name = name;
        return this;
    }
    public Student setStudentAddress(String address)
    {
        this.address = address;
        return this;
    }
    @Override
    public String toString(){
        return "id = " + this.id +  " Name = " + this.name + " address = " + this.address;
    }
}

public class Chaining {
    public static void main(String[] args) {
        Student firstStudent = new Student();
        Student secondStudent = new Student();
        firstStudent.setStudentId(1).setStudentName("Ram").setStudentAddress("Noida");
        secondStudent.setStudentId(2).setStudentName("Shyam").setStudentAddress("Delhi");

        System.out.println(firstStudent);
        System.out.println(secondStudent);

    }
}
