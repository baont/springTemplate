package hello;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tbg
 */
@Repository
public interface UserDao extends JpaRepository<UserDetails, Integer> {
}
