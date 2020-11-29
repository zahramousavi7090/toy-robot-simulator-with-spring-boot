package com.zahra.toy_robot_simulator;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Component
public class Place {
    private int x;
    private int y;
    @NotNull
    private String direction;

    public Place() {
    }

    public Place(int x, int y, @NotNull String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
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

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
