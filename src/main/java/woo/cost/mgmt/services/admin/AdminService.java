package woo.cost.mgmt.services.admin;

import java.util.List;
import woo.cost.mgmt.models.admin.AdminDto;

public interface AdminService {
    List<AdminDto> adminSelectAll();
    
}
