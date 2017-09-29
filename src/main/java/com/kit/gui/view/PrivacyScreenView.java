package com.kit.gui.view;

import com.kit.Application;
import com.kit.gui.controller.PrivacyScreenController;

import javax.swing.*;
import java.awt.*;

/**
 */
public class PrivacyScreenView extends JPanel {
    private PrivacyScreenController privacyScreenController;
    private final JPanel panel;

    public PrivacyScreenView(PrivacyScreenController privacyScreenController) {
        this.privacyScreenController = privacyScreenController;

        setMinimumSize(new Dimension(800, 480));
        setPreferredSize(new Dimension(800, 480));
        setLayout(new BorderLayout());

        panel = new JPanel(new BorderLayout());
        panel.setPreferredSize(new Dimension(762, 503));
        panel.setBackground(Application.COLOUR_SCHEME.getDark());

        setLayout(new BorderLayout());
        add(panel, BorderLayout.EAST);
    }

    public void show(PrivacyScreenView view) {
       view.show();
    }
}
