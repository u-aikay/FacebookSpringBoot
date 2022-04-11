package springbootfacebookclone.service;

import springbootfacebookclone.POJO.PostMapper;
import springbootfacebookclone.model.Person;
import springbootfacebookclone.model.Post;
import java.util.List;

public interface PostService {
    boolean createPost(Long userId, Post post);
    List<PostMapper> getPost(Person currentUser);
}
