package kr.hs.emrim.minsun2767.imageslideshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper flip;
    EditText editText;
    int time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flip=(ViewFlipper)findViewById(R.id.view_flip);
        editText=(EditText)findViewById(R.id.edit_time);
        flip.setFlipInterval(1000);
        Button butStart=(Button)findViewById(R.id.but_start);
        butStart.setOnClickListener(this);
        Button butStop=(Button)findViewById(R.id.but_stop);
        butStop.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.but_start:
                time=(int)(Double.parseDouble(editText.getText().toString())*1000);
                flip.setFlipInterval(time);
                flip.startFlipping();
                break;

            case R.id.but_stop:
                flip.stopFlipping();
                break;
        }

    }
}
