package woo.cost.mgmt.services.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import woo.cost.mgmt.models.admin.AdminDao;
import woo.cost.mgmt.models.admin.AdminDto;
@Service
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
