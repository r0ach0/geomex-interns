package geomex.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import geomex.impls.AccountServiceImpl;
import geomex.models.AccountVO;

@Controller
public class LoginController {
    @Resource(name = "accountService")
    private AccountServiceImpl service;
    
    @RequestMapping(value = "/login.do", method = RequestMethod.GET)
    public String login(Model model) {
        AccountVO user = new AccountVO(null, null, null);
        model.addAttribute("account", user);
        
        return "login";
    }
    
    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    public String signup(@ModelAttribute("account") AccountVO user, Model model) {
        if(service.isAvailableAccount(user))
            return "loggedin";
        else
            return "login";
    }
}
