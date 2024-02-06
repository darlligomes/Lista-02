import java.util.Scanner;

public class Questao07_LeituraVetor {
    public static void main(String[] args) {
        int[] leitura = new int[5];
        int soma = 0, multiplicacao = 1;
        Scanner leitor = new Scanner(System.in);

        for(int i = 0; i < leitura.length; i++){
            leitura[i] = leitor.nextInt();
            soma += leitura[i];
            multiplicacao *= leitura[i];

            System.out.println(leitura[i]);
        }
        leitor.close();
        System.out.println("A soma de todos eles é " + soma);
        System.out.println("A multiplicação de todos eles é " + multiplicacao);
    }
}
