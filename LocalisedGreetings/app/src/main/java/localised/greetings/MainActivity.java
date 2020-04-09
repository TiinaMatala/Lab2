package localised.greetings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.english).setOnClickListener(this);
        findViewById(R.id.ruotti).setOnClickListener(this);
        findViewById(R.id.suomi).setOnClickListener(this);
        findViewById(R.id.suprise).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        EditText textEditor = findViewById(R.id.textEditor);
        TextView output = findViewById(R.id.output);
        String name = textEditor.getText().toString();

        if(view.getId() == R.id.english) {
            output.setText("Hello " + name + "!");
        }

        if(view.getId() == R.id.ruotti) {
            output.setText("Hejjsan " + name + "!");
        }

        if(view.getId() == R.id.suomi) {
            output.setText("Terve " + name + "!");
        }

        if(view.getId() == R.id.suprise) {
            output.setText("Salut " + name + "!");
        }
    }
}
