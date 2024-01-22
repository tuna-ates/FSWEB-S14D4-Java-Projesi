import monster.Monster;
import monster.Troll;
import productForSale.Chocolate;
import productForSale.Coke;
import productForSale.ProductForSale;

public class Store {
    public static void main(String[] args) {
       /* ProductForSale[] productForSales=new ProductForSale[3];
        Chocolate chocolate=new Chocolate(12,
                "şekersiz","white");
        productForSales[0]=chocolate;

        Coke coke=new Coke(5,"normal","chocolate coke");
        productForSales[1]=coke;

        listProducts(productForSales);*/

        Monster troll=new Troll(12,7);
        System.out.println(troll.toString());

        System.out.println(troll.attack());
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product:products){
            if(product!=null){
                product.showDetails();
                System.out.println("******************************");
            }

        }

    }
}