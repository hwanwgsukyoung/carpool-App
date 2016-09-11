package com.project.hacharm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import net.daum.mf.map.api.MapView;

public class Driver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver);

        // 다음이 제공하는 MapView 객체 생성 및 API Key 설정
        MapView mapView = new MapView(this);
        mapView.setDaumMapApiKey("245e84dbd15e11e94b319f2b6a148653");

        // xml에 선언된 map_view 레이아웃을 찾아온 후 생성한 MapView 객체 추가
        RelativeLayout mapViewContainer = (RelativeLayout) findViewById(R.id.map_view);
        mapViewContainer.addView(mapView);
    }
}
