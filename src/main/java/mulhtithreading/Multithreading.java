package mulhtithreading;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

class Multithreading {
   private static final int SIZE = 10_000_000;
   private static final int HALF_SIZE = SIZE / 2;

    public static void main(String[] args) {
        float[] arr = new float[SIZE];
        currentTime(()-> Flow(arr),"Flow");

        float[] arr1 = new float[SIZE];
        currentTime(( )-> dualFlow(arr1),"dualFlow");
        System.out.println("Equals: " + Arrays.equals(arr,arr1));

    }

    private static void Flow(float [] data){
        Flow(data,0);
    }

    private static void Flow(float [] data, int offset){
        for (int index = 0; index < data.length; index++){
            float currentValue = data[index];
            data[index] = cycle(index, currentValue);

        }
    }
//Расщепление массива на два потока/склейка массива
    private static void dualFlow(float[] data){
        float[] copy = Arrays.copyOfRange(data,0,HALF_SIZE);
        float[] copy1 = Arrays.copyOfRange(data,HALF_SIZE, data.length);
        Thread thread1 = new Thread(() -> Flow(copy, 0));
        Thread thread2 = new Thread(() -> Flow(copy1, HALF_SIZE));
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e){
            System.out.println("InterruptedException e");
            e.printStackTrace();
            return;
        }
        System.arraycopy(copy,0,data,0,HALF_SIZE);
        System.arraycopy(copy1,0,data,HALF_SIZE,HALF_SIZE);

    }

    //Цикл по формуле
    private  static float cycle(int index, float currentValue){
    return (float)(currentValue * Math.sin(0.2f + index / 5) * Math.cos(0.2f + index / 5) * Math.cos(0.4f + index / 2));
}

//Продолжительность циклов
private static void currentTime(Runnable action, String Name){
    long a =  System.currentTimeMillis();
    action.run();
    long b =  System.currentTimeMillis();
    long c = b - a;
    System.out.printf("Method %s duration %d ms%n", Name, TimeUnit.MILLISECONDS.toMillis(c));
    }
}



