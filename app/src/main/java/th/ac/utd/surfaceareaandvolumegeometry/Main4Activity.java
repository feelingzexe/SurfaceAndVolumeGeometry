package th.ac.utd.surfaceareaandvolumegeometry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {
    private Button button_area_prism;
    private Button button_area_pyramid;
    private Button button_area_cylinder;
    private Button button_area_cone;
    private Button button_area_circle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        button_area_prism = (Button) findViewById(R.id.button_area_prism);
        button_area_prism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPrismAreaActivity();
            }
        });

        button_area_pyramid = (Button) findViewById(R.id.button_area_pyramid);
        button_area_pyramid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPyramidAreaActivity();
            }
        });

        button_area_cylinder = (Button) findViewById(R.id.button_area_cylinder);
        button_area_cylinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCylinderAreaActivity();
            }
        });

        button_area_cone = (Button) findViewById(R.id.button_area_cone);
        button_area_cone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConeAreaActivity();
            }
        });

        button_area_circle = (Button) findViewById(R.id.button_area_circle);
        button_area_circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCircleAreaActivity();
            }
        });
    }
    private void openPrismAreaActivity()
    {
        Intent intent = new Intent(this, area_prism_activity.class); // don't forget to change this one
        startActivity(intent); // starting activity
    }
    private void openPyramidAreaActivity()
    {
        Intent intent = new Intent(this, area_pyramid_activity.class); // don't forget to change this one
        startActivity(intent); // starting activity
    }
    private void openCylinderAreaActivity()
    {
        Intent intent = new Intent(this, area_cylinder_activity.class); // don't forget to change this one
        startActivity(intent); // starting activity
    }
    private void openConeAreaActivity()
    {
        Intent intent = new Intent(this, area_cone_activity.class); // don't forget to change this one
        startActivity(intent); // starting activity
    }
    private void openCircleAreaActivity()
    {
        Intent intent = new Intent(this, area_circle_activity.class); // don't forget to change this one
        startActivity(intent); // starting activity
    }
}
