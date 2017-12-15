package com.lanou3g.exception;

import com.lanou3g.exception.LoginException;

public class NotMatchUserNameAndPasswordException extends LoginException {
    @Override
    public String getMessage() {
        return "用户名与密码不匹配异常";
    }
}
