package com.tt.learn.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tt.learn.entity.Manager;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ManagerMapper extends BaseMapper<Manager> {
}
