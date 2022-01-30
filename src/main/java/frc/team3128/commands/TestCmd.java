package frc.team3128.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.team3128.subsystems.TestBenchMotor;

public class TestCmd extends CommandBase {
    
    TestBenchMotor t;
    DoubleSupplier ds;

    public TestCmd(TestBenchMotor m, DoubleSupplier f) {
        t = m;
        ds = f;
        addRequirements(t);
    }

    @Override
    public void execute() {
        t.set(ds.getAsDouble());
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
