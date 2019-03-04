package com.zhihui.cloud.auth.server.exception.auth;

import com.zhihui.cloud.auth.common.constant.CommonConstants;
import com.zhihui.cloud.auth.server.exception.BaseException;

/**
 * @author Chen
 */
public class UserTokenException extends BaseException {
    public UserTokenException(String message) {
        super(message, CommonConstants.EX_USER_INVALID_CODE);
    }
}
