package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class Variables extends OpMode {
    @Override
    public void init() {
        int teamNumber = 23014;
        double motorspeed = 0.75;
        boolean clawClosed = true;
        String name = "lebron"

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("motor speed", motorspeed);
        telemetry.addData("claw closed", clawClosed);
    }

    @Override
    public void loop() {

    }
}
