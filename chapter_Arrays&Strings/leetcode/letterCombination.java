public class Solution {
    private final String [] LETTERS = new String [] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();
        if (digits.length() == 0) return result;
        result.add("");
        for(int i=0; i<digits.length(); i++){
            int x = Character.getNumericValue(digits.charAt(i));
            while(result.peek().length() == i){
                String t = result.remove();
                for(char s: LETTERS[x].toCharArray()){
                    result.add(t+s);
                }
            }
        }
        return result;
    }
}
