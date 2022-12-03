public class CamaroteSuperior extends VIP {

    protected double adicional = 40.00;

    public void vIngressoSuperior(double valor1){
        valor1 = this.valor(valor1) + adicional;
        System.out.println("Valor total a pagar com o adicional: " + valor1);
    }
}
