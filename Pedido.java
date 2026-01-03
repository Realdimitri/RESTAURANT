import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Pedido {
    private  static int cocaCola1L = 12;
    private static int cocaCola350ML = 6;
    private static int sucoMaracuja= 6;
    private static int sucoUva= 6;
    private static List<Cliente> clientes = new ArrayList<>();


    public static void main(String[] args) {
        int op;
        do{
            opcoes();
            op= sc.nextInt();
            sc.nextLine();

            switch (op){
                case 1:
                    cadastro(); break;
                case 2:

                    System.out.println(Cardapio.MostrarCardapio());
            }
        }while (op!=0);

    }


    private static Scanner sc = new Scanner(System.in);


    public static void cadastro() {
        boolean excecao = false;
        do {
            try {

                System.out.println("Cadastro");
                System.out.print("Digite o nome completo: ");
                String nome = sc.nextLine();
                System.out.print("Digite o telefone: ");
                String telefone = sc.next();
                sc.nextLine();
                System.out.print("Digite o endereço: ");
                String endereco = sc.nextLine();
                Cliente cliente = new Cliente(nome, endereco, telefone);
                clientes.add(cliente);
            } catch (IllegalArgumentException e) {
                excecao = true;
                System.out.println(e.getMessage());

            }

        }while (excecao);
        System.out.println(clientes);
    }

    public static  void opcoes(){
        System.out.println("-------ESCOLHA UMA DAS OPÇOES A SEGUIR-------");
        System.out.println("1-CADASTRO");
        System.out.println("2-CARDÁPIO");
        System.out.println("0-SAIR");

    }

}




