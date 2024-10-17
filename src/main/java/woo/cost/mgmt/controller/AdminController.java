package woo.cost.mgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import woo.cost.mgmt.models.admin.AdminDto;
import woo.cost.mgmt.services.admin.AdminServiceImp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequiredArgsConstructor
@RequestMapping("api/admin")
public class AdminController {

    @Autowired
    private final AdminServiceImp adminserviceImp;

    @GetMapping("/select")
    public List<AdminDto> selectAll(@RequestParam String param) {
        System.out.println("컨트롤러");
        return adminserviceImp.adminSelectAll();
    }
    
}
