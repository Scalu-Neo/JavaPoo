import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Ponto2D pontoOne = new Ponto2D();
        Ponto2D pontoTwo = new Ponto2D(-12.2,15.5);

        System.out.println("Inserindo as coordenadas X e Y para mover o pontoOne:");
        pontoOne.coordenadaXSet(input.nextDouble());
        pontoOne.coordenadaYSet(input.nextDouble());

        pontoOne.movimentoPonto(pontoOne.coordenadaXGet(),pontoOne.coordenadaYGet());
        System.out.println("Posição atual do pontoOne: " + pontoOne.toString());
        System.out.println("Posição previamente setada pelo construtor do pontoTwo: " + pontoTwo.toString());

        double ResultDistancia = pontoOne.distanciaPontos(pontoTwo);
        System.out.printf("\nCalculando distância entre o pontoOne e o pontoTwo: %.2f\n", ResultDistancia);

        Ponto2D pontoThree = pontoOne.clonePonto();
        if(pontoOne.equals(pontoThree)){
            System.out.println("O pontoThree é o clone de PontoOne");
        }

    }
}