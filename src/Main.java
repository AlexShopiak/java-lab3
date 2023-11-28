import util.Inquirer;
import util.Calculator;

public class Main {
    public static void main(String[] args) {
        String input = Inquirer.inquire();
        System.out.println("\nInput: " + input);

        String output = Calculator.calculate(input);;
        System.out.println("\nOutput: " + output);

        System.out.println();
    }
}
