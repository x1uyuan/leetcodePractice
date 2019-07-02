package org.joker.leetcode.no852;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-22 18:24
 */
public class PeakIndex {
    public int peakIndexInMountainArray(int[] A) {
        int result = 0;
        for(int i = 1; i< A.length - 1; i++) {
            if (A[i-1]<A[i] && A[i]>A[i+1]){
                result = i;
            }
        }
        return result;
    }
}

