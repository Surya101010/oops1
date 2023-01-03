public class Constructorwithinconstructor {
    public static void main(String args[]) {
        Student1 a = new Student1();
        a.rno = 23;
        a.name = "jedi";
        a.marks = 33;
        Student1 b = new Student1(a);
        System.out.println(b.rno);
        System.out.println(b.name);
        System.out.println(b.marks);
    }
    }
class Student1 {
    int rno;
    String name;
    float marks=33;
    Student1(){
        this.rno=20;
        this.name="rahul";
        this.marks=26;
    }
    Student1(Student1 other){
        this.rno= other.rno;
        this.name=other.name;
        this.marks= other.marks;
    }
}