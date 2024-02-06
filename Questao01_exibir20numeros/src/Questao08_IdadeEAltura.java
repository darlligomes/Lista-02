import java.util.Scanner;

public class Questao08_IdadeEAltura {
    public static void main(String[] args) {
        int[] idade = new int[5];
        double[] altura = new double[5];
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < idade.length; i++){
            System.out.println("Digite a idade de indivíduo nº " + (i+1) );

            while (true) {
                try {
                    idade[i] = leitor.nextInt();
                    break;
                } catch (Exception e){
                    System.out.println("Valor inválido, tente novamente: ");
                    leitor.next();
                }
            }

            System.out.println("Digite a altura do indíviduo nº " + (i+1) );

            while (true) {
                try {
                    altura[i] = leitor.nextDouble();
                    break;
                } catch (Exception e){
                    System.out.println("Valor inválido, tente com vírgula: ");
                    leitor.next();
                }
            }
        }

        for (int i = (idade.length - 1); i > 0; i--){
            System.out.println("Indíviduo nº " + (i+1) + " com seus " + idade[i] + " e " + altura[i] + "m de altura");
        }

    }
}
