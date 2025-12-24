package com.durga.datastructures.geeksforgeeks;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Created by DurgaNaresh on @Date 6/27/2022
 * <p>
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success.
 */
public class ArrayPrograms {
    public static void rotateLeftMethod1(int[] array, int steps){
        System.out.println("Program For Array Rotation to Left Method1");
        System.out.println("Input Array:"+Arrays.toString(array));
        // create temp array
        int[] temp = new int[array.length];
        // copy elements to the temp array
        if (steps >= 0) System.arraycopy(array, 0, temp, (array.length - steps), steps);
        // copy rest of the elements from the original array
        int i = 0;
        for(int j = steps; j < array.length; j++, i++){
            temp[i] = array[j];
        }
        //copy from temp to original
        System.arraycopy(temp, 0, array, 0, array.length);
        System.out.println("Array after left rotation- " + Arrays.toString(array));
    }

    public static void rotateLeftMethod2(int[] array, int steps){
        System.out.println("Program For Array Rotation to Left Method2");
        System.out.println("Input Array:"+Arrays.toString(array));
        for(int i = 0; i < steps; i++){
            // store the first element
            int temp = array[0];
            // shift element to the left by 1 position
            System.arraycopy(array, 1, array, 0, array.length - 1);
            // copy stored element to the last
            array[array.length - 1] = temp;
        }
        System.out.println("Array after left rotation- " + Arrays.toString(array));
    }

    public static void rotateRightMethod1(int[] array, int steps){
        System.out.println("Program For Array Rotation to Right Method1");
        System.out.println("Input Array:"+Arrays.toString(array));
        // create temp array
        int[] temp = new int[array.length];
        // copy elements to the temp array
        if (steps >= 0) System.arraycopy(array, (array.length - steps), temp, 0, steps);
        // copy rest of the elements from the original array
        int i = steps;
        for(int j = 0; j < array.length - steps; j++, i++){
            temp[i] = array[j];
        }
        System.out.println("Array after right rotation- " + Arrays.toString(temp));
    }

    public static void rotateRightMethod2(int[] array, int steps){
        System.out.println("Program For Array Rotation to Right Method2");
        System.out.println("Input Array:"+Arrays.toString(array));
        for(int i = 0; i < steps; i++){
            int temp = array[array.length-1];
            System.arraycopy(array, 0, array, 1, array.length - 1);
            // copy stored element to the beginning
            array[0] = temp;
        }
        System.out.println("Array after right rotation- " + Arrays.toString(array));
    }

    public static void rotateArrayRotateOneByOne(int[] array){
        System.out.println("Program For Array Rotation Using RotateOneByOne");
        System.out.println("Input Array:"+Arrays.toString(array));
        int n = array.length;
        int d = 2;
        int p = 1;
        while (p <= d) {
            int last = array[0];
            System.arraycopy(array, 1, array, 0, n - 1);
            array[n - 1] = last;
            p++;
         }
        System.out.println("Array after Rotation:"+Arrays.toString(array));

    }
    /*Function to left rotate arr[] of siz n by d*/
    public static void leftRotateUsingJugglingAlgorithm(int[] array, int d, int n)
    {
        System.out.println("Program For Array Rotation Using Juggling Algorithm");
        System.out.println("Input Array:"+Arrays.toString(array));
        /* To handle if d >= n */
        d = d % n;
        int i, j, k, temp;
        int g_c_d = gcd(d, n);
        for (i = 0; i < g_c_d; i++) {
            /* move i-th values of blocks */
            temp = array[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                array[j] = array[k];
                j = k;
            }
            array[j] = temp;
            System.out.println("OutPut is:"+Arrays.toString(array));
        }
    }
    /*Function to get gcd of a and b*/
    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    /* Function to left rotate arr[] of size n by d */
    public static void leftRotateReversalAlgorithm(int[] array, int d)
    {
        System.out.println("Program For Array Rotation Using Reversal Algorithm");
        System.out.println("Input Array:"+Arrays.toString(array));
        if (d == 0)
            return;

        int n = array.length;
        // in case the rotating factor is
        // greater than array length
        d = d % n;
        reverseArray(array, 0, d - 1);
        reverseArray(array, d, n - 1);
        reverseArray(array, 0, n - 1);
        System.out.println("OutPut is:"+Arrays.toString(array));
    }

