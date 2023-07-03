package Placement_Training.LinkedList;

class sumOfDigitsPalindrome {
    static int isDigitSumPalindrome(int N) {
        int sum = sumOfDig(N);
        if(isPal(sum)){
            return 1 ;
        }
        else{
            return 0;
        }
    }
    static boolean isPal(int N){
        int temp = N ;
        int rev = 0 ;
        while(temp!=0){
            int k = temp%10;
            rev = rev*10 + k ;
            temp = temp /10;
        }

        return(N==rev);
    }

    static int sumOfDig(int N ){
        int temp = N ;
        int sum = 0 ;
        while(temp>0){
            int k = temp%10 ;
            sum = sum + k ;
            temp = temp / 10 ;
        }
        return sum ;
    }

    public static void main(String[] args) {

        System.out.println(isDigitSumPalindrome(92));
    }
}
