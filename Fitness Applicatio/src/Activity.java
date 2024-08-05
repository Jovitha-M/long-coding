public class Activity {
    private static int counterId = 0;
    private int activityId;
    private String activityName;
    private double caloriesBurntPerHour;

    public Activity(String activityName, double caloriesBurntPerHour) {
        this.activityId = ++counterId;
        this.activityName = activityName;
        this.caloriesBurntPerHour = caloriesBurntPerHour;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public double getCaloriesBurntPerHour() {
        return caloriesBurntPerHour;
    }

    public void setCaloriesBurntPerHour(double caloriesBurntPerHour) {
        this.caloriesBurntPerHour = caloriesBurntPerHour;
    }

    public double calculateCaloriesBurnt(double duration){
        return caloriesBurntPerHour * duration;
    }
}
