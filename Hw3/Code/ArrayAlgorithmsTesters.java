import java.util.Random;

public class ArrayAlgorithmsTesters{

    /* ========  Testers ======== */
    public static void test_copyRec(Helpers helpers, int[] inputArr){
        System.out.println("1. ===== Testing: copy =====");
        System.out.println("Input array: " + helpers.arrayToString(inputArr));
        System.out.println("Copied array: " );
        System.out.println("Iterative: " + helpers.arrayToString(ArrayAlgorithm.copy(inputArr)));
        System.out.println("Recursive: " + helpers.arrayToString(ArrayAlgorithm.copyRec(inputArr)));
    }

    public static void test_addAllRec(Helpers helpers, int[] inputArr){
        System.out.println("2. ===== Testing: addAll =====");
        System.out.println("Input array: " + helpers.arrayToString(inputArr));
        System.out.println("Total: ");
        System.out.println("Iterative: " + ArrayAlgorithm.addAll(inputArr));
        System.out.println("Recursive: " + ArrayAlgorithm.addAllRec(inputArr));
    }

    public static void test_addArraysRec(Helpers helpers, int[] inputArr1,int[] inputArr2){
        System.out.println("3. ===== Testing: addArrays =====");
        System.out.println("Input array: " + helpers.arrayToString(inputArr1) + " and " + helpers.arrayToString(inputArr2));
        System.out.println("Total: " );
        System.out.println("Iterative: " + helpers.arrayToString(ArrayAlgorithm.addArrays(inputArr1, inputArr2)));
        System.out.println("Recursive: " + helpers.arrayToString(ArrayAlgorithm.addArraysRec(inputArr1, inputArr2)));
    }

    public static void test_multiplyAllRec(Helpers helpers, int[] inputArr){
        System.out.println("4. ===== Testing: multiply =====");
        System.out.println("Input array: " + helpers.arrayToString(inputArr));
        System.out.println("Product: " );
        System.out.println("Iterative: " + ArrayAlgorithm.multiplyAll(inputArr));
        System.out.println("Recursive: " + ArrayAlgorithm.multiplyAllRec(inputArr));
    }

    public static void test_findAverageRec(Helpers helpers, int[] inputArr){
        System.out.println("5. ===== Testing: findAverage =====");
        System.out.println("Input array: " + helpers.arrayToString(inputArr));
        System.out.println("Average: ");
        System.out.println("Iterative: " + ArrayAlgorithm.findAverage(inputArr));
        System.out.println("Recursive: " + ArrayAlgorithm.findAverageRec(inputArr));
    }

    public static void test_isElementRec(Helpers helpers, int[] inputArr, int target){
        System.out.println("6. ===== Testing: isElement =====");
        System.out.println("Input array: " + helpers.arrayToString(inputArr));
        System.out.println("Value: "+ target);
        System.out.println("Result from isElement: ");
        System.out.println("Iterative: " + ArrayAlgorithm.isElement(inputArr, target));
        System.out.println("Recursive: " + ArrayAlgorithm.isElementRec(inputArr, target));
    }

    public static void test_indexOfRec(Helpers helpers, int[] inputArr, int target){
        System.out.println("7. ===== Testing: indexOf =====");
        System.out.println("Input array: " + helpers.arrayToString(inputArr));
        System.out.println("Value: "+ target);
        System.out.println("Index of element: " );
        System.out.println("Iterative: " + ArrayAlgorithm.indexOf(inputArr, target));
        System.out.println("Recursive: " + ArrayAlgorithm.indexOfRec(inputArr, target));
    }

    public static void test_findMinRec(Helpers helpers, int[] inputArr){
        System.out.println("8. ===== Testing: findMin =====");
        System.out.println("Input array: " + helpers.arrayToString(inputArr));
        System.out.println("Minimum value: ");
        System.out.println("Iterative: " + ArrayAlgorithm.findMin(inputArr));
        System.out.println("Recursive: " + ArrayAlgorithm.findMinRec(inputArr));
    }

    public static void test_findMinIndexRec(Helpers helpers, int[] inputArr){
        System.out.println("9. ===== Testing: findMinIndex =====");
        System.out.println("Input array: " + helpers.arrayToString(inputArr));
        System.out.println("Index of minimum: "+ ArrayAlgorithm.findMinIndexRec(inputArr));
    }

    public static void test_findMaxRec(Helpers helpers, int[] inputArr){
        System.out.println("10. ===== Testing: findMaxRec =====");
        System.out.println("Input array: " + helpers.arrayToString(inputArr));
        System.out.println("Maximum value: ");
        System.out.println("Iterative: " + ArrayAlgorithm.findMax(inputArr));
        System.out.println("Recursive: " + ArrayAlgorithm.findMaxRec(inputArr));
    }

