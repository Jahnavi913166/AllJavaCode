package com.practice.java.Array;

public class StockBuy_Sell {
    public static void printArray(int[] givenArray) {
        for (int i = 0; i < givenArray.length; i++) {
            System.out.print(givenArray[i] + " ");
        }
        System.out.println();
    }

    public static int maxProfit_Buy_Sell2(int[] stockPrice) {
        //TC-O(n) SC-O(1)
        int minSoFar = stockPrice[0], maxProfit = 0;
        for (int i = 0; i < stockPrice.length; i++) {

            if (stockPrice[i] < minSoFar) {
                minSoFar = stockPrice[i];
            }
            int currMax = Math.abs(stockPrice[i] - minSoFar);
            if (currMax > maxProfit) {
                maxProfit = currMax;
            }


        }

        return maxProfit;
    }

    public static int maxProfit_Buy_Sell2_difapproach(int[] stockPrice) {
        int maxProfit = 0;
        int minSoFar = stockPrice[0];
        for (int i = 0; i < stockPrice.length; i++) {
            minSoFar = Math.min(minSoFar, stockPrice[i]);
            int profit = Math.abs(stockPrice[i] - minSoFar);
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }


    public static int maxProfit_Buy_Sell1(int[] stockPrice) {
        //TC-O(n) SC-O(n)
        int n = stockPrice.length;
        int[] auxilary = new int[n];
        int max = n - 1;
        int maxVal = stockPrice[n - 1];
        auxilary[max--] = maxVal;
        for (int i = n - 2; i >= 0; i--) {
            if (stockPrice[i] > maxVal) {
                maxVal = stockPrice[i];
            }
            auxilary[max--] = maxVal;
        }
        printArray(auxilary);
        int difference = 0, maxProfit = Math.abs(stockPrice[0] - auxilary[0]);
        for (int i = 1; i < n; i++) {
            difference = Math.abs(stockPrice[i] - auxilary[i]);
            if (difference > maxProfit) {
                maxProfit = difference;
            }
        }
        return maxProfit;
    }


    public static void main(String[] args) {
        //int[] stockPrice = {3, 5, 1, 7, 4, 9, 3};
        int [] stockPrice={7,6,4,3,1};
        //System.out.println("stock buy and sell max profit:" + maxProfit_Buy_Sell1(stockPrice));
        System.out.println(maxProfit_Buy_Sell2(stockPrice));
       // System.out.println(maxProfit_Buy_Sell2_difapproach(stockPrice));
    }

}
