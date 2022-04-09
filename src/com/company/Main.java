package com.company;

import java.util.Scanner;



public class Main {

    public static void main(String...args) throws Exceptions {

        double x;
        double y;
        Scanner scanner = new Scanner(System.in);


            for (int i = 3; i >= 0; i--) {
                for (Calc str: Calc.values() ) {
                    System.out.println(str.ordinal()+" - "+ str);
                }
//                System.out.println("""
//                        Выберите операцию:\s
//                          0 = сумма\s
//                          1 = минус\s
//                          2 = деление\s
//                          3 = умножить\s
//                          4 = очистить консоль\s""");

                int operations = scanner.nextInt();
                if (operations < 4) {
                    i++;
                    System.out.println("Вы выбрали: " + Calc.values()[operations].print());
                    System.out.println("Введите первое значение");
                    x = scanner.nextDouble();
                    System.out.println("Введите второе значение");
                    y = scanner.nextDouble();


                System.out.println("Ваш результат по операции: " + Calc.values()[operations] + " = "
                        + Calc.values()[operations].result(x, y));

                    Calc.values()[operations].result(x, y);

                } else if (operations > 4) {
                    System.out.println("Вы выбрали неверную операцию \n" +
                            " попробуйте снова \n количество попыток: " + i);
                } else if (operations == 4) {
                    for (int j = 0; j < 100; j++) {
                        System.out.println(" ");
                    }
                    System.out.println("чисто");
                }
            }
            System.out.println("Вы потратили все попытки до свидания");
    }
}
