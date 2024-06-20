
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);
        //Exibir as mensagens para o novo usuário
        System.out.println("Por favor, digite o numero da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o numero da agencia:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo:");
        double saldo = scanner.nextDouble();

        //Obter pela scanner os valores digitados no terminal
        scanner.close();

        //Exibir a mensagem conta criada
        String mensagem = "Ola" +nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agencia:" +agencia+ ", conta:" +numero+ "e seu saldo:" +saldo+ "ja esta disponivel.";
        System.out.println(mensagem);

    }     
}
