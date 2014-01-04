package com.wildstangs.subsystems.intro;

import com.wildstangs.subjects.base.IObserver;
import com.wildstangs.subjects.base.Subject;
import com.wildstangs.subsystems.base.WsSubsystem;

/**
 *
 * @author Joey
 */
public class IntroDriveBase extends WsSubsystem implements IObserver {


    public IntroDriveBase(String name) {
        super(name);

       // registerForJoystickButtonNotification(WsJoystickAxisEnum.);
    }

    public void update() {
        super.update(); 
    }
    

    public void acceptNotification(Subject subjectThatCaused) {

    }
}
