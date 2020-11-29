package com.zahra.toy_robot_simulator;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("robot")
public class RobotController {
    private final Robot robot;

    @Autowired
    public RobotController(Robot robot) {
        this.robot = robot;
    }

    @Operation(summary = "initiate place command from user")
    @PostMapping(value = "/place")
    public void place(@RequestBody Place place) {
        robot.place(place);
    }

    @Operation(summary = "left command")
    @GetMapping(value = "/left")
    public void left() {
        robot.left();
    }

    @Operation(summary = "right command")
    @GetMapping(value = "/right")
    public void right() {
        robot.right();
    }

    @Operation(summary = "move command")
    @GetMapping(value = "/move")
    public void move() {
        robot.move();
    }

    @Operation(summary = "report command")
    @GetMapping(value = "/report")
    public Place report() {
        return robot.report();
    }
}
