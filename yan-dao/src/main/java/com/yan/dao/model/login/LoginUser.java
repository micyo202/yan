package com.yan.dao.model.login;

import com.yan.dao.model.user.SysUser;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class LoginUser extends SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Map<String, Object>> userRoles;

    public List<Map<String, Object>> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<Map<String, Object>> userRoles) {
        this.userRoles = userRoles;
    }

    @Override
    public String toString() {
        return "LoginUser [userRoles=" + userRoles + "]";
    }

}