package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name="ControllerDrive", group="Robot")
public class ControllerDrive extends LinearOpMode
{
    //Oh boy, 2 vars declared at once!
    private DcMotor lDrive, rDrive = null;
    @Override
    public void runOpMode()
    {
        //TODO:
        //Replace deviceName with actual names
        lDrive = hardwareMap.get(DcMotor.class, "left_drive");
        rDrive = hardwareMap.get(DcMotor.class, "right_drive");
        //Flip side
        rDrive.setDirection(DcMotor.Direction.REVERSE);
        waitForStart();
        while (opModeIsActive())
        {
            //Up is actually -
            double d = -gamepad1.left_stick_y;
            double t = gamepad1.right_stick_x;
            lDrive.setPower(d + t);
            rDrive.setPower(d - t);
        }
    }
}
