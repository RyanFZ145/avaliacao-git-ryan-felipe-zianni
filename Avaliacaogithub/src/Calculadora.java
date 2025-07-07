import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        System.out.println("Escolha o Método: \n 1 para Adição \n 2 para Multiplicação");
        int res = calc.nextInt();
        if (res == 1){
            Scanner adicao = new Scanner(System.in);
            System.out.println("Digite o primeiro número");
            int a = adicao.nextInt();
            System.out.println("Digite o segundo número");
            int b = adicao.nextInt();

            System.out.println(a + b);
        }
        else {
            Scanner adicao = new Scanner(System.in);
            System.out.println("Digite o primeiro número");
            int a = adicao.nextInt();
            System.out.println("Digite o segundo número");
            int b = adicao.nextInt();

            System.out.println(a * b);
        }
    }
}