    /*Function to reverse arr[] from index start to end*/
    static void reverseArray(int[] arr, int start, int end)
    {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Wrapper over the recursive function leftRotateRec()
    // It left rotates arr[] by d.
    public static void leftRotateUsingBlockSwapAlgorithmRecursiveImplementation(int[] array, int d, int n)
    {
        System.out.println("Program For Array Rotation Using BlockSwap Algorithm RecursiveImplementation");
        System.out.println("Input Array:"+Arrays.toString(array));
        leftRotateRec(array, 0, d, n);
        System.out.println("Output is:"+Arrays.toString(array));
    }

    public static void leftRotateRec(int[] arr, int i, int d, int n)
    {
        /* Return If number of elements to be rotated
        is zero or equal to array size */
        if(d == 0 || d == n)
            return;

        /*If number of elements to be rotated
        is exactly half of array size */
        if(n - d == d)
        {
            swap(arr, i, n - d + i, d);
            return;
        }

        /* If A is shorter*/
        if(d < n - d)
        {
            swap(arr, i, n - d + i, d);
            leftRotateRec(arr, i, d, n - d);
        }
        else /* If B is shorter*/
        {
            swap(arr, i, d, n - d);
            leftRotateRec(arr, n - d + i, 2 * d - n, d); /*This is tricky*/
        }
    }
    /*This function swaps d elements
    starting at index fi with d elements
    starting at index si */
    public static void swap(int[] arr, int fi, int si, int d)
    {
        int i, temp;
        for(i = 0; i < d; i++)
        {
            temp = arr[fi + i];
            arr[fi + i] = arr[si + i];
            arr[si + i] = temp;
        }
    }

    //Java code for above implementation
    static void leftRotateUsingBlockSwapAlgorithmIterativeImplementation(int d)
    {
        System.out.println("Program For Array Rotation Using BlockSwap Algorithm IterativeImplementation");
        System.out.println("Input Array:"+Arrays.toString(Constants.array));
        int i, j;
        if(d == 0 || d == 7)
            return;
        /* If number of elements to be rotated is more than array size*/
        if(d > 7)
            d = d % 7;
        i = d;
        j = 7 - d;
        while (i != j)
        {
            if(i < j) /*A is shorter*/
            {
                swap(Constants.array, d-i, d+j-i, i);
                j -= i;
            }
            else /*B is shorter*/
            {
                swap(Constants.array, d-i, d, j);
                i -= j;
            }
            // printArray(arr, 7);
        }
        /*Finally, block swap A and B*/
        swap(Constants.array, d-i, d, i);
        System.out.println("Output is:"+Arrays.toString(Constants.array));
    }

    public static void cyclicallyRotateAnArrayMethod1(int[] array){
        System.out.println("Program For cyclically Rotate An Array Method1");
        System.out.println("Input Array:"+Arrays.toString(array));
        int x = array[array.length-1], i;
        for (i = array.length-1; i > 0; i--)
            array[i] = array[i-1];
        array[0] = x;
        System.out.println("Output is:"+Arrays.toString(array));
    }

    public static void cyclicallyRotateAnArrayMethod2(int[] array)
    {
        System.out.println("Program For cyclically Rotate An Array Method2");
        System.out.println("Input Array:"+Arrays.toString(array));
        int i = 0, j = array.length - 1;
        while(i != j)
        {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
        }
        System.out.println("Output is:"+Arrays.toString(array));
    }

    /* Searches an element key in a
      pivoted sorted array arr[]
      of size n */
    public static int searchAnElementSortedRotatedArrayMethod1(int[] array, int n, int key)
    {
        System.out.println("Program For Search an element in a sorted and rotated array Method1");
        System.out.println("Input Array:"+Arrays.toString(array));
        int pivot = findPivot(array, 0, n - 1);

        // If we didn't find a pivot, then
        // array is not rotated at all
        if (pivot == -1)
            return binarySearch(array, 0, n - 1, key);

        // If we found a pivot, then first
        // compare with pivot and then
        // search in two subarrays around pivot
        if (array[pivot] == key)
            return pivot;
        if (array[0] <= key)
            return binarySearch(array, 0, pivot - 1, key);
        return binarySearch(array, pivot + 1, n - 1, key);
    }

    /* Function to get pivot. For array
       3, 4, 5, 6, 1, 2 it returns
       3 (index of 6) */
    static int findPivot(int[] arr, int low, int high)
    {
        // base cases
        if (high < low)
            return -1;
        if (high == low)
            return low;

        /* low + (high - low)/2; */
        int mid = (low + high) / 2;
        if (mid < high && arr[mid] > arr[mid + 1])
            return mid;
        if (mid > low && arr[mid] < arr[mid - 1])
            return (mid - 1);
        if (arr[low] >= arr[mid])
            return findPivot(arr, low, mid - 1);
        return findPivot(arr, mid + 1, high);
    }

    /* Standard Binary Search function */
    static int binarySearch(int[] arr, int low, int high, int key)
    {
        if (high < low)
            return -1;

        /* low + (high - low)/2; */
        int mid = (low + high) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);
        return binarySearch(arr, low, (mid - 1), key);
    }

