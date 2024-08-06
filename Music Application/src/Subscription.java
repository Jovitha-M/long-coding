public class Subscription {
    private static int counterId = 0;
    private int subscriptionId;
    private String packageName;
    private double price;

    public Subscription(String packageName, double price) {
        this.subscriptionId = ++counterId;
        this.packageName = packageName;
        this.price = price;
    }

    public int getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}