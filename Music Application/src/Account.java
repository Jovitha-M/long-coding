import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
    private static int counterId = 0;
    private int accountId;
    private Subscription subscription;
    private Date startDate;
    private Date endDate;
    private List<User> users;

    public Account(Subscription subscription, Date startDate, Date endDate) {
        this.accountId = ++counterId;
        this.subscription = subscription;
        this.startDate = startDate;
        this.endDate = endDate;
        this.users = new ArrayList<>();
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addUser(User user){
        if(user.getAccount().accountId == this.accountId)
            this.users.add(user);
    }
}
