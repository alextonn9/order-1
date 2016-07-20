package com.yoho.error;

import java.util.Map;

/**
 *
 * Created by chang@yoho.cn on 2015/11/3.
 */
public interface ErrorCode {

    /**
     * 1.3版本
     * 1.3版本持续开发
     * 错误内容为content
     * 
     * @param content
     */
	
	
    public void setErrorContent(Map<String, Object> content);

    /**
     * 获取错误码
     * @return 错误码
     */
    public int getCode();
}
