package countries.programmatically;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> countries;
    final String[] COUNTRIES = new String[] {
            "Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra",
            "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina",
            "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        LinearLayout mainLayout = new LinearLayout(this);
        LinearLayout.LayoutParams mainParams = new LinearLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        mainLayout.setLayoutParams(mainParams);
        setContentView(mainLayout);

        LinearLayout linearLayout = new LinearLayout(this);
        LinearLayout.LayoutParams linearParams = new LinearLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        linearParams.gravity = Gravity.CENTER_HORIZONTAL;
        linearLayout.setLayoutParams(linearParams);
        mainLayout.addView(linearLayout);

        Button addBtn = new Button(this);
        addBtn.setText("Add");
        linearLayout.addView(addBtn);

        Button editBtn = new Button(this);
        editBtn.setText("Edit");
        linearLayout.addView(editBtn);

        Button removeBtn = new Button(this);
        removeBtn.setText("Remove");
        linearLayout.addView(removeBtn);

        EditText editText = new EditText(this);
        mainLayout.addView(editText);

        ListView listView = new ListView(this);
        mainLayout.addView(listView);
        listView.setId(0);
        ListView myListView = (ListView) findViewById(0);
        final ArrayAdapter<String> aa;
        aa = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,
                COUNTRIES);
        myListView.setAdapter(aa);
    }
}
