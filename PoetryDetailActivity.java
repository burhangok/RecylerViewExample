package ismek.com.attilalhan;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class PoetryDetailActivity extends AppCompatActivity {

    TextView textareaT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poetry_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textareaT = findViewById(R.id.poetry);

        setTitle(getIntent().getStringExtra("TITLE"));
        textareaT.setText(getIntent().getStringExtra("POETRY"));

    }
}
