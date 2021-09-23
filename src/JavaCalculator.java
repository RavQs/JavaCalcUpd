import java.util.Scanner;

public class JavaCalculator {
   static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


            String line = scan.nextLine();

            try {
                String[] symbols = line.split(" ");

                if(symbols.length != 3)
                    throw new Exception("Try again, please");

                Number Num1 = InputCheck.CheckNums(symbols[0]);
                Number Num2 = InputCheck.CheckNums(symbols[2], Num1.getType());
                String result = Calculation.doMath(Num1,Num2,symbols[1]);
                System.out.println(result);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }



}
