package pers.jay.equality.service;
import java.util.List;

import pers.jay.equality.pojo.Actor;

public interface ActorService {
	void add(int id, String firstName,String lastName);
	void delete(int id);
	void update(int id, String firstName,String lastName);
	Actor read(int id);
	List<Actor> list();
}
