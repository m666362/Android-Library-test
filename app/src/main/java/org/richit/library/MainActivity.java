package org.richit.library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.richit.siemenscardviewlibrary.SiemensDialog;

public class MainActivity extends AppCompatActivity {

    SiemensDialog siemensDialog;
    EditText titleEditText;
    EditText messageEditText;
    EditText cancelButtonET;
    EditText sendButtonET;
    String titleText;
    String messageText;
    String cancelButtonText;
    String sendButtonText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        initObject();

    }

    private void initObject() {

        siemensDialog = new SiemensDialog( this );
        titleEditText = findViewById( R.id.titleET);
        messageEditText = findViewById( R.id.messageET);
        cancelButtonET = findViewById( R.id.button1Et);
        sendButtonET = findViewById( R.id.button2ET );
    }

    public void showDialogButton(View view) {
        titleText = titleEditText.getText().toString();
        messageText = messageEditText.getText().toString();
        cancelButtonText = cancelButtonET.getText().toString();
        sendButtonText = sendButtonET.getText().toString();
        if (titleText.isEmpty() && messageText.isEmpty() && cancelButtonText.isEmpty() && sendButtonText.isEmpty()){
            Toast.makeText( this, "Nothing to show", Toast.LENGTH_SHORT ).show();
        }else {
            siemensDialog.makeAlertDialog( this, "" + titleText, "" + messageText, "" + cancelButtonText, "" + sendButtonText, new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    siemensDialog.dismissAlertDialog();
                }
            }, new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    siemensDialog.makeToast();
                }
            } );
        }

    }
}
