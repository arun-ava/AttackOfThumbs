package com.example.admin.peekaboo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.GridView;

public class ActivityGame extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        try {

            super.onCreate(savedInstanceState);

 //           requestWindowFeature(Window.FEATURE_NO_TITLE);
  //          getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

              setContentView(R.layout.activity_game);


            GridView gridView = (GridView) findViewById(R.id.gvwGame);
            gridView.setAdapter(new ImageAdapter(this));
        }
        catch (Exception e) {
            String s = e.getMessage();
        }
    }
}
