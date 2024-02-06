import java.util.Scanner;

public class Questao10_2Vetores {
    public static void main(String[] args) {
        int[] Array1 = new int[2];
        int[] Array2 = new int[2];
        int[] Array3 = new int[4];

        Scanner leitor = new Scanner(System.in);

        for(int i = 0; i < Array1.length; i++){
            System.out.println("Insira o valor de Array1: ");
            Array1[i] = leitor.nextInt();
            System.out.println("Insira o valor de Array2: ");
            Array2[i] = leitor.nextInt();
        }

        for (int k = 0; k < Array3.length; k++) {
            if (k < Array1.length) { Array3[2 * k] = Array1[k]; }
            if (k < Array2.length) { Array3[2 * k + 1] = Array2[k]; }
        }

        for (int i : Array3) {
            System.out.print(i + " ");
        }
    }
}
