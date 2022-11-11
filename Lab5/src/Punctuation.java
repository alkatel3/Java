import java.util.Objects;

public class Punctuation implements SentencePart {
    private String punctuationString;
    public Punctuation(String punctuationString) {
        this.punctuationString = punctuationString;
    }

    public void Show(){
        System.out.print(punctuationString);
    }
    public int GetIndex(){
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Punctuation that = (Punctuation) o;
        return Objects.equals(punctuationString, that.punctuationString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(punctuationString);
    }
}
