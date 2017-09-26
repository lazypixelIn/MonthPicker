package lazypixel.com.library;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Parth Patel on 26/09/2017.
 */

public class MonthDialog extends DialogFragment {

    ImageView leftIcon;
    ImageView righIcon;
    TextView monthname;
    GridLayout gridLayout;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.dialogmonth, container,
                false);

        leftIcon = rootView.findViewById(R.id.iconLeft);
        righIcon=rootView.findViewById(R.id.iconRight);
        monthname=rootView.findViewById(R.id.monthName);
        gridLayout = rootView.findViewById(R.id.gridItem);
        drawMonth();
        getDialog().setTitle("DialogFragment Tutorial");
        // Do something else
        return rootView;
    }

    private void drawMonth() {
        for (int i = 0; i < 11; i++) {
            MonthView monthView=new MonthView(getContext());
            monthView.setText(i+"");
            gridLayout.addView(monthView);
        }
    }


}
