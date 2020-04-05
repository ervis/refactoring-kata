package legacy.provided;

import java.util.List;

public class User {
    private List<User> friends;

    public List<User> getFriends() {
        return friends;
    }

    public void addFriend(User user) {
        if (!friends.contains(user)) {
            friends.add(user);
        }
    }
}
