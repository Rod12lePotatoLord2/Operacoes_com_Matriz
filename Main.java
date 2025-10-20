import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[5];
        double soma = 0;

        System.out.println("Por favor, insira as notas dos alunos: ");

        for(int i = 0; i < notas.length; i++){
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }
        double media = soma / notas.length;
        System.out.printf("\nMédia da Turma: %.2f%n", media);

        int acimaDaMedia = 0;
        for(int i = 0; i < notas.length; i++){
            if(notas[i] > media){
                acimaDaMedia++;
            }
        }
        System.out.println("Quantidade das notas acima da media:" + acimaDaMedia);
        sc.close();
    }
}