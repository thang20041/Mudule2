import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {


        /*
int : số nguyên
double: số thập phân
String : chuỗi
boolean: logic (true || false)
char : Ký tự
 */
       /* int a = 10;
        double c

        */

        /*
        Toán tử
        - Toán học: *,/,-,+,%,++,--
        - So sánh : >,<,>=,<=,!=,==
        -Toán tử logic: &&, ||, !
            int diem = 95;
            System.out.println(diem >= 90 && diem <= 100);
            System.out.println(diem < 100 || diem > 0);
            System.out.println(!true);
        -Gán : =, +=, -=, *=, /=, %=
             int a = 10;
            a += 5; //a = a + 5
            a %=15; // a= 10 % 15;
            System.out.println(a);

         */

        /*
        Câu điểu kiện : if và swich-case
        if
        if-else
        if-else if
        if lồng
         */


//      Scanner input = new Scanner(System.in);
//      // Scanner : Là 1 lớp để tương tác dữ liệu,
//        // System.in: Dữ liệu nhập từ bàn phím
//        System.out.println("Nhập số: ");
////        int a = input.nextInt(); Nhập số nguyên
////        double a = input.nextDouble(); Nhập
//        String a = input.nextLine(); //Nhập Chuỗi
//        System.out.println("Số vừa nhập là : " + a);

        /*
        Vòng lặp
         */
//        for (int i = 1; i <= 10 ; i++) {
//            System.out.println(i);
//
//        }
//
//        int i = 1;
//        while (i <= 10){
//            System.out.println(i);
//            i++;
//        }
//
//        int a = 1;
//        do {
//            System.out.println(a);
//            a++;
//        }while (a<=10);


        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int item : arr) {
            System.out.println(item);

        }



    }

}


