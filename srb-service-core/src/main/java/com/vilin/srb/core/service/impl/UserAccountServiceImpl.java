package com.vilin.srb.core.service.impl;

import com.vilin.srb.core.pojo.entity.UserAccount;
import com.vilin.srb.core.mapper.UserAccountMapper;
import com.vilin.srb.core.service.UserAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账户 服务实现类
 * </p>
 *
 * @author Leo
 * @since 2021-06-02
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {

}
