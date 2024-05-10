import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        int Numero = 0;
        String Agencia = "";
        String NomeCliente = "";
        double Saldo = 0.0;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        
        System.out.print("Número da agência: ");
        Numero = scanner.nextInt();
        scanner.nextLine(); // esta linha consome o \n do int
        System.out.print("Código da agência: ");
        Agencia = scanner.nextLine();
        System.out.print("Nome do cliente: ");
        NomeCliente = scanner.nextLine();
        System.out.print("Saldo do cliente: ");
        Saldo = scanner.nextDouble();

        System.out.println("Olá, " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + ", e seu saldo de " + Saldo + " já está disponível para saque.");
        scanner.close();
    }
}
