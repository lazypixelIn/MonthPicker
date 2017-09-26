package lazypixel.com.library;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentManager;

/**
 * Created by Parth Patel on 26/09/2017.
 */

public class MonthPicker {

    private FragmentManager fragmentManager;

    public MonthPicker(FragmentManager fragmentManager) {
        this.fragmentManager = fragmentManager;
    }

    public void show() {
        MonthDialog monthDialog =new MonthDialog();
        monthDialog.show(fragmentManager,"Dialog");
    }
}
