package frc.robot.subsystem;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.command.DrivetrainTeleop;

public class Drivetrain extends Subsystem {

    private TalonSRX frontLeft;
    private TalonSRX frontRight;
    private TalonSRX backLeft;
    private TalonSRX backRight;

    public Drivetrain() {
        this.frontLeft = new TalonSRX(RobotMap.DRIVETRAIN_FRONT_LEFT_PORT);
        this.frontRight = new TalonSRX(RobotMap.DRIVETRAIN_FRONT_RIGHT_PORT);
        this.backLeft = new TalonSRX(RobotMap.DRIVETRAIN_BACK_LEFT_PORT);
        this.backRight = new TalonSRX(RobotMap.DRIVETRAIN_BACK_RIGHT_PORT);
    }

    public void tankDrive(double leftValue, double rightValue) {
        frontLeft.set(ControlMode.PercentOutput, leftValue);
        frontRight.set(ControlMode.PercentOutput, rightValue);
        backLeft.set(ControlMode.PercentOutput, leftValue);
        backRight.set(ControlMode.PercentOutput, rightValue);
    }

    public void arcadeDrive(double throttleValue, double turnValue) {
        double leftMotor = -(throttleValue / 1.2) + (turnValue / 2.0);
		double rightMotor = -(throttleValue / 1.2) - (turnValue / 2.0);

		frontLeft.set(ControlMode.PercentOutput, leftMotor);
		frontRight.set(ControlMode.PercentOutput, -rightMotor);
    }

    @Override
    protected void initDefaultCommand() {
		setDefaultCommand(new DrivetrainTeleop());
	}
 
}