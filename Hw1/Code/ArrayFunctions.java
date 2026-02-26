import java.util.Random;

public class ArrayFunctions{
    /* Modify these values to change the size and range of numbers when creating a random array */
    static int ARR_SIZE = 10;
    static int MAX_VAL = 100;
    

    /* ========  Helpers ======== */
    /* Creates an integer array of a given where each element is between 0 and max */
    public static int[] makeRandomArray(int size, int max){
        Random random = new Random();//initialize random number generator
        int[] array = new int[size];
        for (int i = 0; i< array.length; i++) {
            array[i] = random.nextInt(max);//generate a random integer in the range 0 to max
        }
        return array;
    }

    //converts array to string
    public static String arrayToString(int[] array){
        String arrString="";
        for(int i=0; i<array.length; i++){
            arrString += " " + array[i];
        }
        return arrString;
    }

    /* ========  Functions ======== */

    /**
     * Store the entire array to a new location
     * @param array an array of integers 
     * @return the copied array of integers
     */
    public static int[] copy(int[] array){
        int[] newArray = new int[array.length]; // creates a new array of integers with length of the original array
        for (int i=0; i<array.length; i++){ // iterates over each integer in the array and store it to a new array
            newArray[i] = array[i];
        }
		return newArray;
    }

    /**
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


    /**
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

    /**
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

    /**
     * Calculates the average of all elements within the array
     * @param arr an array of integers
     * @return the average of all integer elements in the array
     */
    public static int findAverage(int[] arr) {
        int total = addAll(arr);
        int average = total / arr.length;
		return average;
    }

    /**
     * swap the position of two integers within the array
     * @param arr an array of integers
     * @param a the index of integer in the array
     * @param b the index of another integer in the array
     * @return the rearranged array
     * @throws IllegalArgumentException if the index picked is out of bound
     */
    public static int[] swap(int[] arr, int a, int b) {
        if (a < arr.length && b < arr.length){ // checks if the index is within the array length
            int p1 = arr[a];
            arr[a] = arr[b];
            arr[b] = p1;
            return arr;
        }else{
            throw new IllegalArgumentException("Index out of bound.");
        }
    }
    
    /**
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


    /**
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

    /**
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

    /**
     * Returns the index of the minimum integer in the array
     * @param arr an array of integers
     * @return the index of minimum value in the array
     */
    public static int findMinIndex(int[] arr){
        int minIndex = 0;
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    /**
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

    /**
     * Returns the index of the maximum integer in the array
     * @param arr an array of integers
     * @return the index of maximum value in the array
     */
    public static int findMaxIndex(int[] arr){
        int maxIndex = 0;
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    /**
     * Reverse the order of integers in an array 
     * @param arr an array of integers
     * @return the reversed array 
     */
    public static int[] reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int p = arr[left];
            arr[left] = arr[right];
            arr[right] = p;

            left = left + 1;
            right = right - 1;
        }
        return arr;
    }

    /**
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

    /**
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


    /**
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

    /**
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
            swap(arrA, i, minIndex); // swap the location between the local minimum and the number at location i
        }
        return arrA;
    }

    /* ========  Unit Tests ======== */


    public static void test_copy(int[] inputArr){
        System.out.println("1. ===== Testing: copy =====");
        System.out.print("Input array: ");
        System.out.println(arrayToString(inputArr));
        int[] copy = copy(inputArr);
        System.out.println("Copied array: " + arrayToString(copy));
        System.out.println("1. ===== Done: copy =====\n");
    }


    public static void test_addAll(int[] inputArr){
        System.out.println("2. ===== Testing: addAll =====");
        System.out.print("Input array: ");
        System.out.println(arrayToString(inputArr));
        int total = addAll(inputArr);
        System.out.println("Total: " + total);
        System.out.println("2. ===== Done: addAll =====\n");
    }

    /**
     * tests the add array method
     * @param inputArr1 the first input integer array
     * @param inputArr2 the second input integer array
     */
    public static void test_addArrays(int[] inputArr1,int[] inputArr2){
        System.out.println("3. ===== Testing: addArrays =====");
        System.out.print("Input array: ");
        System.out.println(arrayToString(inputArr1) + " and " + arrayToString(inputArr2));
        int[] sumArray = addArrays(inputArr1, inputArr2);
        System.out.println("Total: " + arrayToString(sumArray));
        System.out.println("3. ===== Done: addArrays =====\n");
    }

