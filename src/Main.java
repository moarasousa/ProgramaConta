import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Moara";
        String tipoDeConta = "conta-corrente";
        double saldo = 2500.00;

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************");


        //Menu de Opções
        Scanner leitura = new Scanner(System.in);
        String menu = """
                ****Digite sua opção:****
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair
                """;
        int opcao = 0;
        while(opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();


            if (opcao == 1){
                System.out.println("Seu saldo atual é: " + saldo);
            } else if (opcao == 2){
                System.out.println("Valor desejado a ser transferido:");
                double valor = leitura.nextDouble();
                    if (valor > saldo) {
                        System.out.println("Não é possível realizar a transferência.");
                    } else {
                        saldo -= valor;
                        System.out.println("Transferência realizada!");
                        System.out.println("Saldo atual:  " + saldo);
                        }
            } else if (opcao == 3){
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atual:  " + saldo);
            } else if (opcao != 4){
                System.out.println("Opção Inválida");
            }
        }





    }
}