package com.derveljun.tuiexample.tui;

import jexer.TApplication;

public class MainUi extends TApplication {

    public MainUi() throws Exception {
        super(BackendType.SWING);

        addToolMenu();
        addFileMenu();
        addWindowMenu();
    }

    public static void main(String[] args) throws Exception {
        new MainUi().run();
    }

}
