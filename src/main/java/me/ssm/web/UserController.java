package me.ssm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import me.frame.base.BaseController;
import me.ssm.entity.User;
import me.ssm.service.UserService;
import me.ssm.vo.UserWebVo;

@Controller
@RequestMapping(value="/user")
public class UserController extends BaseController{
	
	@Autowired
	UserService userService;

	@RequestMapping(value="/login")//,method=RequestMethod.POST
	public @ResponseBody UserWebVo login(@RequestBody User user){
		
			return new UserWebVo(OK, "登录成功", user);
	}
	
	
	@RequestMapping(value="/register")//,method=RequestMethod.POST
	public @ResponseBody UserWebVo register(@RequestBody User user){
		
			return new UserWebVo(OK,"注册成功",user);
		
	}
	
	
}
