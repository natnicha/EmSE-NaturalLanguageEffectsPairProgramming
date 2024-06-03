public class task_2 {
    private static int convertToString(int digit){
    }
    
    private static int checkNoOfDigit(int digit){
        String[] num = Integer.toString(digit).split("");
        // String splittedNum=num.split("");
        System.out.println(num[1]);
        int index = 0;
        int multiplier=1;
        if (num.length>1){
            // for (int index=0; index<num.length; index++){
            int convertedDigit=Integer.parseInt(num[index]);
            // }
            multiplier *=convertedDigit;
            index ++;
            // return multiplier;
        }
        
        return multiplier;
    }
    
    public static void main (String[] args) {
        checkNoOfDigit(18);
    }
}
