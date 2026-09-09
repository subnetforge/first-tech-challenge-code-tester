package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

// Same file works on the real robot and in the updated web simulator.
// Approximate timed square: forward, right, backward, left, without turning.
// Verify motor directions first. Adjust sideways sleep times to match side lengths.
@Autonomous(name = "Square Auto - Slow Test", group = "Autonomous")
public class SquareAuto extends LinearOpMode {
    @Override
    public void runOpMode() {
        DcMotor frontLeft = hardwareMap.get(DcMotor.class, "B3");
        DcMotor frontRight = hardwareMap.get(DcMotor.class, "O1");
        DcMotor backLeft = hardwareMap.get(DcMotor.class, "B0");
        DcMotor backRight = hardwareMap.get(DcMotor.class, "O2");
        DcMotor spin = hardwareMap.get(DcMotor.class, "spin");
        double power = 0.25;
        frontLeft.setDirection(DcMotor.Direction.REVERSE);
        frontRight.setDirection(DcMotor.Direction.FORWARD);
        backLeft.setDirection(DcMotor.Direction.REVERSE);
        backRight.setDirection(DcMotor.Direction.FORWARD);
        frontLeft.setPower(0);
        frontLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontRight.setPower(0);
        frontRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backLeft.setPower(0);
        backLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRight.setPower(0);
        backRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        spin.setPower(0);
        spin.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        spin.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        telemetry.addLine("Square ready: forward, right, backward, left. Spinner stays off.");
        telemetry.update();
        try {
            waitForStart();
            if (!opModeIsActive()) return;
            telemetry.addLine("Forward");
            telemetry.update();
            frontLeft.setPower(power);
            frontRight.setPower(power);
            backLeft.setPower(power);
            backRight.setPower(power);
            sleep(1000);
            frontLeft.setPower(0);
            frontRight.setPower(0);
            backLeft.setPower(0);
            backRight.setPower(0);
            if (!opModeIsActive()) return;
            sleep(300);
            if (!opModeIsActive()) return;
            telemetry.addLine("Right");
            telemetry.update();
            frontLeft.setPower(power);
            frontRight.setPower(-power);
            backLeft.setPower(-power);
            backRight.setPower(power);
            sleep(1000);
            frontLeft.setPower(0);
            frontRight.setPower(0);
            backLeft.setPower(0);
            backRight.setPower(0);
            if (!opModeIsActive()) return;
            sleep(300);
            if (!opModeIsActive()) return;
            telemetry.addLine("Backward");
            telemetry.update();
            frontLeft.setPower(-power);
            frontRight.setPower(-power);
            backLeft.setPower(-power);
            backRight.setPower(-power);
            sleep(1000);
            frontLeft.setPower(0);
            frontRight.setPower(0);
            backLeft.setPower(0);
            backRight.setPower(0);
            if (!opModeIsActive()) return;
            sleep(300);
            if (!opModeIsActive()) return;
            telemetry.addLine("Left");
            telemetry.update();
            frontLeft.setPower(-power);
            frontRight.setPower(power);
            backLeft.setPower(power);
            backRight.setPower(-power);
            sleep(1000);
            frontLeft.setPower(0);
            frontRight.setPower(0);
            backLeft.setPower(0);
            backRight.setPower(0);
            if (!opModeIsActive()) return;
            sleep(300);
            if (!opModeIsActive()) return;
            telemetry.addLine("Square complete. Motors stopped.");
            telemetry.update();
        } finally {
            frontLeft.setPower(0);
            frontRight.setPower(0);
            backLeft.setPower(0);
            backRight.setPower(0);
            spin.setPower(0);
        }
    }
}
