import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        
        System.out.print("Número da agência: ");
        int Numero = scanner.nextInt();
        scanner.nextLine(); // esta linha consome o \n do int
        System.out.print("Código da agência: ");
        String Agencia = scanner.nextLine();
        System.out.print("Nome do cliente: ");
        String NomeCliente = scanner.nextLine();
        System.out.print("Saldo do cliente: ");
        double Saldo = scanner.nextDouble();

        System.out.println("Olá, " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + ", e seu saldo de " + Saldo + " já está disponível para saque.");
        scanner.close();
    }
}
