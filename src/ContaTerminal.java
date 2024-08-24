import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Instancia o Scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicitação de informações ao usuário
        System.out.println("Por favor, digite o número da Conta:");
        numero = scanner.nextInt();

        // Consumir a quebra de linha após o próximo Int
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        saldo = scanner.nextDouble();

        // Mensagem final
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);

        // Fecha o Scanner
        scanner.close();
    }
}

