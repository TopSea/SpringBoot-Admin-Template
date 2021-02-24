package topsea.sbadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/admin/index")
    public String AdminIndex(){
        return "admin/index";
    }

    @GetMapping("/admin/login")
    public String AdminLogin(){
        return "admin/adminUser/login";
    }

    @GetMapping("/admin/register")
    public String AdminRegister(){
        return "admin/adminUser/register";
    }

    @GetMapping("/admin/resetPassword")
    public String AdminResetPassword(){
        return "admin/adminUser/forgot-password";
    }
}
