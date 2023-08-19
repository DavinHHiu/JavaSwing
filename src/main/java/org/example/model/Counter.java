package org.example.model;

public class Counter {
    private long value;

    public Counter () {
        this.value = 0;
    }

    public long getValue () {
        return this.value;
    }

    public void setValue (long value) {
        this.value = value;
    }

    public void increase () {
        this.value += 1;
    }

    public void decrease () {
        this.value -= 1;
    }

    public void reset () {
        this.value = 0;
    }
}
