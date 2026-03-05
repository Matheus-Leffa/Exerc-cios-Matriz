package maiorElementoMatriz;

public class MaiorElemento {
    public static void main(String[] args) {
        int[][] matriz = {
                {-2, -1, -120},
                {-4, -14, -6},
                {-7, -8, -15}
        };

        int maiorElemento = matriz[0][0];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] > maiorElemento){
                    maiorElemento = matriz[i][j];
                }
            }
        }

        System.out.println(maiorElemento);
    }
}
