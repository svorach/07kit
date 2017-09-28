package com.kit.gui.controller;

import com.google.common.reflect.TypeToken;
import com.kit.gui.Controller;
import com.kit.gui.view.GalleryView;
import com.kit.api.Screen;
import com.kit.core.model.Container;
import com.kit.gui.Controller;
import com.kit.gui.ControllerManager;
import com.kit.gui.view.PrivacyScreenView;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 */
public class PrivacyScreenController extends Controller<PrivacyScreenView> {
    private final PrivacyScreenView view = new PrivacyScreenView(this);
    private JFrame frame;

    public PrivacyScreenController() {
        ControllerManager.add(PrivacyScreenController.class, this);
    }

    @Override
    public PrivacyScreenView getComponent() {
        return view;
    }

    public void show() {
        //view.reload();
        frame = new JFrame("Privacy Screen");
        frame.add(getComponent());
        frame.pack();
        frame.setVisible(true);
    }
}
