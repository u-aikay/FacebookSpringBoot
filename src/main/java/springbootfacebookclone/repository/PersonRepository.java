package springbootfacebookclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootfacebookclone.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findPersonByEmail(String email);
}
