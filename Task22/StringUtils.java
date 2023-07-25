package Task22;

public class StringUtils {
    static int countVowels(String str) {
        int count = 0;
        for(char ch:str.toCharArray()) {
            ch = Character.toLowerCase(ch);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') count++;
        }

        return count;
    }

    public static void main(String[] args) {
        StringOperation vowelCount = StringUtils::countVowels;  // Using method reference
        System.out.println(vowelCount.performOperation("Imam"));
    }
}
