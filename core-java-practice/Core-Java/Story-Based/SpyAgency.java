import java.util.*;
public class SpyAgency {
    public static String reverseMessage(String message) {
        return new StringBuilder(message).reverse().toString();
    }
    public static boolean isPalindrome(String message) {
        String cleaned = message.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
    public static void countVowelsAndConsonants(String message) {
        int vowels = 0;
        int consonants = 0;
        for (char ch : message.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);

                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static Character firstNonRepeatingCharacter(String log) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : log.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : log.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        String secret = "Radar";
        String intercept1 = "listen";
        String intercept2 = "silent";
        String log = "surveillance";

        System.out.println("Reversed Message: " + reverseMessage(secret));
        System.out.println("Palindrome: " + isPalindrome(secret));
        countVowelsAndConsonants(secret);
        System.out.println("Anagrams: " + areAnagrams(intercept1, intercept2));

        System.out.println("First Non-Repeating Character: " + firstNonRepeatingCharacter(log));
    }
}