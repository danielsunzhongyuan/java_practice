
public class Main {

    static boolean isAnagram(String a, String b) {
        if (a == null || b == null || a.equals("") || b.equals("")) {
            return false;
        }
        if (a.length() != b.length()) {
            return false;
        }
        java.util.HashMap<Character, Integer> dict = new java.util.HashMap<>();
        for (char c : a.toLowerCase().toCharArray()) {
            dict.put(c, dict.getOrDefault(c, 0) + 1);
        }
        for (char c : b.toLowerCase().toCharArray()) {
            if (!dict.containsKey(c)) {
                return false;
            }
            if (dict.get(c) == 0) {
                return false;
            }
            dict.put(c, dict.get(c) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("cat", "act") ? "Anagram" : "Not anagram");
    }
}
