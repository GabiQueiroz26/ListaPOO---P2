import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
             
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Normal n = new Normal();
        CamaroteInferior CI = new CamaroteInferior();
        CamaroteSuperior CS = new CamaroteSuperior();
        

        System.out.println("Digite 1 para escolher o ingresso do Tipo Normal ou digite 2 para escolher do Tipo VIP: ");

        int tipoIngresso = sc.nextInt();

        if(tipoIngresso == 1){
            System.out.println();
            n.ImprimeIngressoNormal(tipoIngresso);
        } else {
            System.out.println("Digite 1 para escolher o ingresso do Tipo Camarote Superior ou digite 2 para escolher do Tipo Camarote Inferior: ");
            int tipoIngressoVIP = sc.nextInt();
            if(tipoIngressoVIP == 1){
                System.out.println();
                System.out.println("Você escolheu o Camarote Inferior");
                CI.acesso();
                CI.imprimeLocal(null);
                CI.vIngresso(tipoIngressoVIP);
            } else {
                System.out.println();
                System.out.println("Você escolheu o Camarote Superior");
                CS.vIngressoSuperior(tipoIngressoVIP);
            }
            
        }

        sc.close();
    }
}
