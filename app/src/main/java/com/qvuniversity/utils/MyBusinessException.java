package com.qvuniversity.utils;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class MyBusinessException extends SerenityManagedException {
    public MyBusinessException(String message, Throwable testErrorException) {
        super(message, testErrorException);
    }
}