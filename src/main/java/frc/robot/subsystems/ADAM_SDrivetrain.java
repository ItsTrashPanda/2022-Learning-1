// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class ADAM_SDrivetrain extends SubsystemBase {
  private final CANSparkMax leftFront = new CANSparkMax(1, MotorType.kBrushless);
  private final CANSparkMax leftBack = new CANSparkMax(2, MotorType.kBrushless);

  private final CANSparkMax rightFront = new CANSparkMax(3, MotorType.kBrushless);
  private final CANSparkMax rightBack = new CANSparkMax(4, MotorType.kBrushless);

  public ADAM_SDrivetrain() {
    rightBack.setInverted(true);
    rightFront.setInverted(true);
  }

  public void arcadeDrive(double y, double x) {
    leftBack.set(y+x);
    leftFront.set(y+x);
    rightBack.set(y-x);
    rightFront.set(y-x);
  }

}
