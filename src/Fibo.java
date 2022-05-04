import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        int num1 =0, num2=1, dato, contador=0;
        System.out.println("Ingrese el numero");
        Scanner sc =new Scanner(System.in);
        dato = sc.nextInt();
        System.out.println("Numeros de fibonacci: ");

        for (int i = 0; i < dato; i++) {
            System.out.print(" "+num1);
            num1=num1+num2;
            num2=num1-num2;

        }

    }


}
