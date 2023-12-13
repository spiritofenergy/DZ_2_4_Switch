package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("1.С помощью цикла do..while, выведите римские цифры (код начинается с 8544). " +
                "Начало: char c = 8544; ...");
   char r = 8544;
   do {
       System.out.print(r + " , ");
       r++;
   }while (r < 8560);
        System.out.println("\n");

        ////////////////
       System.out.println("2.С помощью цикла do..while, выведите числа от -0.9 до 0.9");
       double i = -0.9;
       do {
           System.out.print(Math.round(i * 100.0) / 100.0 + ", ");
           i+=0.1;
       }
       while (i < 0.9);
        System.out.println("\n");

      ///////////////////
        System.out.println("3.Пользователь вводит строку, выведите каждый второй символ (подсказка: str.charAt(i) )");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        for (int il = 0; il < word.length() - 1; il++) {
            if ((il + 1) % 2 == 0) {
                System.out.print(word.charAt(il));
                System.out.print(", ");
            }
        }System.out.println("\n");

        //////////////////
        System.out.println("4.Пользователь вводит строку. " +
                "Выводите все слова на разных строках (подсказка : if (str.charAt(i)==‘ ‘) System.out.println(); )");
        System.out.println("Введите слова через пробел");

        String str = scanner.nextLine();
        int i7 = 0;
        while (i7 < str.length()) {
            if (str.charAt(i7) == ' ') {
                System.out.println();
            } else {
                System.out.print(str.charAt(i7));
            }
            i7++;
        }
        System.out.println("");
        char v = 8545;
        System.out.println("Вариант " + v);

        ////////////////
        System.out.println("Введите слова через пробел");
        String strMain = scanner.nextLine();
        String[] arrSplit = strMain.split(" ");
        for (int y =0; y < arrSplit.length; y++)
        {
            System.out.println(arrSplit[y]);
        } System.out.println("\n");

        //////////////////
        System.out.println("5.Пользователь вводит строку. Выведите первые 3 слова.");
        System.out.println("Введите слова через пробел");

        String line = scanner.nextLine();
        String[] words = line.split(" ");
        int i5 = 0;
        while (i5 < words.length) {
            System.out.print(words[i5]);
            if ((i5 + 1) % 3 != 0) {
                System.out.print(" ");
            } else {
               break;
            }
            i5++;
        } System.out.println("\n");

        ////////////////////
        System.out.println("6.Пользователь вводит строку, выведите ее задом-наперёд.");
        System.out.println("Введите слова через пробел");

        String str1 = scanner.nextLine();
        String result = "";
        for (int i1 = 0; i1 < str1.length(); i1++) {
            result = str1.charAt(i1) + result;
        }
        System.out.println(result);


        v = 8545;
        System.out.println("Вариант "+v);  System.out.println("\n");


        //////////////////
        System.out.println("Введите слова через пробел");
        String str13 = scanner.nextLine();
        char[] array = str13.toCharArray();
        String result1 = "";
        for (int i2 = array.length - 1; i2 >= 0; i2--) {
            result1 = result1 + array[i2];
        }
        System.out.println(result1);

        //////////////////
        System.out.println("7.Пользователь вводит букву. Выведите любое слово, начинающуюся на эту букву.");
        System.out.println("Введите строку:");
        String string = scanner.nextLine();
        System.out.println("Введите букву:");
        String letter = scanner.next();
        char firstLetter = letter.charAt(0);
        char[] chars = string.toCharArray();
        String world = "";
        for (int i3 = 0; i < chars.length - 1; i3++) {
            if (chars[i3] == ' ' && !world.equals("")) {
                if (word.toCharArray()[0] == firstLetter) {
                    System.out.println(world);
                }
                word = "";
                continue;
            }
            world = world.concat(String.valueOf(chars[i3]));
        }

        System.out.println("8.Пользователь вводит цифру: выведите страну, телефонный код которого начинается на эту цифру.");
        System.out.println("Введите код страны от 0 до 9");
        int codNumber;

        while (true) {
            codNumber = scanner.nextInt();
            switch (codNumber) {
                case (1):
                    System.out.println("Америка");
                    break;
                case (2):
                    System.out.println("Египет");
                    break;
                case (3):
                    System.out.println("Украина");
                    break;
                case (4):
                    System.out.println("Германия");
                    break;
                case (5):
                    System.out.println("Кипр");
                    break;
                case (6):
                    System.out.println("Финляндия");
                    break;
                case (7):
                    System.out.println("Швеция");
                    break;
                case (8):
                    System.out.println("Сингапур");
                    break;
                case (9):
                    System.out.println("Австралия");
                    break;
                default:
                    System.out.println("Нет такого кода");
                    break;

            }


            System.out.println("9.Пользователь вводит цифру. Если она от 0 до 6 -пусть вводит еще. Если 9 -конец. \n" +
                    "Если 7,8 -пусть вводит строки до тех пор, пока не введет «стоп» (на этом все)");

            System.out.println("Введите код страны от 0 до 9");
            int cod = 0;
            String stop = "stop";

            stop = scanner.nextLine();
            cod = scanner.nextInt();
            show(cod, cod);
            show(stop, cod);


        }
    }
    public static void show(Object input, int cod) {

        if (input instanceof Integer) {
            switch (cod) {
                case (1):
                    System.out.println("Введите ещё");
                    break;
                case (2):
                    System.out.println("Введите ещё");
                    break;
                case (3):
                    System.out.println("Введите ещё");
                    break;
                case (4):
                    System.out.println("Введите ещё");
                    break;
                case (5):
                    System.out.println("Введите ещё");
                    break;
                case (6):
                    System.out.println("Введите ещё");
                    break;
                case (7):
                    System.out.println("Введете «стоп»");
                    break;
                case (8):
                    System.out.println("Введете «стоп»");
                    break;
                case (9):
                    System.out.println("Конец");
                    break;
                default:
                    System.out.println("Нет такого кода");
                    break;
            }
        } else if (input instanceof String){
        if(((String)input).contains("stop")){
        System.out.println("GAME OVER");
        }else{
        System.out.println("Entered 'stop");
        }

        }
    }
}






