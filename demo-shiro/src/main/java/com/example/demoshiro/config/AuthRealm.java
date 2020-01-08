package com.example.demoshiro.config;

import com.example.demoshiro.dto.Permission;
import com.example.demoshiro.dto.Role;
import com.example.demoshiro.dto.User;
import com.example.demoshiro.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName: AuthRealm
 * @Description: 自定义Realm
 * @Author: GaoYueBin
 * @Date: 2019-07-05 18:09
 * @Version 1.0
 **/
public class AuthRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    /**
     * @return org.apache.shiro.authz.AuthorizationInfo
     * @Author GaoYueBin
     * @Description 授权
     * @Date 2019/7/8 10:37
     * @Param [principalCollection]
     **/
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        User user = (User) principalCollection.fromRealm(this.getClass().getName()).iterator().next();
        List<String> permissionList = new ArrayList<>();
        Set<String> roleNameSet = new HashSet<>();

        //获取用户角色列表
        Set<Role> roleSet = user.getRoles();
        if (!CollectionUtils.isEmpty(roleSet)) {
            for (Role role : roleSet) {
                //添加角色名称
                roleNameSet.add(role.getRname());
                //获取角色的权限值
                Set<Permission> permissionSet = role.getPermissions();
                if (!CollectionUtils.isEmpty(permissionSet)) {
                    for (Permission permission : permissionSet) {
                        // 添加权限名称
                        permissionList.add(permission.getName());
                    }
                }
            }

        }

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addStringPermissions(permissionList);
        info.setRoles(roleNameSet);
        return info;
    }

    /**
     * @return org.apache.shiro.authc.AuthenticationInfo
     * @Author GaoYueBin
     * @Description 认证登录
     * @Date 2019/7/8 10:37
     * @Param [authenticationToken]
     **/
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken;
        //获取登录用户名
        String userName = usernamePasswordToken.getUsername();
        //从数据库中查询用户名
        User user = userService.findByUserName(userName);
        return new SimpleAuthenticationInfo(user, user.getPassword(), this.getClass().getName());
    }
}
