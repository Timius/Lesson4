/**
 * Created by User on 14.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        //решение первой задачки
        System.out.println("One\n" + "Two\n" + "Three");
        //решение второй задачки
        double n = 542.95281;
        double i;
        i = n * 100000;
        int s1 = (int) i / 10000000;
        i -= s1 * 10000000;
        int s2 = (int) i / 1000000;
        i = i - s2 * 1000000;  //для разнообразия другим способом вычил
        int s3 = (int) i / 100000;
        i -= s3 * 100000;
        int s4 = (int) i / 10000;
        i -= s4 * 10000;
        int s5 = (int) i / 1000;
        i -= s5 * 1000;
        int s6 = (int) i / 100;
        i -= s6 * 100;
        int s7 = (int) i / 10;
        i -= s7 * 10;
        int s8 = (int) i;
        int s = s1 - s2 + s3 - s4 + s5 - s6 + s7 - s8;
        System.out.println(s1 + "-" + s2 + "+" + s3 + "-" + s4 + "+" + s5 + "-" + s6 + "+" + s7 + "-" + s8 + "=" + s);
        //решение третьей задачки с помощью оператора if
        int d = 1500;
        if (d < 1000) {
            System.out.println("критически малый доход");
        } else if (d >= 1000 & d < 5000) {
           System.out.println("средний доход");
        } else if (d >= 5000 & d < 100000) {
            System.out.println("высокий доход");
        } else {
            System.out.println("миллионер");}
        //решение третьей задачки с помощью оператора выбора switch (правда через .опу)
        /*есть конечно вариант набить кучу кейсов от 1 до 1499 для вывода "критически малый доход"
        далее от 5000 до 100000 и т.д. но это очень долго и надеюсь не требовалось
        */
        int c;
        if (d < 1000) {
            c = 1;    }
        else if (d >= 1000 & d < 5000) {
            c = 2;                     }
        else if (d >= 5000 & d < 100000) {
            c = 3;                      }
        else {
            c = 4;}
            switch (c) {
                case 1:
                    System.out.println("критически малый доход");
                    break;
                case 2:
                    System.out.println("средний доход");
                    break;
                case 3:
                    System.out.println("высокий доход");
                    break;
                case 4:
                    System.out.println("миллионер");
                    break;
            }
        }
    }
