public class Main {
    public static void main(String[] args) {
        String InputText = new String("Ok! " +
                "Hello,  my name is Vitaliy. " +
                "I am from Lviv. " +
                "I am student. " +
                "I love sport and music! " +
                "Do you love sport or music?");

        Text text = new Text(InputText);
        System.out.println(text);
        System.out.println();
        text.replace();
        System.out.println(text);


    }
}