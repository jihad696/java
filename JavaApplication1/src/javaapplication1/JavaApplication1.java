
package javaapplication1;

import java.util.Array;


public class JavaApplication1 
{

    
    public static void main(String[] args) {
        String [] arr = {"Jeihad " , "Baleegh" , "Saad"};
        System.out.println(Arrays.toString(arr) );
        String sortedArray [] = sort (arr);
        System.out.println(Arrays.toString(sortedArray));
        
    }

    private static String[] sort (String[] array) {
        String temp ="";
        for (int i=0 ; i<array.length;i++){
            for (int j=i+1 ; j< array.length;j++){
            
            if (array[i].compareToIgnoreCase(array[j])>0){
            
            temp = array[i];
            array[i]=array[j];
            array[j]=temp;
            
            
                    }
                    
                    
                    
                    }
        }
        return array;
    
    }}

