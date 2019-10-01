/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Edgar
 */
public class Ordenado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException, IOException {

        /*
        String[] a = {"5", "4", "3", "2", "1"};
        System.out.println(Arrays.toString(a));
        s.bubbleSort(a);
        System.out.println(Arrays.toString(a));*/
        ArrayList<business> businesses = new ArrayList<>();
        Sort s = new Sort();
        long TInicio, TFin, tiempo;
        int[] n = {100, 1000, 2500, 5000, 10000};
        int cont;
        business[] bArray;

        businesses = s.leeArchivo("business10k.json");

        for (int i = 0; i < 5; i++) {

            bArray = businesses.subList(0, n[i]).toArray(new business[businesses.size()]);
            System.out.println("Array Length " + bArray.length);
            System.out.println("");

            //Bubble
            TInicio = System.currentTimeMillis();
            
            cont=s.bubbleSort(bArray);

            TFin = System.currentTimeMillis();
            tiempo = TFin - TInicio;
            System.out.println("tiempo bubble: " + tiempo +"\t# "+cont);

            //Selection
            TInicio = System.currentTimeMillis();
            bArray = businesses.subList(0, n[i]).toArray(new business[5]);
            cont=s.selectionSort(bArray);

            TFin = System.currentTimeMillis();
            tiempo = TFin - TInicio;
            System.out.println("tiempo selection  " + tiempo+"\t# "+cont);
            

            // Insertion
            TInicio = System.currentTimeMillis();
            bArray = businesses.subList(0, n[i]).toArray(new business[5]);
            cont=s.insertionSort(bArray);

            TFin = System.currentTimeMillis();
            tiempo = TFin - TInicio;
            System.out.println("tiempo insertion " + tiempo+"\t# "+cont);

            // Quick 
            s.setQuickCont(0);
            TInicio = System.currentTimeMillis();
            bArray = businesses.subList(0, n[i]).toArray(new business[5]);
            s.sort(bArray);
            

            TFin = System.currentTimeMillis();
            tiempo = TFin - TInicio;
            System.out.println("tiempo quick " + tiempo+"\t\t# "+s.getQuickCont());

            // Merge
            s.setQuickCont(0);
            TInicio = System.currentTimeMillis();
            bArray = businesses.subList(0, n[i]).toArray(new business[5]);
            s.mergeSort(bArray);

            TFin = System.currentTimeMillis();
            tiempo = TFin - TInicio;
            System.out.println("tiempo merge " + tiempo+"\t\t# "+s.getQuickCont());
            
            // Merge Mixcoac
            TInicio = System.currentTimeMillis();
            bArray = businesses.subList(0, n[i]).toArray(new business[5]);
            cont=s.iterativeMergeSort(bArray);

            TFin = System.currentTimeMillis();
            tiempo = TFin - TInicio;
            System.out.println("tiempo mixcoac " + tiempo+"\t# "+cont);

            System.out.println("");
        }

    }

}
