import java.util.List;


public interface UserDao {

	void createUser(User user);
	void modifyUser(User user);
	void deleteUser(User user);
	
	User getUser(String username);
	
	List<User> getUsers();
	List<User> searchByName(String name);
	List<User> searchByMail(String mail);
	
	
	
}
