// Name:- Athif Ahamed Mohamed Shaffy
// Student Id:- A00256229
// Program Description:- Program for Unit Conversions, in this program user can convert km,mi,kg,lb,cm,in,g,oz,C,F,K,cups,L
import java.util.Scanner;

class Lab1Sol {
    public static void main(String[] args) {

        //Declare variable variables 
        double inputValue;
        String unit;
        double convertedValue;

        // Prompting and getting user input
        System.out.print("Enter a value to convert:");
        Scanner input = new Scanner(System.in);
        inputValue = input.nextDouble();
        System.out.print("Enter the current unit of measure:");
        unit = input.next();
        input.close();

        // Switch case to convert values
        switch (unit) {
            case "km":
                // Converting km to mi
                convertedValue = inputValue * 0.62;
                System.out.printf("%.2f km is equals to : %.2f mi", inputValue, convertedValue);
                break;
            case "mi":
                // Converting mi to km
                convertedValue = inputValue * 1.61;
                System.out.printf("%.2f mi is equals to : %.2f km", inputValue, convertedValue);
                break;
            case "kg":
                // Converting kg to lb
                convertedValue = inputValue * 2.21;
                System.out.printf("%.2f kg is equals to : %.2f lb", inputValue, convertedValue);
                break;
            case "lb":
                // Converting lb  to kg
                convertedValue = inputValue * 0.45;
                System.out.printf("%.2f lb is equals to : %.2f kg", inputValue, convertedValue);
                break;
            case "cm":
                // Converting centimetre to inches
                convertedValue = inputValue * 0.39;
                System.out.printf("%.2f cm is equals to : %.2f in", inputValue, convertedValue);
                break;
            case "in":
                // Converting inches into centimetre
                convertedValue = inputValue * 2.54;
                System.out.printf("%.2f in is equals to : %.2f cm", inputValue, convertedValue);
                break;
            case "g":
                // Convert grams  into ounce
                convertedValue = inputValue * 0.04;
                System.out.printf("%.2f g is equals to : %.2f oz", inputValue, convertedValue);
                break;
            case "oz":
                // Convert ounce unit into grams
                convertedValue = inputValue * 28.35;
                System.out.printf("%.2f oz is equals to : %.2f g", inputValue, convertedValue);
                break;
            case "C":
                // Converting Celsius to Fahrenheit
                convertedValue = (inputValue * 9 / 5) + 32;
                System.out.printf("%.2f C is equals to : %.2f F", inputValue, convertedValue);
                break;
            case "F":
                // Converting Celsius to Fahrenheit
                convertedValue = (inputValue - 32) * 5 / 9;
                System.out.printf("%.2f F is equals to : %.2f C", inputValue, convertedValue);
                break;
            case "K":
                // Converting Kelvin to Celsius
                convertedValue = inputValue - 273.15;
                System.out.printf("%.2f K is equals to : %.2f C", inputValue, convertedValue);
                break;
            case "cups":
                // Converting cups to Liters
                convertedValue = inputValue * 0.24;
                System.out.printf("%.2f cups is equals to : %.2f L", inputValue, convertedValue);
                break;
            case "L":
                // Converting Liters to cups
                convertedValue = inputValue * 4.17;
                System.out.printf("%.2f L is equals to : %.2f cups", inputValue, convertedValue);
                break;
            default:
                //Invalid unit show error and show list of units
                //km,mi,kg,lb,cm,in,g,oz,C,F,K,cups,L
                System.out.print("Invalid unit of measure. Only the following list of units are supported :  \n km \n mi \n kg \n lb \n cm \n in \n g \n oz \n C \n F \n K \n L \n cups ");
        }

    }
}