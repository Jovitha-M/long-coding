public class Food extends Intake{
    public Food(String intakeName, double caloriesPerUnit, String unit) {
        this.intakeName = intakeName;
        this.caloriesPerUnit = caloriesPerUnit;
        this.unit = unit;
    }


    @Override
    public double calculateTotalCalories(double quantity) {
        return caloriesPerUnit * quantity;
    }
}
