package in.darshana.showtime.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Build;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.Toolbar;

import in.darshana.showtime.Fragment.DrinksFragment;
import in.darshana.showtime.R;

public class HomeActivity extends AppCompatActivity {
    Toolbar mToolbar;
    FrameLayout mFrameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        mToolbar = findViewById(R.id.toolbar);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            setActionBar(mToolbar);
        }
        mFrameLayout = findViewById(R.id.containerNew);

        Fragment showListFragment = new DrinksFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerNew,showListFragment)
                .commit();

    }
}