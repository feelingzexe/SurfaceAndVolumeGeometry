package th.ac.utd.surfaceareaandvolumegeometry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;


public class Main2Activity extends AppCompatActivity {
    private Button button_volume;
    private Button button_surfacearea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button_volume = (Button) findViewById(R.id.button_volume);
        button_volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

        button_surfacearea = (Button) findViewById(R.id.button_surfacearea);
        button_surfacearea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
    }
    private void openActivity3()
    {
        Intent intent = new Intent(this, Main3Activity.class); // don't forget to change this one
        startActivity(intent); // starting activity
    }
    private void openActivity4()
    {
        Intent intent = new Intent(this, Main4Activity.class); // don't forget to change this one
        startActivity(intent); // starting activity
    }
}
