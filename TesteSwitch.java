import java.util.Scanner;
public class TesteSwitch{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero");
        numero = teclado.nextInt();

        switch(numero){
            case 1:
                System.out.println("Digitou o valor 1");
                break;
            case 2:
                System.out.println("Digitou o valor 2");
                break;
            case 3:
                System.out.println("Digitou o valor 3");
                break;
            default:
                System.out.println("Digitou outro valor");
        }
    }
}