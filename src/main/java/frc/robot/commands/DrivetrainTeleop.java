package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class DrivetrainTeleop extends Command {

    public DrivetrainTeleop() {
        requires(Robot.getDrivetrain());
    }

    @Override
    protected void execute() {
        Robot.getDrivetrain().tankDrive(Robot.getOI().getJoystickLeftX(), Robot.getOI().getJoystickRightX());
    }   
    
    @Override
    protected boolean isFinished() {
        return false;
    }
}