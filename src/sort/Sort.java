/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author Edgar
 */
public class Sort <T extends Comparable<T>>{
    public void selectionSort(T[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int pos = i;
      T min = arr[i];
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j].compareTo(min) < 0) {
          min = arr[j];
          pos = j;
        } 
      } 
      T aux = arr[i];
      arr[i] = min;
      arr[pos] = aux;
    } 
  }
  public T[] insertionSort(T[] array) {
    /*for (int i = 1; i < arr.length ; i++) {
      int rec = i;
      int pos = i + 1;
      
      while (true) {
        if (((rec >= 0) ? 1 : 0) & ((arr[rec].compareTo(arr[pos]) > 0) ? 1 : 0)) {
          T obj = arr[rec];
          arr[rec] = arr[pos];
          arr[pos] = obj;
          rec--;
          continue;
        } 
        break;
      } 
    } */
    for (int j = 1; j < array.length; j++) {

            // Picking up the key(Card)
            T key = array[j];
            int i = j - 1;

            while (i >= 0 && key.compareTo(array[i])<0 ) {
                array[i + 1] = array[i];
                i--;
            }
            // Placing the key (Card) at its correct position in the sorted subarray
            array[i + 1] = key;
        }
        return array;
  } 
  
  public void bubbleSort(T[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j + 1].compareTo(arr[j]) < 0) {
          T aux = arr[j + 1];
          arr[j + 1] = arr[j];
          arr[j] = aux;
        } 
      } 
    } 
  }
}
