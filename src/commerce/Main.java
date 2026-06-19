package commerce;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        // 상품과 정보를 저장하기 위한 List
        List<Category> categoryList = new ArrayList<>();

        // 카테고리 생성
        Category electronic = new Category("전자제품");
        Category clothes = new Category("의류");
        Category food = new Category("식품");
        Category work = new Category("작품");

        // 생성된 카테고리를 리스트에 추가
        categoryList.add(electronic);
        categoryList.add(clothes);
        categoryList.add(food);
        categoryList.add(work);

        // 상품과 정보를 생성과 동시에 리스트에 추가
        food.getProductList().add(new Product("Apple", 1500, "청송사과", 15));
        food.getProductList().add(new Product("Banana", 3500, "필리핀바나나", 15));
        electronic.getProductList().add(new Product("Galaxy S26", 2000000, "삼성전자", 200));
        electronic.getProductList().add(new Product("Iphone 18", 2500000, "애플", 124));
        clothes.getProductList().add(new Product("T-shirt", 23000, "H&M", 22));
        clothes.getProductList().add(new Product("Jean", 78000, "ZARA", 4));

        // 상품리스트를 전달해서 커머스시스템 객체 생성
        CommerceSystem commerceSystem = new CommerceSystem(categoryList);
        // 커머스시스템의 start 메서드 실행
        commerceSystem.start();
    }
}
