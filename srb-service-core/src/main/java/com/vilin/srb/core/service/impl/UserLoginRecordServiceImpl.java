package com.vilin.srb.core.service.impl;

import com.vilin.srb.core.pojo.entity.UserLoginRecord;
import com.vilin.srb.core.mapper.UserLoginRecordMapper;
import com.vilin.srb.core.service.UserLoginRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户登录记录表 服务实现类
 * </p>
 *
 * @author Leo
 * @since 2021-06-02
 */
@Service
public class UserLoginRecordServiceImpl extends ServiceImpl<UserLoginRecordMapper, UserLoginRecord> implements UserLoginRecordService {

}
