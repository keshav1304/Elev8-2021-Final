// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IntakeSubsystem extends SubsystemBase {

private final WPI_TalonSRX intake;
private final WPI_VictorSPX kickup;

  /** Creates a new ShooterSubsystem. */
  public IntakeSubsystem() {
    intake = new WPI_TalonSRX(Constants.intakePort);
    kickup = new WPI_VictorSPX(Constants.kickupPort);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void intake(double y){
    intake.set(y);
  }

  public void kickup(double y){
    kickup.set(y);
  }
}