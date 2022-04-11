package springbootfacebookclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import springbootfacebookclone.model.Likes;
import springbootfacebookclone.model.Person;
import springbootfacebookclone.model.Post;

import java.util.List;

public interface LikesRepository extends JpaRepository<Likes, Long> {
    List<Likes> findAllByPostPostId(Long postId);
    List<Likes> findAllByPostPostIdAndPersonId(Long postId, Long personId);
    @Transactional
    void deleteLikesByPostAndPerson(Post post, Person person);
}
