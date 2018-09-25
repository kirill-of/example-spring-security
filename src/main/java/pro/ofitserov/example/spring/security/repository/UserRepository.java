package pro.ofitserov.example.spring.security.repository;

import org.springframework.data.repository.CrudRepository;
import pro.ofitserov.example.spring.security.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByName(String name);
}
