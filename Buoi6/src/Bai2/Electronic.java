package Bai2;

public class Electronic extends Product{
    private int warrantyMonths;

    public Electronic(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double getDiscountedPrice() {
        return price*1.05;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Bao hanh: " + warrantyMonths+ "thang");

    }

    @Override
    public String toString() {
        return "Electronic{" +
                "warrantyMonths=" + warrantyMonths +
                '}';
    }
}
