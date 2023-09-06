import java.util.Scanner;

public class DieuKien {
    public static void main(String[] args) {
    /*
    Bài 1: Nhập vào hai số a và b, và kiểm tra xem a có chia hết cho b hay không.
     */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào số a: ");
//        int a = scanner.nextInt();
//        System.out.println("Nhập vào số b: ");
//        int b = scanner.nextInt();
//
//        if (a % b == 0) {
//            System.out.println("a chia hết cho b");
//        } else {
//            System.out.println("a không chia hết cho b");
//        }

        /*
        Bài 2: Nhập tuổi và in ra kết quả nếu tuổi học sinh đó không đủ điều kiện vào học lớp 10.
         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số tuổi: ");
//        int age =  scanner.nextInt();
//        if (age < 15){
//            System.out.println("Tuổi học sinh không đủ điểu kiện vào lớp 10 ");
//        }
//        else{
//            System.out.println("Tuổi học sinh đủ điều kiện vào lớp 10 ");
//
//        }

        /*
        Bài 3: Nhập một số nguyên bất kỳ và in kết quả ra màn hình để nói cho người dùng biết số đó là lớn hay nhỏ hơn 0
         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập 1 số nguyên: ");
//        int number = scanner.nextInt();
//        if(number > 0) {
//            System.out.println(number + " lớn hơn 0");
//        }
//        else if (number < 0){
//            System.out.println(number + " nhỏ hơn 0");
//        }
//        else {
//            System.out.println(number + " bằng 0");
//        }

        /*
        Bài 4: Nhập 3 số nguyên và tìm giá trị lớn nhất của ba số nguyên đó
         */

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào số thứ nhất: ");
//        int firstNumber = scanner.nextInt();
//        System.out.println("Nhập số thứ hai: ");
//        int secondNumber = scanner.nextInt();
//        System.out.println("Nhập số thứ ba: ");
//        int thirdNumber = scanner.nextInt();
//        int Max = firstNumber;
//        if(secondNumber > Max){
//            Max = secondNumber;
//        }
//        if(thirdNumber > Max){
//            Max = thirdNumber;
//        }
//        System.out.println("Giá trị lớn nhất của 3 số là: " + Max);


        /*
         Bài 5: Xếp hạng học lực của học sinh dựa trên các điểm bài kiểm tra, điểm thi giữa kỳ, điểm thi cuối kỳ
         */


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập điểm bài kiểm tra: ");
//        double testScore = scanner.nextDouble();
//        System.out.println("Nhập điểm thi giữa kì: ");
//        double midTermScore = scanner.nextDouble();
//        System.out.println("Nhập điểm thi cuối kì: ");
//        double termEndPoint = scanner.nextDouble();
//        double averageScore = (testScore + midTermScore + termEndPoint) / 3;
//        if (averageScore >= 8.5){
//            System.out.println("Giỏi");
//        }else if (averageScore >= 7){
//            System.out.println("Khá");
//        }else if (averageScore >= 5.5){
//            System.out.println("Trung Bình");
//        }else if (averageScore >= 4){
//            System.out.println("Yếu");
//        }else {
//            System.out.println("Kém");
//        }


        /*
         Bài 6: Tính hoa hồng nhận được tuỳ theo mức doanh số bán hàng 2000 đơn
         */

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào mức doanh số bán hàng: ");
//        int sales = scanner.nextInt();
//        double commission = 0;
//        if (sales >= 20) {
//            commission = sales * 0.1;
//        } else if (sales >= 10) {
//            commission = sales * 0.05;
//        }
//        System.out.println("Hoa hồng nhận được là: " + commission + "%");

        /*
        Bài 7: Tính cước điện thoại cho một hộ gia đình với các thông số đã cho 50, 100,200,500
         */

//        Scanner scanner = new Scanner(System.in);
//        double[] rates = {50, 100, 200, 500};
//        double total = 0;
//        for (int i = 0; i < rates.length; i++) {
//            double rate = scanner.nextDouble();
//            total += rate * rates[i];
//        }
//        System.out.println("Cước điện thoại cho hộ gia đình là: " + total);


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số lượng gói cước: ");
//        int numRates = scanner.nextInt();
//        double[] rates = new double[numRates];
//        for (int i = 0; i < numRates; i++) {
//            System.out.println("Nhập giá trị gói cước thứ " + (i + 1) + ": ");
//            rates[i] = scanner.nextDouble();
//        }
//        double total = 0;
//        System.out.println("Nhập cước điện thoại: ");
//        for (int j = 0; j < numRates; j++) {
//            double rate = scanner.nextDouble();
//            total += rate * rates[j];
//
//        }
//        System.out.println("Cước điện thoại cho hộ gia đình là: " + total);


        /*
        Bài 1: Chuyển từ độ C sang độ F. °C  x  9/5 + 32 = °F
         */

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập nhiệt độ (độ C): ");
//        double celsius = scanner.nextDouble();
//        double fahrenheit = celsius * 9/5 + 32;
//        System.out.println(celsius + " độ C = " + fahrenheit + " độ F");


        /*
        Bài 2: Chuyển từ mét sang feet: ft =m * 3.2808
         */

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập chiều dài (mét): ");
//        double meters = scanner.nextDouble();
//        double feet = meters * 3.2808;
//        System.out.println(meters + " mét = " + feet + " feet");

        /*
        Bài 3: Tính diện tích hình vuông khi biết cạnh a.
         */

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập cạnh hình vuông (a): ");
//        double a = scanner.nextDouble();
//        double area = a * a;
//        System.out.println("Diện tích hình vuông là: " + area);


        /*
        Bài 4: Tính diện tích hình  chữ nhật khi biết 02 cạnh a, b.
         */

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập chiều dài hình chữ nhật (a): ");
//        double a = scanner.nextDouble();
//        System.out.print("Nhập chiều rộng hình chữ nhật (b): ");
//        double b = scanner.nextDouble();
//        double area = a * b;
//        System.out.println("Diện tích hình chữ nhật là: " + area);


        /*
        Bài 5: Tính diện tích tam giác vuông khi biết 02 cạnh kề a, b.
         */

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập cạnh kề thứ nhất (a): ");
//        double a = scanner.nextDouble();
//        System.out.print("Nhập cạnh kề thứ hai (b): ");
//        double b = scanner.nextDouble();
//        double area = (a * b) / 2;
//        System.out.println("Diện tích tam giác vuông là: " + area);


        /*
        Bài 6: Giải phương trình bậc 1.
         */

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập hệ số a: ");
//        double a = scanner.nextDouble();
//        System.out.print("Nhập hệ số b: ");
//        double b = scanner.nextDouble();
//        if (a == 0) {
//            if (b == 0) {
//                System.out.println("Phương trình có vô số nghiệm");
//            } else {
//                System.out.println("Phương trình vô nghiệm");
//            }
//        } else {
//            double x = -b / a;
//            System.out.println("Phương trình có nghiệm x = " + x);
//        }



        /*
        Bài 7: Giải phương trình bậc 2.
         */


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập hệ số a: ");
//        double a = scanner.nextDouble();
//        System.out.print("Nhập hệ số b: ");
//        double b = scanner.nextDouble();
//        System.out.print("Nhập hệ số c: ");
//        double c = scanner.nextDouble();
//        double delta = b * b - 4 * a * c;
//        if (delta < 0) {
//            System.out.println("Phương trình vô nghiệm");
//        } else if (delta == 0) {
//            double x = -b / (2 * a);
//            System.out.println("Phương trình có nghiệm kép x1 = x2 = " + x);
//        } else {
//            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
//            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
//            System.out.println("Phương trình có hai nghiệm phân biệt x1 = " + x1 + ", x2 = " + x2);
//        }


        /*
        Bài 8: Kiểm tra xem một số nhập vào có phải là tuổi của một người không. Một số nguyên là tuổi của một người khi nhỏ 120 và lơn hơn 0..
         */

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập số nguyên: ");
//        int age = scanner.nextInt();
//        if (age > 0 && age < 120) {
//            System.out.println("Số này có thể là tuổi của một người");
//        } else {
//            System.out.println("Số này không phải là tuổi của một người");
//        }


        /*
        Bài 9: Kiểm tra xem 3 số thực (a,b,c) nhập vào có phải là cạnh của một tam giác. Điều kiện để a,b,c là cạnh của một tam giác là:
a,b,c > 0
a + b > c
b + c > a
a + c > b
         */

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập cạnh thứ nhất (a): ");
//        double a = scanner.nextDouble();
//        System.out.print("Nhập cạnh thứ hai (b): ");
//        double b = scanner.nextDouble();
//        System.out.print("Nhập cạnh thứ ba (c): ");
//        double c = scanner.nextDouble();
//        if (a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && a + c > b) {
//            System.out.println("Ba số thực nhập vào có thể là cạnh của một tam giác");
//        } else {
//            System.out.println("Ba số thực nhập vào không phải là cạnh của một tam giác");
//        }


        /*
        Bài 10: Viết chương trình tính giá điện.
         */


//        double[] rates = {1678, 1734, 2014, 2536, 2834, 2927};
//        int[] tiers = {50, 50, 100, 100, 100, Integer.MAX_VALUE};
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập số kWh tiêu thụ: ");
//        int usage = scanner.nextInt();
//        double total = 0;
//        for (int i = 0; i < rates.length; i++) {
//            if (usage > tiers[i]) {
//                total += tiers[i] * rates[i];
//                usage -= tiers[i];
//            } else {
//                total += usage * rates[i];
//                break;
//            }
//        }
//        System.out.println("Tổng tiền điện phải trả là: " + total + " VND");



        /*
        Bài 11: Viết chương trình tính thuế thu nhập cá nhân
         */


        double[] rates = {0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35};
        int[] tiers = {5000000, 10000000, 18000000, 32000000, 52000000, 80000000, Integer.MAX_VALUE};
        int personalDeduction = 11000000;
        int dependentDeduction = 4400000;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập thu nhập chịu thuế: ");
        int taxableIncome = scanner.nextInt();
        System.out.print("Nhập số người phụ thuộc: ");
        int numDependents = scanner.nextInt();
        taxableIncome -= personalDeduction + numDependents * dependentDeduction;
        double tax = 0;
        for (int i = rates.length - 1; i >= 0; i--) {
            if (taxableIncome > tiers[i]) {
                tax += (taxableIncome - tiers[i]) * rates[i];
                taxableIncome = tiers[i];
            }
        }
        System.out.println("Thuế thu nhập cá nhân phải nộp là: " + tax + " VND");



    }
}



















