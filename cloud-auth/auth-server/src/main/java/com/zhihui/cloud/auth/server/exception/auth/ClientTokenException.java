package com.zhihui.cloud.auth.server.exception.auth;

import com.zhihui.cloud.auth.common.constant.CommonConstants;
import com.zhihui.cloud.auth.server.exception.BaseException;

public class ClientTokenException extends BaseException {
    public ClientTokenException(String message) {
        super(message, CommonConstants.EX_CLIENT_INVALID_CODE);
    }
}
