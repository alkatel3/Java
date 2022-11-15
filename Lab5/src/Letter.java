import java.util.Objects;

public class Letter {
    private char letterChar;

    public Letter(char letterChar) {
        this.letterChar = letterChar;
    }

    @Override
    public String toString() {
        return String.valueOf(letterChar);
    }
}
