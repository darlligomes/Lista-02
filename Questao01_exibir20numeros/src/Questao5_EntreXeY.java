import java.util.Scanner;
public class Questao5_EntreXeY {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira número 1:");
        int x = leitor.nextInt();
        System.out.println("Insira número 2:");
        int y = leitor.nextInt();
        int MenorValor = Math.min(x,y);
        int MaiorValor = Math.max(x,y);

        while (MenorValor < MaiorValor){
            MenorValor++;
            if(MenorValor == MaiorValor){
                break;
            }
            else{
                System.out.println(MenorValor);
                MenorValor++;
                System.out.println(MenorValor);
            }
        }

    }
}
