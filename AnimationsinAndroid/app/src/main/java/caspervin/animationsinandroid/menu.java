package caspervin.animationsinandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void skiftSide(View view) {
        Intent myItent1 = new Intent(getBaseContext(), PropertyAnimations.class);
        startActivity(myItent1);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void skiftSideDrawable(View view) {
        Intent myItent3 = new  Intent (getBaseContext(), DrawableAnimation.class);
        startActivity(myItent3);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
