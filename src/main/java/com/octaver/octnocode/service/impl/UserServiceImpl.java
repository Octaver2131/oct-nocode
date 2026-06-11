package com.octaver.octnocode.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.octaver.octnocode.model.entity.User;
import com.octaver.octnocode.mapper.UserMapper;
import com.octaver.octnocode.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 用户 服务层实现。
 *
 * @author <a href="https://github.com/octaver2131">Octaver</a>
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>  implements UserService{

}
