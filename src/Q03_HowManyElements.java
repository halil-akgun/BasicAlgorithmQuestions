import java.util.HashMap;
import java.util.Map;

/*
Aşağıdaki soruları verilen matrisler kullanarak cevaplayınız. Algoritmanın akış diyagramını çiziniz.

        3 6 2          1 1 2
   A =  1 5 6     B =  3 3 3
        2 1 5          2 2 1

    03. A dizinde her elemanın kaç defa geçtiğini bulunuz.
 */
public class Q03_HowManyElements {
    public static void main(String[] args) {
        int[][] arrA = {
                {3, 6, 2},
                {1, 5, 6},
                {2, 1, 5}
        };

        System.out.println(solution(arrA));
    }

    private static Map<Integer, Integer> solution(int[][] arrA) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] ints : arrA) {
            for (int w : ints) {
                map.put(w, map.getOrDefault(w, 0) + 1);
            }
        }
        return map;
    }
}
