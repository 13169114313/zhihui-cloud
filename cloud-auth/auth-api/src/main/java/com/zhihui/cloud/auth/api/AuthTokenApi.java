package com.zhihui.cloud.auth.api;

import com.zhihui.cloud.auth.dto.TokenDTO;
import com.zhihui.cloud.common.msg.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "${zhihui.feign-server.auth:cloud-auth}", fallback = AuthTokenApiHystrix.class)
public interface AuthTokenApi {

    /**
     * 登录获取token
     * @param userName
     * @return
     */
    @RequestMapping(value = "/client/login", method = RequestMethod.POST)
    Result<TokenDTO> login(@RequestParam(value = "userName") String userName);
}
