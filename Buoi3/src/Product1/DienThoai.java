package Product1;

import ProductMangement.Product;

public class DienThoai {
    public static void main(String[] args) {
        Product Dienthoai = new Product() {
        };
        Product iPhone = new Product("Sanpham1", "iPhone 17 promax", 10000, 3);

        System.out.println(iPhone.getId());
        System.out.println(iPhone.getName());
        System.out.println(iPhone.getPrice());
        System.out.println(iPhone.getQuantity());

        Product samSung = new Product("Sanpham2","samsung galaxy A12",1000,13);

        System.out.println(samSung.getId());
        System.out.println(samSung.getName());
        System.out.println(samSung.getPrice());
        System.out.println(samSung.getQuantity());

        Product oppo = new Product("Sanpham3","oppo zeno 8 z 5g",4000,3);

        System.out.println(oppo.getId());
        System.out.println(oppo.getName());
        System.out.println(oppo.getPrice());
        System.out.println(oppo.getQuantity());
    }
}
