package frc.robot.command;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class DrivetrainTeleop extends Command {

    public DrivetrainTeleop() {
        requires(Robot.getDrivetrain());
    }

    @Override
    protected void execute() {
        Robot.getDrivetrain().tankDrive(Robot.getController().getJoystickLeftX(), Robot.getController().getJoystickRightX());
    }   
    
    @Override
    protected boolean isFinished() {
        return false;
    }
}