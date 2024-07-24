public class Contador {
    private int valor;

    public Contador(){

    }
    public Contador(int valor){
        this.valor = valor;
    }

    public void zerarContador(){
        this.valor = 0;
    }
    public void incrementarContador(){
        this.valor++;
    }
    public int  getValor(){
        return valor;
    }
    public void setValor(int novoValor){
        this.valor = novoValor;
    }

}
