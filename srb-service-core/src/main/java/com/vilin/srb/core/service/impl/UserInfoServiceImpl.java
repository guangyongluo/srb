package com.vilin.srb.core.service.impl;

import com.vilin.srb.core.pojo.entity.UserInfo;
import com.vilin.srb.core.mapper.UserInfoMapper;
import com.vilin.srb.core.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基本信息 服务实现类
 * </p>
 *
 * @author Leo
 * @since 2021-06-02
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
