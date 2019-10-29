package frc.robot.subsystem;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

import frc.robot.command.ArmTeleop;

public class Arm extends Subsystem {
    
    private TalonSRX leftPivot;
    private TalonSRX rightPivot;
    private TalonSRX leftLateral;
    private TalonSRX rightLateral;
     
    public Arm() {
        this.leftPivot = new TalonSRX(RobotMap.ARM_LEFT_PIVOT);
        this.rightPivot = new TalonSRX(RobotMap.ARM_RIGHT_PIVOT);
        this.leftLateral = new TalonSRX(RobotMap.ARM_LEFT_LATERAL);
        this.rightLateral = new TalonSRX(RobotMap.ARM_RIGHT_LATERAL);
    }

    public void pivot(double speed, int direction) {
        leftPivot.set(ControlMode.PercentOutput, speed * direction);
        rightPivot.set(ControlMode.PercentOutput, speed * -direction);
    }
    
    public void lateral(double speed, int direction) {
        rightLateral.set(ControlMode.PercentOutput, speed * direction);
        leftLateral.set(ControlMode.PercentOutput, speed * -direction);
    }

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new ArmTeleop());
	}

}
