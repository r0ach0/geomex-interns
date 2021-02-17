package geomex.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import login.service.UserService;
import login.service.UserVO;

@Controller
@SessionAttributes({ "user" })
/*
 * @SessionAttributes => Model 정보를 HttpSession에 저장시켜주는 애노테이션이다.
 */
public class LoginController {

	@Resource(name = "userService")
    private UserService userService;
	
	  @RequestMapping(value = "/login.do", method = RequestMethod.GET)
	    public String showLoginForm() throws Exception{
	        //@ModelAttribute("login")를 선언한 함수를 이 용해도 됨.
	        
	      	System.out.println("[LOG] MVC MAPPING 성공");
	        return "login/loginFormTest";
	    }

	    
	    
	  
	 
	    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
	    /*
	     * @ModelAttribute 는 vo의 setter를 자동으로 호출해서 id와 pw의 값을 자동으로 넣어줌 
	     */
	    public String loginProcess(@ModelAttribute("login") UserVO user, Model model) throws Exception {
	    	System.out.println("[LOG] POST 매핑 성공 !! 입력된 ID : "+user.getId()+" pw : "+user.getPw());
	       
	    	   UserVO userVO = userService.authenticate(user.getId(), user.getPw());
	
	    	if ( userVO != null) {
	        	//로그인 성공
	        	System.out.println("[LOG] admin 입력 성공 !! session에 저장될 내용 : "+user.toString());
	        	 /*
	      	   * 
	      	   * SessionAttributes 애노테이션에 정의되 Key와
	      	   * 동일한 Key로 Model에 값을 Set해주는 행위가 있을 시 자동으로 Session에도 저장시켜준다.
	      	   * 모델에 key를 user로 값을 set 해줄시 자동으로 session에도 user를 키로, 값을 set 해줌
	      	   */
	            model.addAttribute("user", user.getId());
	            return "login/home";
	        }
	        else{
	        	//로그인 실패
	        	System.out.println("[LOG] 로그인 실패 ");
	        }
	        return "login/loginFormTest";
	    }
	    
	    
		  
		  @RequestMapping(value = "/logout.do")
		    public String logout(SessionStatus sessionStatus) {
		        if (!sessionStatus.isComplete()) {
		            sessionStatus.setComplete();
		        }
		        return "login/loginForm";
		  }
	  
	 
}
