package frc.team3128.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.team3128.infrastructure.NAR_EMotor;
import frc.team3128.hardware.motorcontroller.NAR_TalonFX;

public class TestBenchMotor extends SubsystemBase {
    private NAR_EMotor motor = new NAR_TalonFX(2);

    public TestBenchMotor() {}

    public void run() {
        motor.set(0.5);
    }

    public void stop() {
        motor.set(0);
    }

    public void set(double e) {
        motor.set(e);
    }
    
}
