public class TypingSpeedAccuracyChecker {

    // Method to compare original and typed text, character by character
    static void checkTypingAccuracy(String original, String typed) {
        int matched = 0;
        int firstMismatchPos = -1;
        char originalChar = ' ';
        char typedChar = ' ';

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatchPos == -1) {
                // record only the FIRST mismatch found
                firstMismatchPos = i + 1; // +1 to make it 1-based position
                originalChar = original.charAt(i);
                typedChar = typed.charAt(i);
            }
        }

        int total = original.length();
        double accuracy = ((double) matched / total) * 100;

        if (firstMismatchPos == -1) {
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | No Mismatches%n", matched, total, accuracy);
        } else {
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | First Mismatch at position %d ('%c' vs '%c')%n",
                    matched, total, accuracy, firstMismatchPos, originalChar, typedChar);
        }
    }

    public static void main(String[] args) {
        checkTypingAccuracy("hello world", "hello worlt");
        checkTypingAccuracy("coding", "coding");
    }
}