package frc.team3128;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.team3128.commands.TestCmd;
//import frc.team3128.commands.TestDrive;
import frc.team3128.hardware.input.NAR_Joystick;
import frc.team3128.subsystems.TestBenchMotor;
import frc.team3128.subsystems.TestBenchPiston;
import frc.team3128.utility.Log;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a "declarative" paradigm, very little robot logic should
 * actually be handled in the {@link Robot} periodic methods (other than the
 * scheduler calls). Instead, the structure of the robot (including subsystems,
 * commands, and button mappings) should be declared here.
 */
public class RobotContainer {

    //private NAR_Drivetrain m_drive;
    private NAR_Joystick m_rightStick;

    private TestBenchMotor motor;

    private CommandScheduler m_commandScheduler = CommandScheduler.getInstance();
    private Command auto;

    private boolean DEBUG = false;

    public RobotContainer() {

        //m_drive = NAR_Drivetrain.getInstance();
        motor = new TestBenchMotor();

        //Enable all PIDSubsystems so that useOutput runs

        m_rightStick = new NAR_Joystick(1);
        m_commandScheduler.setDefaultCommand(motor, new TestCmd(motor, m_rightStick::getY));

        configureButtonBindings();
        dashboardInit();
    }   

    private void configureButtonBindings() {
        Log.info("Configuring button bindings", "called method lets goooo");
    }

    private void dashboardInit() {
        if (DEBUG) {
            SmartDashboard.putData("CommandScheduler", CommandScheduler.getInstance());
            //SmartDashboard.putData("Drivetrain", m_drive);
        }
            
    }

    public void stopDrivetrain() {
        //m_drive.stop();
    }

    public Command getAutonomousCommand() {
        return auto;
    }
}
