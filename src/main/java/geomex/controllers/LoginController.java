package geomex.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import geomex.impls.UserService;
import geomex.models.UserVO;

@Controller
@SessionAttributes({ "user" })
/*
 * @SessionAttributes => Model 정보를 HttpSession에 저장시켜주는 애노테이션이다.
 */
public class LoginController {

	@Resource(name = "userService")
    private UserService userService;
	
		//로그인창으로 이동
	  @RequestMapping(value = "/login.do", method = RequestMethod.GET)
	    public String showLoginForm() throws Exception{
	        //@ModelAttribute("login")를 선언한 함수를 이 용해도 됨.
	        
	      	System.out.println("[LOG] MVC MAPPING 성공");
	        return "login/loginForm";
	    }

	    
	    
	  
	  	//로그인 데이터 입력받아서 진행
	    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
	    /*
	     * @ModelAttribute 는 vo의 setter를 자동으로 호출해서 id와 pw의 값을 자동으로 넣어줌 
	     */
	    public String loginProcess(@ModelAttribute("login") UserVO user, Model model) throws Exception {
	  
	    	UserVO userVO = userService.select(user);
	    	if(userVO == null) return null;
	    	
	    	if ( userVO.getPassword() == user.getPassword()) {
	        	//로그인 성공
	    		System.out.println("[LOG] 로그인 성공");
	    		/*
	      	   * 
	      	   * SessionAttributes 애노테이션에 정의되 Key와
	      	   * 동일한 Key로 Model에 값을 Set해주는 행위가 있을 시 자동으로 Session에도 저장시켜준다.
	      	   * 모델에 key를 user로 값을 set 해줄시 자동으로 session에도 user를 키로, 값을 set 해줌
	      	   */
	            model.addAttribute("user", user.getId());
	            return "index.jsp";
	        }
	        else{
	        	//로그인 실패
	        	System.out.println("[LOG] 로그인 실패 ");
	        }
	        return "login/loginForm";
	    }
	    
	    
		  
		  @RequestMapping(value = "/logout.do")
		    public String logout(SessionStatus sessionStatus) {
		        if (!sessionStatus.isComplete()) {
		            sessionStatus.setComplete();
		        }
		        return "index.jsp";
		  }
	  
	 
}
