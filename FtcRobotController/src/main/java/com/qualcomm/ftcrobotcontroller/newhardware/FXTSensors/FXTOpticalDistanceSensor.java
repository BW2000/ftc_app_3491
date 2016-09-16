package com.qualcomm.ftcrobotcontroller.newhardware.FXTSensors;

import com.qualcomm.ftcrobotcontroller.RC;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by FIXIT on 15-08-23.
 */
public class FXTOpticalDistanceSensor extends FXTSensor {

    OpticalDistanceSensor opti;

    public FXTOpticalDistanceSensor(String address) {
        opti = RC.h.opticalDistanceSensor.get(address);
        sensorType = FTC_OPTIC_DIST;
        sensorName = address;
    }

    @Override
    public String toString() {
        return "" + getValue();
    }

    @Override
    public String getName() {
        return "Opti_Distance";
    }

    public double returnValue() {
        return opti.getLightDetected();
    }

    @Override
    public OpticalDistanceSensor getHardwareSensor() {
        return opti;
    }

}