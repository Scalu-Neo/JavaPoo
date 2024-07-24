public class Ponto2D {
    private double coordenadaX;
    private double coordenadaY;

    public Ponto2D(){
        this.coordenadaX = 0.0;
        this.coordenadaY = 0.0;
    }
    public Ponto2D(double coordenadaX, double coordenadaY){
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }
    public Ponto2D(Ponto2D pontoFinal){
        this.coordenadaX = pontoFinal.coordenadaXGet();
        this.coordenadaY = pontoFinal.coordenadaYGet();
    }

    public double coordenadaXGet(){
        return coordenadaX;
    }
    public void coordenadaXSet(double coordenadaX){
        this.coordenadaX = coordenadaX;
    }
    public double coordenadaYGet(){
        return coordenadaY;
    }
    public void coordenadaYSet(double coordenadaY){
        this.coordenadaY = coordenadaY;
    }
    public void movimentoPonto(double coordenadaX, double coordenadaY){
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }
    public void movimentoPonto(Ponto2D pontoEscolhido){
        this.coordenadaX = pontoEscolhido.coordenadaXGet();
        this.coordenadaY = pontoEscolhido.coordenadaYGet();
    }

    public boolean equals(Ponto2D pontoQualquer){
        if(this.coordenadaX == pontoQualquer.coordenadaXGet() && this.coordenadaY == pontoQualquer.coordenadaYGet()){
            return true;
        }else
            return false;
    }
    @Override
    public String toString(){
        return "(" + this.coordenadaXGet() + "," + this.coordenadaYGet() + ")";
    }

    public double distanciaPontos(Ponto2D ponto){
        double distX = this.coordenadaX-ponto.coordenadaXGet();
        double distY = this.coordenadaY-ponto.coordenadaYGet();
        double disTotal = Math.sqrt(Math.pow(distX,2) + Math.pow(distY,2));
        return disTotal;
    }

    public Ponto2D clonePonto(){
        Ponto2D pontoClonado = new Ponto2D(this.coordenadaX,this.coordenadaY);
        return pontoClonado;
    }
}
