
 import java.util.Scanner;

 public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favro, digite o número da Agência !");
        Integer agencia = scanner.nextInt();

        System.out.println("Insira o número da Conta !");
        String numero = scanner.next();

        System.out.println("Digite o seu Nome !");
        String nome = scanner.next();

        System.out.println("Digite o seu saldo!");
        Double saldo = scanner.nextDouble();




        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();

    }

}