package com.zhihui.cloud.auth.server.controller;

import com.zhihui.cloud.auth.common.jwt.TokenVo;
import com.zhihui.cloud.auth.dto.TokenDTO;
import com.zhihui.cloud.auth.server.bean.JwtAuthRequest;
import com.zhihui.cloud.common.exception.BizException;
import com.zhihui.cloud.common.msg.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author Chen
 * 客户获取token
 *
 */
@Api(value = "客户端token申请", description = "客户端token申请， 用于各个内部微服务之间的token申请")
@RestController
@RequestMapping("authorization")
public class AuthController {

    @RequestMapping(value = "/token", method = RequestMethod.POST)
    public Result<TokenVo> token(@RequestBody JwtAuthRequest jwtAuthRequest) throws BizException {
        return Result.success(new TokenVo());
    }

    @ApiOperation(value = "获取应用token", notes = "Response Messages 中的HTTP Status Code 值的是errcode的值")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Result<TokenDTO> login(@RequestParam(value = "userName") String userName) throws BizException {
        return Result.success(new TokenDTO());
    }
}
