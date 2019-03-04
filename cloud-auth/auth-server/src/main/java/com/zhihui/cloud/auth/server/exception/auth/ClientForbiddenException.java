package com.zhihui.cloud.auth.server.exception.auth;

import com.zhihui.cloud.auth.common.constant.CommonConstants;
import com.zhihui.cloud.auth.server.exception.BaseException;

public class ClientForbiddenException extends BaseException {
    public ClientForbiddenException(String message) {
        super(message, CommonConstants.EX_CLIENT_FORBIDDEN_CODE);
    }

}
