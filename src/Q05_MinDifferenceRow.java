import java.util.Arrays;
import java.util.TreeMap;

/*
Aşağıdaki soruları verilen matrisler kullanarak cevaplayınız. Algoritmanın akış diyagramını çiziniz.

        3 6 2          1 1 2
   A =  1 5 6     B =  3 3 3
        2 1 5          2 2 1

    05. B dizisindeki en küçük ve en büyük elemanı arasındaki fark en küçük olan satırı bulunuz.
 */
public class Q05_MinDifferenceRow {
    public static void main(String[] args) {
        int[][] arrB = {
                {1, 1, 2},
                {3, 2, 3},
                {2, 2, 1}
        };

        System.out.println(Arrays.toString(solution(arrB)));
    }

    private static int[] solution(int[][] arrB) {
        TreeMap<Integer, Integer> minDifference_Index = new TreeMap<>();
        for (int i = 0; i < arrB.length; i++) {
            minDifference_Index.put(findDifference(arrB[i]), i);
        }
        return arrB[minDifference_Index.firstEntry().getValue()];
    }

    private static int findDifference(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int w : arr) {
            max = Math.max(max, w);
            min = Math.min(min, w);
        }
        return max - min;
    }
}
