import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int soma = 0;
        int totalElementos = 0;

        System.out.println("Digite os valores para a matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                soma += matriz[i][j];
                totalElementos++;
            }
        }

        System.out.println("\nMatriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }

        double media = (double) soma / totalElementos;
        System.out.println("\nSoma total dos elementos: " + soma);
        System.out.printf("Média dos elementos: %.2f\n", media);

        System.out.println("\nDiagonal Principal: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Elemento [" + i + "][" + i + "]: " + matriz[i][i]);
        }
        sc.close();
    }
}