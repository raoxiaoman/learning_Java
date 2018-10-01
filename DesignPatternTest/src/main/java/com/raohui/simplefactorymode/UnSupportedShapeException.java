package com.raohui.simplefactorymode;

public class UnSupportedShapeException extends RuntimeException {
    private String msg;

    public UnSupportedShapeException() {
        super();
    }

    public UnSupportedShapeException(String msg) {
        super(msg);
        this.msg = msg;
    }

}
