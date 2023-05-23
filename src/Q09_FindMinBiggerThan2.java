
/*
Aşağıdaki soruları verilen matrisler kullanarak cevaplayınız. Algoritmanın akış diyagramını çiziniz.

        3 6 2          1 1 2
   A =  1 5 6     B =  3 3 3
        2 1 5          2 2 1

    09. A matrisinin 2 den büyük en küçük elemanının bulunuz. (Sonuç 3 çıkacaktır.)
 */
public class Q09_FindMinBiggerThan2 {
    public static void main(String[] args) {
        int[][] arrA = {
                {3, 6, 2},
                {1, 5, 6},
                {2, 1, 5}
        };
        System.out.println(solution(arrA));
    }

    private static int solution(int[][] arrA) {
        int min = Integer.MAX_VALUE;
        for (int[] ints : arrA) {
            for (int w : ints) {
                if (w > 2) min = Math.min(min, w);
            }
        }
        return min;
    }
}
