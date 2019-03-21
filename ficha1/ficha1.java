public class ficha1 {

    /**
     * EXERCICIOS II
     */

    // 1
    public static double celsiusParaFahrenheit(double graus) {
        return (graus * 1.8 + 32);
    }

    //  2

    public static int maximoNumeros(int a, int b) {
        return (a < b ? b : a);
    }

    // 3

    public static String criaDescricaoConta(String nome, double saldo) {
        return ("Nome: " + nome + "\n" + "Saldo: " + saldo + "\n");
    }

    // 4

    public static double eurosParaLibras(double valor, double taxaConversao) {
        return (valor * taxaConversao);
    }

    // 5

    public static String media(int a, int b) {
        int media = (a + b) / 2;
        int menor, maior;
        if (a < b) {
            menor = a;
            maior = b;
        } else {
            menor = b;
            maior = a;
        }
        return ("A média dos dois valor é: " + media + "\n" + "Valores por ordem decrescente:\n" + maior + "\n" + menor);
    }

    // 6

    public static long factorial(int num) {
        long total=num;
        --num;
        while ( num > 0) {
            total = total * num;
            --num;
        }
        return total;
    }

    // 7

    public static long tempoGasto(){
        long now = System.currentTimeMillis();
        factorial(5000);
        long later = System.currentTimeMillis();
        return (later - now);
    }

    public static void main(String[] args) {}
}
