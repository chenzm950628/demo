package com.example.spring.boot.demo.command.common.util;

public enum demo {
    A(1, "1"),
    B(2, "2");
    private int code;
    private String name;

    demo(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
