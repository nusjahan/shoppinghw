package shop;

public class Student extends Customer{

    private long studentID;
    private final double DISCOUNT=.05;


    public Student(String name) {
        super(name);
    }
}
