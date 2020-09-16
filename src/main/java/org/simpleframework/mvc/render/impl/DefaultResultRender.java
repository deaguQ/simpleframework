package org.simpleframework.mvc.render.impl;

import org.simpleframework.mvc.RequestProcessorChain;
import org.simpleframework.mvc.render.ResultRender;

/**
 * 默认渲染器
 */
public class DefaultResultRender implements ResultRender {
    @Override
    public void render(RequestProcessorChain requestProcessorChain) throws Exception {
        //设置状态码
        requestProcessorChain.getResponse().setStatus(requestProcessorChain.getResponseCode());
    }
}
