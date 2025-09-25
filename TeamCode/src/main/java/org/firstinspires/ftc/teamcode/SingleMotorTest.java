package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class SingleMotorTest extends OpMode {

    DcMotor singleMotor;

    @Override
    public void init() {
        singleMotor = hardwareMap.get(DcMotor.class, "motor0");
    }

    @Override
    public void loop() {
        singleMotor.setPower(gamepad1.left_stick_x);
    }
}
