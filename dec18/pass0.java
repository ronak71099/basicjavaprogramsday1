package dec18;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.*;
class PassO {
    static int s;
    public static void main(String [] args)
    {
        PassO p = new PassO();
        p.start();
        System.out.println(s);
    }

    void start()
    {
        int x = 7;
        twice(x);
        System.out.print(x + " ");
    }

    void twice(int x)
    {
        x = x*2;
        s = x;
    }
}