import java.util.Objects;

public class Punctuation implements SentencePart {
    private String punctuationString;
    public Punctuation(String punctuationString) {
        this.punctuationString = punctuationString;
    }

    public int GetIndex(){
        return 0;
    }

    @Override
    public String toString() {
        return String.valueOf(punctuationString);
    }
}
