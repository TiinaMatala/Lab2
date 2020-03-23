package clicks.withoutui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
            final int[] clicks = {0};
            final Button pressedButton = new Button (this);
            pressedButton.setText("Click me!");
            setContentView(pressedButton);
            pressedButton.setOnClickListener(new View.OnClickListener() {
                //@Override
                public void onClick(View v) {
                    pressedButton.setText("You have clicked me " + clicks[0] + " times");
                    clicks[0] = clicks[0] + 1;
                }
            });
    }
}
