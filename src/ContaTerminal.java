import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite a Agência !");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o seu nome !");
        String nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o saldo inicial !");
        double saldo = scanner.nextDouble();
        String saudacao = "Olá ";
        // Vou usar concat pois é o que foi pedido no repo do exercício
        String result = saudacao.
        concat(nomeCliente)
        .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
        .concat(agencia)
        .concat(", conta " + numero)
        .concat(" e seu saldo R$" + saldo + " já está disponível para saque.");
        System.out.println(result);
        scanner.close();
    }
}
