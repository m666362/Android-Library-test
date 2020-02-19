package org.richit.library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.richit.siemenscardviewlibrary.CardViewClass;

public class MainActivity extends AppCompatActivity {

    CardViewClass cardViewClass;
    EditText titleEditText;
    EditText messageEditText;
    EditText button1EditText;
    EditText button2EditText;
    String title;
    String message;
    String button1;
    String button2;

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
        title = titleEditText.getText().toString();
        message = messageEditText.getText().toString();
        button1 = button1EditText.getText().toString();
        button2 = button2EditText.getText().toString();
        if (title.isEmpty() && message.isEmpty() && button1.isEmpty() && button2.isEmpty()){
            Toast.makeText( this, "Nothing to show", Toast.LENGTH_SHORT ).show();
        }else {
            cardViewClass.makeAlertDialog( this, "" + title, "" + message, "" + button1, "" + button2, new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cardViewClass.dismissAlertDialog();
                }
            }, new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cardViewClass.makeToast();
                }
            } );
        }

    }
}
