// Jose Guzman
// October 1, 2023
// created a formula to convert fahrenheit to celsius
// File name: ForLoops.java
// To Compile in terminal type: javac ForLoops.java
// To Run in terminal type: java ForLoops

public class ForLoops {
    public static void main(String[] args) {
        double approximateCelsius;
        double exactCelsius;
        int fahrenheit = 0;

        System.out.println("Fahrenheit\tApproximate Celsius\tExact Celsius");

        for (fahrenheit = 0; ; fahrenheit++) {
            approximateCelsius = (fahrenheit - 30) / 2.0;
            exactCelsius = (5.0 / 9.0) * (fahrenheit - 32);

            System.out.println(fahrenheit + "\t\t" + approximateCelsius + "\t\t\t" + exactCelsius);

            if (Math.abs(approximateCelsius - exactCelsius) > 4.0) {
                break; 
            }
        }
    }
}
