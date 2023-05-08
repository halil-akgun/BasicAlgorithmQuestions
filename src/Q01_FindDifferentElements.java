import java.util.ArrayList;
import java.util.List;

/*
Aşağıdaki soruları verilen matrisler kullanarak cevaplayınız. Algoritmanın akış diyagramını çiziniz.

        3 6 2          1 1 2
   A =  1 5 6     B =  3 3 3
        2 1 5          2 2 1

    01. A dizisinde olup B dizisinde olmayan elemanları bulunuz
 */
public class Q01_FindDifferentElements {
    public static void main(String[] args) {
        int[][] arrA = {{3, 6, 2}, {1, 5, 6}, {2, 1, 5}};
        int[][] arrB = {{1, 1, 2}, {3, 3, 3}, {2, 2, 1}};
        System.out.println(solution(arrA, arrB));
    }

    private static List<Integer> solution(int[][] arrA, int[][] arrB) {
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                listA.add(arrA[i][j]);
                listB.add(arrB[i][j]);
            }
        }
        for (Integer w : listA) {
//            if (!listB.contains(w) && !result.contains(w)) result.add(w); // distinct
            if (!listB.contains(w)) result.add(w);
        }
        return result;
    }
}
