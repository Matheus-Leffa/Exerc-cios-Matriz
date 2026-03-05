package somaMatriz;

public class SomaMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2},
                {4, 5, 6},
                {7}
        };

        int soma = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                soma += matriz[i][j];
            }
        }

        System.out.println(soma);
    }
}
