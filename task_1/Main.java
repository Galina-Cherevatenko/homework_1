package homework_1.task_1;
import java.util.Scanner;
public class Main {public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double Summa, Profit, Dohod, DohodZagod;
    int procent, n;

    System.out.println("Введите сумму вклада:");
    Summa = in.nextDouble();
    System.out.println("Введите процент:");
    procent = in.nextInt();
    System.out.println("Введите количество лет:");
    n = in.nextInt();
    in.close();
    DohodZagod = 0;
    Dohod = 0;
    for (int i = 1; i <= n; i++) {
        Profit = Summa*(1+(double)procent/100);
        DohodZagod = Profit - Summa;
        if (DohodZagod > 42500)
            DohodZagod = DohodZagod - (DohodZagod-42500)*0.13;
        Summa=Summa+DohodZagod;
        Dohod=Dohod+DohodZagod;
    }

    System.out.printf("Ваш доход составит: %.2f", Dohod );

}
}
