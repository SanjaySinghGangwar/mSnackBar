package com.theaverageguy.msnackbar;

import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class mSnackBar {
    public static void show(View view, String message) {
        Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_LONG);
        snackbar.show();
    }

    public static void showWithActionMessage(View view, String message, String actionMessage) {
        Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_LONG)
                .setAction(actionMessage, viewMe -> {
                });
        snackbar.show();
    }

    public static void custom(View view, String message, int BackgroundColor) {
        Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_LONG);
        View sbView = snackbar.getView();
        sbView.setBackgroundColor(BackgroundColor);
        snackbar.show();
    }


    public static void customWithAction(View view, String message, int BackgroundColor, String actionMessage, int actionTextColor) {
        Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_LONG)
                .setAction(actionMessage, viewMe -> {
                });
        snackbar.setActionTextColor(actionTextColor);
        View sbView = snackbar.getView();
        sbView.setBackgroundColor(BackgroundColor);
        snackbar.show();
    }

}
