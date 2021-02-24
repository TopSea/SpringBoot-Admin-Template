package topsea.sbadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilitiesController {

    @GetMapping("/admin/animation")
    public String AdminUtilitiesAnimation(){
        return "admin/utilities/utilities-animation";
    }

    @GetMapping("/admin/border")
    public String AdminUtilitiesBorder(){
        return "admin/utilities/utilities-border";
    }

    @GetMapping("/admin/color")
    public String AdminUtilitiesColor(){
        return "admin/utilities/utilities-color";
    }

    @GetMapping("/admin/other")
    public String AdminUtilitiesOther(){
        return "admin/utilities/utilities-other";
    }
}
