package leo.sortalgorithm;

import java.util.Arrays;

public class Sort {

    private int[] orignArray;

    public Sort(int[] orignArray) {
        this.orignArray = orignArray;
    }

    public int[] getOrignArray() {
        return orignArray;
    }

    public void setOrignArray(int[] orignArray) {
        this.orignArray = orignArray;
    }

    public int[] bubbleSort(){

        int temp;
        for(int i=0; i<orignArray.length; i++){
            for(int j=0;j<orignArray.length-i-1;j++)
                if(orignArray[j]<orignArray[j+1]){
                    temp = orignArray[j];
                    orignArray[j] = orignArray[j+1];
                    orignArray[j+1] = temp;
                }
        }
        return orignArray;
    }

    //从小到大排序
    public int[] selectSort(){

        for(int i=0; i<orignArray.length-1; i++){

            int temp;
            int index = 0;

            for (int j= i+1; j<orignArray.length; j++)
            if(orignArray[index] > orignArray[i]) index = i;

            temp = orignArray[i];
            orignArray[i] = orignArray[index];
            orignArray[index] = temp;

        }

        return orignArray;
    }

    public void fastSort(int[] orignArray,int begin,int end){

        if(begin>=end) return;;

        int key = orignArray[begin];
        int keyIndex  = begin;

        for(int i=begin; i< end; i++){
            if(orignArray[i]<key){
                orignArray[keyIndex] = orignArray[i];
                keyIndex++;
                orignArray[i] = orignArray[keyIndex];
            }
        }
        orignArray[keyIndex] = key;

        fastSort(orignArray,begin,keyIndex);
        fastSort(orignArray,keyIndex+1,end);
    }
    @Override
    public String toString() {
        return "Sort{" +
                "orignArray=" + Arrays.toString(orignArray) +
                '}';
    }
}
