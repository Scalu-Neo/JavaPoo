public class Main {
    public static void main(String[] args) {

        Data fullData = new Data(5,2,2025);
        Data outraData = new Data(25,2,2025);

        System.out.println("Exibindo data por extenso\n  ");
        System.out.println(fullData.getDia()+" de "+fullData.getMesExtenso()+" de "+fullData.getAno());
        System.out.println("Comparando datas:\nCaso 0: As datas são iguais; " +
                "\nCaso 1: A data atual é maior;\nCaso -1: a data atual é menor ");
        System.out.println(fullData.comparaData(outraData));

    }
}