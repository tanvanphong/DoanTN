package activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.R;

public class Lienhe extends AppCompatActivity {
    Toolbar toolbarcontact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lienhe);
        toolbarcontact = findViewById(R.id.toolbarcontact);
        ActionBar();
    }

    private void ActionBar() {
        setSupportActionBar(toolbarcontact);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbarcontact.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lienhe.this, TrangChinh.class);
                startActivity(intent);
            }
        });
    }
}