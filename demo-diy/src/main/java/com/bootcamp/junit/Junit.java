package com.bootcamp.junit;

public class Junit {
  public static int sum(int x , int y){
    return x + y;  //calculation
  }
  public static void sort(int[] arr){
    int temp = 0;
    for (int i = 0; i < arr.length ; i++ ){
      for (int j = 0; j < arr.length - i -1 ; j++){
        if (arr[j] > arr[j+1]){
          temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    //
  }
}
