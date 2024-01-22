package productForSale;

public class Chocolate extends ProductForSale{
    private String chocolateType;

    public Chocolate( double price
            , String description,String chocolateType) {
        super("productForSale.Chocolate", price, description);
        this.chocolateType=chocolateType;
    }

    public String getChocolateType() {
        return chocolateType;
    }

    @java.lang.Override
    public void showDetails() {

        System.out.println("Type: "+super.getType());
        System.out.println("Price: "+super.getPrice());
        System.out.println("Description: "+super.getDescription());
        System.out.println("ChocolateType: "+getChocolateType());

    }
}
