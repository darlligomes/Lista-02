import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


// Maior de cinco inputsss

public class Questao2_Maiorde5 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        System.out.println("Insira 5 números!");
        Scanner leitor = new Scanner(System.in);

        for(int i = 1; i <= 5; i++){
            lista.add(leitor.nextInt());
        }

        Collections.sort(lista, Collections.reverseOrder());
        System.out.println("O maior número dos 5 é: " + lista.get(0));



    }
}
