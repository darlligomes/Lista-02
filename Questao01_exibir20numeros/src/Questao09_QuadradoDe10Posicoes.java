import java.util.Scanner;

public class Questao09_QuadradoDe10Posicoes {
    public static void main(String[] args) {
        int[] A = new int[3];
        int soma = 0;

        Scanner leitor = new Scanner(System.in);

        for(int i = 0; i < A.length; i++){
            System.out.println("Insira valor de posição nº " + (i+1) );
            A[i] = leitor.nextInt();
            soma += (A[i]*A[i]);
        }

        System.out.println(soma);

    }
}
