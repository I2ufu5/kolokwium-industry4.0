package kolokwium.Repositories;

import kolokwium.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

@Repository
@CrossOrigin
public interface UsersDAO extends JpaRepository<User,Long> {
    Optional<User> findUserByEmail(String email);
    Optional<User> findUserByName(String name);
    Optional<User> findByUserId(Long id);
    boolean existsByEmail(String email);
    boolean existsByUserId(Long id);
    boolean existsByName(String name);
}
