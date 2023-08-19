package org.example.model;

public class MyCalculator {
    private double value1;
    private double value2;
    private double answer;

    public MyCalculator() {}

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    public double plus() {
        this.answer = this.value1 + this.value2;
        return this.answer;
    }

    public double minus() {
        this.answer = this.value1 - this.value2;
        return this.answer;
    }

    public double multiply() {
        this.answer = this.value1 * this.value2;
        return this.answer;
    }

    public double divide() {
        this.answer = this.value1 / this.value2;
        return this.answer;
    }

    public double power() {
        this.answer = Math.pow(this.value1, this.value2);
        return this.answer;
    }

    public double mod() {
        this.answer = this.value1 % this.value2;
        return this.answer;
    }
}
