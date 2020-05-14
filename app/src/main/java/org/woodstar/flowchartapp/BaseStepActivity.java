package org.woodstar.flowchartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BaseStepActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_step);
    }

    /** Called when the user taps the Send button */
    public void nextStep(View buttonClicked) {
        Intent intent = new Intent(this, EndActivity.class);
        int button_id = buttonClicked.getId();
        switch(button_id) {
            case R.id.button_yes:
                intent.putExtra(EndActivity.END_MESSAGE_ID, "endText_yes");
                break;
            case R.id.button_no:
                intent.putExtra(EndActivity.END_MESSAGE_ID, "endText_no");
                break;
            case R.id.button_cat:
                intent.putExtra(EndActivity.END_MESSAGE_ID, "endText_cat");
                break;
            default: //We are defaulting to cat but probably should actually error here since it should be unreachable
                intent.putExtra(EndActivity.END_MESSAGE_ID, "endText_cat");
        }
        startActivity(intent);
    }

}
