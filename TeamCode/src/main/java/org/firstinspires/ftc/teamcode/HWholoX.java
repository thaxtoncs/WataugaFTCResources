package org.firstinspires.ftc.team8190.Holo;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;
import org.firstinspires.ftc.robotcore.external.navigation.Acceleration;

// Hardware config for HoloX Drive
public class HWholoX
{
    // Public OpMode members
    public DcMotor mtrFR = null;
    public DcMotor mtrFL = null;
    public DcMotor mtrBR = null;
    public DcMotor mtrBL = null;
    public DcMotor mtrLift = null
    public Servo rightClaw = null;
    public Servo leftClaw = null;
    public Servo level = null;

    // Local OpMode members
    HardwareMap hwMap = null;
    private ElapsedTime period = new ElapsedTime();

    // Constructor
    public HWholoX() {

    }

    // Initialize standard Hardware interfaces
    public void init(HardwareMap ahwMap) {

        // Save reference to Hardware map
        hwMap = ahwMap;

        // Define and Initialize Motors
        mtrFR = hwMap.dcMotor.get("mtrFR");
        mtrFL = hwMap.dcMotor.get("mtrFL");
        mtrBR = hwMap.dcMotor.get("mtrBR");
        mtrBL = hwMap.dcMotor.get("mtrBL");
        mtrLift = hwMap.dcMotor.get("mtrLift")

        // Set all motors to run WITHOUT (or USING) encoders
        mtrFL.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        mtrFR.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        mtrBL.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        mtrBR.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        mtrLift.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        // Set all motors to zero power
        mtrFL.setPower(0);
        mtrFR.setPower(0);
        mtrBL.setPower(0);
        mtrBR.setPower(0);
        mtrLift.setPower(0);
        // Define and initialize ALL installed servos.
        rightClaw = hwMap.servo.get("right_claw");
        leftClaw = hwMap.servo.get("left_claw");
        level = hwMap.servo.get("level");
        rightClaw.setPosition(MID_SERVO);
        leftClaw.setPosition(MID_SERVO);
        level.setPosition(MID_SERVO);
    }

    public void waitForTick(long periodMs) {

        /* waitForTick implements a periodic delay. However, this acts like a metronome with a regular
         * periodic tick.  This is used to compensate for varying processing times for each cycle.
         * The function looks at the elapsed cycle time, and sleeps for the remaining time interval.
         *
         * @param periodMs  Length of wait cycle in mSec.
         */
        long remaining = periodMs - (long) period.milliseconds();

        // sleep for the remaining portion of the regular cycle period.
        if (remaining > 0) {
            try {
                Thread.sleep(remaining);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        // Reset the cycle clock for the next pass.
        period.reset();
    }
}