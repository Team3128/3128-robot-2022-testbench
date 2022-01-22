package frc.team3128.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.team3128.common.hardware.motor.NAR_TalonSRX;
import frc.team3128.common.infrastructure.NAR_EMotor;

public class TestBenchMotor extends SubsystemBase {
    private NAR_EMotor motor = new NAR_TalonSRX(11);

    public TestBenchMotor() {}

    public void run() {
        motor.set(0.5);
    }

    public void stop() {
        motor.set(0);
    }
    
}
