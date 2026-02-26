public class ArrayAlgorithm{

    // ------------------ copy() ------------------ //

    /** Iterative
     * Store the entire array to a new location
     * @param inputArr an array of integers 
     * @return the copied array of integers
     */
    public static int[] copy(int[] inputArr){
        int[] newArray = new int[inputArr.length]; // creates a new array of integers with length of the original array
        for (int i=0; i<inputArr.length; i++){ // iterates over each integer in the array and store it to a new array
            newArray[i] = inputArr[i];
        }
		return newArray;
    }

    /** Wrapper
     * Store the entire array to a new location
     * @param inputArr an array of integers 
     * @return the copied array of integers
     */
    public static int[] copyRec(int[] inputArr) {
        int n = inputArr.length;
        int[] copied = new int[n];
        copy(inputArr, n, copied);
        return copied;
    }

    /** Recursive
     * Helper function that copies the input array in a recursive way
     * @param inputArr input array
     * @param n the length of input array
     * @param inputArrCopied the copied array
     */
    private static void copy(int[] inputArr, int n, int[] inputArrCopied){
        if (n == 1){
            inputArrCopied[0] = inputArr[0];
        }else{
            copy(inputArr, n-1, inputArrCopied);
            inputArrCopied[n-1] = inputArr[n-1];
        }
    }
    
    // ----------------------------------------------- //


    // ------------------ addAll() ------------------ //

    /** Iterative
     * Adds all the integers in the array together
     * @param arr an array of integers
     * @return the sum of integers in the array, returned as a integer number
     */
    public static int addAll(int[] arr) {
        int sum = 0; // initiates variable sum and set at zero
        for (int i=0; i<arr.length; i++){
            sum = sum + arr[i]; // adds each integer term to the sum
        }
		return sum;
    }

    /** Wrapper
     * Adds all the integers in the array together
     * @param inputArr an array of integers
     * @return the sum of integers in the array, returned as a integer number
     */
    public static int addAllRec(int[] inputArr){
        int n = inputArr.length;
        return addAll(inputArr, n);
    }

    /** 
     * Recursive
     * @param inputArr an array of integers
     * @param n length of the input array
     */
    private static int addAll(int[] inputArr, int n){
        if (n == 1){
            return inputArr[0];
        }else{
            return addAll(inputArr, n-1) + inputArr[n-1];
        }
    }
    // ----------------------------------------------- //


    // ------------------ addArrays() ------------------ //

    /** Iterative
     * Adds the terms in two arrays together one by one
     * @param arrA the first array of integers
     * @param arrB the second array of integers 
     * @return a new array where each element is the sum of the corresponding elements of arrA and arrB
     * @throws IllegalArgumentException if the two arrays have different length
     */
    public static int[] addArrays(int[] arrA, int[] arrB) {
        if (arrA.length == arrB.length){
            int[] sumArray = new int[arrA.length]; // initiates a new integer array of 10 integer elements
            for (int i=0; i<arrA.length; i++){
                sumArray[i] = arrA[i] + arrB[i]; // adds each correspnding integer terms
            }
            return sumArray;
        }else{
            throw new IllegalArgumentException("Arrays must have same length.");
        }
    }

    /** Wrapper
     * Adds the terms in two arrays together
     * @param inputArr1 the first array of integers
     * @param inputArr2 the second array of integers 
     * @return a new array where each element is the sum of the corresponding elements of arrA and arrB
     */
    public static int[] addArraysRec(int[] inputArr1, int[] inputArr2){
        int n = inputArr1.length;
        int[] added = new int[n];
        addArrays(inputArr1, inputArr2, n, added);
        return added;
    }

    /** Recursive
     * Helper function that adds two array togethwer in a recursive way
     * @param inputArr1 the input array
     * @param inputArr2 the input array
     * @param n the length of input array
     * @param added the array that stores the added numbers
     */
    private static void addArrays(int[] inputArr1, int[] inputArr2, int n, int[] added){
        if (n == 1){
            added[0] = inputArr1[0] + inputArr2[0];
        }else{
            addArrays(inputArr1, inputArr2, n-1, added);
            added[n-1] = inputArr1[n-1] + inputArr2[n-1];
        }
    }
    // -------------------------------------------------- //

    
    // ------------------ multiplyAll() ------------------ //

    /** Iterative
     * Multiplies all the terms in the integer array
     * @param arr an array of integers 
     * @return the product of all integer elements
     */
    public static int multiplyAll(int[] arr) {
        int product = 1; // initializes the product
        for (int i=0; i<arr.length; i++){
            product = product * arr[i]; // using the product to multiply each elements in the array
        }
		return product;
    }

    /** Wrapper
     * Multiplies all the terms in the integer array
     * @param inputArr an array of integers 
     * @return the product of all integer elements
     */
    public static int multiplyAllRec(int[] inputArr){
        int n = inputArr.length;
        return multiplyAll(inputArr, n);
    }

    /** Recursion
     * Multiplies all the terms in the integer array
     * @param inputArr an array of integers 
     * @param n the number of elements in the input array
     * @return the product of all integer elements
     */
    private static int multiplyAll(int[] inputArr, int n){
        if (n == 1){
            return inputArr[0];
        }else{
            return multiplyAll(inputArr, n-1) * inputArr[n-1];
        }
    }

    // ----------------------------------------------- //


    // ------------------ findAverage() ------------------ //

    /** 
     * Calculates the average of all elements within the array
     * @param arr an array of integers
     * @return the average of all integer elements in the array
     */
    public static float findAverage(int[] arr) {
		return (float) addAll(arr)/arr.length;
    }

    /** Recursive add all
     * Calculates the average of all elements within the array
     * @param inputArr an array of integers
     * @return the average of all integer elements in the array
     */
    public static float findAverageRec(int[] inputArr){
        return (float)addAllRec(inputArr)/inputArr.length;
    }

    // ----------------------------------------------- //


    // ------------------ isElement() ------------------ //

    /** Iterative
     * Checks whether a integer is an element of the array
     * @param array an array of integers
     * @param value the value to be checked
     * @return true if the value is in the array, otherwise false
     */
    public static boolean isElement(int[] array, int value){
        for(int i=0; i < array.length; i++){
            if(array[i] == value){
                return true;
            }
        }
        return false;
    }

    /** Wrapper
     * Checks whether a integer is an element of the array
     * @param inputArr an array of integers
     * @param target the targeted value to be checked
     * @return true if the value is in the array, otherwise false
     */
    public static boolean isElementRec(int[] inputArr, int target){
        int n = inputArr.length;
        return isElement(inputArr, target, n);
    }

    /** Recursive
     * Checks whether a integer is an element of the array
     * @param inputArr an array of integers
     * @param target the targeted value to be checked
     * @param n the length of input array
     * @return true if the value is in the array, otherwise false
     */
    private static boolean isElement(int[] inputArr, int target, int n){
        if (n==0){
            return false;
        }
        else if(inputArr[n-1] == target){
            return true;
        }
        else{
            return isElement(inputArr, target, n-1);
        }
    }
    // ----------------------------------------------- //
    

    // ------------------ indexOf() ------------------ //

    /** Iterative
     * Checks the index of integers in the array
     * @param arr an array of integers
     * @param a the value that needs to be checked for index
     * @return the index of the value in the array
     */
    public static int indexOf(int[] arr, int a){
        for (int i=0; i < arr.length; i++){
            if (arr[i] == a){
                return i;
            }
        }
        return -1;
    }

    /** Wrapper
     * Checks the index of integers in the array
     * @param inputArr an array of integers
     * @param target the targeted value to be checked
     * @return the index of the value in the array
     */
    public static int indexOfRec(int[] inputArr, int target){
        int n = inputArr.length;
        return indexOf(inputArr, target, n);
    }

    /** Recursive
     * Checks the index of integers in the array
     * @param inputArr an array of integers
     * @param target the targeted value to be checked
     * @param n the length of input array
     * @return the index of the value in the array
     */
    private static int indexOf(int[] inputArr, int target, int n){
        if (n==0){
            return -1;
        }
        else if(inputArr[n-1] == target){
            return n-1;
        }
        else{
            return indexOf(inputArr, target, n-1);
        }
    }

    // ----------------------------------------------- //

    
    // ------------------ findMin() ------------------ //

    /** Iterative
     * Returns the minimum integer in the array
     * @param arr an array of integers
     * @return the minimum value in the array
     */
    public static int findMin(int[] arr){
        int minValue = arr[0]; // sets the first integer as minimum as default
        for (int i=1; i < arr.length; i++){
            if (arr[i] < minValue){
                minValue = arr[i]; // replaces the minimum if the next integer is smaller than the previous one
            }
        }
        return minValue;
    }

    /** Wrapper
     * Returns the minimum integer in the array
     * @param inputArr an array of integers
     * @return the minimum value in the array
     */
    public static int findMinRec(int[] inputArr){
        int n = inputArr.length;
        return findMin(inputArr,n);
    }

    /** Recursion
     * Returns the minimum integer in the array
     * @param inputArr an array of integers
     * @param n the length of the input array
     * @return the minimum value in the array
     */
    private static int findMin(int[] inputArr, int n){
        if (n == 1){
            return inputArr[0];
        }else{
            int min = findMin(inputArr, n-1);
            if (min > inputArr[n-1]){
                return inputArr[n-1];
            }else{
                return min;
            }
        }
    }

    // ----------------------------------------------- //


    // ------------------ findMinIndexRec() ------------------ //

    /**
     * Returns the index of the minimum integer in the array
     * @param inputArr an array of integers
     * @return the index of minimum value in the array
     */
    public static int findMinIndexRec(int[] inputArr) {
        int min = findMinRec(inputArr);
        int min_index = indexOfRec(inputArr, min);
        return min_index;
    }

    // ----------------------------------------------- //


    // ------------------ findMax() ------------------ //

    /** Iterative
     * Returns the maximum integer in the array
     * @param arr an array of integers
     * @return the maximum value in the array
     */
    public static int findMax(int[] arr){
        int maxValue = arr[0]; // sets the first integer as maximum as default
        for (int i=1; i < arr.length; i++){
            if (arr[i] > maxValue){
                maxValue = arr[i]; // replaces the maximum if the next integer is smaller than the previous one
            }
        }
        return maxValue;
    }

    /** Wrapper
     * Returns the maximum integer in the array
     * @param inputArr an array of integers
     * @return the maximum value in the array
     */
    public static int findMaxRec(int[] inputArr){
        int n = inputArr.length;
        return findMax(inputArr, n);
    }

    /** Recursive
     * Returns the maximum integer in the array
     * @param inputArr an array of integers
     * @param n the length of the input array
     * @return the maximum value in the array
     */
    private static int findMax(int[] inputArr, int n){
        if (n==1){
            return inputArr[0];
        }else{
            int max = findMax(inputArr, n-1);
            if (max < inputArr[n-1]){
                return inputArr[n-1];
            }else{
                return max;
            }
        }
    }
    // ----------------------------------------------- //


    // ------------------ findMaxIndexRec() ------------------ //

    /**
     * Returns the index of the maximum integer in the array
     * @param inputArr an array of integers
     * @return the index of maximum value in the array
     */
    public static int findMaxIndexRec(int[] inputArr){
        int max = findMaxRec(inputArr);
        int max_index = indexOfRec(inputArr, max);
        return max_index;
    }
    // ----------------------------------------------- //


    // ------------------ reverse() ------------------ //

    /** Iterative
     * Reverse the order of integers in an array 
     * @param arr an array of integers
     */
    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int p = arr[left];
            arr[left] = arr[right];
            arr[right] = p;

            left = left + 1;
            right = right - 1;
        }
    }

    /** Wrapper
     * Reverse the order of integers in an array 
     * @param inputArr an array of integers
     */
    public static void reverseRec(int[] inputArr){
        int left = 0;
        int right = inputArr.length-1;
        reverse(inputArr,left,right);
    }

    /** Recursive
     * Reverse the order of integers in an array 
     * @param inputArr an array of integers
     * @param left the index where reverse starts from the left
     * @param right the index where reverse starts from the right
     */
    private static void reverse(int[] inputArr, int left, int right){
        if (left >= right){
            return;
        }else{
            Helpers.swap(inputArr, left, right);
            reverse(inputArr, left+1, right -1);
        }
    }
    // ----------------------------------------------- //


    // ------------------ returnReverse() ------------------ //

    /** Iterative
     * Reverse the order of integers in an array and return a new array
     * @param arr an array of integers
     * @return the new reversed array 
     */
    public static int[] returnReverse(int[] arr){
        int [] reverse_arr = new int[arr.length];
        for (int i=0; i < arr.length; i++){
            reverse_arr[i] = arr[arr.length - 1 - i];
        }
        return reverse_arr;
    }

    /** Wrapper
     * Reverse the order of integers in an array and return a new array
     * @param inputArr an array of integers
     * @return the new reversed array 
     */
    public static int[] returnReverseRec(int[] inputArr){
        int[] reversed = new int[inputArr.length];
        returnReverse(inputArr, inputArr.length, reversed);
        return reversed;
    }

    /** Recursion
     * Helper function that reverses the order of an array
     * @param inputArr input array
     * @param n the length of array
     * @param reversed the reversed array
     */
    public static void returnReverse(int[] inputArr, int n, int[] reversed){
        if (n==1){ // assumes the input array always has a length of at least one
            reversed[0] = inputArr[inputArr.length - 1];
        }else{
            returnReverse(inputArr, n - 1, reversed);
            reversed[n - 1] = inputArr[inputArr.length - n]; 
        }
    }

    // ----------------------------------------------- //


    // ------------------ intersection() ------------------ //

    /** Iterative
     * Takes in two arrays and returns a new integer array that contains the elements that appear in both input arrays
     * @param arrA the first integer array
     * @param arrB the second integer array
     * @return the intersection of the two arrays
     */
    public static int[] intersection(int[] arrA, int[] arrB){
        int[] tempArr = new int[arrA.length]; // temporary array
        int n = 0;

        for (int i=0; i < arrA.length; i++){
            boolean inArrB = false;
            for (int j=0; j< arrB.length; j++){ // checks if the each element in A is also in B
                if (arrA[i] == arrB[j]){
                    inArrB = true;
                    break;
                }
            }

            boolean intempArr = false; // checks if the elements that appear both in A and in B is already stored
            for (int k=0; k < n; k++){
                if (arrA[i] == tempArr[k]){
                    intempArr = true;
                    break;
                }
            }

            if (inArrB && !intempArr){
                tempArr[n] = arrA[i]; // if the element appears in both array A and array B, and it is not added to the array yet, then add it to the tenporary array
                n = n + 1;
            }
        }
        int [] arrC = new int[n];
        for (int i=0; i < n; i++){ // stores the array that includes zeros to a new array
            arrC[i] = tempArr[i];
        }
        return arrC;
    }

    /** Recursive
     * Takes in two arrays and returns a new integer array that contains the elements that appear in both input arrays
     * @param inputArr1 the first integer array
     * @param inpurArr2 the second integer array
     * @return the intersection of the two arrays
     */
    public static int[] intersectionRec(int[] inputArr1, int[] inputArr2){
        int[] temp = new int[inputArr1.length];
        int size = intersection(inputArr1, inputArr2, temp, inputArr1.length);

        int[] result = new int[size];
        clearArray(temp, size, result);
        return result;
    }

    /**
     * Helper function that determines the size of array of intersection
     * @param inputArr1 the first input array
     * @param inputArr2 the second input array
     * @param temp the temperary array that stores intersected elements
     * @param n the length of array
     * @return the number of intersected elements 
     */
    public static int intersection(int[] inputArr1, int[] inputArr2, int[] temp, int n) {
        if (n == 0) {
            return 0;
        } else {
            int count = intersection(inputArr1, inputArr2, temp, n - 1);

            int current = inputArr1[n - 1];
            boolean inB = isElementRec(inputArr2, current);
            boolean inTemp = isElementRec(temp, current);
            
            if (inB && !inTemp) {
                temp[count] = current; 
                return count + 1;
            } else {
                return count;
            }
        }
    }

    /**
     * Helper function that restores the array into a cleared array
     * @param inputArr the input array
     * @param size the size of clear array
     * @param result the cleared array
     */
    public static void clearArray(int[] inputArr, int size, int[] result){
        if (size == 0){
            return;
        }else{
            clearArray(inputArr, size - 1, result);
            result[size-1] = inputArr[size - 1];
        }
    }
    // ----------------------------------------------- //


    // ------------------ union() ------------------ //

    /** Iterative
     * takes in two integer arrays and returns a new integer array that represents the set union of the two arrays
     * @param arrA the first integer array
     * @param arrB the second integer array
     * @return the union of the two arrays
     */
    public static int[] union(int[] arrA, int[] arrB){
        int[] tempArr1 = new int[arrA.length + arrB.length]; // temporary array
        int n = 0;
        for (int i=0; i < arrA.length; i++){ // stores all the element in array A into the temporary array
            tempArr1[n] = arrA[i];
            n = n + 1;
        }
        for (int j=0; j< arrB.length; j++){ // stores all the element in array B into the temporary array
            tempArr1[n] = arrB[j];
            n = n + 1;
        }
        int count = 0; 
        int[] tempArr2 = new int[n];
        for (int i=0; i < tempArr1.length; i++){

            boolean repeat = false;
            for (int j=0; j < count; j++){ // checks for repeated elements in the array, and store the non repeated ones into a new array.
                if (tempArr1[i] == tempArr2[j]){
                    repeat = true;
                    break;
                }
            }
            if (!repeat){
                tempArr2[count] = tempArr1[i];
                count = count + 1;
            }
        }
        int[] arrC = new int[count];
        for (int i=0; i < count; i++){
            arrC[i] = tempArr2[i];
        }
        return arrC;
    }

    /** Recursive
     * takes in two integer arrays and returns a new integer array that represents the set union of the two arrays
     * @param inputArr1 the first integer array
     * @param inputArr2 the second integer array
     * @return the union of the two arrays
     */
    public static int[] unionRec(int[] inputArr1, int[] inputArr2){
        int[] temp = new int[inputArr1.length + inputArr2.length];
        int size = union(inputArr1, temp, inputArr1.length, 0);

        size = union(inputArr2, temp, inputArr2.length, size);

        int[] result = new int[size];
        clearArray(temp, size, result);
        return result;
    }

    /**
     * Helper function that stores the non-repeated elements from array A into the temporary array
     * @param inputArr the input array
     * @param temp the temporary array
     * @param n length of the input array
     */
    public static int union(int[] inputArr, int[] temp, int n, int start){
        if (n == 0){
            return start;
        }else{
            int count = union(inputArr, temp, n-1, start);

            int current = inputArr[n-1];
            boolean inTemp = isElementRec(temp, current);
            if (!inTemp){
                temp[count] = current;
                return count + 1;
            }else{
                return count;
            }
        }
    }
    // ----------------------------------------------- //

    // ------------------ sort ------------------ //

    /** Iterative
     * Takes in an array and sorts it
     * @param arrA the first integer array
     * @return the sorted array
     */
    public static int[] sort(int[] arrA){
        for (int i=0; i < arrA.length - 1; i++){
            int minIndex = i; //sorts each element in array A one by one. 
            for (int j =i+1; j < arrA.length; j++){
                if (arrA[j] < arrA[minIndex]){ // compares the current element with the elements after this current element to find the smallest one
                    minIndex = j;
                }
            }
            Helpers.swap(arrA, i, minIndex); // swap the location between the local minimum and the number at location i
        }
        return arrA;
    }

    /** wrapper
     * @param arrA the first integer array
     * @return the sorted array
     */
    public static int[] sortRec(int[] inputArr){
        int[] sorted = new int[inputArr.length];
        int[] copy = copyRec(inputArr);
        sort(copy, inputArr.length, sorted);
        return sorted;
    }

    /** Recursive
     * @param inputArr the input array
     * @param n length of the input array
     * @param sorted he sorted array
     */
    public static void sort(int[] inputArr, int n, int[] sorted){
        if (n == 0){
            return;
        } else {
            int minIdx = findMinIndexRec(inputArr, 0, n);
            sorted[inputArr.length - n] = inputArr[minIdx];
            Helpers.swap(inputArr, minIdx, n - 1);
            sort(inputArr, n - 1, sorted);
        }
    }

    /** 
     * Helper function that checks the index of minimum within the given range
     * @param inputArr the input array
     * @param index the index of local minimum
     * @param limit the range to search
     * @return the index of local minimum within given range
     */
    public static int findMinIndexRec(int[] inputArr, int index, int limit) {
        if (index == limit - 1) {
            return index;
        } else {
            int minIdxOfRest = findMinIndexRec(inputArr, index + 1, limit);
            if (inputArr[index] < inputArr[minIdxOfRest]) {
                return index;
            } else {
                return minIdxOfRest;
            }
        }
    }
}