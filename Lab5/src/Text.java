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
            var item=sentence.GetFirstWord();
            sentence.SetFirstWord(sentence.GetLastWord());
            sentence.SetLastWord(item);
        }
    }

    public void Show(){
        for (Sentence sentence:sentences) {
            sentence.Show();
        }
    }
}