    /**
     * tests the multiply all method
     * @param inputArr the  input integer array
     */
    public static void test_multiplyAll(int[] inputArr){
        System.out.println("4. ===== Testing: multiplyAll =====");
        System.out.print("Input array: ");
        System.out.println(arrayToString(inputArr));
        int product = multiplyAll(inputArr);
        System.out.println("Product: " + product);
        System.out.println("4. ===== Done: multiplyAll =====\n");
    }

    /**
     * tests the find average method
     * @param inputArr the input integer array
     */
    public static void test_findAverage(int[] inputArr){
        System.out.println("5. ===== Testing: findAverage =====");
        System.out.print("Input array: ");
        System.out.println(arrayToString(inputArr));
        int average = findAverage(inputArr);
        System.out.println("Average: " + average);
        System.out.println("5. ===== Done: findAverage =====\n");
    }

    /**
     * tests the swap method
     * @param inputArr the input integer array
     * @param a the first index picked in the array
     * @param b the second index picked in the array
     */
    public static void test_swap(int[] inputArr, int a, int b){
        System.out.println("6. ===== Testing: swap =====");
        System.out.print("Input array: ");
        System.out.println(arrayToString(inputArr));
        System.out.print("Indices to swap: ");
        System.out.println(a + " and " + b);
        int[] newArr = swap(inputArr, a, b);
        System.out.println("Average: " + arrayToString(newArr));
        System.out.println("6. ===== Done: swap =====\n");
    }

    public static void test_isElement(int[] inputArr){
        int value = inputArr[0]; //Choosing an element in the array
        System.out.println("7. ===== Testing: isElement =====");
        System.out.print("Input array: ");
        System.out.println(arrayToString(inputArr));
        System.out.println("Value: "+ value);
        System.out.println("Result from isElement: "+ isElement(inputArr, value));
        System.out.println("7. ===== Done: isElement =====\n");
    }

    /**
     * test the method index of
     * @param inputArr the array of integers
     */
    public static void test_indexOf(int[] inputArr){
        int value = inputArr[1]; // choosing an element in the array
        System.out.println("8. ===== Testing: indexOf =====");
        System.out.print("Input array: ");
        System.out.println(arrayToString(inputArr));
        System.out.print("Value: " + value + "\n");
        System.out.print("Index of element: " + indexOf(inputArr, value)+ "\n");
        System.out.println("8. ===== Done: indexOf =====\n");
    }

    /**
     * test the method findMin
     * @param inputArr the array of integers
     */
    public static void test_findMin(int[] inputArr){
        System.out.println("9. ===== Testing: findMin =====");
        System.out.print("Input array: ");
        System.out.println(arrayToString(inputArr));
        System.out.print("Minimum value: " + findMin(inputArr) + "\n");
        System.out.println("9. ===== Done: findMin =====\n");
    }

    /**
     * test the method findMinIndex
     * @param inputArr the array of integers
     */
    public static void test_findMinIndex(int[] inputArr){
        System.out.println("10. ===== Testing: findMinIndex =====");
        System.out.print("Input array: ");
        System.out.println(arrayToString(inputArr));
        System.out.print("Index of minimum: " + findMinIndex(inputArr) + "\n");
        System.out.println("10. ===== Done: findMinIndex =====\n");
    }

    /**
     * test the method findMax
     * @param inputArr the array of integers
     */
    public static void test_findMax(int[] inputArr){
        System.out.println("11. ===== Testing: findMax =====");
        System.out.print("Input array: ");
        System.out.println(arrayToString(inputArr));
        System.out.print("Maximum value: " + findMax(inputArr) + "\n");
        System.out.println("11. ===== Done: findMax =====\n");
    }

    /**
     * test the method findMaxIndex
     * @param inputArr the array of integers
     */
    public static void test_findMaxIndex(int[] inputArr){
        System.out.println("12. ===== Testing: findMaxIndex =====");
        System.out.print("Input array: ");
        System.out.println(arrayToString(inputArr));
        System.out.print("Index of maximum: " + findMaxIndex(inputArr) + "\n");
        System.out.println("12. ===== Done: findMaxIndex =====\n");
    }

