/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import org.json.simple.parser.ParseException;

/**
 *
 * @author elisaortizloyola
 */
public class Aleatorio {

    public static void main(String[] args) throws ParseException, IOException {

        ArrayList<business> businesses = new ArrayList<>();
        Sort s = new Sort();
        long TInicio, TFin, tiempo;
        int[] n = {100, 1000, 2500, 5000, 10000};
        int cont;
        int[] cb, cs, ci, cq, cm, cmm;
        long[] tb, ts, ti, tq, tm, tmm;
        tb = new long[30];
        ts = new long[30];
        ti = new long[30];
        tq = new long[30];
        tm = new long[30];
        tmm = new long[30];
        cb = new int[30];
        cs = new int[30];
        ci = new int[30];
        cq = new int[30];
        cm = new int[30];
        cmm = new int[30];
        business[] bArray;

        businesses = s.leeArchivo("business10k.json");
        for (int i = 0; i < 5; i++) {

            
            for (int j = 0; j < 30; j++) {
                Collections.shuffle(businesses);

                bArray = businesses.subList(0, n[i]).toArray(new business[5]);
                
                System.out.println("");

                //Bubble
                TInicio = System.currentTimeMillis();

                cb[j] = s.bubbleSort(bArray);

                TFin = System.currentTimeMillis();
                tb[j] = TFin - TInicio;
                

                //Selection
                TInicio = System.currentTimeMillis();
                bArray = businesses.subList(0, n[i]).toArray(new business[5]);
                cs [j]= s.selectionSort(bArray);

                TFin = System.currentTimeMillis();
                ts[j] = TFin - TInicio;
                

                // Insertion
                TInicio = System.currentTimeMillis();
                bArray = businesses.subList(0, n[i]).toArray(new business[5]);
                ci[j] = s.insertionSort(bArray);

                TFin = System.currentTimeMillis();
                ti[j] = TFin - TInicio;
                

                // Quick 
                s.setQuickCont(0);
                TInicio = System.currentTimeMillis();
                bArray = businesses.subList(0, n[i]).toArray(new business[5]);
                s.sort(bArray);

                TFin = System.currentTimeMillis();
                tq[j] = TFin - TInicio;
                cq[j]=s.getQuickCont();
                

                // Merge
                s.setQuickCont(0);
                TInicio = System.currentTimeMillis();
                bArray = businesses.subList(0, n[i]).toArray(new business[5]);
                s.mergeSort(bArray);

                TFin = System.currentTimeMillis();
                tm[j] = TFin - TInicio;
                cm[j]=s.getQuickCont();
                

                // Merge Mixcoac
                TInicio = System.currentTimeMillis();
                bArray = businesses.subList(0, n[i]).toArray(new business[5]);
                cmm[j] = s.iterativeMergeSort(bArray);

                TFin = System.currentTimeMillis();
                tmm[j] = TFin - TInicio;
               

                System.out.println("");
            }
        System.out.println("Array Length " + n[i]);
        System.out.println(s.average(tb));
        System.out.println(s.average(ts));
        System.out.println(s.average(ti));
        System.out.println(s.average(tq));
        System.out.println(s.average(tm));
        System.out.println(s.average(tmm));
        
        System.out.println( s.average(cb));
        System.out.println( s.average(cs));
        System.out.println( s.average(ci));
        System.out.println( s.average(cq));
        System.out.println( s.average(cm));
        System.out.println( s.average(cmm));
        }
        

    }

}
