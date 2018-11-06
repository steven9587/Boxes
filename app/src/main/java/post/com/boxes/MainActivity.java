package post.com.boxes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void check(View view){
        EditText edLength = findViewById(R.id.ed_length);
        EditText edWidth = findViewById(R.id.ed_width);
        EditText edHeight = findViewById(R.id.ed_height);
        float length = Float.parseFloat(edLength.getText().toString());
        float width = Float.parseFloat(edWidth.getText().toString());
        float height = Float.parseFloat(edHeight.getText().toString());

        if (length <= 23 && width <=14 && height <=13) {
            Intent intent = new Intent(this,ResultActivity.class);
            intent.putExtra("box","box3");
            intent.putExtra("dimention","23 / 14 / 13  cm");
            intent.putExtra("price","65");
            startActivity(intent);
        } else {
            Intent intent = new Intent(this,ResultActivity.class);
            intent.putExtra("box","box5");
            intent.putExtra("dimention","39.5 / 27.5 / 23  cm");
            intent.putExtra("price","90");
            startActivity(intent);
        }
    }
}
