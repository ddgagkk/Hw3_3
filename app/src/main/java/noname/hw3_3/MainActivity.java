package noname.hw3_3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnRed,btnGray,btnBule,btnClear;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         btnRed= (Button) findViewById(R.id.btnColorRed);
         btnGray= (Button) findViewById(R.id.btnColorGray);
         btnBule = (Button) findViewById(R.id.btnColorBule);
         btnClear= (Button) findViewById(R.id.btnClear);
        txt= (TextView) findViewById(R.id.textview);
    }

    @Override
    protected void onResume() {
        super.onResume();
        acvityBtn();

    }
    protected  void acvityBtn()
    {
        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setBackgroundResource(R.color.colorRed);
            }
        });
        btnBule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setBackgroundResource(R.color.colorBule);
            }
        });
        btnGray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setBackgroundResource(R.color.colorGray);
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setBackgroundResource(R.color.colorWhite);
            }
        });
    }
    }

