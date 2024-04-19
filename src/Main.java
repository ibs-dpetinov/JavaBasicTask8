import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое положительное число n");
        int n = console.nextInt();
        int i = 1;
        int result = 0;
        while ((i <= n)) {
            if (i % 2 != 0) result += i;
            i += 1;
        };

        System.out.println("Сумма нечетных чисел <= n равна " + result);
    }
}