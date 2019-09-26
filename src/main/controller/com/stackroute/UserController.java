package com.stackroute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String displayName(Model model) {
       return "user";
    }

    @RequestMapping(value="/login", method= RequestMethod.POST)
    public String display(@RequestParam("username") String username,
        @RequestParam("password") String password, Model model) {
        User user = new User(username, password);
        model.addAttribute("user", user.getName());
        return "iindex";
    }
}

