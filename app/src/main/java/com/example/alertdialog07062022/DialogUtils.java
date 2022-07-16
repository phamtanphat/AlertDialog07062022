package com.example.alertdialog07062022;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RatingBar;
import android.widget.TextView;

/**
 * Created by pphat on 7/16/2022.
 */
public class DialogUtils {

    public static void openRatingDialog(Context context, EventListenerRatingDialog eventDialog) {
        Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.layout_dialog_rating);
        dialog.setCancelable(false);

        Window window = dialog.getWindow();

        // Set Position dialog
        WindowManager.LayoutParams layoutParams = window.getAttributes();
        layoutParams.gravity = Gravity.CENTER;

        // Set width and height
        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);

        TextView neverButton = dialog.findViewById(R.id.text_view_never_button);
        TextView maybeLaterButton = dialog.findViewById(R.id.text_view_maybe_later_button);
        RatingBar ratingBar = dialog.findViewById(R.id.rating_bar);

        neverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eventDialog.onClickNeverButton();
                dialog.dismiss();
            }
        });

        maybeLaterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eventDialog.onClickMaybeLaterButton();
                dialog.dismiss();
            }
        });

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float value, boolean b) {
                eventDialog.onRatingChanged(value);
            }
        });

        dialog.show();
    }

    public interface EventListenerRatingDialog {
        void onClickNeverButton();
        void onClickMaybeLaterButton();
        void onRatingChanged(float rating);
    }
}
