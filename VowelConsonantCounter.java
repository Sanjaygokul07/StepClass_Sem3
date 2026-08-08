public class VowelConsonantCounter {

    // Method to count vowels and consonants
    static void countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;
        String vowelSet = "aeiouAEIOU";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') continue;
            if (vowelSet.indexOf(ch) != -1) {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + " | Consonants: " + consonants);
    }

    public static void main(String[] args) {
        countVowelsAndConsonants("Java Programming");
    }
}