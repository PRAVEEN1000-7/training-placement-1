import java.io.*;
import java.util.*;

public class Solution {

    public static <T> void printArray(T[] arr) {
        for (T val : arr) {
            System.out.println(val);
        }
    }

    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3};
        String[] strArr = {"Hello", "World"};

        printArray(intArr);
        printArray(strArr);
    }
}
