package dec21;
class student{
    int number=10;
    String name="shyam";
//    student(int a,String b){
//        this.number = a;
//        this.name = b;
//    }
    void displayDetails(){
        System.out.println(number);
        System.out.println(name);
    }
}
public class gettinghandsdirty extends student {
    public static void main(String[] args) {
        student s = new gettinghandsdirty();

        s.displayDetails();
        s.name="ram";
        s.number=1;
        s.displayDetails();

    }

    }
