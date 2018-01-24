package org.firstinspires.ftc.TeamCode;
package java.math;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

public class HoloX{

  public triggerRead (String trigger, int min, int max){
    if (tirgger = "left"){
        return Range.clip(robot.gamepad1.left_trigger, min, max); 
    }
    if (trigger = "right"){
        return Range.clip(robot.gamepad1.right_trigger, min, max);
    }
    else{
        return null;
    }
  }
  
  public stickRead (String stick, String value, int min, int max,){
    if (stick = "rignt" || stick = "Right"){
        if (value = "x" || value = "X"){
            return Range.clip(robot.gamepad1.right_stick_x, min, max);
        }
        else if (value = "y" || value = "Y"){
            return Range.clip(robot.gamepad1.right_stick_y, min, max);
        }
        else{
            return null;
        }
    }
    else if (stick = "left" || stick = "Left") {
        if (value = "x" || value = "X"){
            return Range.clip(robot.gamepad1.left_stick_x, min, max);
        }
        else if (value = "y" || value = "Y"){
            return Range.clip(robot.gamepad1.left_stick_y, min, max);
        }
        else{
            return null;
        }
    }
    else{
        return null; 
    }
  }
  
  public getStickAngle(String stick){
        return (Math.atan2(stickRead(stick, x, -1, 1), stickRead(stick, y, -1, 1) * (180 / Math.PI));
  }
  
  
}
