package net.proselyte.logsecurityapp.dao;

/**
 * Created by Artem on 20.12.2016.
 */
import net.proselyte.logsecurityapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
