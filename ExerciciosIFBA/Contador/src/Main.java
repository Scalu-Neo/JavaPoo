import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Contador contadorTest = new Contador();
        contadorTest.setValor(input.nextInt());

        System.out.println("Valor do contador: " + contadorTest.getValor());
        contadorTest.zerarContador();
        System.out.println("Zerando contador: " + contadorTest.getValor());
        contadorTest.incrementarContador();
        System.out.println("Incrementando contador: " + contadorTest.getValor());
    }
}