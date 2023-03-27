import java.util.Random;
import java.util.Scanner;

public class DataPoints {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);



        int firstMatchingIndex = -1;
        int inputMatchIndex;
        int inputNumber ;
        final int COUNT = 100;
        int[] dataPoints = new int[COUNT];
        Random r = new Random();
        for(int i = 0 ; i < COUNT; i++){
//populate int between 1 and 100
            dataPoints[i] = 1+r.nextInt(100);
        }
//print numbers separating with pipe
        for(int i= 0; i < COUNT; i++){
            int currentDataPoint = dataPoints[i];
            System.out.print(currentDataPoint);
            if(i < COUNT-1)
                System.out.print("|");
        }

        int sum = 0;
//do sum
        for(int i = 0 ; i < COUNT; i++){
            sum = sum + dataPoints[i];
        }
//do average
        double avg = (float)sum/COUNT;
//print sum and average
        System.out.println("\nThe SUM of the random array dataPoints is: "+sum);
        System.out.println("The AVERAGE of the random array dataPoints is: "+avg);


//get input between 1 and 100
        inputNumber = SafeInput.getRangedInt(in, "Enter a number between 1 and 100", 1, 100);
//find total match of input in dataPoints
        int matchCount = 0;
        for(int i : dataPoints){
            if(i==inputNumber)
                matchCount++;
        }
//print
        System.out.println("INPUT "+inputNumber+" is found "+matchCount+" times in the dataPoints array.");

//get input in

        inputMatchIndex = SafeInput.getRangedInt(in, "Enter another number between 1 and 100", 1, 100);
//find first matching index in dataPoints
        for(int i = 0; i < COUNT; i++){
            if(dataPoints[i]==inputMatchIndex){
                firstMatchingIndex = i;
                break;
            }
        }
        if(firstMatchingIndex == -1){
            System.out.println("The value "+inputMatchIndex+" was NOT FOUND at dataPoints array.");
        }else{
            System.out.println("The value "+inputMatchIndex+" was found at array index "+firstMatchingIndex);
        }


        int min = dataPoints[0];
        int max = dataPoints[0];
//fins minimum and maximum
        for(int i = 1; i < COUNT; i++){
            int currentData= dataPoints[i];
            if(currentData > max)
                max = currentData;
            if(currentData < min)
                min = currentData;
        }

        System.out.println("Minimum Value in the dataPoints = "+min);
        System.out.println("Maximum Value in the dataPoints = "+max);
//define double array
        double[] dataPointsDouble = {5.89,20.67,84.22,122.99,265.90,12.75};
//call getAverage
        System.out.println("Average of dataPoints(double) is: " + getAverage(dataPointsDouble));

    }

    public static double getAverage(double[] values){
        double sum = 0;
        double avg = 0;
        if(values!=null && values.length!=0){
            for(double d: values){
                sum = sum + d;
            }
            avg = sum/values.length;
        }
        return avg;

    }
}