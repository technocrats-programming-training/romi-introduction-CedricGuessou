// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import lib.ProceduralRobot;

import static lib.Romi.driveTime;
import static lib.Romi.turnTime;


public class Robot extends ProceduralRobot {
  @Override
  public void autonomousProcedure() throws InterruptedException {
    // Write your code here:
    System.out.println("First movement phase: ");
    driveTime(0.6, 2);
    System.out.println("End of first movement phase!");
    sleepSeconds(1);
    System.out.println("First rotation phase: ");
    turnTime(.2, 2);
    System.out.println("End of first rotation phase!");
    sleepSeconds(.7);
    System.out.println("Second movement phase: ");
    driveTime(0.4, 5);
    System.out.println("End of second movement phase!");
    sleepSeconds(1);
    System.out.println("Second rotation phase: ");
    turnTime(0.175, 2);
    System.out.println("End of second rotation phase!");
    sleepSeconds(.7);
    System.out.println("Third movement phase: ");
    driveTime(0.5, 4);
    System.out.println("End of third movement phase!");
    sleepSeconds(3);
    System.out.println("VICTORY SPIN!!!");
    turnTime(0.7, 3);
    turnTime(-0.7, 4);
    System.out.println("Thank you!");

  }
}
