package semana07;

public class ExerciciosRevisao {
    public static double somarTresValores (double n1, double n2, double n3) {
        return n1+ n2 + n3;
    }

    public static double calcularMediaAritmetica (double n1, double n2, double n3) {
        return (n1 + n2 + n3)/3;
    }

    public static int devolverMaiorValor (int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            return n1;
        } else 

            if (n2 > n1 && n2 > n3) {
                return n2;
            } else
                
                if (n3 > n1 && n3 > n2)
                    return n3;
                else
                    return 0;
    }

    public static int devolverMenorValor (int n1, int n2, int n3) {
        if (n1 < n2 && n1 < n3) {
            return n1;
        } else 

            if (n2 < n1 && n2 < n3) {
                return n2;
            } else
                
                if (n3 < n1 && n3 < n2)
                    return n3;
                else 
                    return 0;
    }

    public static double[] devolverArray (double n1, double n2, double n3) {
        double[] array = {n1, n2, n3};
        return array;
    }

    public static double devolverSomaArray (double[] array) {
        double soma = 0;
        for (double valor : array) {
            soma += valor;
        }
        return soma;
    }

    public static double devolverMediaArray (double[] array) {
        return devolverSomaArray(array) / array.length;
    }

    public static double encontrarMaior (double[] array) {
        double maior = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }
    
    public static double encontrarMenor (double[] array) {
        double menor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }

    public static int[] juntarArrays(int[] array1, int[] array2) {
        int[] resultado = new int[array1.length + array2.length];
        int indice = 0;
        for (int valor : array1) {
            resultado[indice] = valor;
        indice++;
        }
        for (int valor : array2) {
            resultado[indice] = valor;
            indice++;
        }
        return resultado;
    }
    
}