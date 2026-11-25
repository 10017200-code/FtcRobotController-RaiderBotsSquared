package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
//We will need Servo, so ignore this warning.
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="ControllerDrive", group="Robot")
public class ControllerDrive extends LinearOpMode
{
    //You guys should be glad I did it this way.
    //TODO:
    //Fix this. We set everything here to a DcMotor wile some are servos and other things.
    //That WILL take a long time.
    private DcMotor flDrive, frDrive, blDrive, brDrive = null;
    private DcMotor pollenGate, nectarGate, pollenShooterGate, nectarShooterGate = null;
    private DcMotor pollenShooter, nectarShooter, rampLift, intakeLift = null;
    private DcMotor genServo1, genServo2, genMotor1, genMotor2, genMotor3, genMotor4 = null;
    private DcMotor rampWheelChain, intakeChain, izc1, izc2, izc3, odometerPinPointComputer = null;

    @Override
    public void runOpMode()
    {
        //TODO:
        //Replace deviceName with actual names
        //Make all vars
        //EXPANSION HUB
        flDrive =                   hardwareMap.get(DcMotor.class, "drive_frontleft");
        frDrive =                   hardwareMap.get(DcMotor.class, "drive_frontright");
        blDrive =                   hardwareMap.get(DcMotor.class, "drive_backleft");
        brDrive =                   hardwareMap.get(DcMotor.class, "drive_backright");
        pollenGate =                hardwareMap.get(DcMotor.class, "gate_pollen");
        nectarGate =                hardwareMap.get(DcMotor.class, "gate_nectar");
        rampLift =                  hardwareMap.get(DcMotor.class, "lift_ramp");
        intakeLift =                hardwareMap.get(DcMotor.class, "lift_intake");
        genServo1 =                 hardwareMap.get(DcMotor.class, "gen_servo1");
        genServo2 =                 hardwareMap.get(DcMotor.class, "gen_servo2");

        //CONTROL HUB
        nectarShooterGate =         hardwareMap.get(DcMotor.class, "sgate_nectar");
        pollenShooterGate =         hardwareMap.get(DcMotor.class, "sgate_pollen");
        nectarShooter =             hardwareMap.get(DcMotor.class, "shooter_nectar");
        pollenShooter =             hardwareMap.get(DcMotor.class, "shooter_pollen");
        intakeChain =               hardwareMap.get(DcMotor.class, "chain_intake");
        rampWheelChain =            hardwareMap.get(DcMotor.class, "chain_rampwheel");
        izc1 =                      hardwareMap.get(DcMotor.class, "izc_one");
        odometerPinPointComputer =  hardwareMap.get(DcMotor.class, "izc_odometerpinpoint");
        izc2 =                      hardwareMap.get(DcMotor.class, "izc_two");
        izc3 =                      hardwareMap.get(DcMotor.class, "izc_three");
        genMotor1 =                 hardwareMap.get(DcMotor.class, "gen_motor1");
        genMotor2 =                 hardwareMap.get(DcMotor.class, "gen_motor2");
        genMotor3 =                 hardwareMap.get(DcMotor.class, "gen_motor3");
        genMotor4 =                 hardwareMap.get(DcMotor.class, "gen_motor4");

        //Flip side
        frDrive.setDirection(DcMotor.Direction.REVERSE);
        waitForStart();
        while (opModeIsActive())
        {
            //Up is actually -
            double d = -gamepad1.left_stick_y;
            double t = gamepad1.right_stick_x;
            flDrive.setPower(d + t);
            frDrive.setPower(d - t);
        }
        //TODO:
        //Get other controls in here
    }
}
