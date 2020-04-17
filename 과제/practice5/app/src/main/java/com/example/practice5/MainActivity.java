package com.example.practice5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final LinearLayout.LayoutParams whole = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        ); // 기본 LinearLayout

        final LinearLayout base = new LinearLayout(this);
        base.setOrientation(LinearLayout.VERTICAL);
        setContentView(base, whole);
        setTitle("연습문제 5-7");
        // 상단 레이아웃 설정


        // 위파트 레이아웃 시작
        final LinearLayout.LayoutParams Top = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        Top.weight = 1.0f;

        final LinearLayout TopPart = new LinearLayout(this);
        TopPart.setOrientation(LinearLayout.HORIZONTAL);
        base.addView(TopPart, Top);
        // 위파트 끝


        // 위 - 왼쪽 시작
        final LinearLayout.LayoutParams TopLeftlayout = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        TopLeftlayout.weight = 1.0f;

        final LinearLayout TopLeft = new LinearLayout(this);
        TopLeft.setBackgroundColor(Color.rgb(102, 153, 255));
        TopPart.addView(TopLeft, TopLeftlayout);
        // 위-왼쪽 끝

        // 위 - 오른쪽 시작
        final LinearLayout.LayoutParams TopRightlayout = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        TopRightlayout.weight = 1.0f;

        final LinearLayout TopRight = new LinearLayout(this);
        TopRight.setOrientation(LinearLayout.VERTICAL);
        TopPart.addView(TopRight, TopRightlayout);
        // 위 - 오른쪽 끝

        // 위 - 오른쪽 - 위 시작
        final LinearLayout.LayoutParams TopRightToplayout = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        TopRightToplayout.weight = 1.0f;

        final LinearLayout TopRightTop = new LinearLayout(this);
        TopRightTop.setBackgroundColor(Color.rgb(204, 204, 255));
        TopRight.addView(TopRightTop, TopRightToplayout);
        // 위 - 오른쪽 - 위 끝

        // 위 - 오른쪽 - 아래 시작
        final LinearLayout.LayoutParams TopRightBottom = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        TopRightBottom.weight = 1.0f;

        final LinearLayout TopRightBottomlayout = new LinearLayout(this);
        TopRightBottomlayout.setBackgroundColor(Color.rgb(204, 153, 204));
        TopRight.addView(TopRightBottomlayout, TopRightBottom);
        // 위 - 오른쪽 - 아래 끝

        // 아래파트 시작
        final LinearLayout.LayoutParams Bottom = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        Bottom.weight = 1.0f;

        final LinearLayout bottomPart = new LinearLayout(this);
        base.setBackgroundColor(Color.rgb(255, 153, 153));
        base.addView(bottomPart, Bottom);
        // 아래파트 끝

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.android);
    }
}
