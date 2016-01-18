package com.company;

public class Main {

    public static void main(String[] args) {

        int[] a = {1000,10,1,9,8,11,7,300,200,100,5000};
        int temp;

        for(int i = a.length - 1 ; i > 0 ; i--){

            //if unsorted swap then start over
            if(a[i-1] > a[i]){

                //swap
                temp = a[i];
                a[i] = a[i - 1];
                a[i - 1] = temp;

                //start over
                i = a.length;
            }
        }

        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + ",");
        }

    }
}

