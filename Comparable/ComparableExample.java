import java.util.ArrayList;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("John", 20));
        list.add(new Student("Jane", 30));
        list.add(new Student("Jack", 10));
        list.add(new Student("Jill", 40));
        List<Integer> list2 = new ArrayList<>();
        list2.add(9);
        list2.add(2);
        list2.add(55);
        list2.sort(null); // null is natural ordering in the integer(string doesn't allow this)
        System.out.println(list2);

        list.sort(null);
        System.out.println(list);
        
    }
    
}
class Student implements java.lang.Comparable<Student> {
    private String name;
    private double gpa;

    @Override
    public int compareTo(Student other) {          // in camapre we write the custom logic but in campareTo we don't write logic  
        return Double.compare(this.gpa, other.gpa);
    }
public Student (String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
    
    public String getName() {
        return name;
    }   
    public double getgpa(){
        return gpa;
    }
}