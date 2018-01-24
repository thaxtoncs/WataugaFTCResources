package org.firstinspires.ftc.teamcode;
package java.math;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;
@TeleOp(name = "TeleOp: HoloX Without Compass Correction", group = "TeleOp")
public class HoloXTeleOp extends OpMode {
    
    // initialize the robot
    HWholoX robot = new HWholoX();
    // power of motors BL and FR
    int positivePower;
    // power of motors BR and FL
    int negativePower;
    // degrees to fix the forward direction
    int directionFix = 45;
    // toggle for speed of robot
    boolean speedToggle = true;
    public void loop(){
        // toggle if the left joystick button is pressed
        if (robot.gamepad1.left_stick_button = true){
            speedToggle = !speedToggle;
            sleep(5);
        }
        // if the toggle is true run at full speed
        if (speedToggle = true){
            positivePower = Math.cos(HoloX.getStickAngle(left) + directionFix);
            negativePower = Math.sin(HoloX.getStickAngle(left) + directionFix);
        }
        // if not run at half speed
        else{
            positivePower = Math.cos(HoloX.getStickAngle(left) + directionFix) * 0.5;
            negativePower = Math.sin(HoloX.getStickAngle(left) + directionFix) * 0.5;
        }
        // set the power for the motors
        robot.motorFL.setPower(positivePower);
        robot.motorBR.setPower(-positivePower);
        robot.motorFR.setPower(negativePower);
        robot.motorBL.setPower(-negativePower);
   }
}