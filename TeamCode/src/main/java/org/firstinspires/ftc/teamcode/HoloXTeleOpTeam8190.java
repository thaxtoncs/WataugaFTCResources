package org.firstinspires.ftc.teamcode;
package java.math;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;
@TeleOp(name = "TeleOp: HoloX Without Compass Correction", group = "TeleOp")
public class HoloXTeleOp8190 extends OpMode {
    
    // initialize the robot
    HoloX HoloX = new HoloX
    HWholoX robot = new HWholoX();
    // power of motors BL and FR
    public int positivePower;
    // power of motors BR and FL
    public int negativePower;
    // degrees to fix the forward direction
    public int directionFix = 45;
    // toggle for speed of robot
    private boolean speedToggle = true;
    //value for servo location
    private int servoLoc = 0;
    public void loop(){
        // toggle if the left joystick button is pressed
        if (robot.gamepad1.left_stick_button = true){
            speedToggle = !speedToggle;
            sleep(5);
        }
        // if the toggle is true run at full speed
        if (speedToggle = true){
            //positivePower = Math.cos(HoloX.getStickAngle(left - directionFix));
            //negativePower = Math.sin(HoloX.getStickAngle(left - directionFix));
            HoloX.moveRobot(HoloX.getStickAngle(left), 100)
        }
        // if not run at half speed
        else{
            //positivePower = Math.cos(HoloX.getStickAngle(left - directionFix)) * 0.5;
            //negativePower = Math.sin(HoloX.getStickAngle(left - directionFix)) * 0.5;
            HoloX.moveRobot(HoloX.getStickAngle(left), 50); 
        }
        if (
        // set the power for the motors
        robot.mtrLift.setPower(HoloX.stickRead(right, x, -1, 1));
        //robot.mtrFL.setPower(positivePower);
        //robot.mtrBR.setPower(-positivePower);
        //robot.mtrFR.setPower(negativePower);
        //robot.mtrBL.setPower(-negativePower);
   }
}
