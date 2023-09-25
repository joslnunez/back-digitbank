package ar.digitalers.back_digitbank.repos;

import ar.digitalers.back_digitbank.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmailIgnoreCase(String email);

}
