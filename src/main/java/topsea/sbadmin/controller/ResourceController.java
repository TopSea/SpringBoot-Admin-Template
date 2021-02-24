package topsea.sbadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResourceController {
    @GetMapping("/admin/charts")
    public String AdminChart(){
        return "admin/data/charts";
    }

    @GetMapping("/admin/tables")
    public String AdminTables(){
        return "admin/data/tables";
    }
}
