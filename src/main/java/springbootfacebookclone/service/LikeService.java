package springbootfacebookclone.service;

import springbootfacebookclone.model.Person;

public interface LikeService {
    public boolean likePost(Person person, Long postId, String action);
}
