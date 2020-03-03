package exercise4;

import java.util.Random;

public class Main {


    public static void main(String[] args) {
        Random temp = new Random(1000);
        for (int i = 0; i < 50; i++) {
            if (i%10==9)
                System.out.println(temp.nextInt(100));
            else
                System.out.print(temp.nextInt(100)+" ");
        }
    }
}
