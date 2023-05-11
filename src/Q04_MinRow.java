import java.util.Arrays;
import java.util.TreeMap;

/*
Aşağıdaki soruları verilen matrisler kullanarak cevaplayınız. Algoritmanın akış diyagramını çiziniz.

        3 6 2          1 1 2
   A =  1 5 6     B =  3 3 3
        2 1 5          2 2 1

    04. A dizindeki elemanları toplamı en küçük satırı bulunuz.
 */
public class Q04_MinRow {
    public static void main(String[] args) {
        int[][] arrA = {
                {3, 6, 2},
                {1, 5, 6},
                {2, 1, 5}
        };

        System.out.println(Arrays.toString(solution(arrA)));
    }

    private static int[] solution(int[][] arrA) {
        TreeMap<Integer, Integer> sums_Indexes = new TreeMap<>();
        int sum = 0;

        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                sum += arrA[i][j];
            }
            sums_Indexes.put(sum, i);
            sum = 0;
        }
        return arrA[sums_Indexes.firstEntry().getValue()];
    }
}
