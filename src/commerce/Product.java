package commerce;

// 클래스 및 필드 생성
public class Product {
    private final String pdName;
    private final int price;
    private final String description;
    private final int stock;

    // 생성자
    public Product(String pdName, int price, String description, int stock) {
        this.pdName = pdName;
        this.price = price;
        this.description = description;
        this.stock = stock;
    }

    // getter
    public String getPdName() {
        return pdName;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getStock() {
        return stock;
    }
}
