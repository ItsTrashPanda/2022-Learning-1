// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;

public class RILEY_Drivetrain extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private final PWMSparkMax leftMotor = new PWMSparkMax(0);
  private final PWMSparkMax rightMotor = new PWMSparkMax(1);

  public RILEY_Drivetrain() {
    rightMotor.setInverted(true);
  }

  public void arcadeDrive(double y, double x) {
      leftMotor.set(y + x);
      rightMotor.set(y - x);
  }
  @Override
  public void periodic()
  {

  }
  @Override
  public void simulationPeriodic()
  {

  }
}
