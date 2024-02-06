import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Questao3_SomaeMedia {
    public static void main(String[] args) {
        ArrayList<Integer> valores = new ArrayList<>();

        int soma = 0;
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            valores.add(leitor.nextInt());
            soma += valores.get(i);
        }


            System.out.println("O valor da soma é: " + soma);
            double media = (double) soma / valores.size();
            System.out.println("O valor da média é: " + media);
        }
    }

