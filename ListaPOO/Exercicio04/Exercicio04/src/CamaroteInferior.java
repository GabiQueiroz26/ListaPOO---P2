public class CamaroteInferior extends VIP {

    protected String localizacao = "Rua tal";

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String local) {
        this.localizacao = local;
    }

    public String acesso(){
        return this.localizacao;
    }

    public void imprimeLocal(String local){
        local = this.localizacao;
        System.out.println("Localização: " + local);
    }

    public void vIngresso(double valor2){
        valor2 = this.valor(valor2);
    }
}
