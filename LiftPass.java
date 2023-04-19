public class LiftPass {
    private String id;
    private String type;
    private double pricePerDay;

    public LiftPass(String id, String type, double pricePerDay) {
        this.id = id;
        this.type = type;
        this.pricePerDay = pricePerDay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public double calculateDiscountedPrice(int numOfDays) {
        double totalPrice = numOfDays * pricePerDay;
        if (numOfDays >= 5) {
            totalPrice *= 0.9; // 10% discount for 5 or more days
        } else if (numOfDays == 1) {
            totalPrice = pricePerDay;
        } else {
            totalPrice *= numOfDays;
        }
        if (totalPrice > 200) {
            totalPrice = 200; // $200 maximum price for season pass
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "LiftPass{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", pricePerDay=" + pricePerDay +
               

