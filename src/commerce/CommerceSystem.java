package commerce;

import java.util.List;
import java.util.Scanner;

// 상품리스트를 필드로 생성
public class CommerceSystem {
    private List<Product> products;

    public CommerceSystem(List<Product> productList) {
        this.products = productList;
    }

    // start 메서드로 입출력
    public void start() {
        Scanner sc = new Scanner(System.in);

        // 상품 리스트 출력을 위한 반복문
        while (true) {
            for (int i = 0; i < products.size(); i++) {
                System.out.printf("%d. %-12s | %,10d원 | %s%n", // pintf를 사용하여 출력 정규화
                        i + 1,
                        products.get(i).getPdName(),
                        products.get(i).getPrice(),
                        products.get(i).getDescription());
            }
            System.out.println("0.종료           | 프로그램 종료");
            System.out.print("상품 선택: ");
            int choice = sc.nextInt();

            // 0번을 선택시 반복 종료
            if (choice == 0) break;

            // 코드 단순화를 위한 선언
            Product selectProduct = products.get(choice - 1);

            // 선택된 상품 출력
            System.out.println();
            System.out.printf("%d. %-12s | %,10d원 | %s | 재고: %d개",
                    choice,
                    selectProduct.getPdName(),
                    selectProduct.getPrice(),
                    selectProduct.getDescription(),
                    selectProduct.getStock());
            System.out.println();
            System.out.println();
        }
        sc.close();
        System.out.println("커머스 플랫폼 종료");
    }

    // getter
    public List<Product> getProducts() {
        return products;
    }
}

