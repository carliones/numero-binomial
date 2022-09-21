import java.util.Scanner;
public class binomial
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("insira o valor de n");
        int n = input.nextInt();
        System.out.println();
        System.out.println("insira o valor de x");
        int x = input.nextInt();

        agora fat = new agora();
        int valor1 = fat.fato(n);
        System.out.println(valor1);
        int valor2 = fat.fato(x);
        System.out.println(valor2);
        int valor4 = n - x;
        int valor3 = fat.fato(valor4);
        int y = valor2 * valor3;
        int result = valor1 / y;

        System.out.println();
        System.out.printf("o resultado é: %d", result);





    }
}