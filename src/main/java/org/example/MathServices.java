package org.example;


import java.util.Collections;
import java.util.List;

public class MathServices {

    public static int LinealSearch(List<Integer> chainList, int value){
        for(int i = 0; i < chainList.size(); i++){
            if(chainList.get(i).equals(value)){
                return i;
            }
        }
        return -1;
    }

    public static int BinarySearch(List<Integer> chainList, int value){
        int inicialIndex = 0;
        int finalIndex = chainList.size() - 1;
        Collections.sort(chainList);
        while(inicialIndex <= finalIndex) {

            int middleIndex = inicialIndex + (finalIndex - inicialIndex) / 2;

            if (chainList.get(middleIndex) == value) {
                return middleIndex;
            } else if (chainList.get(middleIndex) < value) {
                inicialIndex = middleIndex + 1;
            } else {
                finalIndex = middleIndex - 1;
            }
        }
        return -1;
    }
}
