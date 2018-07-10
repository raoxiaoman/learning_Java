package com.raohui.model;

public class SingleTypeTest {
    private String message;
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SingleTypeTest{" +
                "message='" + message + '\'' +
                '}';
    }
}
