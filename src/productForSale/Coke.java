package productForSale;

public class Coke extends ProductForSale{

    private String cokeType;
    public Coke( double price,
                String description,String cokeType) {
        super("productForSale.Coke", price, description);
        this.cokeType=cokeType;
    }

    public String getCokeType() {
        return cokeType;
    }

    @java.lang.Override
    public void showDetails() {
        System.out.println("Type: "+super.getType());
        System.out.println("Price: "+super.getPrice());
        System.out.println("Description: "+super.getDescription());
        System.out.println("ChocolateType: "+getCokeType());

    }
}
