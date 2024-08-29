public class NumeroComplexo {
    private double numReal;
    private double numImg;

    public NumeroComplexo(){
    }
    public NumeroComplexo(double numReal, double numImg){
        this.numReal = numReal;
        this.numImg = numImg;
    }

    public double getNumReal() {
        return numReal;
    }
    public void setNumReal(double valorReal){
        this.numReal = valorReal;
    }
    public double getNumImg(){
        return numImg;
    }
    public void setNumImg(double valorImg){
        this.numImg = valorImg;
    }
    public NumeroComplexo somarNumComplexo(NumeroComplexo outroComplexo){
        return new NumeroComplexo(this.numReal+(outroComplexo.getNumReal()),this.numImg+(outroComplexo.getNumImg()));
    }
    public NumeroComplexo subtrairNumComplexo(NumeroComplexo outroComplexo){
        return new NumeroComplexo(this.numReal-(outroComplexo.getNumReal()),this.numImg-(outroComplexo.getNumImg()));
    }
    public NumeroComplexo multiplicarNumComplexo(NumeroComplexo outroComplexo){
        double valorReal = (this.numReal*outroComplexo.getNumReal())-(this.numImg*outroComplexo.getNumImg());
        double valorImg = (this.numReal*outroComplexo.getNumImg()-(this.numImg*outroComplexo.getNumReal()));
        return new NumeroComplexo(valorReal,valorImg);
    }
    public NumeroComplexo dividirNumComplexo(NumeroComplexo outroComplexo){
        double divisor = (this.numReal*outroComplexo.getNumReal())-(this.numImg*outroComplexo.getNumImg());
        if(divisor==0){
            throw new ArithmeticException("O divisor não por ser zero");
        }
        double valorReal = ((this.numReal*outroComplexo.getNumReal())-(this.numImg*outroComplexo.getNumImg()))/divisor;
        double valorImg = ((this.numImg*outroComplexo.getNumReal())-(this.numReal*outroComplexo.getNumImg()))/divisor;
        return new NumeroComplexo(valorReal,valorImg);
    }
    public boolean ComparaNumComplexos(NumeroComplexo outroComplexo){
        return this.numReal == outroComplexo.getNumReal() && this.numImg == outroComplexo.getNumImg();
    }
    @Override
    public String toString() {
        if (numImg >= 0) {
            return String.format("%.2f + %.2fi", numReal, numImg);
        } else {
            return String.format("%.2f - %.2fi", numReal, -numImg);
        }
    }
    public double moduloNumComplexo(){
        return Math.sqrt(this.numReal*this.numReal+this.numImg*this.numImg);
    }
}
