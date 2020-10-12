package pers.jay.equality.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import pers.jay.equality.pojo.User;
import pers.jay.equality.service.UserService;
/**
 * 登录专用类
 * 自定义类，实现了UserDetailsService接口，用户登录时调用的第一类
 * @author 程就人生
 *
 */
@Component
public class MyCustomUserService implements UserDetailsService {
	@Autowired
	UserService UserService;
    /**
     * 登陆验证时，通过username获取用户的所有权限信息
     * 并返回UserDetails放到spring的全局缓存SecurityContextHolder中，以供授权器使用
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	User user;
    	//在这里可以自己调用数据库，对username进行查询，看看在数据库中是否存在
        MyUserDetails myUserDetail = new MyUserDetails();
        //从数据库user表获取用户信息
        user = UserService.getUserByUsername(username);
        myUserDetail.setUsername(username);
        myUserDetail.setPassword(user.getPassword());
        return myUserDetail;
    }
}