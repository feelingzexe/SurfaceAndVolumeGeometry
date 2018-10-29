package th.ac.utd.surfaceareaandvolumegeometry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
    private Button button_vol_prism;
    private Button button_vol_pyramid;
    private Button button_vol_cylinder;
    private Button button_vol_cone;
    private Button button_vol_circle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button_vol_prism = (Button) findViewById(R.id.button_vol_prism);
        button_vol_prism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPrismActivity();
            }
        });

        button_vol_pyramid = (Button) findViewById(R.id.button_vol_pyramid);
        button_vol_pyramid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPyramidActivity();
            }
        });

        button_vol_cylinder = (Button) findViewById(R.id.button_vol_cylinder);
        button_vol_cylinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCylinderActivity();
            }
        });

        button_vol_cone = (Button) findViewById(R.id.button_vol_cone);
        button_vol_cone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConeActivity();
            }
        });

        button_vol_circle = (Button) findViewById(R.id.button_vol_circle);
        button_vol_circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCircleActivity();
            }
        });
    }
    private void openPrismActivity()
    {
        Intent intent = new Intent(this, vol_prism_activity.class); // don't forget to change this one
        startActivity(intent); // starting activity
    }
    private void openPyramidActivity()
    {
        Intent intent = new Intent(this, vol_pyramid_activity.class); // don't forget to change this one
        startActivity(intent); // starting activity
    }
    private void openCylinderActivity()
    {
        Intent intent = new Intent(this, vol_cylinder_activity.class); // don't forget to change this one
        startActivity(intent); // starting activity
    }
    private void openConeActivity()
    {
        Intent intent = new Intent(this, vol_cone_activity.class); // don't forget to change this one
        startActivity(intent); // starting activity
    }
    private void openCircleActivity()
    {
        Intent intent = new Intent(this, vol_circle_activity.class); // don't forget to change this one
        startActivity(intent); // starting activity
    }
}
