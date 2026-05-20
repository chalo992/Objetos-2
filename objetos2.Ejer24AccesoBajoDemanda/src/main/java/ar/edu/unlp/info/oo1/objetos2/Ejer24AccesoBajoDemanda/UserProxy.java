package ar.edu.unlp.info.oo1.objetos2.Ejer24AccesoBajoDemanda;

import java.util.List;

public class UserProxy implements PersistableUser {

    private User user;
    private PostRepository postRepository;
    private boolean postsLoaded;

    public UserProxy(User user) {
        this.user = user;
        this.postRepository = new PostRepository();
        this.postsLoaded = false;
    }

    @Override
    public List<Post> getPosts() {
        if (!postsLoaded) {
            user.addPosts(
                postRepository.findPostsByUsername(user.getUsername())
            );
            postsLoaded = true;
        }
        return user.getPosts();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }
}
