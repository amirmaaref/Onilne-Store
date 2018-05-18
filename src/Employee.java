import java.util.List;

public class Employee extends Person {
    private List<Product> mProducts;
    public Employee() {
        super();
    }

    public List<Product> getProducts() {
        return mProducts;
    }

    public void setProducts(List<Product> products) {
        mProducts = products;
    }
}