public class IsPalindrome {
    public static Boolean isPalindrome(String str) {
        String sanitizedStr = str.replaceAll("[^A-Za-z0-9]+", "");
        
        int i = 0;
        int j = sanitizedStr.length() - 1;
        while (i < j) {
            if (Character.toLowerCase(sanitizedStr.charAt(i)) != Character.toLowerCase(sanitizedStr.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
