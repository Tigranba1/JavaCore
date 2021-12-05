package JavaCore;

import java.util.*;
import java.util.List;

public class ArraySort {

    /**
     * Create a method that sorts the int array elements by odd and even number such that if first number is odd then second must be even number and so on for the next elements of the array.
     *
     * @param arr
     */
    private static void evenOdd(int arr[]) {
        List<Integer> evens = new ArrayList<Integer>();
        List<Integer> odd = new ArrayList<Integer>();
        int sortArr[] = new int[arr.length];
        for (int i : arr) {
            if (i % 2 == 0) {
                evens.add(i);
            } else {
                odd.add(i);
            }
        }

        int j = 0;
        int k = 0;
        int i = 0;


        while (i < sortArr.length) {
            if (arr[0] % 2 == 0) {
                if (i % 2 == 0) {
                    sortArr[i] = evens.get(j);
                    j++;
                } else {
                    sortArr[i] = odd.get(k);
                    k++;
                }
            } else {
                if (i % 2 != 0) {
                    sortArr[i] = evens.get(j);
                    j++;
                } else {
                    sortArr[i] = odd.get(k);
                    k++;
                }
            }
            i++;
        }
        for (int ev : sortArr) {
            System.out.println(ev);
        }
    }


//    private static void sortEvenOdd(int[] array){
//        int temp;
//        int[] sortedArray = new int[array.length];
//        for (int j = 0; j < array.length - 1; j++) {
//            for (int x = 0; x < array.length - 1; x++) {
//                while(array[x] % 2 == 0 && array[x+1] % 2 != 0 && x < array.length-1 || array[x] % 2 != 0 && array[x+1] % 2 == 0 && x < array.length-1) {
//                    x++;
//                }
//                int y = x+1;
//
//                if(y < array.length) {
//                    while (array[y] % 2 == 0 && array[y + 1] % 2 != 0 || array[y] % 2 != 0 && array[y + 1] % 2 == 0) {
//                        y++;
//                    }
//
//                        if (array[y] % 2 == 1 && array[y + 1] % 2 == 1 || array[y] % 2 == 0 && array[y + 1] % 2 == 0) {
//                            temp = array[x];
//                            array[x] = array[y];
//                            array[y] = temp;
//                            sortedArray = array;
//                        }
//                }
//            }
//        }
//        for (int i: sortedArray) {
//            System.out.println(i);
//        }
//    }

    /**
     * Create a method that says Is the int array in ascending sequence.
     *
     * @param arr
     * @return boolean
     */
    private static boolean isArrAscSorted(int arr[]) {
        boolean isSorted = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                isSorted = true;
            } else {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    /**
     * Create a method that returns the arithmetic mean of given int array elements.
     *
     * @param arr
     * @return float
     */
    private static float arithmethMean(int arr[]) {
        int count = 0;
        float sum = 0f;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            count++;
        }
        return (float) (sum / count);
    }

    /**
     * Create a method that receives a sorted array and returns an array in random order.
     *
     * @param array
     */
    private static void unSortArr(int[] array) {
        int index, temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    /**
     * Create a method that finds pairs of numbers whose sum is equal to a given value and return array with these values.
     *
     * @param array
     * @param num
     * @return array
     */
    private static void pairArr(int[] array, int num) {

        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == num) {
                    arr.add(array[i]);
                    arr.add(array[j]);
                }
            }

        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

    }

    /**
     * Create a method that finds and returns the most frequently occurring element in an array.
     *
     * @param arr
     * @param n
     * @return int
     */
    private static int mostFrequent(int arr[], int n) {
        Arrays.sort(arr);

        int maxCount = 1, res = arr[0];
        int currCount = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1])
                currCount++;
            else {
                if (currCount > maxCount) {
                    maxCount = currCount;
                    res = arr[i - 1];
                }
                currCount = 1;
            }
        }
        if (currCount > maxCount) {
            maxCount = currCount;
            res = arr[n - 1];
        }

        return res;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 2, 3, 4, 4, 5, 5};
        int arr2[] = {6, 7, 4, 2, 5};
        int n = arr1.length;
        evenOdd(arr1);
        System.out.println(isArrAscSorted(arr1));
        System.out.println(arithmethMean(arr1));
        unSortArr(arr1);
        System.out.println(" ");
        pairArr(arr1, 5);
        System.out.println(" ");
        System.out.println(mostFrequent(arr1,n));
    }
}