    // Returns index of key in arr[l…h]
    // if key is present, otherwise returns -1
    public static int searchElementSortedAndRotatedArrayMethod2(int[] array, int l, int h, int key)
    {
        if (l > h)
            return -1;

        int mid = (l + h) / 2;
        if (array[mid] == key)
            return mid;

        /* If arr[l...mid] first subarray is sorted */
        if (array[l] <= array[mid]) {
            /* As this subarray is sorted, we
               can quickly check if key lies in
               half or other half */
            if (key >= array[l] && key <= array[mid])
                return searchElementSortedAndRotatedArrayMethod2(array, l, mid - 1, key);
            /*If key not lies in first half subarray,
           Divide other half  into two subarrays,
           such that we can quickly check if key lies
           in other half */
            return searchElementSortedAndRotatedArrayMethod2(array, mid + 1, h, key);
        }

        /* If arr[l..mid] first subarray is not sorted,
           then arr[mid... h] must be sorted subarray*/
        if (key >= array[mid] && key <= array[h])
            return searchElementSortedAndRotatedArrayMethod2(array, mid + 1, h, key);

        return searchElementSortedAndRotatedArrayMethod2(array, l, mid - 1, key);
    }

    // This function returns true if arr[0…n-1]
    // has a pair with sum equals to x.
    public static boolean pairInSortedRotatedMethod1(int[] array, int n, int x)
    {
        System.out.println("Program For pairInSortedRotated Method1");
        System.out.println("Input Array:"+Arrays.toString(array));
        {
            // Find the pivot element
            int i;
            for (i = 0; i < n - 1; i++)
                if (array[i] > array[i+1])
                    break;

            int l = (i + 1) % n; // l is now index of
            // smallest element

            int r = i;       // r is now index of largest
            //element

            // Keep moving either l or r till they meet
            while (l != r)
            {
                // If we find a pair with sum x, we
                // return true
                if (array[l] + array[r] == x)
                    return true;

                // If current pair sum is less, move
                // to the higher sum
                if (array[l] + array[r] < x)
                    l = (l + 1) % n;

                else  // Move to the lower sum side
                    r = (n + r - 1) % n;
            }
            return false;
        }

    }
    // This function returns count of number of pairs with sum equals to x.
    public static int pairsInSortedRotatedMethod2(int[] array, int n, int x)
    {
        System.out.println("Program For pairInSortedRotated Method2");
        System.out.println("Input Array:"+Arrays.toString(array));
        // Find the pivot element.
        // Pivot element is largest
        // element of array.
        int i;
        for (i = 0; i < n - 1; i++)
            if (array[i] > array[i + 1])
                break;

        // l is index of
        // the smallest element.
        int l = (i + 1) % n;

        // r is index of
        // largest element.
        int r = i;

        // Variable to store
        // count of number
        // of pairs.
        int cnt = 0;

        // Find sum of pair
        // formed by arr[l]
        // and arr[r] and
        // update l, r and
        // cnt accordingly.
        while (l != r)
        {
            // If we find a pair with
            // sum x, then increment
            // cnt, move l and r to
            // next element.
            if (array[l] + array[r] == x)
            {
                cnt++;

                // This condition is required
                // to be checked, otherwise
                // l and r will cross each
                // other and loop will never
                // terminate.
                if(l == (r - 1 + n) % n)
                {
                    return cnt;
                }

                l = (l + 1) % n;
                r = (r - 1 + n) % n;
            }

            // If current pair sum
            // is less, move to
            // the higher sum side.
            else if (array[l] + array[r] < x)
                l = (l + 1) % n;

                // If current pair sum
                // is greater, move
                // to the lower sum side.
            else
                r = (n + r - 1) % n;
        }
        return cnt;
    }

