public class Main {

    public static void main(String[] args) {
	// write your code here
        String pass ="kkLo9922f" ;
        System.out.println(isValid(pass));



    }

    public static boolean atLeast8Digits(String password, int n){
        if(password.length()>=n)
            return true;
        else
            return false;
    }

    public static boolean isLetterOrDigit(String password){
        for(int i=0; i<password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                ;
                return false;
            }
        }

        return true;
    }



    public static boolean has2Digits(String password){
        int numberOfDigits = 0;
        for(int i=0;i<password.length();i++){
            if(Character.isDigit(password.charAt(i)));
            numberOfDigits++;
        }
        if(numberOfDigits>=2){
            return true;
        }
        return false;
    }


    public static boolean isValid(String password){
        boolean x = atLeast8Digits(password,8);
        boolean z = isLetterOrDigit(password);
        boolean p = has2Digits(password);

        if(x && z && p == true)
         return true;
        else
            return false;
    }
}
