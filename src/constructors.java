
 class constructors {
    public static void main(String args[]){
        Student a=new Student();
        a.rno=20;
        a.name="jaguar";
        a.marks=35;
        System.out.println(a.rno);
        System.out.println(a.name);
        System.out.println(a.marks);
        a.greeting();
        Student b=new Student(20);
        System.out.println(b.rno);
        System.out.println(b.name);
        System.out.println(b.marks);
        b.greeting();
    }
}
//Implication of constructor is so simple here Student() is the constructor this keyword is used to bind the data to the constructor
 class Student {
     int rno;
     String name;
     float marks=33;
     void greeting(){
         System.out.println("hi my name is "+ name);//this is hidden here name == this.name
     }
     Student(int num){
         this.rno=21;
         this.name="kamal";
         this.marks=27;
     }
     Student(){
         this.rno=20;
         this.name="rahul";
         this.marks=26;
     }
 }