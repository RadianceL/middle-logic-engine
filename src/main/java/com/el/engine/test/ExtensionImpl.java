package com.el.engine.test;

import com.el.engine.extension.Extension;

/**
 * <br/>
 * since 2021/5/13
 *
 * @author eddie.lys
 */
public class ExtensionImpl implements Extension {

    public ExtensionImpl() {
    }

    @Override
    public Object print(String s) {
        return s;
    }
}