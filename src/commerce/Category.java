package commerce;

import java.util.ArrayList;
import java.util.List;

// 카테고리 이름과 상품 리스트를 필드로 선언
public class Category {
    private String categoryName;
    private List<Product> productList;

    //전달받은 카테고리 이름으로 생성하고, 상품 목록을 저장할 리스트를 초기화
    public Category(String categoryName) {
        this.categoryName = categoryName;
        this.productList = new ArrayList<>();
    }

    // getter
    public String getCategoryName() {
        return categoryName;
    }

    public List<Product> getProductList() {
        return productList;
    }
}
