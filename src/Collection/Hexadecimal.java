package Collection;

public class Hexadecimal {
    static boolean isHexadecimalChar(char ch) {
        int hashCode = Character.hashCode(ch);
        return hashCode>=97 && hashCode <=102;
    }

    static boolean isHexadecimal(String str) {
        if(str == null || str.isEmpty()){
            return false;
        }
        for (char ch : str.toLowerCase().toCharArray() ) {
           if(!Character.isDigit(ch) && !isHexadecimalChar(ch)){
               return false;
           }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isHexadecimal("A"));
        System.out.println(isHexadecimalChar('f'));
    }
}
