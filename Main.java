import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;

import jdk.internal.icu.util.CodePointTrie.Fast;


/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in)) ; 
        String[] str = read.readLine().trim().split(" ") ;
        int n = Integer.parseInt(str[0]) ;
        int[] arr = new int[n] ;
        str = read.readLine().trim().split(" ") ;
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(str[i]) ;
        }  
        HashSet<Integer> hs = new HashSet<>() ;
        for(int i=0; i<n; i++) {
            hs.add(arr[i]) ;
        }
        // Iterator itr = hs.iterator() ;
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }
        int maxLength = 0 ;
        for(int i=0; i<n; i++) {
            if(hs.contains(arr[i]-1) == false) {
                int currentLength = 1 ;
                int currentNumber = arr[i] + 1 ;
                while(hs.contains(currentNumber)) {
                    //arr[i]++ ;
                    currentLength += 1 ;
                    currentNumber += 1 ;
                }
                maxLength = Math.max(currentLength,maxLength) ;
            }
        }
        System.out.println(maxLength);
    }
}