public class EditPalindrome {
    public static void main(String[] args) {
        System.out.println("mom to non palindrom word is: "+changTONonPalindrom("mom"));
        System.out.println("mom to non palindrom word is: "+changTONonPalindrom("aaabbaaa"));
    }
    private static String changTONonPalindrom(String str)
    {
        int mid=str.length()/2;
        boolean found=false;
        char character=' ';
        int i;
        for(i=mid-1;i>=0;i--)
        {
            character = str.charAt(i);
            if(character!='a')
            {
                found=true;
                break;
            }
        }
        if(!found)
        {
            for(i=mid+1;i<str.length();i++)
            {
                character = str.charAt(i);
                if(character!='a')
                {
                    found=true;
                    break;
                }
            }
        }
// This gives the character 'a'
        int ascii = (int) character;
        ascii-=1;
        str = str.substring(0, i) + (char)ascii+ str.substring(i + 1);
        return str;
    }
}

class Solution {
    public String breakPalindrome(String palindrome) {
        int len = palindrome.length();
        char strArr[] = palindrome.toCharArray();

        for(int i = 0; i < len/2; i++){
            if(strArr[i] != 'a'){
                strArr[i] = 'a';
                return String.valueOf(strArr);
            }
        }
        strArr[len-1] = 'b';
        return len<=1 ? "" : String.valueOf(strArr);
    }
}
