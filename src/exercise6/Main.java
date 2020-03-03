package exercise6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int MAXIMUM_NUMBERS = 100_000;
        int[] array = new int[MAXIMUM_NUMBERS];
        for (int i = 0; i <MAXIMUM_NUMBERS ; i++) {
            array[i]=new Random().nextInt(100);
        }
        StopWatch time = new StopWatch();
        for (int i = 0; i < array.length; i++) {
            int positionOfMin =i;
            for (int j = i+1; j < array.length; j++) {
                if (array[positionOfMin]>array[j])
                    positionOfMin=j;
            }
            int temp= array[i];
            array[i]=array[positionOfMin];
            array[positionOfMin]=temp;
        }
        time.stop();
        System.out.println(time.getElapsedTime());
    }
}
