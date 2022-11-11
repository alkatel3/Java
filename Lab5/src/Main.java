import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String InputText = new String("Ok! " +
                "Hello,  my name is Vitaliy. " +
                "I'm from Lviv. " +
                "I'm student. " +
                "I love sport and music! " +
                "Do you love sport or music?");

        Text text = new Text(InputText);
        text.Show();
        System.out.println();
        text.Replase();
        text.Show();


    }
}