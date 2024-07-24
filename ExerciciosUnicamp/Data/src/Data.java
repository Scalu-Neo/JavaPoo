public class Data {
    private int dia;
    private int mes;
    private int ano;
    public Data(int dia, int mes, int ano){
        if(validaData(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }else{
            this.dia=1;
            this.mes=1;
            this.ano=1;
        }
    }
    public int getDia(){

        return this.dia;
    }
    public int getMes(){

        return this.mes;
    }
    public int getAno(){

        return this.ano;
    }
    public String getMesExtenso(){
        String arrayMes[]={"Janeiro","Fevereiro","Março","Abril","Maio","Junho",
                "Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        return arrayMes[this.mes -1];
    }
    public boolean validaData(int dia, int mes, int ano){
        boolean check=false;
        if(ano>=1 && mes>=1 && mes<=12){
            if(dia>=1 && dia<=diaMes(mes,ano)){
                check = true;
            }
        }
        return check;
    }

    public int diaMes(int mes, int ano){
        int auxdia;
        if(mes==2){
            if(isBissexto(ano)){
                auxdia=29;
            }else{
                auxdia=28;
            }
        } else if (mes==4 || mes==6 || mes==9 || mes==11) {
            auxdia=30;
        }else{
            auxdia=31;
        }
        return auxdia;
    }
    public boolean isBissexto(int ano){
        boolean check;
        if((ano%4==0 && ano%100!=0) || ano%400==0){
            check = true;
        }else{
            check = false;
        }
        return check;
    }
    public int comparaData(Data outraData){
        int result=-1;
        if(this.dia==outraData.getDia() && this.mes==outraData.getMes() && this.ano==outraData.getAno()){
            result = 0;
        } else if (this.ano > outraData.getAno() || (this.ano == outraData.getAno() && this.mes > outraData.getMes())
                || (this.ano == outraData.getAno() && this.mes == outraData.getMes() && this.dia > outraData.getDia())){
            result = 1;
        }
        return result;
    }
}

