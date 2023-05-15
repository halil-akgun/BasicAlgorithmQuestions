import java.util.Arrays;

/*
Aşağıdaki soruları verilen matrisler kullanarak cevaplayınız. Algoritmanın akış diyagramını çiziniz.

        3 6 2          1 1 2
   A =  1 5 6     B =  3 3 3
        2 1 5          2 2 1

    08. A matrisi ile B matrisinin hangisinin ortalamasının daha büyük olduğunu bulunuz.
 */
public class Q08_BiggestAverage {
    public static void main(String[] args) {
        int[][] arrA = {
                {3, 6, 2},
                {1, 5, 6},
                {2, 1, 5}
        };
        int[][] arrB = {
                {1, 1, 2},
                {3, 2, 3},
                {2, 2, 1}
        };

        System.out.println(Arrays.deepToString(solution(arrA, arrB)));
    }

    private static int[][] solution(int[][] arrA, int[][] arrB) {
        int averageA = 0;
        int averageB = 0;

        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                averageA += arrA[i][j];
                averageB += arrB[i][j];
            }
        }

        return averageA > averageB ? arrA : arrB;
    }
}
