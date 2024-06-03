import java.lang.Math;

public class task_3 {
    
    public static int checkSum (int[] array, double index){
        int sumFirst=0;
        int sumLast=0;
        boolean isEqual = false;

        for (int i=0; i<index; i++){
            sumFirst+=array[i];
            sumLast+=array[array.length-i-1];
            if(sumFirst==sumLast){
                isEqual=true;
            }else if(sumFirst!=sumLast && isEqual==true){
                return i;  
            }
        }
        return 0;
    }
    
    private static double getIndex(int[] array){
        return Math.floor(array.length/2);
    }
    
    public static void main (String[] args) {
        int[] digits={1,2,3,4,3,2,1};
        double index= getIndex(digits);
        System.out.println(checkSum(digits, index));
    }
}
