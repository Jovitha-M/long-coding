public class Water extends Intake{
    public Water() {
        this.intakeName = "Water";
        this.caloriesPerUnit = 1.2;
        this.unit = "litre";
    }

    @Override
    public double calculateTotalCalories(double quantity) {
        return caloriesPerUnit * quantity;
    }
}
