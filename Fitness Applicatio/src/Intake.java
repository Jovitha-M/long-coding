public abstract class Intake {
    private static int counterId = 0;
    protected int intakeId;
    protected String intakeName;
    protected String unit;
    protected double caloriesPerUnit;

    public abstract double calculateTotalCalories(double quantity);

    public Intake(int intakeId) {
        this.intakeId = ++counterId;
    }

    public Intake(){}

    public int getIntakeId() {
        return intakeId;
    }

    public void setIntakeId(int intakeId) {
        this.intakeId = intakeId;
    }

    public String getIntakeName() {
        return intakeName;
    }

    public void setIntakeName(String intakeName) {
        this.intakeName = intakeName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getCaloriesPerUnit() {
        return caloriesPerUnit;
    }

    public void setCaloriesPerUnit(double caloriesPerUnit) {
        this.caloriesPerUnit = caloriesPerUnit;
    }

}
