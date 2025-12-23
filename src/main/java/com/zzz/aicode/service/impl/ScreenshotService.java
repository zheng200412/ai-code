package com.zzz.aicode.service.impl;

/**
 * 截图服务
 */
public interface ScreenshotService {

    /**
     * 生成网页截图并上传到对象存储
     * @param webUrl
     * @return
     */
    String generateAndUploadScreenshot(String webUrl);
}
