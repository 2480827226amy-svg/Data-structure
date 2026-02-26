import java.util.Random;
import java.util.Scanner;

public class GradesInfo {

    static int ARR_SIZE = 10;
    static int MAX_VAL = 100;

    /* ========  Helpers ======== */
    /* Creates an integer array of a given where each element is between 0 and max */
    public static int[] makeRandomArray(int size, int max){
        Random random = new Random();//initialize random number generator
        int[] array = new int[size];
        for (int i = 0; i< array.length; i++) {
            array[i] = random.nextInt(max + 1); //generate a random integer in the range 0 to max
        }
        return array;
    }

    //converts array to string
    public static String arrayToString(int[] array){
        String arrString = "";
        for(int i=0; i<array.length; i++){
            arrString += " " + array[i];
        }
        return arrString;
    }

    /* prints the list of possible options to search scores */
    public static void printMenu(){
        System.out.println("========== MENU ==========");
        System.out.println("1. get my score");
        System.out.println("2. get my rank");
        System.out.println("3. did anybody receive a 100?");
        System.out.println("4. did anybody receive a 0?");
        System.out.println("5. get the highest score");
        System.out.println("6. how many students received the highest score?");
        System.out.println("7. get the lowest score");
        System.out.println("8. how many students received the lowest score?");
        System.out.println("9. get a sorted list of all the scores");
        System.out.println("10. quit");
        System.out.println("==========================");
        System.out.println("Enter a number you'd like to know: ");
    }
    
    /* ========  Unit tests ======== */

    /**
     * tests the sorted scores method
     * @param inputArr the testing array
     */
    public static void test_sortedScores(Grades testing_object, int[] inputArr){
        System.out.println("===== Testing Sorted Score =====");
        System.out.println("Grades array: " + arrayToString(inputArr));
        System.out.println("Sorted: " + arrayToString(testing_object.sortedScores()));
    }

    /**
     * tests the get scores method
     * @param inputArr the testing array
     * @param p the student id used for testing
     */
    public static void test_getScore(Grades testing_object, int p, int[] inputArr){
        System.out.println("===== Testing Get Score =====");
        System.out.println("Grades array: " + arrayToString(inputArr));
        System.out.println("Score of student " + p + ": " + testing_object.getScore(p));
    }

    /**
     * tests the get rank method
     * @param inputArr the testing array
     * @param p the student id used for testing
     */
    public static void test_getRank(Grades testing_object, int p, int[] inputArr){
        System.out.println("===== Testing Get Rank =====");
        System.out.println("Grades array: " + arrayToString(inputArr));
        System.out.println("Sorted grades array: " + arrayToString(testing_object.sortedScores()));
        System.out.println("Score of student " + p + ": " + testing_object.getScore(p));
        System.out.println("Rank of student " + p + ": " + arrayToString(testing_object.getRank(p)));
    }

    /**
     * tests the get duplicate rank method
     * @param inputArr the testing array
     * @param p the student id used for testing
     */
    public static void test_getduplicateRank(int p, int[] duplicate){
        Grades duplicate_test = new Grades(duplicate);
        System.out.println("===== Testing Get Rank - Duplicates Case =====");
        System.out.println("Grades array: " + arrayToString(duplicate));
        System.out.println("Sorted grades array: " + arrayToString(duplicate_test.sortedScores()));
        System.out.println("Score of student " + p + ": " + duplicate_test.getScore(p));
        int[] rank = duplicate_test.getRank(p);
        System.out.println("Rank of student " + p + ": (" + rank[0] + "," + rank[1] + ")");
    }

    /**
     * tests the perfect score method
     * @param inputArr the testing array
     */
    public static void test_perfectScoreQ(Grades testing_object){
        System.out.println("===== Testing Perfect Score? =====");
        System.out.println("Grades array: " + arrayToString(testing_object.sortedScores()));
        System.out.println("Did anyone receive a score of 100?: " + testing_object.perfectScoreQ());
    }

    /**
     * tests the bottom score method
     * @param inputArr the testing array
     */
    public static void test_bottomScoreQ(Grades testing_object){
        System.out.println("===== Testing Bottom Score? =====");
        System.out.println("Grades array: " + arrayToString(testing_object.sortedScores()));
        System.out.println("Did anyone receive a score of 0?: " + testing_object.bottomScoreQ());
    }

    /**
     * tests the get max score method
     * @param inputArr the testing array
     */
    public static void test_getMaxScore(Grades testing_object){
        System.out.println("===== Testing Max Score =====");
        System.out.println("Sorted grades array: " + arrayToString(testing_object.sortedScores()));
        System.out.println("Highest score: " + testing_object.getMaxScore());
    }

