public class Palindrome {
    public static void main(String[] args) {
        isPalindrome("katak");
        isPalindrome("kattak");
        isPalindrome("mister");
        isPalindrome("k asur rusa k");
    }

    static void isPalindrome(String word) {
        Integer median = word.length() / 2;
        StringBuilder reverseSecondWord = new StringBuilder(word.substring(word.length() - median)).reverse();

        String firstWord = word.substring(0, median);
        String secondWord = reverseSecondWord.toString();

        String result = firstWord.equals(secondWord) ? "Palindrome" : "Bukan Palindrome";
        System.out.println(result);
    }
}
