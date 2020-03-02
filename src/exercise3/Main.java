package exercise3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        for (long i = 10_000; i <=100000000000L ; i*=10) {
            Date temp = new Date(i);
            System.out.println(i+" - "+ temp.toString());
        }
    }
}
