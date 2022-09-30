package homework_1.task_1;
import java.util.Scanner;
public class Main {public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double S, R, Dohod;
    int p, n;

    System.out.println("Введите сумму вклада:");
    S = in.nextDouble();
    System.out.println("Введите процент:");
    p = in.nextInt();
    System.out.println("Введите количество лет:");
    n = in.nextInt();
    in.close();

    R = 1;
    for (int i = 1; i <= n; i++)
        R = R*(1+(double)p/100);

    Dohod = S*R-S;
    if (Dohod > 42500)
        Dohod = 0.87*Dohod;

    System.out.printf("Ваш доход составит: %.2f", Dohod );

}
}
