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
    AlertDialog alertDialog;

    View cardView;

    TextView titleTV ;
    TextView messageTV ;
    Button cancelButton ;
    Button sendButton ;

    public SiemensDialog(@NonNull Context context) {
        super( context );
        this.context = context;
        inflate( context, R.layout.card_view_layout, null );
    }

    public SiemensDialog setView(){
        cardView = LayoutInflater.from( context ).inflate( R.layout.card_view_layout, null );
        return this;
    }

    public SiemensDialog setTitle(String title){
        if(!title.isEmpty()){
            titleTV = cardView.findViewById( R.id.titleTv );
            titleTV.setVisibility( VISIBLE );
            titleTV.setText( title );
        }
        return this;
    }

    public SiemensDialog setMessage(String message){
        if (!message.isEmpty()){
            messageTV = cardView.findViewById( R.id.messagetv );
            messageTV.setVisibility( VISIBLE );
            messageTV.setText( message );

        }
        return this;
    }

    public SiemensDialog setCancelButton(String cancelButtonText, OnClickListener onClickListener){
        if (!cancelButtonText.isEmpty()){
            cancelButton = cardView.findViewById( R.id.cancelbutton );
            cancelButton.setVisibility( VISIBLE );
            cancelButton.setText( cancelButtonText );
            cancelButton.setOnClickListener( onClickListener );

        }
        return this;
    }

    public SiemensDialog setSendButton(String sendButtonText, OnClickListener onClickListener){
        if (!sendButtonText.isEmpty()){
            sendButton = cardView.findViewById( R.id.sendButton );
            sendButton.setVisibility( VISIBLE );
            sendButton.setText( sendButtonText );
            sendButton.setOnClickListener( onClickListener );

        }
        return this;
    }

    public void build(){
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
