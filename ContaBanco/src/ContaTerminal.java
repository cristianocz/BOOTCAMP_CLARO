import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (java.util.Scanner scanner = new Scanner(System.in)) {
            System.out.print("Por favor, digite o número da Agência: ");
            String agencia = scanner.nextLine();
            
            System.out.print("Digite o número da Conta: ");
            int numero = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
            
            System.out.print("Digite o nome do Cliente: ");
            String nomeCliente = scanner.nextLine();
            
            System.out.print("Digite o saldo da Conta: ");
            double saldo = scanner.nextDouble();
            
            // Exibindo a mensagem final
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
            System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo é R$" + saldo);
            System.out.println("Seu saldo já está disponível para saque.");
        }
    }
}
