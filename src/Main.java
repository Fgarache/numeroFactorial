import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1;
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        num1= sc.nextInt();
        Main main = new Main();
        System.out.println("el Factorial de "
                +num1+" es "
                +main.factorial(num1));
    }
    public int factorial (int n){
        if (n < 0) {
            //validar
            return 0;
        }else{
                if (n == 0) {
                    return 1;
                } else {
                    return n* factorial(n-1);
                }
            }
        }
    }
