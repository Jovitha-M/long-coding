import java.util.ArrayList;
import java.util.List;

public class Post {
    private static int counterId;
    private int postId;
    private String title;
    private String description;
    private int likes;
    private int share;
    private User user;
    private static List<Post> allPosts = new ArrayList<>();

    public Post(String title, String description, User user) {
        this.postId = ++counterId;
        this.title = title;
        this.description = description;
        this.likes = 0;
        this.share = 0;
        this.user = user;
        allPosts.add(this);
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getShare() {
        return share;
    }

    public void setShare(int share) {
        this.share = share;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Post> getAllPosts() {
        return allPosts;
    }

    public void displayPosts(){
        for (Post post : allPosts){
            System.out.println("Username: "+post.user.getName());
            System.out.println("Title: "+post.getTitle());
            System.out.println("Description: "+post.getDescription());
            System.out.println("Likes :"+post.getLikes());
        }
    }

}
