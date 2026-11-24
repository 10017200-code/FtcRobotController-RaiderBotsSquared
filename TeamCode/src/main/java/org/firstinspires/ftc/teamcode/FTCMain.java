package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedRGBA;
import com.qualcomm.robotcore.hardware.SwitchableLight;

@Autonomous(name="Robot: Auto Drive To Line", group="Robot")
@Disabled
public class FTCMain extends LinearOpMode
{
    //Pretty sure these declare the motors
    private DcMotor         leftDrive   = null;
    private DcMotor         rightDrive  = null;

    //I dont thnik we will need the sensor, but i will still include this
    NormalizedColorSensor colorSensor;

    //Maybe the speed?
    static final double     APPROACH_SPEED  = 0.25;

    @Override
    public void runOpMode()
    {
        //I am guessing this is the motors, this example only has 2, not 4
        leftDrive  = hardwareMap.get(DcMotor.class, "left_drive");
        rightDrive = hardwareMap.get(DcMotor.class, "right_drive");

        //IMPORTANT! We can use a switch to set the direction according to the direction parameter of runWheels!
        //                                       REVERSE if backwards
        leftDrive.setDirection(DcMotor.Direction.FORWARD);
        rightDrive.setDirection(DcMotor.Direction.FORWARD);

        while (opModeInInit())
        {
            telemetry.addData("Status", "Ready to move forwards");
        }

        //Set speed?
        leftDrive.setPower(APPROACH_SPEED);
        rightDrive.setPower(APPROACH_SPEED);

        //Now i know for sure that this stops the motors.
        //We can use basic Java functions for running motors for a timeframe
        leftDrive.setPower(0);
        rightDrive.setPower(0);
    }
}

//TODO:
//Understand this, and phase it into my concept.
//Also, improve comments :]