    // Returns max possible value of i*arr[i]
    public static void maxSum(int[] array)
    {
        System.out.println("Program For maxSum");
        System.out.println("Input Array:"+Arrays.toString(array));
        // Find array sum and i*arr[i] with no rotation
        int arrSum = 0;  // Stores sum of arr[i]
        int currVal = 0;  // Stores sum of i*arr[i]
        for (int i=0; i<array.length; i++)
        {
            arrSum = arrSum + array[i];
            currVal = currVal+(i*array[i]);
        }

        // Initialize result as 0 rotation sum
        int maxVal = currVal;

        // Try all rotations one by one and find
        // the maximum rotation sum.
        for (int j=1; j<array.length; j++)
        {
            currVal = currVal + arrSum-array.length*array[array.length-j];
            if (currVal > maxVal)
                maxVal = currVal;
        }

        // Return result
        System.out.println("maxVal is:"+maxVal);
    }

      // Returns maximum value of i*arr[i]
    public static void MaximumSumAmongAllRotationsGivenArrayMethod1(int[] array, int n)
    {
        System.out.println("Program For MaximumSumAmongAllRotationsGivenArray Method1");
        System.out.println("Input Array:"+Arrays.toString(array));
       // Initialize result
        int res = Integer.MIN_VALUE;

       // Consider rotation beginning with i for all possible values of i.
        for (int i = 0; i < n; i++)
        {

            // Initialize sum of current rotation
            int curr_sum = 0;

            // Compute sum of all values. We don't
            // actually rotation the array, but compute
            // sum by finding indexes when arr[i] is
            // first element
            for (int j = 0; j < n; j++)
            {
                int index = (i + j) % n;
                curr_sum += j * array[index];
            }

            // Update result if required
            res = Math.max(res, curr_sum);
        }
        System.out.println("MaximumSumAmongAllRotationsGivenArray:"+res);
    }

    public static void MaximumSumAmongAllRotationsGivenArrayMethod2(int[] array, int n)
    {
        System.out.println("Program For MaximumSumAmongAllRotationsGivenArray Method2");
        System.out.println("Input Array:"+Arrays.toString(array));
        // Compute sum of all array elements
        int cum_sum = 0;
        for (int i = 0; i < n; i++)
            cum_sum += array[i];

        // Compute sum of i*arr[i] for
        // initial configuration.
        int curr_val = 0;
        for (int i = 0; i < n; i++)
            curr_val += i * array[i];

        // Initialize result
        int res = curr_val;

        // Compute values for other iterations
        for (int i = 1; i < n; i++)
        {
            // Compute next value using previous
            // value in O(1) time
            int next_val = curr_val - (cum_sum -
                    array[i-1]) + array[i-1] *
                    (n-1);

            // Update current value
            curr_val = next_val;

            // Update result if required
            res = Math.max(res, next_val);
        }
        System.out.println("MaximumSumAmongAllRotationsGivenArrayMethod2:"+res);
    }

    // function definition
    public static void MaximumSumAmongAllRotationsGivenArrayMethod3(int[] array, int n)
    {
        System.out.println("Program For MaximumSumAmongAllRotationsGivenArray Method3");
        System.out.println("Input Array:"+Arrays.toString(array));
        int sum = 0;
        int i;
        int pivot = findPivot(array, n);

        // difference in pivot and index of
        // last element of array
        int diff = n - 1 - pivot;
        for(i = 0; i < n; i++)
        {
            sum= sum + ((i + diff) % n) * array[i];
        }
        System.out.println("MaximumSumAmongAllRotationsGivenArrayMethod3:"+sum);
    }

    // function to find pivot
    static int findPivot(int[] arr, int n)
    {
        int i;
        for(i = 0; i < n; i++)
        {
            if(arr[i] > arr[(i + 1) % n])
                return i;
        }
        return 0;
    }

