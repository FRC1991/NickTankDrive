package org.usfirst.frc1991.test.commands;



import org.usfirst.frc1991.test.Robot;
import org.usfirst.frc1991.test.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TankDrive extends Command {

    public TankDrive() {
        // Use requires() here to declare subsystem dependencies
    	requires(Robot.drivetrain);
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	double speedL = Robot.oi.joystick1.getRawAxis(1);
    	double speedR = Robot.oi.joystick1.getRawAxis(5);
    	RobotMap.drivetrainSpeedController1.set(speedL);
    	RobotMap.drivetrainSpeedController2.set(speedL);
    	RobotMap.drivetrainSpeedController3.set(speedL);
    	RobotMap.drivetrainSpeedController4.set(speedR);
    	RobotMap.drivetrainSpeedController5.set(speedR);
    	RobotMap.drivetrainSpeedController6.set(speedR);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
