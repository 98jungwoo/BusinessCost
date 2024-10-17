package woo.cost.mgmt.models.admin;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;
@Repository
@RequiredArgsConstructor
public class AdminDaoImp implements AdminDao {

    @Autowired
    private final SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<AdminDto> adminSelectAll() {
        System.out.println("daoImp");
        return sqlSessionTemplate.selectList("");
    }

}
