package pers.jay.equality.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pers.jay.equality.mapper.ActorMapper;
import pers.jay.equality.pojo.Actor;
import pers.jay.equality.service.ActorService;

@Controller("ActorController")
@RestController
//@RequestMapping("/actor")
public class ActorController {
	@Autowired
	private ActorService actorService;

	@Resource
	private ActorMapper actorMapper;

	@GetMapping("/actor")
	public Actor findActorById(@RequestParam(value = "actorId") int actorId) {
		return actorService.read(actorId);
	};
	@GetMapping("/actor/all")
	public List<Actor> findAllActor() {
		return actorService.list();
	};
}