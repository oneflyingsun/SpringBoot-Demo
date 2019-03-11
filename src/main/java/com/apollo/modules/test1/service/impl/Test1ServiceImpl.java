package com.apollo.modules.test1.service.impl;

import com.apollo.modules.test1.entity.Test1;
import com.apollo.modules.test1.mapper.Test1Mapper;
import com.apollo.modules.test1.service.ITest1Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 */
@Service
public class Test1ServiceImpl extends ServiceImpl<Test1Mapper, Test1> implements ITest1Service {

}
