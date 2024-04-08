package chap05;

import java.util.Arrays;
public class programming06 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(a));
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
    public static void reverse(int[] org) {
        int start = 0;
        int end = org.length - 1;
        while (start < end) {
            int temp = org[start];
            org[start] = org[end];
            org[end] = temp;
            start++;
            end--;
        }
    }
}
