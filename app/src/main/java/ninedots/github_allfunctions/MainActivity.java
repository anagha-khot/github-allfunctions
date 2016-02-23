package ninedots.github_allfunctions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int a=100;
    int b=150;
    int c=200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("A : "+ a +" B :"+ b +" C : "+ c);
    }
}
