package com.letopo.biz.service.storage;

import java.io.InputStream;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-24 10:59
 */
public interface StorageBizService {

    public String upload(String fileName, InputStream is, long contentLength, String contentType);

}
