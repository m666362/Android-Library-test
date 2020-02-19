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

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

public class CardViewClass extends CardView{

    Context context;
    String title;
    String message;
    String button1;
    String button2;

    public CardViewClass(@NonNull Context context, String title, String message, String button1, String button2) {
        super( context );
        inflate( context, R.layout.card_view_layout, null );
        this.title = title;
        this.message = message;
        this.button1 = button1;
        this.button2 = button2;
    }



    public CardViewClass(@NonNull Context context, @Nullable AttributeSet attrs) {
        super( context, attrs );
    }

    public CardViewClass(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super( context, attrs, defStyleAttr );
    }

    public void makeAlertDialog(Context context){
        View cardView = LayoutInflater.from( context ).inflate( R.layout.card_view_layout, null );
        TextView textView = cardView.findViewById( R.id.messagetv );
        TextView titleTV = cardView.findViewById( R.id.titleTv );
        Button cancelButton = cardView.findViewById( R.id.cancelbutton );
        Button sendButton = cardView.findViewById( R.id.sendButton );
        AlertDialog alertDialog = new AlertDialog.Builder( context )
                .setView( cardView )
                .show();

        alertDialog.getWindow().setBackgroundDrawable( new ColorDrawable( Color.TRANSPARENT ) );
    }

}
