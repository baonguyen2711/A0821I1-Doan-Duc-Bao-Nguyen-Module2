package classandobject.baitap;

import java.time.LocalTime;
import java.util.Arrays;

public class StopWatch {
    LocalTime startTime, endTime;
    int miliSecond;
    public StopWatch() {
        startTime = LocalTime.now();
    }
    public void start() {
        startTime = LocalTime.now();
    }
    public void stop() {
        endTime = LocalTime.now();
    }
    public int getElapsedTime() {
        miliSecond = ((endTime.getHour()-startTime.getHour())*3600 +
                (endTime.getMinute()-startTime.getMinute())*60 +
                (endTime.getSecond()-startTime.getSecond())*1000);
        return miliSecond;
    }
}
class StopWatch1 {
    public static void main(String[] args) {
        int[] arr = new int[100000];

        int length = arr.length;
        for (int i = 0; i < length; i++) {
            arr[i] = (int)(Math.random()*1000);
        }


        System.out.println("Before sort");
        System.out.println(Arrays.toString(arr));

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        selectionSort(arr);

        stopWatch.stop();

        int time = stopWatch.getElapsedTime();
        System.out.println("Time sort: " + time);

        System.out.println("After sort");
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[min_index]> arr[j])
                    min_index= j;
            }

            if(min_index!=i){
                int tmp= arr[min_index];
                arr[min_index]= arr[i];
                arr[i]= tmp;
            }
        }
    }
}
