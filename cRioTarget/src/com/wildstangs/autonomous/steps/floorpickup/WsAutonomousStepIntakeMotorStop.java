package com.wildstangs.autonomous.steps.floorpickup;

import com.wildstangs.autonomous.WsAutonomousStep;
import com.wildstangs.inputmanager.base.WsInputManager;
import com.wildstangs.inputmanager.inputs.joystick.WsJoystickButtonEnum;
import com.wildstangs.subjects.base.BooleanSubject;
import com.wildstangs.subjects.base.Subject;
import com.wildstangs.subsystems.WsFloorPickup;
import com.wildstangs.subsystems.base.WsSubsystemContainer;

/**
 *
 * @author Liam
 */
public class WsAutonomousStepIntakeMotorStop extends WsAutonomousStep {

    public void initialize() {
        WsFloorPickup subsystem = (WsFloorPickup) (WsSubsystemContainer.getInstance().getSubsystem(WsSubsystemContainer.WS_FLOOR_PICKUP));
        Subject forwardSubject = WsInputManager.getInstance().getOiInput(WsInputManager.MANIPULATOR_JOYSTICK).getSubject(WsJoystickButtonEnum.MANIPULATOR_BUTTON_5);
        Subject backSubject = WsInputManager.getInstance().getOiInput(WsInputManager.MANIPULATOR_JOYSTICK).getSubject(WsJoystickButtonEnum.MANIPULATOR_BUTTON_7);
        BooleanSubject forwardButton = (BooleanSubject) forwardSubject;
        BooleanSubject backButton = (BooleanSubject) backSubject;

        forwardButton.setValue(false);
        backButton.setValue(false);
        finished = true;

    }

    public void update() {
    }

    public String toString() {
        return "turning off motors for floor pickup";
    }
}
