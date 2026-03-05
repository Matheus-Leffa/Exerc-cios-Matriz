package SomaDiagonalPrincipal;

public class SomaDiagonal {
    public static void main(String[] args) {
        int[][] matriz = {
                {2, 2, 3, 10},
                {4, 5, 6, 11},
                {7, 8, 9, 12},
                {13, 14, 15, 16}
        };

        int somaDiagonal = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i] == matriz[j]){
                    somaDiagonal += matriz[i][j];
                }
            }
        }

        System.out.println(somaDiagonal);
    }
}
