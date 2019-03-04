package com.zhihui.cloud.auth.server.bean;

import com.zhihui.cloud.auth.common.jwt.IJWTInfo;
import lombok.Data;

@Data
public class ClientInfo implements IJWTInfo {

    private String clientId;
    private String name;
    private String id;

    @Override
    public String getUniqueName() {
        return clientId;
    }
}
