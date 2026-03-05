package somaLinha;

public class SomaLinha {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {5, 5, 6},
                {7, 8, 9}
        };

        int indiceLinha = 0;
        int somaLinha = 0;

        for(int j = 0; j < matriz[indiceLinha].length; j++){
            somaLinha += matriz[indiceLinha][j];
        }


        System.out.println(somaLinha);
    }
}
