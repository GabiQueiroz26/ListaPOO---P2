import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
   
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o nome do cliente:");
        String nome = sc.nextLine();
        System.out.println("Entre com o endereço do cliente:");
        String endereco =  sc.nextLine();
        System.out.println("Entre com a idade do cliente: ");
        int idade = sc.nextInt();
        System.out.println("Entre com o cpf do cliente: ");
        String cpf = sc.next();

        Cliente c = new Cliente(nome,endereco,cpf,idade);

        System.out.println("Validando o cpf..." );
        c.validaCPF();

        sc.close();
    }


}
