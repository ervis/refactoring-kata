package legacy.comment;

import java.util.ArrayList;
import java.util.List;

import legacy.exception.UserNotLoggedInException;
import legacy.provided.Post;
import legacy.provided.PostDAO;
import legacy.provided.User;
import legacy.provided.UserSession;

public class CommentService {
    public List<Post> getPostsByUser(User user) throws UserNotLoggedInException {
        List<Post> posts = new ArrayList<>();
        User loggedUser = UserSession.getInstance().getLoggedUser();
        boolean isFriend = false;
        if (loggedUser != null) {
            for (User friend : user.getFriends()) {
                if (friend.equals(loggedUser)) {
                    isFriend = true;
                    break;
                }
            }
            if (isFriend) {
                posts = PostDAO.findPostsByUser(user);
            }
            return posts;
        } else {
            throw new UserNotLoggedInException();
        }
    }
}
