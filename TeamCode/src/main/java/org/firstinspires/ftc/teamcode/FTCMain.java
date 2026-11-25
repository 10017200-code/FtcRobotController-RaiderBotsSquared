package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedRGBA;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.SwitchableLight;

import org.firstinspires.ftc.robotcore.external.Telemetry;

@Autonomous(name="RBotsSqrd", group="Robot")
public class FTCMain extends LinearOpMode
{
    public void runMotor(DcMotor motor, boolean fw, double speed, int duration)
    {
        //Since this is supposed to be Java 8, I cant use enhanced switches
        if (fw)
        {
            motor.setDirection(DcMotor.Direction.FORWARD);
        }
        else
        {
            motor.setDirection(DcMotor.Direction.REVERSE);
        }

        telemetry.addData("Method", "runMotor() commencing now.");
        telemetry.update();

        //Setting the speed
        motor.setPower(speed);
        //Simpler than I thought
        sleep(duration);
        motor.setPower(0);
        telemetry.addData("FinishMethod", "runMotor() finished.");
        telemetry.update();
    }

    @Override
    public void runOpMode()
    {

    }
}