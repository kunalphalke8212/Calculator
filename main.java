package Calculator;

import java.util.Scanner;

public class main {

    public static void main(String args[]) {

        System.out.println("Enter a number no 1:");
        Scanner sd = new Scanner(System.in);
        int no1 = sd.nextInt();
        System.out.println("Enter a second no 2:");
        int no2 = sd.nextInt();

        System.out.println("Select your method");
        System.out.println("1.Add\n 2.sub\n 3.multi \n 4.div\n 5.power\n 6.min\n 7.max");
        int chose = sd.nextInt();
        addcal obj = new addcal();

        switch (chose) {
            case 1:
                int r1 = obj.add(no1, no2);
                System.out.print("your add " + r1);
                break;
            case 2:
                int r2 = obj.sub(no1, no2);
                System.out.print("your sub " + r2);
                break;
            case 3:
                int r3 = obj.multi(no1, no2);
                System.out.print("your multi " + r3);
                break;
            case 4:
                int r4 = obj.div(no1, no2);
                System.out.print("your div " + r4);
                break;
            case 5:
                double r5 = obj.pow(no1, no2);
                System.out.print("your power " + r5);
                break;
            case 6:
                double r6 = obj.min(no1, no2);
                System.out.print("your min " + r6);
                break;
            case 7:
                double r7 = obj.max(no1, no2);
                System.out.print("your min " + r7);
                break;
            default:
                break;
        }
        sd.close();

    }
}