    // Returns count of rotations for an
    // array which is first sorted in
    // ascending order, then rotated
    public static void countRotationsMethod1(int[] array, int n)
    {
        System.out.println("Program For countRotations Method1");
        System.out.println("Input Array:"+Arrays.toString(array));
        // We basically find index of minimum
        // element
        int min = array[0], min_index = 0;
        for (int i = 0; i < n; i++) {
            if (min > array[i]) {
                min = array[i];
                min_index = i;
            }
        }
        System.out.println("countRotationsMethod2:"+min_index);
    }

    // Returns count of rotations for an array
    // which is first sorted in ascending order,
    // then rotated
    static int countRotationsMethod2(int[] array, int low, int high)
    {
        System.out.println("Program For countRotations Method2");
        System.out.println("Input Array:"+Arrays.toString(array));
        // This condition is needed to handle
        // the case when array is not rotated
        // at all
        if (high < low)
            return 0;

        // If there is only one element left
        if (high == low)
            return low;

        // Find mid
        // /*(low + high)/2;*/
        int mid = low + (high - low)/2;

        // Check if element (mid+1) is minimum
        // element. Consider the cases like
        // {3, 4, 5, 1, 2}
        if (mid < high && array[mid+1] < array[mid])
            return (mid + 1);

        // Check if mid itself is minimum element
        if (mid > low && array[mid] < array[mid - 1])
            return mid;

        // Decide whether we need to go to left
        // half or right half
        if (array[high] > array[mid])
            return countRotationsMethod2(array, low, mid - 1);

        return countRotationsMethod2(array, mid + 1, high);
    }

    //Method 3: Iterative Code (Binary Search)
    // Returns count of rotations
    // for an array which is first sorted
    // in ascending order, then rotated

    // Observation: We have to return
    // index of the smallest element
    public static int countRotationsMethod3(int[] array, int n)
    {
        System.out.println("Program For countRotations Method3");
        System.out.println("Input Array:"+Arrays.toString(array));
        int low = 0, high = n - 1;
        while (low <= high) {

            // if first element is mid or
            // last element is mid
            // then simply use modulo, so it
            // never goes out of bound.
            int mid = low + (high - low) / 2;
            int prev = (mid - 1 + n) % n;
            int next = (mid + 1) % n;

            if (array[mid] <= array[prev]
                    && array[mid] <= array[next])
                return mid;
            else if (array[mid] <= array[high])
                high = mid - 1;
            else if (array[mid] >= array[low])
                low = mid + 1;
        }
        return 0;
    }

    public static void multipleLeftRotationsAnArrayMethod1(int[] A, int a, int k)
    {
        System.out.println("Program For multipleLeftRotationsAnArray Method1");
        System.out.println("Input Array:"+ Arrays.toString(A));
        //if the value of k ever exceeds the length of the array
        int c = k % a;

        //initializing array D so that we always
        //have a clone of the original array to rotate
        int[] D = A.clone();

        rotateArray(D, 0, c - 1);
        rotateArray(D, c, a - 1);
        rotateArray(D, 0, a - 1);

        // printing the rotates array
        System.out.print(Arrays.toString(D));
        System.out.println();
    }

    // Function to rotate the array from start index to end index
    private static void rotateArray(int[] A, int start,int end)
    {
        while (start < end) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
    }

    // Fills temp[] with two copies of arr[]
    public static void preprocess(int[] arr, int n, int[] temp)
    {
        System.out.println("Program For multipleLeftRotationsAnArray Method1");
        System.out.println("Input Array:"+ Arrays.toString(arr));
        // Store arr[] elements at i and i + n
        for (int i = 0; i<n; i++)
            temp[i] = temp[i + n] = arr[i];
    }

