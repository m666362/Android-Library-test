package org.richit.library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import org.richit.siemenscardviewlibrary.CardViewClass;

public class MainActivity extends AppCompatActivity {

    CardViewClass cardViewClass;
    EditText titleEditText;
    EditText messageEditText;
    EditText button1EditText;
    EditText button2EditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        initObject();

    }

    private void initObject() {

        cardViewClass = new CardViewClass( this );
        titleEditText = findViewById( R.id.titleET);
        messageEditText = findViewById( R.id.messageET);
        button1EditText = findViewById( R.id.button1Et);
        button2EditText = findViewById( R.id.button2ET );
    }

    public void showDialogButton(View view) {
        cardViewClass.makeAlertDialog( this );
    }
}
