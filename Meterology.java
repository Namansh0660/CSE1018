import java.util.Scanner;
public class Metrology 
{
    public static void main(String[] args) 
    {
        double[][] data = new double[5][3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) 
        {
            data[i][0] = i+1;
            System.out.println("Enter Temperature for Hour "+(i+1));
            data[i][1] = scanner.nextDouble();
            System.out.println("Enter Humidity for Hour "+(i+1));
            data[i][2] = scanner.nextDouble();
        }
        double avgTemperature = 0, avgHumidity = 0;
        for (int i = 0; i < 5; i++) 
        {
            avgTemperature += data[i][1];
            avgHumidity += data[i][2];
        }
        avgTemperature /= 5;
        avgHumidity /= 5;
        System.out.println("Average temperature: " + avgTemperature);
        System.out.println("Average humidity: " + avgHumidity);
        double maxTemperature = data[0][1], minTemperature = data[0][1];
        int maxTemperatureHour = 1, minTemperatureHour = 1;
        for (int i = 1; i < 5; i++) {
            if (data[i][1] > maxTemperature) 
            {
                maxTemperature = data[i][1];
                maxTemperatureHour = (int) data[i][0];
            }
            if (data[i][1] < minTemperature) 
            {
                minTemperature = data[i][1];
                minTemperatureHour = (int) data[i][0];
            }
        }
        System.out.println("Max temperature : "+maxTemperature);
        System.out.println("Hour of maximum temperature: " + maxTemperatureHour);
        System.out.println("Min temperature : "+minTemperature);
        System.out.println("Hour of minimum temperature: " + minTemperatureHour);

        double maxHumidity = data[0][2], minHumidity = data[0][2];
        int maxHumidityHour = 1, minHumidityHour = 1;
        for (int i = 1; i < 5; i++) {
            if (data[i][2] > maxHumidity) 
            {
                maxHumidity = data[i][2];
                maxHumidityHour = (int) data[i][0];
            }
            if (data[i][2] < minHumidity) 
            {
                minHumidity = data[i][2];
                minHumidityHour = (int) data[i][0];
            }
        }
        System.out.println("Max Humidity : "+maxHumidity);
        System.out.println("Hour of maximum humidity: " + maxHumidityHour);
        System.out.println("Min Humidity : "+minHumidity);
        System.out.println("Hour of minimum humidity: " + minHumidityHour);
        scanner.close();
    }

}
