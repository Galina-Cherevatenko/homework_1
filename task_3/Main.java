package homework_1.task_3;
import java.util.Scanner;
    public class Main {public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, f1, f2, F;

        System.out.println("Введите n:");
        n = in.nextInt();


    int[] arr = new int[n];

    for (int i = 0; i<n; i++){
        System.out.println("Введите элемент "+ i);
        arr[i] = in.nextInt();
    }
    System.out.print ("Числа Фибоначи: ");
    for (int i = 0; i<n; i++){
        double tmp = 5*arr[i]*arr[i] -4;
        double tmp1 = 5*arr[i]*arr[i] +4;
        double sq = (long)Math.sqrt(tmp);
        double sq1 = (long)Math.sqrt(tmp1);
        if (sq*sq == tmp || sq1*sq1 == tmp1) System.out.print(arr[i] + " ");

    }
    System.out.println (" ");
    System.out.print ("Не числа Фибоначи: ");
    for (int i = 0; i<n; i++){
        double tmp = 5*arr[i]*arr[i] -4;
        double tmp1 = 5*arr[i]*arr[i] +4;
        double sq = (long)Math.sqrt(tmp);
        double sq1 = (long)Math.sqrt(tmp1);
        if (sq*sq != tmp && sq1*sq1 != tmp1) System.out.print(arr[i] + " ");

    }


    in.close();

}
}
