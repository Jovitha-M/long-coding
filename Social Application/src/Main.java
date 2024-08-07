public class Main {
    public static void main(String[] args) {
        User user1 = new User("Jovitha", "jovi@gmail.com", 7877);
        User user2 = new User("Alice", "alice@gmail.com", 1234);
        User user3 = new User("Bob", "bob@gmail.com", 5678);

        user2.followUser(user1);
        user3.followUser(user1);

        user2.makeFriend(user1);
        user3.makeFriend(user1);

        System.out.println("Followers of " + user1.getName() + ": " + user1.getFollowers().size());
        System.out.println("Friends of " + user1.getName() + ": " + user1.getFriends().size());

//        System.out.println("User: " + user1.getName());
//        for (Post post : user1.getPosts()) {
//            System.out.println("Post: " + post.getTitle() + ", Description: " + post.getDescription());
//        }

//        user1.getAllPosts();
    }
}
