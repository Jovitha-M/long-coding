import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class User {
    private static int counterId = 0;
    private int userId;
    private String name;
    private String email;
    private Integer contact;
    private List<Post> posts;
    private List<Follower> followers;
    private List<Friend> friends;


    public User(String name, String email, Integer contact) {
        this.userId = ++counterId;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.posts = new ArrayList<>();
        this.followers = new ArrayList<>();
        this.friends = new ArrayList<>();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getContact() {
        return contact;
    }

    public void setContact(Integer contact) {
        this.contact = contact;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Follower> getFollowers() {
        return followers;
    }

    public List<Friend> getFriends() {
        return friends;
    }

    public void addNewPost(String title, String description) {
        Post post = new Post(title, description, this);
        posts.add(post);
    }

    public void getAllPosts() {
        posts.get(0).displayPosts();
    }

    public void followUser(User user){
        Follower follower = new Follower(this,user);
        user.followers.add(follower);
    }

    public void makeFriend(User user){
        long fol = user.getFollowers().stream()
                .filter(follower -> follower.getFollowing().getUserId() == user.getUserId())
                .count();
        System.out.println(fol);
        if(fol > 0) {
            Friend friend = new Friend(this, user);
            this.friends.add(friend);
            user.friends.add(friend);
        }
    }
}
