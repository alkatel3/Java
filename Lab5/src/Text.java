public class Text {
    private Sentence[] sentences;

    public Text(String textString) {
        final String[] sentencesStrings = textString.split("(?<!\\w\\.\\w.)(?<![A-Z][a-z]\\.)(?<=[.!?])\\s");
        sentences = new Sentence[sentencesStrings.length];
        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = new Sentence(sentencesStrings[i]);
        }
    }

    public void Replase(){
        for (Sentence sentence:sentences){
            var item=sentence.GetFirstWord().toString();
            sentence.SetFirstWord(sentence.GetLastWord().toString());
            sentence.SetLastWord(item);
        }
    }

    public String toString() {
        String result="";
        for (Sentence sentence:sentences) {
            result+=sentence;
        }
        return  result;
    }
}
