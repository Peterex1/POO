import java.util.Arrays;
import java.util.Scanner;
/*
 * EXERCICIOS
 */

public class ficha2 {

    // 1

    /// a

    // Função que retorna o minimo valor de um array
    public static int getMin(int[] array) {
        int min;
        min = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (min > array[i]) min = array[i];
        }
        return min;
    }

    public static void minimoArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números deseja adicionar ao array?\n");
        int total = sc.nextInt();
        int[] valores = new int[total];
        for (int i = 0; i < total; ++i) {
            System.out.print("Qual o número que deseja adicionar?\n");
            int n = sc.nextInt();
            valores[i] = n;
        }
        int min = getMin(valores);
        System.out.print("O menor número do array é " + min);
    }

    /// b

    public static int[] betweenIndex(int[] array, int i1, int i2) {
        int[] values = new int[i2 - i1 + 1];

        for (int i = 0; i1 <= i2; ++i1) {
            values[i++] = array[i1];
        }

        return values;
    }

    // c

    public static boolean existValue(int a, int[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (a == array[i]) return true;
        }
        return false;
    }

    public static int[] sameValues(int[] a1, int[] a2) {
        int tam = a1.length > a2.length ? a2.length : a1.length;

        int[] sameAux = new int[tam];

        int index = 0;

        for (int i = 0; i < tam; ++i) {
            if (existValue(a1[i], a2)) {
                sameAux[index] = a1[i];
                ++index;
            }
        }

        int[] same = new int[index - 1];
        System.arraycopy(sameAux, 0, same, 0, same.length);

        return same;
    }


    public static void main(String[] args) {
    }
}
