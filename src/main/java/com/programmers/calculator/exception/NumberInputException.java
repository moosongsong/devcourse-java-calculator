package com.programmers.calculator.exception;

public class NumberInputException extends InputException {
    private static final long serialVersionUID = -6008277195540542990L;

    public NumberInputException() {
        super("번호 입력이 잘못되었습니다.");
    }
}
