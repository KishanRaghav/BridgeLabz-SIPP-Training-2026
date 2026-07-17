import java.util.*;

public class GroupSupportTickets {

    public static List<List<String>> groupAnagrams(String[] words) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : words) {

            char[] chars = word.toCharArray();

            Arrays.sort(chars);

            String key = new String(chars);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        List<List<String>> result = groupAnagrams(words);

        for (List<String> group : result) {
            System.out.println(group);
        }

        sc.close();
    }
}