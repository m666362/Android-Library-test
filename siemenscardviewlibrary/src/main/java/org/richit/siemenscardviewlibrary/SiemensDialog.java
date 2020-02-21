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

    View cardView;
    TextView titleTV ;
    TextView messageTV ;
    Button cancelButton ;
    Button sendButton ;

    AlertDialog alertDialog;

    public SiemensDialog(@NonNull Context context) {
        super( context );
        this.context = context;
        inflate( context, R.layout.card_view_layout, null );
    }

    public SiemensDialog setView(){
        cardView = LayoutInflater.from( context ).inflate( R.layout.card_view_layout, null );
        return this;
    }

    public SiemensDialog setTitle(String title,int color){
        if(!title.isEmpty()){
            titleTV = cardView.findViewById( R.id.titleTv );
            titleTV.setVisibility( VISIBLE );
            titleTV.setText( title );
            titleTV.setTextColor( color );
        }
        return this;
    }

    public SiemensDialog setMessage(String message,int color){
        if (!message.isEmpty()){
            messageTV = cardView.findViewById( R.id.messagetv );
            messageTV.setVisibility( VISIBLE );
            messageTV.setText( message );
            messageTV.setTextColor( color );
        }
        return this;
    }

    public SiemensDialog setCancelButton(String cancelButtonText,int color, OnClickListener onClickListener){
        if (!cancelButtonText.isEmpty()){
            cancelButton = cardView.findViewById( R.id.cancelbutton );
            cancelButton.setVisibility( VISIBLE );
            cancelButton.setText( cancelButtonText );
            cancelButton.setTextColor( color );
            cancelButton.setOnClickListener( onClickListener );

        }
        return this;
    }

    public SiemensDialog setSendButton(String sendButtonText,int color,  OnClickListener onClickListener){
        if (!sendButtonText.isEmpty()){
            sendButton = cardView.findViewById( R.id.sendButton );
            sendButton.setVisibility( VISIBLE );
            sendButton.setText( sendButtonText );
            sendButton.setTextColor( color );
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
