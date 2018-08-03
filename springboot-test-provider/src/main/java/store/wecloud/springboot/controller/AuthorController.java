package store.wecloud.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import store.wecloud.springboot.bean.User;

@Controller
@RequestMapping("/user")
public class AuthorController {
    @Autowired
    private User user;

    @RequestMapping("/")
    public @ResponseBody String index(){
        return "user name is: " + user.getName() + " password is: " + user.getPassword();
    }
}
