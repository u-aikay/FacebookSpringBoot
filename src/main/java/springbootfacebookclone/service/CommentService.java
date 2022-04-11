package springbootfacebookclone.service;

import springbootfacebookclone.POJO.CommentMapper;
import springbootfacebookclone.model.Comment;
import springbootfacebookclone.model.Person;
import java.util.List;

public interface CommentService {
    boolean createComment(Long userId, Long postId,Comment comment);
    public List<CommentMapper> getComments(Long postId);
    boolean editComment(Long commentId, Person person, Long postId, String comment);
    boolean deleteComment(Long commentId);
}
