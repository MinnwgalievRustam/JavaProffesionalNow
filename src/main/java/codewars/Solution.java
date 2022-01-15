package codewars;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "";
        System.out.println(solution.toJadenCase(str));


    }
    public String toJadenCase(String phrase) {
        String[] words = phrase.split("\\s+");
        String str = "";
            if (phrase.isEmpty()) {
                return null;}

        for (String word: words){
            str += (word.substring(0,1).toUpperCase() + word.substring(1) + " ");
        }
        return str;
    }
}

