public class Grades {
    
    // attributes
    private int[] grades;

    /* ========  Constructor ======== */
    public Grades(int[] grades){
        this.grades = grades;
    }

    /* ========  Helpers ======== */

    /**
     * Checks the index of integers in the array
     * @param arr an array of integers
     * @param a the value that needs to be checked for index
     * @return the index of the value in the array
     */
    private int indexOf(int[] arr, int a){
        for (int i=0; i < arr.length; i++){
            if (arr[i] == a){
                return i;
            }
        }
        return -1;
    }

    /**
     * counts the number of score appeared in the array
     * @param score the score to be count
     * @return the number of times it appeared
     */
    private int count(int score) {
        int count = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == score) {
                count = count + 1;
            }
        }
        return count;
    }

    /**
     * Returns the minimum integer in the array
     * @param arr an array of integers
     * @return the minimum value in the array
     */
    private int findMin(int[] arr){
        int minValue = arr[0]; // sets the first integer as minimum as default
        for (int i=1; i < arr.length; i++){
            if (arr[i] < minValue){
                minValue = arr[i]; // replaces the minimum if the next integer is smaller than the previous one
            }
        }
        return minValue;
    }

    /**
     * Returns the maximum integer in the array
     * @param arr an array of integers
     * @return the maximum value in the array
     */
    private int findMax(int[] arr){
        int maxValue = arr[0]; // sets the first integer as maximum as default
        for (int i=1; i < arr.length; i++){
            if (arr[i] > maxValue){
                maxValue = arr[i]; // replaces the maximum if the next integer is smaller than the previous one
            }
        }
        return maxValue;
    }

    /* ========  Main Functions ======== */
    /**
     * sorts the array of scores from highest to lowest
     * @return the sorted integer array of scores from highest to lowest
     */
    public int[] sortedScores(){
        int max = getMaxScore();
        int[] sorting = new int[max+1];

        for (int i=0; i < grades.length; i++){ // counting
            int score = grades[i];
            sorting[score] = sorting[score] + 1;
        }

        int index = 0; 
        int[] sorted = new int[grades.length];
        for (int i=max; i>= 0; i--) { // build sorted array (descending)
            while (sorting[i] > 0) {
                sorted[index] = i;
                index = index + 1;
                sorting[i] = sorting[i] - 1;
            }
        }
        return sorted;
    }

    /**
     * gets the students' score with their ids
     * @param studentID the student's special ID number
     * @return the student's score in integer
     */
    public int getScore(int studentID){
            return grades[studentID];
    }

    /**
     * gets the students' rank
     * @param studentID the student's special ID number
     * @return the student's rank 
     */
    public int[] getRank(int studentID){
        int student_score = getScore(studentID);
        int[] sorted = sortedScores();
        int k = indexOf(sorted, student_score);
        int m = count(student_score);

        if (m == 1){
            int[] rank = new int[1];
            rank[0] = k + 1; 
            return rank;
        }else{
            int[] rank = new int[2]; // if multiple students get the same score, return the first rank and the last rank of students who received the same
            rank[0] = k + 1;
            rank[1] = k + m;
            return rank;
        }
    }

    /**
     * whether there is someone getting a 100
     * @return true if there is, otherwise false
     */
    public boolean perfectScoreQ(){
        return count(100) > 0;
    }

    /**
     * whether there is someone getting a 0
     * @return true if there is, otherwise false
     */
    public boolean bottomScoreQ(){
        return count(0)>0;
    }

    /**
     * gets the maximum score in the array
     * @return the highest score
     */
    public int getMaxScore(){
        return findMax(grades);
    }

    /**
     * gets the number of students who get the maximum score
     * @return the number of students who get the highest score
     */
    public int nrMaxScores(){
        int best_score = getMaxScore();
        return count(best_score);
    }

    /** 
     * gets the number of students who get the minimum score
     * @return the lowest score
     */
    public int getMinScore(){
        return findMin(grades);
    }

    /**
     * gets the number of students who get the minimum score
     * @return the number of students who get the minimum score
     */
    public int nrMinScores(){
        int lowest_score = getMinScore();
        return count(lowest_score);
    }

}