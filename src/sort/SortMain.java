/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.Arrays;

/**
 *
 * @author Edgar
 */
public class SortMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sort b = new Sort();
    String[] a = { "5", "4", "3", "2", "1" };
    System.out.println(Arrays.toString(a));
    b.bubbleSort(a);
    System.out.println(Arrays.toString(a));
    System.out.println(less("3", "2"));
    }
    
}
