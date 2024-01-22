package productForSale;

public class Bread extends ProductForSale{

    private String breadType;
    public Bread( double price,
                 String description,String breadType) {
        super("Bread", price, description);
        this.breadType=breadType;
    }

    public String getBreadType() {
        return breadType;
    }

    @java.lang.Override
    public void showDetails() {
        System.out.println("Type: "+super.getType());
        System.out.println("Price: "+super.getPrice());
        System.out.println("Description: "+super.getDescription());
        System.out.println("ChocolateType: "+getBreadType());


    }
}
