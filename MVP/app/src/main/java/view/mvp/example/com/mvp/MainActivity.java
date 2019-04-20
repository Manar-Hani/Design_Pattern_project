package view.mvp.example.com.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.example.esraarashad.mvpdesignpattern.R;

public class MainActivity extends AppCompatActivity implements View {
    private TextView counterText;
    private Button counterBtn;

    Presenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter=new Presenter(this);
        counterText=findViewById(R.id.text_view);
        counterBtn=findViewById(R.id.btn_count);
        counterBtn.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {

                presenter.update();
            }
        });

    }

    @Override
    public void countIncrement(int count) {
        counterText.setText(""+count);
    }
}
