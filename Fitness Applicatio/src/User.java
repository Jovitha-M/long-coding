import java.util.ArrayList;
import java.util.List;

public class User {
    private static int idCounter = 0;
    private int userId;
    private String name;
    private int age;
    private String gender;
    private double height;
    private double weight;
    private List<UserIntake> userIntakes;
    private List<UserActivity> userActivities;

    public User(String name, int age, String gender, double height, double weight) {
        this.userId = ++idCounter;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.userIntakes = new ArrayList<>();
        this.userActivities = new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<UserIntake> getUserIntakes() {
        return userIntakes;
    }

    public void setUserIntakes(List<UserIntake> userIntakes) {
        this.userIntakes = userIntakes;
    }

    public List<UserActivity> getUserActivities() {
        return userActivities;
    }

    public void setUserActivities(List<UserActivity> userActivities) {
        this.userActivities = userActivities;
    }

    public double calculateBMI(){
        double bmi = this.weight / (this.height *  this.height);
        return bmi;
    }
}
