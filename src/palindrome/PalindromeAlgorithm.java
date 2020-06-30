package palindrome;

/**
 * A class which tests if a String is a palindrome or not, by using an O(n/2) 
 * algorithm to check if the individual letters in the String array are the 
 * same (ignoring the upper and lowercases).
 * 
 * @author Ryan Herkt
 */
public class PalindromeAlgorithm 
{
    /**
     * Main test method
     * 
     * @param args 
     */
    public static void main(String[] args)
    {
        System.out.println("Is 'Deed' a palindrome? " + 
                isPalindrome(new String[]{"D", "e", "e", "d"}));
        System.out.println("Is 'Cook' a palindrome? " + 
                isPalindrome(new String[]{"C", "o", "o", "k"}));
        System.out.println("Is '1337' a palindrome? " + 
                isPalindrome(new String[]{"1", "3", "3", "7"}));
        System.out.println("Is 'Reed Deer' a palindrome? " + 
                isPalindrome(new String[]{"R", "e", "e", "d", " ", "D", "e", "e", "r"}));
        System.out.println("Is '2 8 4 8 2' a palindrome? " + 
                isPalindrome(new String[]{"2", " ", "8", " ", "4", " ", "8", " ", "2"}));
        System.out.println("Is 'Rob' a palindrome? " + 
                isPalindrome(new String[]{"R", "o", "b"}));
        System.out.println("Is 'SOS' a palindrome? " + 
                isPalindrome(new String[]{"S", "O", "S"}));
    }
    
    /**
     * The algorithm which returns true if the word is a palindrome (ie 
     * char 1 = char k, char 2 = char k-1, char 3 = char k-2 etc, k being the 
     * length of the string), or false if not.
     * 
     * As a palindromic string requires both halves of the String sequence to 
     * be the same, only half the string needs to be checked, making this an 
     * efficient O(n/2) algorithm
     * 
     * @param phrase to check
     * @return boolean T/F to check if phrase is palindromic
     */
    public static boolean isPalindrome(String[] phrase)
    {
        for (int i = 0; i < phrase.length/2; i++)
            if (!phrase[i].equalsIgnoreCase(phrase[phrase.length-1-i]))
                return false;
        
        return true;
    }
}
