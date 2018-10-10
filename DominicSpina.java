package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
/*
comment section


Comments Below This Line ---------------------------------------------------------------------------

TO DO:
1. Add motor control (as team backup ICE)
2. Add servo control (Arm control*)
3. BUILD ARM
4. Fix servo mount bracket

*ARM CONTROL IS ONLY TEMPORARY - ARM SHAPE WILL CHANGE.
Waiting On Parts
*/

@TeleOp
@Disabled

public class DominicSpina extends LinearOpMode {
private DcMotor motorTest
}
    public void runOpMode(){
        motorTest = hardwareMap.get(DcMotor.class, "motorTest" );
        telemetry.addData("Status", "INITIALIZED");
        waitForStart();

        while(opModeIsActive()){
            telemetry.addData("Status", "RUNNING");
                    telemetry.update();
    }