package usermainte.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import usermainte.dto.UserDto;
import usermainte.entity.User;
import usermainte.service.UserService;

public class UserAction {

	@Resource
	protected UserService userService;

	public List<UserDto> userDtos = new ArrayList<>();

	@Execute(validator = false)
	public String list() {

		List<User> users = this.userService.findAll();

		for (User u : users) {
			this.userDtos.add(new UserDto(u.id, u.name));
		}

		return "list.jsp";
	}
}
