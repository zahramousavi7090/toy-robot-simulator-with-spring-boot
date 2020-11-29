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

}
