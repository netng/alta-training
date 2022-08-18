import java.util.Locale;

public class VokalKonsonan {
    public static void main(String[] args) {
        countVowelConsonant("Alterra Indonesia");
    }

    static void countVowelConsonant (String word) {
        char[] charOfWord = word.replaceAll("\\s", "").toLowerCase().toCharArray();
        Integer numberOfVowel = 0;
        Integer numberOfConsonant = 0;
        Integer numberOfCharacter = charOfWord.length ;

        for (var charWord : charOfWord) {
            switch (charWord) {
                case 'a':
                case 'i':
                case 'u':
                case 'e':
                case 'o':
                    numberOfVowel++;
                    break;
                default:
                    numberOfConsonant++;
            }
        }

        System.out.println(String.format("Jumlah Vokal: %s", numberOfVowel));
        System.out.println(String.format("Jumlah Konsonan: %s", numberOfConsonant));
        System.out.println(String.format("Total Karakter: %s", numberOfCharacter));

    }
}
