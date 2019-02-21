package com.example.soowi.bubble;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.view.View;
import java.util.*;
import java.util.jar.Attributes;
import java.util.logging.Handler;

public class BubbleView extends ImageView implements View.OnTouchListener {
    private Random rand=new Random();
    private ArrayList<Bubble> bubbleList;
    private int size=50;
    private int delay=33;
    private Paint myPaint=new Paint();
    private Handler h= new Handler();
    public BubbleView(Context context, AttributeSet attributeSet){
        super(context,attributeSet);
        bubbleList=new ArrayList<Bubble>();
    }
}
