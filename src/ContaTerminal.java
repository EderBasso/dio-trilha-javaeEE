import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Integer numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o numero da conta: ");
        numero = Integer.parseInt(sc.nextLine());
        System.out.println("Por favor, digite o numero da agecia: ");
        agencia = sc.nextLine();
        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o saldo da conta: ");
        saldo = Double.parseDouble(sc.nextLine());

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque \n", nomeCliente, agencia, numero, saldo);
    }
}