package post.com.boxes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView resultBox = findViewById(R.id.resultbox);
        TextView resultDimention = findViewById(R.id.resultdimention);
        TextView resultPrice = findViewById(R.id.resultprice);
        String box = getIntent().getStringExtra("box");
        String dimention = getIntent().getStringExtra("dimention");
        String price = getIntent().getStringExtra("price");
        resultBox.setText(box);
        resultDimention.setText(dimention);
        resultPrice.setText(price);
    }
}
