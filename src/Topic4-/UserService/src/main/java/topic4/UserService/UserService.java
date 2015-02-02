package topic4.UserService;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

	public boolean createUser(int id, String fullname, String email, char gender);

	public boolean updateUser(User user);

	public boolean deleteUser(int idForSearch);

	public User searchUsuer(int idForSearch);

}
