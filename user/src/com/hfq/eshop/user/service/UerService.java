package com.hfq.eshop.user.service;

import com.hfq.eshop.user.entity.User;

public interface UerService {
    User login(User user)throws Exception;
}
