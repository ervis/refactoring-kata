package legacy.provided;

import java.util.List;

public class PostDAO {
    public static List<Post> findPostsByUser(User user) {
        throw new RuntimeException("database call");
    }
}
