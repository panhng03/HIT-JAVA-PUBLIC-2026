package Bai3;

public class VipAccount extends Account{
    private int points;

    public VipAccount(String username, String email, Address address, int points) {
        super(username, email, address);
        this.points = points;
    }

    @Override
    public double getDiscount() {
        if(points >= 1000){
            return 0.15;
        }
        else{
            return 0.1;
        }
    }
    public void addPoints(int point){
        points += point;
        if(points > 1000){
            System.out.println("Nang hang");
        }
    }

    @Override
    public String toString() {
        return "VIP Account: " + super.toString()
                + ", Points: " + points;
    }
}

