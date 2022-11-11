import java.util.Objects;

public class Letter {
    private char letterChar;

    public Letter(char letterChar) {
        this.letterChar = letterChar;
    }

    public void Show(){
        System.out.print(letterChar);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Letter letter = (Letter) o;
//        return letterChar == letter.letterChar;
        return (letterChar + "").equalsIgnoreCase(letter.letterChar + "");
    }

    @Override
    public int hashCode() {
        return Objects.hash(letterChar);
    }
}
