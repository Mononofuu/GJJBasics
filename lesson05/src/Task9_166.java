public class Task9_166 {
    public static void main(String[] args) {
        Assert.assertEquals("program name to java Pass", getResult("Pass name to java program"));
    }

    private static String getResult(String word) {
        String[] words = word.split(" ");
        String tempWord = words[0];
        words[0] = words[words.length - 1];
        words[words.length - 1] = tempWord;
        StringBuilder resultString = new StringBuilder();
        for (String s : words) {
            resultString.append(s + " ");
        }
        return resultString.toString().trim();
    }
}
