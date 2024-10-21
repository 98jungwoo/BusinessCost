package nam.cost.business.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
//@RequiredArgsConstructor
// @RequestMapping("/api/admin")
public class AdminController {

//    private final AdminServiceImp adminserviceImp;

    @GetMapping("/select")
    public String selectAll() {
        System.out.println("컨트롤러");
    //    return adminserviceImp.adminSelectAll();
        return "Hello";
    }
}