package frc.robot.command;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class ArmTeleop extends Command {
    public ArmTeleop() {
        requires(Robot.getArm());
    }
    @Override
    protected void execute() {
        if (Robot.getController().getLeftBumper() ) {
            Robot.getArm().pivot(RobotMap.SPEED_ARM_PIVOT, 1); // move pivot upwards
        } else if (Robot.getController().getRightBumper()) {
            Robot.getArm().pivot(RobotMap.SPEED_ARM_PIVOT, -1); // move pivot downwards
        } else if (Robot.getController().getLeftTrigger() > 0.0) {
            Robot.getArm().lateral(RobotMap.SPEED_ARM_LATERAL, 1); // move both inwards 
        } else if (Robot.getController().getRightTrigger() > 0.0) {
            Robot.getArm().lateral(RobotMap.SPEED_ARM_LATERAL, -1); // move both outwards
        } else {
            Robot.getArm().pivot(0.0, 1);
            Robot.getArm().lateral(0.0, 1);
            // no input given, MUST HAVE
        }
    }

    @Override
    protected boolean isFinished() {
        return false; 
    }
}

