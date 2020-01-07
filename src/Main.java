import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int counter  = 0;
        double sum = 0;
        System.out.println("Enter size of an array");
        int size = keyboard.nextInt();
        double[] temperature = new double[size];
        System.out.println("Enter ten temperature");
        for(int i = 0; i<10; i++)
        {
            System.out.println("Enter temperature for day: "+ (i+1));
            temperature[i] = keyboard.nextDouble();
            sum = sum+temperature[i];

        }

        double average = sum/temperature.length;
        for(int i = 0; i<10; i++)
        {
            if(temperature[i] > average)
                counter++;

        }
        System.out.println("the average temperature is: " + average);
        System.out.println("the number of days temperature is above the average: " + counter);



    }
}
