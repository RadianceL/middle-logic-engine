package com.el.engine.core.handle.process;

import com.el.engine.identity.scheme.BusinessScheme;

/**
 * 流程处理器 <br/>
 * since 2021/4/27
 *
 * @author eddie.lys
 */
public interface ProcessEngine {

    /**
     * 启动流程
     * @param businessScheme    业务方案
     * @param req               请求
     * @param resp              返回值
     */
    void start(BusinessScheme businessScheme, Object req, Object resp);

}
