import java.util.Scanner;

public class atividade {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("digite um numero:");
            int numero = entrada.nextInt();
            if (numero>0) {
                System.out.println("o numero é positivo.");
            }else if (numero < 0) {
                System.out.println("o numero é negativo.");
            }else {
                System.out.println("o numero é zero.");
            }
            entrada.close();
        }
    }


