package org.richit.library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import org.richit.siemenscardviewlibrary.CardViewClass;

public class MainActivity extends AppCompatActivity {

    CardViewClass cardViewClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        cardViewClass = new CardViewClass( this );
        cardViewClass.makeAlertDialog( this );
    }
}
