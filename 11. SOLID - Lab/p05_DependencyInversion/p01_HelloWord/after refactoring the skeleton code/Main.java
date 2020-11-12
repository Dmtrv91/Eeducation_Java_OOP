package p05_DependencyInversion.p01_HelloWord;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        HelloWorld helloWorld = new HelloWorld();
        Date date = new Date();
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        int i = calendar.get(Calendar.HOUR);
        System.out.println(helloWorld.greeting("Ivan", i));
    }
}
