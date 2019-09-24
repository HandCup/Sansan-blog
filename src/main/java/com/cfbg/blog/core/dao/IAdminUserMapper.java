package com.cfbg.blog.core.dao;

import com.cfbg.blog.core.entity.AdminUser;
import org.apache.ibatis.annotations.Param;

public interface IAdminUserMapper {
    int insert(AdminUser record);
    int insertSelective(AdminUser record);
    /**
     * 登陆方法
     */
    AdminUser login(@Param("userName")String userName,@Param("password") String password);
    AdminUser selectByPrimaryKey(Integer adminUserId);
    int updateByPrimaryKeySelective(AdminUser record);
    int updateByPrimaryKey(AdminUser record);
}
