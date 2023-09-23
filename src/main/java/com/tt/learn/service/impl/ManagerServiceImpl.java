package com.tt.learn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tt.learn.entity.Manager;
import com.tt.learn.mapper.ManagerMapper;
import com.tt.learn.service.ManagerService;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl extends ServiceImpl<ManagerMapper, Manager> implements ManagerService {
}