    /**
     * test the method reverse
     * @param inputArr the array of integers
     */
    public static void test_reverse(int[] inputArr){
        System.out.println("13. ===== Testing: reverse =====");
        System.out.print("Input array: ");
        System.out.println(arrayToString(inputArr));
        System.out.print("Array after reversal: " + arrayToString(reverse(inputArr)) + "\n");
        System.out.println("13. ===== Done: reverse =====\n");
    }

    /**
     * test the method return reverse
     * @param inputArr the array of integers
     */
    public static void test_returnReverse(int[] inputArr){
        System.out.println("14. ===== Testing: returnReverse =====");
        System.out.print("Input array: ");
        System.out.println(arrayToString(inputArr));
        System.out.print("New reversed array: " + arrayToString(reverse(inputArr)) + "\n");
        System.out.println("14. ===== Done: returnReverse =====\n");
    }

    /**
     * test the method intersection
     * @param inputArr1 the first array of integers
     * @param inputArr2 the second array of integers
     */
    public static void test_intersection(int[] inputArr1, int[] inputArr2){
        System.out.println("15. ===== Testing: intersection =====");
        System.out.print("First input array: ");
        System.out.println(arrayToString(inputArr1));
        System.out.print("Second input array: ");
        System.out.println(arrayToString(inputArr2));
        System.out.print("Intersections: " + arrayToString(intersection(inputArr1, inputArr2)) + "\n");
        System.out.println("15. ===== Done: intersection =====\n");
    }

    /**
     * test the method union
     * @param inputArr the array of integers
     */
    public static void test_union(int[] inputArr1, int[] inputArr2){
        System.out.println("16. ===== Testing: union =====");
        System.out.print("First input array: ");
        System.out.println(arrayToString(inputArr1));
        System.out.print("Second input array: ");
        System.out.println(arrayToString(inputArr2));
        System.out.print("Union array: " + arrayToString(union(inputArr1, inputArr2)) + "\n");
        System.out.println("16. ===== Done: union =====\n");
    }

    /**
     * test the method sort
     * @param inputArr the array of integers
     */
    public static void test_sort(int[] inputArr1){
        System.out.println("17. ===== Testing: sort =====");
        System.out.print("Input array: ");
        System.out.println(arrayToString(inputArr1));
        System.out.print("Sorted array: " + arrayToString(sort(inputArr1)) + "\n");
        System.out.println("17. ===== Done: sort =====\n");
    }

    /* ==========  Main =========== */

    public static void main(String[] args) {
        //Create a random array of size ARR_SIZE with integer values between 0 and MAX_VAL
        int[] inputArr1 = makeRandomArray(ARR_SIZE, MAX_VAL);
        int[] inputArr2 = makeRandomArray(ARR_SIZE, MAX_VAL);

        //Run the unit tests

        // #1: copy()
        test_copy(inputArr1);
        System.out.println();

        // #2: addAll()
        test_addAll(inputArr1);
        System.out.println();

        // #3: addArrays()
        test_addArrays(inputArr1, inputArr2);
        System.out.println();

        // #4: multiplyAll()
        test_multiplyAll(inputArr1);
        System.out.println();

        // #5: findAverage()
        test_findAverage(inputArr1);
        System.out.println();
        
        // #6: swap()
        test_swap(inputArr1, 2, 6);
        System.out.println();
		
        // #7: isElement()
        test_isElement(inputArr1);
        System.out.println();
		
        // #8: indexOf()
        test_indexOf(inputArr1);
        System.out.println();

        // #9: findMin()
        test_findMin(inputArr1);
        System.out.println();
		
        // #10: findMaxIndex()
        test_findMinIndex(inputArr1);
        System.out.println();

        // #11: findMax()
        test_findMax(inputArr1);
        System.out.println();

        // #12: findMaxIndex()
        test_findMaxIndex(inputArr1);
        System.out.println();

        // #13: reverse()
        test_reverse(inputArr1);
        System.out.println();

        // #14: returnReverse()
        test_returnReverse(inputArr1);
        System.out.println();

        // #15: intersection()
        test_intersection(inputArr1, inputArr2);
        System.out.println();

        // #16: union()
        test_union(inputArr1, inputArr2);
        System.out.println();

        // #17: sort()
        test_sort(inputArr1);
        System.out.println();
    }

}