    // Function to left rotate an array k time
    static void multipleLeftRotationsAnArrayMethod2(int n, int k)
    {
        System.out.println("Program For multipleLeftRotationsAnArray Method2");
        System.out.println("Input Array:"+ Arrays.toString(Constants.A));
        // Starting position of array after k
        // rotations in temp[] will be k % n
        int start = k % n;

        // Print array after k rotations
        for (int i = start; i < start + n; i++)
            System.out.print(Constants.temp[i] + " ");

        System.out.print("\n");
    }
    // Function to left rotate an array k times
    public static void multipleLeftRotationsAnArrayMethod3(int[] arr, int n, int k)
    {
        System.out.println("Program For multipleLeftRotationsAnArray Method3");
        System.out.println("Input Array:"+ Arrays.toString(arr));
        // Print array after
        // k rotations
        for (int i = k; i < k + n; i++)
            System.out.print(arr[i % n] + " ");
    }

    public static int findMinimumElementSortedAndRotatedArrayMethod1(int[] arr, int low, int high)
    {
        System.out.println("Programs For Find the minimum element in a sorted and rotated array");
        System.out.println("Input Array:"+Arrays.toString(arr));
        // This condition is needed to handle the case when array
        // is not rotated at all
        if (high < low)  return arr[0];

        // If there is only one element left
        if (high == low) return arr[low];

        // Find mid
        int mid = low + (high - low)/2; /*(low + high)/2;*/

        // Check if element (mid+1) is minimum element. Consider
        // the cases like {3, 4, 5, 1, 2}
        if (mid < high && arr[mid+1] < arr[mid])
            return arr[mid+1];

        // Check if mid itself is minimum element
        if (mid > low && arr[mid] < arr[mid - 1])
            return arr[mid];

        // Decide whether we need to go to left half or right half
        if (arr[high] > arr[mid])
            return findMinimumElementSortedAndRotatedArrayMethod1(arr, low, mid-1);
        return findMinimumElementSortedAndRotatedArrayMethod1(arr, mid+1, high);
    }

    // Function to find minimum element
    public static int findMinimumElementSortedAndRotatedArrayMethod2(int[] arr, int low, int high)
    {
        System.out.println("Programs For Find the minimum element in a sorted and rotated array");
        System.out.println("Input Array:"+Arrays.toString(arr));
        while(low < high)
        {
            int mid = low + (high - low) / 2;
            if (arr[mid] == arr[high])
                high--;

            else if(arr[mid] > arr[high])
                low = mid + 1;
            else
                high = mid;
        }
        return arr[high];
    }

