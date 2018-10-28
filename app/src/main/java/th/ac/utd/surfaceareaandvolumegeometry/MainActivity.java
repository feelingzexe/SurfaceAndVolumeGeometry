package th.ac.utd.surfaceareaandvolumegeometry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityTest();
            }
        });

    }
    public void openActivity2()
    {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
    public void openActivityTest()
    {
        Intent intent = new Intent(this, Main2Activity.class); //don't forget to change this one.
        startActivity(intent);
    }


}
