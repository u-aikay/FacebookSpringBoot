package springbootfacebookclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootfacebookclone.model.Comment;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByPostPostId(Long postId);
    Comment findCommentById(Long commentId);
    @Transactional
    void deleteCommentById(Long id);
}
