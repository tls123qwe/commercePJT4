package commerce;

import java.util.List;
import java.util.Scanner;

// 카테고리 리스트를 필드로 생성
public class CommerceSystem {
    private List<Category> categoryList;

    public CommerceSystem(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    // start 메서드로 입출력
    public void start() {
        Scanner sc = new Scanner(System.in);

        // 카테고리 출력을 위한 메서드
        while ((true)) {
            for (int i = 0; i < categoryList.size(); i++) {
                System.out.printf("%d. %-12s%n",
                        i + 1,
                        categoryList.get(i).getCategoryName());
            }
            System.out.println("0.종료");
            System.out.print("카테고리 선택: ");
            int select = sc.nextInt();
            if (select == 0) break;

            // 코드 단순화르 위해 선택된 카테고리를 변수를 만들어 선언
            Category selectedCategory = categoryList.get(select - 1);

            // 선택된 카테고리 출력
            System.out.println();
            System.out.println("[" + selectedCategory.getCategoryName() + "] 카테고리");
            System.out.println();

            // 상품 리스트 출력을 위한 반복문
            while (true) {
                for (int j = 0; j < selectedCategory.getProductList().size(); j++) {
                    System.out.printf("%d. %-12s | %,10d원 | %s%n", // pintf를 사용하여 출력 정규화
                            j + 1,
                            selectedCategory.getProductList().get(j).getPdName(),
                            selectedCategory.getProductList().get(j).getPrice(),
                            selectedCategory.getProductList().get(j).getDescription());
                }
                System.out.println("0.뒤로가기");
                System.out.print("상품 선택: ");
                int choice = sc.nextInt();

                // 0번을 선택시 반복 종료
                if (choice == 0) break;

                // 코드 단순화를 위한 선언
                Product selectProduct = selectedCategory.getProductList().get(choice - 1);

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
        }
        sc.close();
        System.out.println("커머스 플랫폼 종료");
    }
}

