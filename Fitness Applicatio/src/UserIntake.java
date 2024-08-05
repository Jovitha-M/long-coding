public class UserIntake {
    private static int counterId = 0;
    private int userIntakeId;
    private User user;
    private Intake intake;
    private double quantity;
    private double totalCalories;

    public UserIntake(User user, Intake intake, double quantity) {
        this.userIntakeId = ++counterId;
        this.user = user;
        this.intake = intake;
        this.quantity = quantity;
        getTotalCaloriesConsumed();
    }

    public int getUserIntakeId() {
        return userIntakeId;
    }

    public void setUserIntakeId(int userIntakeId) {
        this.userIntakeId = userIntakeId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Intake getIntake() {
        return intake;
    }

    public void setIntake(Intake intake) {
        this.intake = intake;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getTotalCalories() {
        return totalCalories;
    }

    public void getTotalCaloriesConsumed(){
        this.totalCalories = this.intake.calculateTotalCalories(this.quantity);
    }
}
