package geomex.controllers;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import login.service.UserService;
import login.service.UserVO;



@Controller
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

  

    @Resource(name = "userService")
    UserService userService;

    @RequestMapping(value = "/member.do", method = RequestMethod.POST)
    public String insertMember(@ModelAttribute("member") UserVO member) throws Exception {
        
    	System.out.println("[LOG] 회원가입 입력 id:"+member.getId()+" pw : "+member.getPw());
    	
    	//FORM 에서 입력받은 정보 VO에 넣고 INSERT 함수 실행
        userService.create(member);
        return "/member/memberSuccess";
    }

    @RequestMapping(value = "/member.do", method = RequestMethod.GET)
    public String regMemberForm(ModelMap modelMap) {
       
    	UserVO user = new UserVO();
        modelMap.addAttribute("member", user); //view의 commandName가 같게 설정해야 한다.
       
        
        return "/member/memberForm";
    }

  
}
