package p000;

import ads_mobile_sdk.nc3;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ni5 implements View.OnTouchListener {

    /* JADX INFO: renamed from: b */
    public /* synthetic */ nc3 f25874b;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f25874b.f7649g.set(true);
        view.performClick();
        return false;
    }
}
