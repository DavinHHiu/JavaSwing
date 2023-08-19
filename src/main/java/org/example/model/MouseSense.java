package org.example.model;

public class MouseSense {
    private int x;
    private int y;
    private int count;
    private String checkIn;

    public MouseSense() {
        this.x = 0;
        this.y = 0;
        this.count = 0;
        this.checkIn = "No";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public void click() {
        this.count += 1;
    }

    public void enter() {
        this.checkIn = "Yes";
    }

    public void exit() {
        this.checkIn = "No";
    }

    public void update(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
