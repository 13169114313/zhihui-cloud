package com.zhihui.cloud.auth.api;

import com.zhihui.cloud.auth.dto.TokenDTO;
import com.zhihui.cloud.common.msg.Result;
import org.springframework.stereotype.Component;

/**
 * @author Chen
 */
@Component
public class AuthTokenApiHystrix implements AuthTokenApi {

    @Override
    public Result<TokenDTO> login(String userName) {
        return Result.timeout();
    }
}
