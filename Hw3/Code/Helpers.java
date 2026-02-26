import java.util.Random;

public class Helpers{

    int arr_size;
    int max_val;

    public Helpers(int arr_size, int max_val) {
        this.arr_size = arr_size;
        this.max_val = max_val;
    } 

    public int[] makeRandomArray(){
        Random random = new Random();//initialize random number generator
        int[] array = new int[arr_size];
        for (int i = 0; i< array.length; i++) {
            array[i] = random.nextInt(max_val+1);//generate a random integer in the range 0 to max_val
        }
        return array;
    }

    public String arrayToString(int[] array){
        String arrString="";
        for(int i=0; i<array.length; i++){
            arrString += " " + array[i];
        }
        return arrString;
    }

    // ------------------ swap() ------------------ //
    /**
     * swap the position of two integers within the array
     * @param arr an array of integers
     * @param a the index of integer in the array
     * @param b the index of another integer in the array
     * @return the rearranged array
     */
    public static int[] swap(int[] arr, int a, int b) {
        int p1 = arr[a];
        arr[a] = arr[b];
        arr[b] = p1;
        return arr;
    }
}