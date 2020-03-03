package exercise5;

import java.util.GregorianCalendar;

public class Main {


    public static void main(String[] args) {
        GregorianCalendar temp = new GregorianCalendar();
        System.out.println(temp.get(GregorianCalendar.YEAR));
        System.out.println(temp.get(GregorianCalendar.MONTH));
        System.out.println(temp.get(GregorianCalendar.DAY_OF_MONTH));
        temp.setTimeInMillis(1234567898765L);
        System.out.println(temp.get(GregorianCalendar.YEAR));
        System.out.println(temp.get(GregorianCalendar.MONTH));
        System.out.println(temp.get(GregorianCalendar.DAY_OF_MONTH));

    }
}
