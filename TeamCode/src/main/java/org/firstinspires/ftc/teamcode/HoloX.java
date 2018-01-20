
package org.firstinspires.ftc.robotcontroller.external.samples;
package java.math;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

public class BasicOpMode_Linear extends OpMode {
    HWholoX robot = new HWholoX();
    ModernRoboticsI2cCompassSensor compass;
    compass = hardwareMap.get(ModernRoboticsI2cCompassSensor.class, "compass");
    int Lx = null;
    int Ly = null;
    int angle = null;
    int positivePower = null;
    int negativePower = null;
}
    public void loop(){
        Lx = Range.clip(robot.gamepad1.left_stick_x, -1, 1);
        Ly = Range.clip(robot.gamepad1.left_stick_y, -1, 1);
        angle = ((Math.atan2(Ly, Lx) * (180 / Math.PI));
        positivePower = Math.cos(angle);
        negativePower = Math.sin(angle);
        robot.motorFL.setPower(positivePower);
        robot.motorBR.setPower(positivePower);
        robot.motorFR.setPower(negativePower);
        robot.motorBL.setPower(negativePower);



   }
}
