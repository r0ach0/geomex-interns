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
public class RegisterController {
    @Resource(name = "accountService")
    private AccountServiceImpl service;
    
    @RequestMapping(value = "/register.do", method = RequestMethod.GET)
    public String register(Model model) {
        AccountVO user = new AccountVO(null, null, null);
        model.addAttribute("account", user);

        return "register";
    }
    
    @RequestMapping(value = "/register.do", method = RequestMethod.POST)
    public String signup(@ModelAttribute("account") AccountVO user, Model model) {
        try {
            service.create(user);
            return "redirect:login.do";
        } catch (Exception e) {
            e.printStackTrace();
            return "register";
        }
    }
}
