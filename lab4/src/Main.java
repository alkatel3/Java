import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Furniture table = new Furniture("Table", "Light brown", 80, "Germany", "wood");
        Furniture chair = new Furniture("Chair", "White", 20, "Poland", "plastic");
        Furniture nightstand = new Furniture("Nightstand", "light gray", 50.5, "Ukraine", "wood");
        Furniture hanger_stand = new Furniture("Hanger stand", "Metallic", 80, "Germany", "Metal");
        Furniture sofa = new Furniture("Sofa", "Red", 230, "France", "Eco leather");

        Furniture[] furnitures={table, chair, nightstand, hanger_stand, sofa};
        System.out.print("Start array:\n");
        for (int i=0; i<furnitures.length;i++){
            System.out.println(furnitures[i]);
        }
        System.out.println();

        Arrays.sort(furnitures, Comparator.comparing(Furniture::getType));

        System.out.print("Sort by type array:\n");
        for (int i=0; i<furnitures.length;i++){
            System.out.println(furnitures[i]);
        }
        System.out.println();

        Arrays.sort(furnitures, Comparator.comparingDouble(Furniture::getPrice).reversed());

        System.out.print("Sort by price array:\n");
        for (int i=0; i<furnitures.length;i++){
            System.out.println(furnitures[i]);
        }
        System.out.println();


    }
}