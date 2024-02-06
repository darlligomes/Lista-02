import java.util.Scanner;
public class Questao1_1a20 {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Deseja imprimir lado a lado ou um abaixo do outro?");
        System.out.println("Lado a lado = L, Abaixo = A");
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        Scanner leitor = new Scanner(System.in);
        String Escolha = leitor.next().toUpperCase();
        leitor.close();
        if(Escolha.equals("A")){
            for (int i = 1; i <= 20; i++){
                System.out.println(i);
            }
            } else if(Escolha.equals("L")){
            for (int i = 1; i <= 20; i++){
                System.out.print(i + ", ");
            }
        } else {
            System.out.println("Opção inválida! Escolha L ou A");
        }

    }
}