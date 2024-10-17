package woo.cost.mgmt.services.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import woo.cost.mgmt.models.admin.AdminDao;
import woo.cost.mgmt.models.admin.AdminDto;

public class AdminServiceImp implements AdminService{

    private final AdminDao adminDao;

    @Autowired
    public AdminServiceImp(AdminDao adminDao){
        this.adminDao = adminDao;
    }

    @Override
    public List<AdminDto> adminSelectAll() {
        return adminDao.adminSelectAll();
    }

}
