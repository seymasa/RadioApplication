package com.example.radyofirmarehberim;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    RecyclerView recyclerView;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_favori: // favorilere tıklarsam içerikte neler olacak onu belirliyoruz
                    mTextMessage.setText(R.string.title_favori);

                    return true;
                case R.id.navigation_tur:// tür e tıklarsam içerikte neler olacak onu belirliyoruz
                    mTextMessage.setText(R.string.title_tur);
                    return true;
                case R.id.navigation_yerel:// yerele tıklarsam içerikte neler olacak onu belirliyoruz
                    mTextMessage.setText(R.string.title_yerel);
                    return true;
                case R.id.navigatio_ulusal:// ulusal tıklarsam içerikte neler olacak onu belirliyoruz
                    mTextMessage.setText(R.string.title_ulusal);

                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = findViewById(R.id.message);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
///////////////////////////////////////////////////////////////////////////////////////////////
        recyclerView = findViewById(R.id.recyclerView);

        RadyoAdapter radyoAdapter = new RadyoAdapter(this,Radyo.getData());
        recyclerView.setAdapter(radyoAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

    }

}
