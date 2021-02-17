package geomex.controllers;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import geomex.impls.UserService;
import geomex.models.UserVO;

@Controller
public class UserController {

	Logger logger = LoggerFactory.getLogger(UserController.class);

	@Resource(name = "userService")
	UserService userService;

	// 회원가입
	@RequestMapping(value = "/member.do", method = RequestMethod.POST)
	public String insertMember(@ModelAttribute("member") UserVO member) throws Exception {

		userService.create(member);
		return "/login/loginForm";
	}

	// 회원가입창 진행시 modelMap에 member로 user 저장
	@RequestMapping(value = "/member.do", method = RequestMethod.GET)
	public String regMemberForm(ModelMap modelMap) {

		UserVO user = new UserVO();
		modelMap.addAttribute("member", user); // view의 commandName가 같게 설정해야 한다.

		return "/member/memberForm";
	}

	// memberName update
	@RequestMapping(value = "/updateName")
	public String updateName(@ModelAttribute("member") UserVO member) throws Exception {

		userService.updateName(member.getId(), member.getName());
		return "index.jsp";
	}

	// member 삭제
	@RequestMapping(value = "/deleteMember")
	public String deleteMember(@ModelAttribute("member") UserVO member) throws Exception {

		userService.delete(member.getId());
		return "index.jsp";
	}

}
