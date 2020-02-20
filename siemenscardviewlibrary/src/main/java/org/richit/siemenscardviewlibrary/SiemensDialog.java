package org.richit.siemenscardviewlibrary;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

public class SiemensDialog extends CardView {

    Context context;
    String titleText;
    String messageText;
    String sendButtonText;
    String cancelButtonText;
    AlertDialog alertDialog;

    public SiemensDialog(@NonNull Context context, String title, String message, String sendButtonText, String cancelButtonText) {
        super( context );
        inflate( context, R.layout.card_view_layout, null );
        this.titleText = title;
        this.messageText = message;
        this.sendButtonText = sendButtonText;
        this.cancelButtonText = cancelButtonText;
    }

    public SiemensDialog(@NonNull Context context) {
        super( context );
        this.context = context;
        inflate( context, R.layout.card_view_layout, null );
    }


    public SiemensDialog(@NonNull Context context, @Nullable AttributeSet attrs) {
        super( context, attrs );
    }

    public SiemensDialog(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super( context, attrs, defStyleAttr );
    }

    public void makeAlertDialog(Context context, String title, String message, String button1, String button2, OnClickListener button1onClickListener, OnClickListener button2onClickListener) {

        View cardView = LayoutInflater.from( context ).inflate( R.layout.card_view_layout, null );

        TextView titleTV = cardView.findViewById( R.id.titleTv );
        TextView messageTV = cardView.findViewById( R.id.messagetv );
        Button cancelButton = cardView.findViewById( R.id.cancelbutton );
        Button sendButton = cardView.findViewById( R.id.sendButton );

        titleTV.setText( "" + title );
        if (title.isEmpty())
            titleTV.setVisibility( GONE );

        messageTV.setText( "" + message );
        if (message.isEmpty())
            messageTV.setVisibility( GONE );

        cancelButton.setText( "" + button1 );
        if (button1.isEmpty())
            cancelButton.setVisibility( GONE );

        sendButton.setText( "" + button2 );
        if (button2.isEmpty())
            sendButton.setVisibility( GONE );

        cancelButton.setOnClickListener( button1onClickListener );
        sendButton.setOnClickListener( button2onClickListener );

        alertDialog = new AlertDialog.Builder( context )
                .setView( cardView )
                .show();

        alertDialog.getWindow().setBackgroundDrawable( new ColorDrawable( Color.TRANSPARENT ) );
    }

    public void dismissAlertDialog() {
        alertDialog.dismiss();
    }

    public void makeToast() {
        Toast.makeText( context, "Your data has been saved", Toast.LENGTH_SHORT ).show();
        dismissAlertDialog();
    }
}
