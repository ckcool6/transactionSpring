package com.itheima.service;

import com.itheima.domain.Account;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;
@Transactional(
        readOnly = false,
        timeout = -1,
        isolation = Isolation.DEFAULT,
        rollbackFor = {java.lang.ArithmeticException.class, IOException.class},
        noRollbackFor = {},
        propagation = Propagation.REQUIRED
)
public interface AccountService {

    /**
     * 转账操作
     * @param outName     出账用户名
     * @param inName      入账用户名
     * @param money       转账金额
     */
    public void transfer(String outName, String inName, Double money);

}
