import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Bascet {
    private Map<String, Integer> products;

    public Bascet() {
        this.products = new HashMap<>();
    }

    public void addProduct(String product, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Количество должно быть больше нуля");
        }
        products.put(product, products.getOrDefault(product, 0) + quantity);
    }

    public void removeProduct(String product) {
        products.remove(product);
    }

    public void updateProductQuantity(String product, int quantity) {
        if (!products.containsKey(product)) {
            throw new IllegalArgumentException("Продукт не найден");
        }
        if (quantity < 0) {
            throw new IllegalArgumentException("отрицательная величина");
        }
        if (quantity == 0) {
            removeProduct(product);
        } else {
            products.put(product, quantity);
        }
    }

    public void clear() {
        products.clear();
    }

    public List<String> getProducts() {
        return new ArrayList<>(products.keySet());
    }

    public int getProductQuantity(String product) {
        return products.getOrDefault(product, 0);
    }
}