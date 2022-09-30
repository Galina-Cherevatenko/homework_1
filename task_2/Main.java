package homework_1.task_2;
import java.util.Scanner;
public class Main {public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n, f1, f2, F, i;

    System.out.println("Введите n:");
    n = in.nextInt();

    in.close();

    f1=1;
    f2=1;
    i=0;
    if (n==1) System.out.println("N-е число Фибоначи: "+ f1);
    if (n==2) System.out.println("N-е число Фибоначи: "+ f2);
    if (n>2){

        while (i < n-2) {
            F = f1 + f2;
            f1=f2;
            f2=F;
            i = i+1;
        }

        System.out.println("N-е число Фибоначи: "+ f2);}

}
}
