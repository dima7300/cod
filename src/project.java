import java.util.Scanner;

public class project {
    public static void main(String[] args) {
//
//
////
////                                                  Задание 1
//
////        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] numbers = new int[10];
//        Scanner num = new Scanner(System.in);
////        int x = num.nextInt();
//
//        for (int i = 0; i < numbers.length; i++) {
//            int x = num.nextInt();
//            numbers[i] = x;
//        }
//        System.out.println(numbers);
//
//        for (int number : numbers) {
//            System.out.println(number);
//        }
////
//            for (int i = 0; i < numbers.length; i++) {
////                int mum = i % 2;
//                    if (i % 2 == 1) {
//
////
//                        System.out.println(numbers[i] * numbers.length);
//                    }
//            }
////
////
////
////
////                                                     Задание 2
//
//        int[] numbers1 = {1, 2, 3, 4, 5};
//        int[] numbers2 = {6, 7, 8, 9, -3};
//        for (int number : numbers1) {
//            System.out.println(number);
//        }
//        System.out.println("~~~~~~~~~~_~_~_~_~_~_~_~_~_~_~_~");
//        for (int number : numbers2) {
//            System.out.println(number);
//        }
//        double summ1 = 0;
//        double summ2 = 0;
//        for (double number1 : numbers1) {
//            summ1 +=number1;
//        }
//            System.out.println("Среднее арифметическое массива1 -  " + summ1/ numbers1.length);
//
//        for (double number2 : numbers2) {
//            summ2 +=number2;
//        }
//            System.out.println("Среднее арифметическое массива2 -  " + summ2/ numbers2.length);
//        if (summ1 == summ2) {
//            System.out.println("Среднее арифметическое массивов равны");
//        }
//        else if (summ1 > summ2) {
//            System.out.println("Среднее арифметическое массива1 больше массива2");
//        }
//        else {
//            System.out.println("Среднее арифметическое массива2 больше массива1");
//        }
////
////
////////                                              Задание 3
//
//        String[] namen = {"я ", "иду ", "в ", "магазин ", "за ", "чипсами ", "очень долго "};
////        Scanner input = new Scanner()
//        for (int i = 0; i < namen.length/2; ++i ) {
//
////            int index = namen.length - 1;
//
////            System.out.println(namen[namen.length-1 -i]);
////            System.out.println(namen[i]);
//            String x = namen[i];
//            namen[i] = namen[namen.length-1 -i];
//            namen[namen.length-1 -i] = x;
//
//        }
//        for (String str: namen) {
//
//            System.out.println(str);
//        }

        Scanner input = new Scanner(System.in);
        System.out.println("Что такое: синий, большой, с усами и полность набит зайцами?");

//        String name3 = input.nextLine();
        boolean x = false;
        int n = 3;
        for (var i = 0; i < n; ++i) {
            if (x){
                break;
            }
            String name3 = input.nextLine();

            switch (name3) {
                case "тролейбус":
                    x = true;
                    System.out.println("Правильно");
                    break;

                case "сдаюсь":
                    x = true;
                    System.out.println("Правильный ответ - Тролейбус.");
                    break;

                default:
                    System.out.println("Подумай еще");
                    break;
            }

        }
    }
}