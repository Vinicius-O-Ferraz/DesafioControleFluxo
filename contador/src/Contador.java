import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numeroUm = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int numeroDois = scanner.nextInt();

        if (numeroUm > numeroDois){
            System.out.println("Os paramtros fornecidos estão incorretos");;
        }
        else{
            for (int i = 0; i <= numeroDois - numeroUm ; i++) {
            System.out.println(i);
        }
    }
    }
}