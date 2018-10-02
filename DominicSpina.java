package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
/*
comment section

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