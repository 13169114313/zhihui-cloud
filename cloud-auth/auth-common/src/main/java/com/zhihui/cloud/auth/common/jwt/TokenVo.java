package com.zhihui.cloud.auth.common.jwt;

import lombok.Data;

import java.io.Serializable;

@Data
public class TokenVo implements Serializable {

    /** token */
    private String token;
    /** 有效时间：单位：秒 */
    private Integer expire;
}
