import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaração das variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
        // Coleta dos dados
        System.out.println("Por favor, digite o número da Conta!");
        numero = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer
        
        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o seu nome!");
        nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo!");
        saldo = scanner.nextDouble();
        
        // Mensagem final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                          "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + 
                          String.format("%.2f", saldo) + " já está disponível para saque");
        
        scanner.close();
    }
}