    /**
     * tests getting number of max score method
     * @param inputArr the testing array
     */
    public static void test_nrMaxScore(Grades testing_object){
        System.out.println("===== Testing Number of Max Scores =====");
        System.out.println("Sorted grades array: " + arrayToString(testing_object.sortedScores()));
        System.out.println("Nr of " + testing_object.getMaxScore() + " score: " + testing_object.nrMaxScores());
    }

    /**
     * tests the get min score method
     * @param inputArr the testing array
     */
    public static void test_getMinScore(Grades testing_object){
        System.out.println("===== Testing Min Score =====");
        System.out.println("Sorted grades array: " + arrayToString(testing_object.sortedScores()));
        System.out.println("Lowest score: " + testing_object.getMinScore());
    }

    /**
     * tests getting number of min score method
     * @param inputArr the testing array
     */
    public static void test_nrMinScore(Grades testing_object){
        System.out.println("===== Testing Number of Min Scores =====");
        System.out.println("Sorted grades array: " + arrayToString(testing_object.sortedScores()));
        System.out.println("Nr of " + testing_object.getMinScore() + " score: " + testing_object.nrMinScores());
    }

    public static void runTests(){
            // creates random testing numbers for student ID between 0 - 10
            Random random = new Random();
            int testing_id =random.nextInt(ARR_SIZE);

            // creates random array instance to test
            int[] inputArr1 = makeRandomArray(ARR_SIZE, MAX_VAL);
            Grades testing_object = new Grades(inputArr1);

            System.out.println("Out-of-bounds id was entered. Running unit tests on the following input...");
            System.out.println("Grades Array: " + arrayToString(inputArr1));
            System.out.println("Student Id: " + testing_id);

            test_sortedScores (testing_object, inputArr1);
            System.out.println();

            test_getScore(testing_object, testing_id, inputArr1);
            System.out.println();

            test_getRank(testing_object, testing_id, inputArr1);
            System.out.println();

            // special tests for duplicates
            int[] duplicates = {90, 100, 78, 65, 90, 66, 54, 3, 28, 10};
            test_getduplicateRank(0, duplicates);
            System.out.println();

            test_perfectScoreQ(testing_object);
            System.out.println();

            test_bottomScoreQ(testing_object);
            System.out.println();

            test_getMaxScore(testing_object);
            System.out.println();

            test_nrMaxScore(testing_object);
            System.out.println();

            test_getMinScore(testing_object);
            System.out.println();

            test_nrMinScore(testing_object);
            System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Create a random array of size ARR_SIZE with integer values between 0 and MAX_VAL
        int[] test_scores = makeRandomArray(ARR_SIZE, MAX_VAL);
        Grades student_grades = new Grades(test_scores);

        System.out.println("Please enter ID number between 0 and 9: ");
        System.out.println("NOTE: entering an out-of-bounds ID will run all unit tests.");

        // checks student ID for testing or searching scores
        int studentID = scanner.nextInt();
        if (studentID > 9 || studentID < 0){ // do automatic tests
            runTests();
        }else{
            System.out.println("======== Welcome to Score Search ========"); // shows the instruction for score search
            System.out.println("===== Your Student ID: " + studentID + " =====");

            boolean stop = false;
            while (!stop){
                printMenu();
                int option = scanner.nextInt();
                switch(option){
                    case 1: 
                        System.out.println("Your score is: " + student_grades.getScore(studentID));
                        break;
                    case 2: 
                        int[] rank = student_grades.getRank(studentID);
                        if (rank.length == 1){
                            System.out.println("Your rank is: " + rank[0]);
                            break;
                        }else{
                            System.out.println("Rank of student " + studentID + ": (" + rank[0] + "," + rank[1] + ")"+ "\n");
                            break;
                        }
                    case 3: 
                        System.out.println("Did anyone receive a score of 100?: " + student_grades.perfectScoreQ());
                        break;
                    case 4:
                        System.out.println("Did anyone receive a score of 0?: " + student_grades.bottomScoreQ());
                        break;
                    case 5: 
                        System.out.println("Highest score: " + student_grades.getMaxScore());
                        break;
                    case 6:
                        System.out.println("Nr of " + student_grades.getMaxScore() + " score: " + student_grades.nrMaxScores());
                        break;
                    case 7: 
                        System.out.println("Lowest score: " + student_grades.getMinScore());
                        break;
                    case 8: 
                        System.out.println("Nr of " + student_grades.getMinScore() + " score: " + student_grades.nrMinScores());
                        break;
                    case 9:  
                        System.out.println("Sorted grades array: " + arrayToString(student_grades.sortedScores())+ "\n");
                        break;
                    case 10:      
                        stop = true;
                        break;
                }

            }

        }

        scanner.close();

    }

}