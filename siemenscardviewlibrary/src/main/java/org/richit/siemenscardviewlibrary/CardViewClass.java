package org.richit.siemenscardviewlibrary;

import android.app.AlertDialog;
import android.content.Context;
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
    String message;

    public CardViewClass(@NonNull Context context) {
        super( context );
        inflate( context, R.layout.card_view_layout, null );
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
        Button cancelButton = cardView.findViewById( R.id.cancelbutton );
        Button sendButton = cardView.findViewById( R.id.sendButton );
        new AlertDialog.Builder( context )
                .setTitle( "Title" )
                .setMessage( "Message" )
                .setView( cardView )
                .show();
    }

}
