public class UserActivity {
    private static int counterId = 0;
    private int userActivityId;
    private User user;
    private Activity activity;
    private double duration;
    private double totalCaloriesBurnt;

    public UserActivity(User user, Activity activity, double duration) {
        this.userActivityId = ++counterId;
        this.user = user;
        this.activity = activity;
        this.duration = duration;
        totalCaloriesBurnt();
    }

    public int getUserActivityId() {
        return userActivityId;
    }

    public void setUserActivityId(int userActivityId) {
        this.userActivityId = userActivityId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getTotalCaloriesBurnt() {
        return totalCaloriesBurnt;
    }

    public void totalCaloriesBurnt(){
        this.totalCaloriesBurnt = this.activity.calculateCaloriesBurnt(this.duration);
    }
}
