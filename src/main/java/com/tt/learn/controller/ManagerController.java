package com.tt.learn.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.sun.org.glassfish.gmbal.ParameterNames;
import com.tt.learn.common.R;
import com.tt.learn.entity.Manager;
import com.tt.learn.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/manager")
public class ManagerController {
    @Autowired
    private ManagerService managerService;
    @PostMapping("/login")
    public R<Manager> login(HttpServletRequest request, @RequestBody Manager manager){
        return null;
    }
    @GetMapping("/test/{id}")
    public R<Manager> test(@PathVariable("id")int id){
        LambdaQueryWrapper<Manager> lqw = new LambdaQueryWrapper<>();
        lqw.eq(Manager::getId,id);
        Manager one = managerService.getOne(lqw);
        return R.success(one);
    }

}