    public static void test_findMaxIndexRec(Helpers helpers, int[] inputArr){
        System.out.println("11. ===== Testing: findMaxIndex =====");
        System.out.println("Input array: " + helpers.arrayToString(inputArr));
        System.out.println("Index of maximum: "+ ArrayAlgorithm.findMaxIndexRec(inputArr));
    }

    public static void test_reverseRec(Helpers helpers, int[] inputArr){
        System.out.println("12. ===== Testing: reverseRec =====");
        System.out.println("Input array: " + helpers.arrayToString(inputArr));
        System.out.println("Array after reversal: ");
        ArrayAlgorithm.reverse(inputArr);
        System.out.println("Iterative: " + helpers.arrayToString(inputArr));
        ArrayAlgorithm.reverseRec(inputArr);
        System.out.println("Recursive (reversed the result from Iterative Testing): " + helpers.arrayToString(inputArr));
    }

    public static void test_returnReverseRec(Helpers helpers, int[] inputArr){
        System.out.println("13. ===== Testing: returnReverseRec =====");
        System.out.println("Input array: " + helpers.arrayToString(inputArr));
        System.out.println("New reversed array: ");
        System.out.println("Iterative: " + helpers.arrayToString(ArrayAlgorithm.returnReverse(inputArr)));
        System.out.println("Recursive: " + helpers.arrayToString(ArrayAlgorithm.returnReverseRec(inputArr)));
    }

    public static void test_intersectionRec(Helpers helpers, int[] inputArr1, int[] inputArr2){
        System.out.println("14. ===== Testing: intersectionRec =====");
        System.out.println("First input array: " + helpers.arrayToString(inputArr1));
        System.out.println("Second input array: " + helpers.arrayToString(inputArr2));
        System.out.println("Intersections: ");
        System.out.println("Iterative: " + helpers.arrayToString(ArrayAlgorithm.intersection(inputArr1, inputArr2)));
        System.out.println("Recursive: " + helpers.arrayToString(ArrayAlgorithm.intersectionRec(inputArr1, inputArr2)));
    }

    public static void test_unionRec(Helpers helpers, int[] inputArr1, int[] inputArr2){
        System.out.println("15. ===== Testing: unionRec =====");
        System.out.println("First input array: " + helpers.arrayToString(inputArr1));
        System.out.println("Second input array: " + helpers.arrayToString(inputArr2));
        System.out.println("Union array: ");
        System.out.println("Iterative: " + helpers.arrayToString(ArrayAlgorithm.union(inputArr1, inputArr2)));
        System.out.println("Recursive: " + helpers.arrayToString(ArrayAlgorithm.unionRec(inputArr1, inputArr2)));
    }

    public static void test_sortRec(Helpers helpers, int[] inputArr1){
        System.out.println("16. ===== Testing: sortRec =====");
        System.out.println("Input array: " + helpers.arrayToString(inputArr1));
        System.out.println("Sorted array: ");
        System.out.println("Iterative: " + helpers.arrayToString(ArrayAlgorithm.sort(inputArr1)));
        System.out.println("Recursive: " + helpers.arrayToString(ArrayAlgorithm.sortRec(inputArr1)));
    }


    public static void main(String[] args) {
        // creates random testing numbers for student ID between 0 - 10

        Helpers helpers1 = new Helpers(10,100);
        Helpers helpers2 = new Helpers(10,100);

        int[] inputArr1 = helpers1.makeRandomArray();
        int[] inputArr2 = helpers2.makeRandomArray();

        Random random = new Random();
        int testing_id =random.nextInt(10);

        test_copyRec(helpers1, inputArr1);
        System.out.println();

        test_addAllRec(helpers1, inputArr1);
        System.out.println();

        test_addArraysRec(helpers1, inputArr1, inputArr2);
        System.out.println();

        test_multiplyAllRec(helpers1, inputArr1);
        System.out.println();

        test_findAverageRec(helpers1, inputArr1);
        System.out.println();
        
        test_isElementRec(helpers1, inputArr1, inputArr1[testing_id]);
        System.out.println();

        test_indexOfRec(helpers1, inputArr1, inputArr1[testing_id]);
        System.out.println();

        test_findMinRec(helpers1, inputArr1);
        System.out.println();

        test_findMinIndexRec(helpers1, inputArr1);
        System.out.println();

        test_findMaxRec(helpers1, inputArr1);
        System.out.println();

        test_findMaxIndexRec(helpers1, inputArr1);
        System.out.println();

        test_reverseRec(helpers1, inputArr1);
        System.out.println();

        test_returnReverseRec(helpers1, inputArr2);
        System.out.println();

        test_intersectionRec(helpers1, inputArr1, inputArr2);
        System.out.println();

        test_unionRec(helpers1, inputArr1, inputArr2);
        System.out.println();

        test_sortRec(helpers1, inputArr1);
        System.out.println();
    }

}