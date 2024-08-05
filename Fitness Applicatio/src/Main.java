public class Main {
    public static void main(String[] args){
        User user1 = new User("Jovitha", 21, "Female", 1.6, 50);

        Intake intake1 = new Food("Apple", 0.52, "gram");

        UserIntake userIntake1 = new UserIntake(user1,intake1,3);

        user1.getUserIntakes().add(userIntake1);

        Activity activity1 = new Activity("Running",56);

        UserActivity userActivity1 = new UserActivity(user1, activity1,3.5);

        user1.getUserActivities().add(userActivity1);

        System.out.println("BMI of user "+user1.getName()+" : "+user1.calculateBMI());
        System.out.println("Total Calories Consumed: " +userIntake1.getTotalCalories());
        System.out.println("Total Calories Burnt: " + userActivity1.getTotalCaloriesBurnt());
    }
}
