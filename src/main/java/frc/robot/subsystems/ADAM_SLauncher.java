// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class ADAM_SLauncher extends SubsystemBase {
  private final CANSparkMax flyWheel1 = new CANSparkMax(5, MotorType.kBrushless);
  private final CANSparkMax flyWheel2 = new CANSparkMax(6, MotorType.kBrushless);


  public ADAM_SLauncher() {
    flyWheel2.setInverted(true);
  }

  public void motor(double input) {
    flyWheel1.set(input);
    flyWheel2.set(input);
  }
}
