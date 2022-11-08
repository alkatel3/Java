import java.lang.reflect.Type;
import java.util.Comparator;

public class Furniture {
    private String type;
    private String color;
    private double price;
    private String country;
    private String material;

    public Furniture(String type, String color,double price,String country, String material){
        this.type=type;
        this.color=color;
        this.price=price;
        this.country=country;
        this.material=material;
    }

    @Override
    public String toString() {
        return "Furniture: {" +
                "type: " + type +
                ";\tcolor: " + color +
                ";\tcountry: " + country +
                ";\tmaterial: " + material +
                ";\tprice: " + price +"$" +
                "}";
    }

    public double getPrice(){
        return price;
    }
    public String getType(){
        return type;
    }
}
