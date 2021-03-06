package org.firstinspires.ftc.teamcode.gamecode;

import org.firstinspires.ftc.teamcode.opmodesupport.TeleOpMode;
import org.firstinspires.ftc.teamcode.robots.Robot;

/**
 * Created by Windows on 2016-01-30.
 */
public class DriveAcross extends TeleOpMode {

    Robot rob;
    int stage = 0;

    @Override
    public void initialize() {
        rob = new Robot();
    }

    @Override
    public void loopOpMode() {
        if (stage == 0) {
            clearTimer();
            stage++;
        } else if (stage == 1 && getMilliSeconds() > 10000) {
            rob.forwardDistance(2800, 0.5);
            stage++;
        } else if (stage == 2 && rob.allReady()) {
            rob.halt();
            stage++;
        }//else
    }
}
