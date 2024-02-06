import java.util.Scanner;

public class Questao6_4NotaDe10alunos {
    public static void main(String[] args) {
        int[] nota = new int[4];
        int contagem = 0;
        Scanner leitor = new Scanner(System.in);

        for (int k = 0; k < 10; k++) {
            System.out.println("------- Aluno nº" + (k + 1) + " -------");
            int soma = 0;
            for (int i = 0; i < 4; i++) {
                System.out.println("Insira a nota nº" + (i + 1));
                nota[i] = leitor.nextInt();

                while (nota[i] < 0 || nota[i] > 10) {
                    System.out.println("Valor inválido, insira novamente. Nota nº" + (i + 1));
                    nota[i] = leitor.nextInt();
                }

                soma += nota[i];
            }

            if (soma >= 24) {
                contagem += 1;
            }
        }

        System.out.println("Os aprovados são no total: " + contagem);
    }
}
