import java.util.TreeSet;

/*
Aşağıdaki soruları verilen matrisler kullanarak cevaplayınız. Algoritmanın akış diyagramını çiziniz.

        3 6 2          1 1 2
   A =  1 5 6     B =  3 3 3
        2 1 5          2 2 1

    06. A dizisinin satır ve sütun toplamlarını 6 elemanlı bir diziye aktararak bu yeni dizinin en büyük
elemanını bulunuz.
 */
public class Q06_MaxSumOfRowsAndColumns {
    public static void main(String[] args) {
        int[][] arrA = {
                {3, 6, 2},
                {1, 5, 6},
                {2, 1, 5}
        };

        System.out.println(solution(arrA));
    }

    private static int solution(int[][] arrA) {
        TreeSet<Integer> sums = new TreeSet<>();

        int sumRow = 0;
        int sumColumn = 0;

        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA.length; j++) {
                sumRow += arrA[i][j];
                sumColumn += arrA[j][i];
            }
            sums.add(sumRow);
            sums.add(sumColumn);
            sumRow = 0;
            sumColumn = 0;
        }
        return sums.last();
    }
}
