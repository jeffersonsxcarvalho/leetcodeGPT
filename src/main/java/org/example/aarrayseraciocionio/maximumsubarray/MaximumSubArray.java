package org.example.aarrayseraciocionio.maximumsubarray;

public class MaximumSubArray {
    // minha solução
    public static int[] maximumSubArray(int[] array) {
        int maiorSomaAnterior = array[0];
        int fim;
        int soma;
        int[] info = new int[3];

        for (int i = 0; i < array.length; i++) {
            soma = array[i];

            for (int j = i+1; j < array.length; j++) {
                soma += array[j];
                if(soma > maiorSomaAnterior) {
                    maiorSomaAnterior = soma;
                    info[0] = i;
                    info[1] = j;
                    info[2] = maiorSomaAnterior;
                }
            }
        }

        return info;
    }

    // GPT me enviou os seguintes vetores
    /*
        int[] nums0 = {-2, 1, -3, 4, -1, 2, 1, -5, 4, 3};
        int[] nums1 = {3, -2, 5, -8, 4, 6, -1, 2, -10, 3};
        int[] nums2 = {-5, 4, -1, 7, -3, 2, -8, 6, 1, -2};

        meu retorno foi

        Posição inicial: 3 | Posição final: 9 Maior Soma: 8  -> [4, -1, 2, 1, -5, 4, 3]
        Posição inicial: 4 | Posição final: 7 Maior Soma: 11 -> [4, 6, -1, 2]
        Posição inicial: 1 | Posição final: 3 Maior Soma: 10 -> [4, -1, 7]
        (nesse ultimo ele errou, disse que era
        Posição inicial: 1 | Posição final: 4 Maior Soma: 9
            [-5, 4, -1, 7, -3, 2, -8, 6, 1, -2] -> [4, -1, 7, -3]
            mas o meu algoritmo retornou o outro, mostrei para a IA ela admitiu ter errado. Fique orgulhoso de mim. hehe

            Essa é uma solução brute force, vamos passar ainda pra uma solução mais otimizada.

         */
}
