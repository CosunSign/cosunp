package com.cosun.cosunp.weixin;

import java.io.Serializable;

/**
 * @author:homey Wong
 * @Date: 2019/9/17 0017 上午 9:13
 * @Description:
 * @Modified By:
 * @Modified-date:
 */
public class JsWechatConfig implements Serializable {

    private static final long serialVersionUID = -7656063540329973304L;

    private String appId;

    private long timestamp;

    private String noncestr;

    private String signature;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getNoncestr() {
        return noncestr;
    }

    public void setNoncestr(String noncestr) {
        this.noncestr = noncestr;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
