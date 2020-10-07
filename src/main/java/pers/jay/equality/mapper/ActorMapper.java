package pers.jay.equality.mapper;
import java.util.List;
import pers.jay.equality.pojo.Actor;

public interface ActorMapper {
	Actor findByActorId(int actorId);
    List<Actor> findAll();
}