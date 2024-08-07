public abstract class SocialMember {
    private static int counterId;
    private int socialId;

    public SocialMember() {
        this.socialId = ++counterId;
    }

    public int getSocialId() {
        return socialId;
    }

    public void setSocialId(int socialId) {
        this.socialId = socialId;
    }
}
