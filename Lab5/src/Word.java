import java.util.Arrays;

public class Word implements SentencePart {
    private Letter[] letters;

    public Word(String wordString) {
        letters = new Letter[wordString.length()];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = new Letter(wordString.charAt(i));
        }
    }

    public  void Show(){
        for (Letter letter:letters) {
            letter.Show();
        }
    }
    public int GetIndex(){
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Arrays.equals(letters, word.letters);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(letters);
    }
}
