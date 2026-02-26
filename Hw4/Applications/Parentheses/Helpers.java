public class Helpers{

    public static String arrayToString(char[] array){
        String arrString="";
        for(int i=0; i<array.length; i++){
            arrString += " " + array[i];
        }
        return arrString;
    }

}