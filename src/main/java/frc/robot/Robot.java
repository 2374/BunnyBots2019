package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.subsystem.Drivetrain;

public class Robot extends TimedRobot {

  private static OI oi;
  private static Drivetrain drivetrain;

  @Override
  public void robotInit() {
    this.oi = new OI();
    this.drivetrain = new Drivetrain();
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

  public static OI getOI() {
    return oi;
  }

}