    // Function to reverse arr[]
    // from index start to end
    private static void rightReverseArray(int[] arr, int start, int end)
    {
        while (start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to right rotate
    // arr[] of size n by d
    public static void reversalAlgorithmRightRotationArray(int[] arr, int d, int n)
    {
        System.out.println("Reversal algorithm for right rotation of an array");
        rightReverseArray(arr, 0, n - 1);
        rightReverseArray(arr, 0, d - 1);
        rightReverseArray(arr, d, n - 1);
        System.out.println("Output is:"+Arrays.toString(arr));
    }

    // Return the maximum hamming distance of a rotation
    public static int maxHammingMethod1(int[] arr, int n)
    {
        System.out.println("Find a rotation with maximum hamming distance Method1");
        // arr[] to brr[] two times so that
        // we can traverse through all rotations.
        int[] brr =new int[2 *n + 1];
        for (int i = 0; i < n; i++){
            brr[i] = arr[i];
            brr[n+i] = arr[i];
        }

        // We know hamming distance with
        // 0 rotation would be 0.
        int maxHam = 0;

        // We try other rotations one by one
        // and compute Hamming distance
        // of every rotation
        for (int i = 1; i < n; i++)
        {
            int currHam = 0;
            for (int j = i, k=0; j < (i + n); j++,
                    k++)
                if (brr[j] != arr[k])
                    currHam++;

            // We can never get more than n.
            if (currHam == n)
                return n;

            maxHam = Math.max(maxHam, currHam);
        }

        return maxHam;
    }

    public static int maxHammingMethod2(int[] arr, int n){
        System.out.println("Find a rotation with maximum hamming distance Method2");
        int hmmd = 0;
        // outer loop for how much rotation
        for(int j = 1; j < n; j++){
            hmmd = 0;
            // inner loop to compare elements with elements on shifted index
            for(int i = 0 ; i < n; i++){
                if(arr[i] != arr[(i + j) % n])
                    hmmd++;
            }
            // max possible hamming distance is n, no need to check further
            if(hmmd == n)
                return n;
        }
        return hmmd;
    }

    // Function to solve query of type 1 x.
    static int queryType1(int toRotate, int n)
    {

        // Decreasing the absolute rotation
        toRotate = (toRotate - 3) % n;
        return toRotate;
    }

    // Function to solve query of type 2 y.
    static int queryType2(int toRotate, int n) {
        // Increasing the absolute rotation.
        toRotate = (toRotate + 1) % n;
        return toRotate;
    }

    // Function to solve queries of type 3 l r.
    static void queryType3(int toRotate, int l, int r,
                           int[] preSum, int n) {
        // Finding absolute l and r.
        l = (l + toRotate + n) % n;
        r = (r + toRotate + n) % n;

        // if l is before r.
        if (l <= r)
            System.out.println(preSum[r + 1] - preSum[l]);

            // If r is before l.
        else
            System.out.println(preSum[n] + preSum[r + 1] - preSum[l]);
    }

    // Wrapper Function solve all queries.
    public static void wrapper(int[] a, int n) {
        System.out.println("Queries on Left and Right Circular shift on array");
        int[] preSum = new int[n + 1];
        preSum[0] = 0;

        // Finding Prefix sum
        for (int i = 1; i <= n; i++)
            preSum[i] = preSum[i - 1] + a[i - 1];

        int toRotate = 0;

        // Solving each query
        toRotate = queryType1(toRotate, n);
        queryType3(toRotate, 0, 2, preSum, n);
        toRotate = queryType2(toRotate, n);
        queryType3(toRotate, 1, 4, preSum, n);
    }

    // Function to leftRotate array multiple times
    static void leftRotationArrayOnTimeAndO1SpaceMethod1(int n)
    {
        System.out.println("Print left rotation of array in O(n) time and O(1) space");
        /* To get the starting point of
        rotated array */
        int mod = 2 % n;

        // Prints the rotated array from
        // start position
        for (int i = 0; i < n; ++i)
            System.out.print(Constants.array[(i + mod) % n] + " ");

        System.out.println();
    }

    // Function for the k times left rotation
    static void leftRotationArrayOnTimeAndO1SpaceMethod2(int n)
    {
        System.out.println("Print left rotation of array in O(n) time and O(1) space Method Two");
        // In Collection class rotate function
        // takes two parameters - the name of
        // array and the position by which it
        // should be rotated
        // The below function will be rotating
        // the array left  in linear time

        // Collections.rotate()rotate the
        // array from right hence n-k
        Collections.rotate(Arrays.asList(Constants.arrayFour), n - 2);

        // Print the rotated array from start position
        for(int i = 0; i < n; i++)
            System.out.print(Constants.arrayFour[i] + " ");
    }

    // Function to compute the element at
    // given index
    public static int findElementGivenIndexAfterNumberOfRotations(int[] arr, int[][] ranges,int rotations, int index)
    {
        System.out.println("Find element at given index after a number of rotations");
        for (int i = rotations - 1; i >= 0; i--) {

            // Range[left...right]
            int left = ranges[i][0];
            int right = ranges[i][1];

            // Rotation will not have any effect
            if (left <= index && right >= index) {
                if (index == left)
                    index = right;
                else
                    index--;
            }
        }

        // Returning new element
        return arr[index];
    }

    public static void splitArrayAndAddFirstPartEndMethod1(int[] arr, int n, int k)
    {
        System.out.println("Split the array and add the first part to the end");
        for (int i = 0; i < k; i++) {

            // Rotate array by 1.
            int x = arr[0];
            if (n - 1 >= 0) System.arraycopy(arr, 1, arr, 0, n - 1);
            arr[n - 1] = x;
        }
        System.out.println("Output is:"+Arrays.toString(arr));
    }

    // Function to split array and
    // move first part to end
    public static void splitArrayAndAddFirstPartEndMethod2(int[] A,int length,int rotation){
        System.out.println("Split the array and add the first part to the end Method 2");
        //make a temporary array with double the size
        int[] tmp = new int[length*2];

        // copy array element in to new array twice
        System.arraycopy(A, 0, tmp, 0, length);
        System.arraycopy(A, 0, tmp, length, length);
        System.arraycopy(tmp, rotation, A, 0, rotation + length - rotation);
        System.out.println("Output is:"+Arrays.toString(tmp));
    }

}
