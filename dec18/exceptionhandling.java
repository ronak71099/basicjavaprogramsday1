package dec18;
class student{
    int rollno;
    String name;
    student(String str,int val){
        this.name = str;
        this.rollno = val;
    }
    student(int rno,String nam){
        this.rollno = rno;
        this.name = nam;
    }
    void display(){
        System.out.println(rollno);
        System.out.println(name);
    }
}
public class exceptionhandling {
    public static void main(String[] args){
        student s = new student(10,"Ram");
        student s1 = new student(15,"Shyam");
        student s2 = new student(16,"Italy");
        student s3 = new student(17,"India");
        student s4 = new student(18,"Indonesia");
        student s5 = new student(19,"Tough");
        student s6 = new student(20,"Ram");
        student s7 = new student(25,"Shyam");
        student s9 = new student("Things",67);
        student s8=new student(97,"Tune");
        s8.name = "Ronak";
        s8.rollno = 100;
            s.display();
            s4.display();
            s8.display();
            s9.display();
    }
}
