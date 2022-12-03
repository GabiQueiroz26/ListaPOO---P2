public class VIP extends Ingresso {

    protected double valorAdicional = 50.00;


    public double valor(double valorIngressoVIP){
        valorIngressoVIP = this.valor + this.valorAdicional;
        System.out.println("Valor Ingresso VIP: " + valorIngressoVIP);
        return valorIngressoVIP;
    }


    public double getValorAdicional() {
        return valorAdicional;
    }


    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
}
