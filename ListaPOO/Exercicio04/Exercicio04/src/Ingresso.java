public class Ingresso {
    
    protected double valor = 100.00;


    public void imprimeValor(double valorIngresso){
        valorIngresso = this.valor;
        System.out.println(valor);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    
}
