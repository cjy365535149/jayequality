package pers.jay.equality.service.impl;
import pers.jay.equality.service.ActorService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pers.jay.equality.pojo.Actor;
import pers.jay.equality.mapper.ActorMapper;

@Service ("ActorService")
public class ActorServiceImpl implements ActorService {
	@Autowired
	private ActorMapper actorMapper;
	
	@Override
	public void add(int id, String firstName, String lastName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int id, String firstName, String lastName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Actor read(int id) {
		Actor Actor;
		Actor = actorMapper.findByActorId(id);
		Actor.setRemark("This is a actor named " + actorMapper.findByActorId(id).getLastName());
		//return actorMapper.findByActorId(id);
		return Actor;
	}

	@Override
	public List<Actor> list() {
		// TODO Auto-generated method stub
		return actorMapper.findAll();
	}
	
	
}