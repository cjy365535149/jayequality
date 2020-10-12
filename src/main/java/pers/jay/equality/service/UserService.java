package pers.jay.equality.service;
import java.util.List;

import pers.jay.equality.pojo.User;

public interface UserService {
	void add(int id, String username,String password);
	void delete(int id);
	void update(int id, String username,String password);
	User read(int id);
	User getUserByUsername(String username);
	List<User> list();
}
