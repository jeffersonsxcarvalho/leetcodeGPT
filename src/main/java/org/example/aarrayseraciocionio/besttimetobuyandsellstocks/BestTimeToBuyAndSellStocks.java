package org.example.aarrayseraciocionio.besttimetobuyandsellstocks;

public class BestTimeToBuyAndSellStocks {

    // minha solução
    public static int[] buyAndSell(int[] prices) {
        int compra = 0;
        int venda = 0;
        int lucro = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {

                if(prices[j]-prices[i] <= 0) {
                    i = j;
                }

                if(prices[j]-prices[i] > lucro){
                    compra = prices[i];
                    venda = prices[j];
                    lucro = venda - compra;
                }
            }
        }

        return new int[]{compra, venda, lucro};
    }

    // soluçao chat gpt
    public static int[] buyAndSell2(int[] prices){
        int menorPreco = prices[0];
        int maiorLucro = 0;

        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < menorPreco) {
                menorPreco = prices[i];
            }

            int lucroAtual = prices[i] - menorPreco;

            if(lucroAtual > maiorLucro) {
                maiorLucro = lucroAtual;
            }
        }

        return new int[]{menorPreco, menorPreco+maiorLucro, maiorLucro};
    }
}
