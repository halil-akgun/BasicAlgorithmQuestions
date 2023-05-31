import java.util.*;

/*
Aşağıdaki soruları verilen matrisler kullanarak cevaplayınız. Algoritmanın akış diyagramını çiziniz.

        3 6 2          1 1 2
   A =  1 5 6     B =  3 3 3
        2 1 5          2 2 1

    10. A ve B matrisinde toplamları aynı olan satırları bulunuz.
 */
public class Q10_RowsWithTheSameSum {
    public static void main(String[] args) {
        int[][] arrA = {
                {3, 6, 2},
                {3, 6, 2},
                {1, 5, 6},
                {3, 2, 3},
                {3, 6, 2},
                {2, 1, 5}
        };
        int[][] arrB = {
                {3, 6, 2},
                {1, 1, 2},
                {3, 2, 3},
                {3, 2, 3},
                {3, 6, 2},
                {2, 2, 1}
        };
        System.out.println(solution(arrA, arrB));
    }

    private static Map<List<Integer>, List<Integer>> solution(int[][] arrA, int[][] arrB) {
        Map<List<Integer>, List<Integer>> map = new HashMap<>();
        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                sumA += arrA[i][j];
                sumB += arrB[i][j];
            }
            if (sumA == sumB) {
                List<Integer> key = new ArrayList<>(Arrays.asList(toIntegerArray(arrA[i])));
                List<Integer> value = new ArrayList<>(Arrays.asList(toIntegerArray(arrB[i])));
                map.put(key, value);
            }
            sumA = 0;
            sumB = 0;
        }
        return map;
    }
    private static Integer[] toIntegerArray(int[] arr) {
        Integer[] result = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }
}
