import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        System.out.println("Hi Ae");

//        Scanner input =  new Scanner(System.in);
//        String name = input.nextLine();
//        System.out.println("Hello C07");

//        int a = 10;
//        System.out.println(a);

//        Scanner inputInt = new Scanner(System.in);
//        int number = inputInt.nextInt();
//        System.out.println(number);

//        Scanner inputInt1 = new Scanner(System.in);
//        System.out.println("Nhập số đầu: ");
//        int number1 = inputInt1.nextInt();
//        Scanner inputInt2 = new Scanner(System.in);
//        System.out.println("Nhập số sau: ");
//        int number2 = inputInt2.nextInt();
//        System.out.println((number1 + number2) + " " + (number1 * number2) + " " + (number1 - number2) + " " + (number1 / number2) + " " + (number1 % number2));

//        Scanner inputNumber = new Scanner(System.in);
//        Scanner inputString = new Scanner(System.in);
//
//        System.out.println("Nhập tên: ");
//        String name = inputString.nextLine();
//
//        System.out.println("Nhập tuổi: ");
//        int age = inputNumber.nextInt();
//
//        System.out.println("Xin chào " + " . Tôi tên là " + name + ". Tôi năm nay " + age + " tuổi.");


                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhập số thứ nhất: ");
                int firstNumber = scanner.nextInt();
                System.out.println(" Nhập số thứ hai: ");
                int secondNumber = scanner.nextInt();

                // Using +, -, *, /, %
                int sum = firstNumber + secondNumber;
                int difference = firstNumber - secondNumber;
                int product = firstNumber * secondNumber;
                int quotient = firstNumber / secondNumber;
                int remainder = firstNumber % secondNumber;

                System.out.println("Sum: " + sum);
                System.out.println("Difference: " + difference);
                System.out.println("Product: " + product);
                System.out.println("Quotient: " + quotient);
                System.out.println("Remainder: " + remainder);

                // Using =, +=, -=, *=, /=
                firstNumber += secondNumber;
                System.out.println("firstNumber += secondNumber: " + firstNumber);
                firstNumber -= secondNumber;
                System.out.println("firstNumber -= secondNumber: " + firstNumber);
                firstNumber *= secondNumber;
                System.out.println("firstNumber *= secondNumber: " + firstNumber);
                firstNumber /= secondNumber;
                System.out.println("firstNumber /= secondNumber: " + firstNumber);

                // Using ++, --
                firstNumber++;
                System.out.println("firstNumber++: " + firstNumber);
                firstNumber--;
                System.out.println("firstNumber--: " + firstNumber);

                // Using <, >, <=, >=, ==, !=
                boolean lessThan = firstNumber < secondNumber;
                boolean greaterThan = firstNumber > secondNumber;
                boolean lessThanOrEqual = firstNumber <= secondNumber;
                boolean greaterThanOrEqual = firstNumber >= secondNumber;
                boolean equal = firstNumber == secondNumber;
                boolean notEqual = firstNumber != secondNumber;

                System.out.println("first number < second number: " + lessThan);
                System.out.println("first number > second number: " + greaterThan);
                System.out.println("first number <= second number: " + lessThanOrEqual);
                System.out.println("first number >= second number: " + greaterThanOrEqual);
                System.out.println("first number == second number: " + equal);
                System.out.println("first number != second number: " + notEqual);




    }
}
