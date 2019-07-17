package hello;

import java.util.List;

/**
 *
 * @author tbg
 */
public interface UserService {
    public List<UserDetails> getUserDetails();

    public UserDetails findById(Integer id);
}
