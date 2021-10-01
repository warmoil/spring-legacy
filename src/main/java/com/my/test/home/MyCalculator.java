package com.my.test.home;

public class MyCalculator {

    private int first;
    private int second;
    private Calculator calculator;

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public Calculator getCalculator() {
        return calculator;
    }

    public MyCalculator() {
    }


    public void add() {
        calculator.addition(first, second);
    }
    public void sub(){
        calculator.subtraction(first, second);
    }
    public void mul(){
        calculator.multiplication(first, second);
    }
    public void div(){
        calculator.division(first, second);
    }
}
