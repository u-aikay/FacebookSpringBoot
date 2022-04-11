package springbootfacebookclone.service.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springbootfacebookclone.model.Person;
import springbootfacebookclone.repository.PersonRepository;
import springbootfacebookclone.service.PersonService;
import springbootfacebookclone.utils.PasswordHashing;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonRepository personRepository;

    /**
     * CREATE operation on User
     * @param person
     * @return boolean(true for successful creation and false on failure to create)
     * */
    public boolean createUser(Person person){
        boolean flag = false;

        try {
            //password encryption
            person.setPassword(PasswordHashing.encryptPassword(person.getPassword()));

            Person userData = personRepository.findPersonByEmail(person.getEmail());


            if(userData == null){
                System.out.println(person);
                personRepository.save(person);
                flag = true;
            } else flag = false;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return  flag;
    }

    /**
     * Get operation on User
     * @param email
     * @param password
     * @return User object
     * */
    public Person getUser(String email, String password){

        Person userData = null;

        try {

            userData = personRepository.findPersonByEmail(email);

            if(!password.equals(PasswordHashing.decryptPassword(userData.getPassword()))){
                userData = null;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return userData;
    }
}
