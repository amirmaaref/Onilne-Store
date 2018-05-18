import java.util.List;

public class Customer extends Person{
    private List<Product> mFavoriteProducts;
    public Customer() {
        super();
    }
    public List<Product> getFavoriteProducts() {
        return mFavoriteProducts;
    }

    public void setFavoriteProducts(List<Product> favoriteProducts) {
        mFavoriteProducts = favoriteProducts;
    }
}