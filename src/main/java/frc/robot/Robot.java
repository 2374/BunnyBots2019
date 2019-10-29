package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.subsystem.Arm;
import frc.robot.subsystem.Drivetrain;

public class Robot extends TimedRobot {

  private static OI oi;
  private static Drivetrain drivetrain;
  private static Arm arm;

  @Override
  public void robotInit() {
    this.oi = new OI();
    this.drivetrain = new Drivetrain();
    this.arm = new Arm();
  }

  @Override
  public void robotPeriodic() {

  }

  @Override
  public void teleopPeriodic() {

  }

  @Override
  public void autonomousInit() {

  }

  @Override
  public void autonomousPeriodic() {

  }

  @Override
  public void testPeriodic() {

  }

  public static Drivetrain getDrivetrain() {
    return drivetrain;
  }

  public static OI getController() {
    return oi;
  }

  public static Arm getArm() {
    return arm;
  }

}
