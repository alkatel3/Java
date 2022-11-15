import java.util.Arrays;

public class Word implements SentencePart {
    private Letter[] letters;

    public Word(String wordString) {
        letters = new Letter[wordString.length()];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = new Letter(wordString.charAt(i));
        }
    }

    @Override
    public String toString() {
        String result="";
        for (Letter letter:letters) {
           result+=letter;
        }
        return  result;
    }

    public int GetIndex(){
        return 1;
    }
}
