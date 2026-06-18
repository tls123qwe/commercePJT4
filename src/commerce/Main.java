package commerce;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 상품과 정보를 저장하기 위한 List
        List<Product> productList = new ArrayList<>();

        // 상품과 정보를 생성과 동시에 리스트에 추가
        productList.add(new Product("Apple", 1500, "청송사과", 15));
        productList.add(new Product("Banana", 3500, "필리핀바나나", 15));
        productList.add(new Product("Galaxy S26", 2000000, "삼성전자", 200));
        productList.add(new Product("Iphone 18", 2500000, "애플", 124));
        productList.add(new Product("T-shirt", 23000, "H&M", 22));
        productList.add(new Product("Jean", 78000, "ZARA", 4));

        // 상품리스트를 전달해서 커머스시스템 객체 생성
        CommerceSystem commerceSystem = new CommerceSystem(productList);
        // 커머스시스템의 start 메서드 실행
        commerceSystem.start();

    }
}
