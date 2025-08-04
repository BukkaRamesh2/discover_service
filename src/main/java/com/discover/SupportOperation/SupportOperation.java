package com.discover.SupportOperation;

import com.discover.entity.Support;

public abstract class SupportOperation {
    protected Support support;

    public SupportOperation(Support support) {
        this.support = support;
    }

    public abstract void checkStatus();
    public abstract void closeSupport();
    public abstract void getByName();
}
