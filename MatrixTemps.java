import java.util.Scanner;
public class MatrixTemps 
    {
    public static void main(String[] args) 
    {
        int[][] ar = new int[24][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 24; i++) 
        {
            ar[i][0] = i;
        }
        for (int i = 0; i < 24; i++)
        {
            System.out.print("Enter the temp at hour " + (i+1) + " in °C : ");
            ar[i][1] = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i < 24; i++) 
        {
            System.out.print("Enter the humidity % at hour " + (i+1) + " : ");
            ar[i][2] = sc.nextInt();
        }
        int maxTempHour = 0, minTempHour = 0, maxHumHour = 0, minHumHour = 0;
        double maxTemp = ar[0][1];
        double minTemp = maxTemp;
        double maxHum = ar[0][2];
        double minHum = maxHum;
        double avgTemp = 0;
        double avgHum = 0;
        for (int i = 0; i < 24; i++) 
        {
            avgTemp = avgTemp + ar[i][1];
            avgHum = avgHum + ar[i][2];
            if (ar[i][1] >= maxTemp) 
            {
                maxTemp = ar[i][1];
                maxTempHour = ar[i][0];
            }
            if (ar[i][1] <= minTemp) 
            {
                minTemp = ar[i][1];
                minTempHour = ar[i][0];
            }
            if (ar[i][2] >= maxHum)
            {
                maxHum = ar[i][2];
                maxHumHour = ar[i][0];
            }
            if (ar[i][2] <= minHum) 
            {
                minHum = ar[i][2];
                minHumHour = ar[i][0];
            }
        }
        avgTemp = avgTemp/24;
        avgHum = avgHum/24;
        System.out.println();
        System.out.println("Avg Temp: " + avgTemp + "°C");
        System.out.println("Avg Humidity: " + avgHum + "%");
        System.out.println("Max Temp: " + maxTemp + "°C at Hour " + (maxTempHour+1));
        System.out.println("Min Temp: " + minTemp + "°C at Hour " + (minTempHour+1));
        System.out.println("Max Humidity: " + maxHum + "% at Hour " + (maxHumHour+1));
        System.out.println("Min Humidity: " + minHum + "% at Hour " + (minHumHour+1));
        sc.close();
    }
}
