package org.firstinspires.ftc.teamcode;
package java.math;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.hardware.ColorSensor;

ColorSensor sensorColor;

public class HoloX{
  public HoloX(){
  
  }
  sensorColor = hardwareMap.get(ColorSensor.class, "sensor_color_distance");
  public void moveRobot(int direction, int speed){
    robot.mtrBL.setPower(-(Math.cos(direction - directionFix) * (speed/100)));
    robot.mtrFR.setPower(Math.cos(direction - directionFix) * (speed/100));
    robot.mtrBR.setPower(-(Math.sin(direction - directionFix) * (speed/100)));
    robot.mtrFL.setPower(math.sin(direction - directionFix) * (speed/100));
  } 
  public int triggerRead (String trigger, int min, int max){
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
  
  public boolean isRed(int thresh){
    if (sensorColor.red > thresh){
      return true;
    }
    else {
      return false
    }
  }
  
  public int stickRead (String stick, String value, int min, int max,){
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
  
  public int getStickAngle(String stick){
        return (Math.atan2(stickRead(stick, x, -1, 1), stickRead(stick, y, -1, 1) * (180 / Math.PI));
  }
  
  
}
