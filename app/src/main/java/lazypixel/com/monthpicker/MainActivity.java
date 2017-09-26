package lazypixel.com.monthpicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import lazypixel.com.library.MonthPicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new MonthPicker(getSupportFragmentManager()).show();
        /*Check*/

    }
}
