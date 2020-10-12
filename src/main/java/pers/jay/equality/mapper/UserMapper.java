package pers.jay.equality.mapper;
import java.util.List;
import pers.jay.equality.pojo.User;

public interface UserMapper {
	User getUserByUsername(String username);
	User getUserById(int id);
    List<User> getAll();
}