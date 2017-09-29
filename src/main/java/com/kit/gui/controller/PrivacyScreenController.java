package com.kit.gui.controller;

import com.kit.gui.Controller;
import com.kit.gui.ControllerManager;
import com.kit.gui.view.PrivacyScreenView;

import javax.swing.*;

/**
 */
public class PrivacyScreenController extends Controller<PrivacyScreenView> {
    private final PrivacyScreenView view = new PrivacyScreenView(this);
    private JFrame frame;

    public PrivacyScreenController() { ControllerManager.add(PrivacyScreenController.class, this); }

    @Override
    public PrivacyScreenView getComponent() {
        return view;
    }

    public void show() {
        frame = new JFrame("Privacy Screen");
        frame.add(getComponent());
        frame.pack();
        frame.setVisible(true);
    }

}
