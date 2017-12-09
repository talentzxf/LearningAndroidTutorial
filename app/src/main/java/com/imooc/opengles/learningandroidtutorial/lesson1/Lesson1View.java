package com.imooc.opengles.learningandroidtutorial.lesson1;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

/**
 * Created by VincentZhang on 12/9/2017.
 */

public class Lesson1View extends GLSurfaceView {
    public Lesson1View(Context context) {
        super(context);

        setEGLContextClientVersion(2);
        setEGLConfigChooser(8,8,8,8,16,0);
        setRenderer(new Lesson1Renderer());
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }
}
