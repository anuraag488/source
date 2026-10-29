package p000;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fh4 extends View {

    /* JADX INFO: renamed from: a */
    public final int[] f19002a;

    /* JADX INFO: renamed from: b */
    public final int[] f19003b;

    /* JADX INFO: renamed from: c */
    public final int[] f19004c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ nh4 f19005d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh4(nh4 nh4Var, Context context) {
        super(context);
        this.f19005d = nh4Var;
        this.f19002a = new int[]{0, 0};
        this.f19003b = new int[]{0, 0};
        this.f19004c = new int[]{0, 0};
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) getLayoutParams();
        int i = layoutParams.x;
        int[] iArr = this.f19002a;
        iArr[0] = i;
        iArr[1] = layoutParams.y;
        nh4 nh4Var = this.f19005d;
        int[] iArr2 = this.f19004c;
        nh4Var.getLocationOnScreen(iArr2);
        int action = motionEvent.getAction();
        int[] iArr3 = this.f19003b;
        if (action == 0) {
            iArr3[0] = iArr[0];
            iArr3[1] = iArr[1];
        } else {
            motionEvent.offsetLocation(iArr[0] - iArr3[0], iArr[1] - iArr3[1]);
        }
        motionEvent.offsetLocation(iArr3[0] - iArr2[0], iArr3[1] - iArr2[1]);
        return nh4Var.m8763b(motionEvent, this);
    }

    public final int[] getThisLocation() {
        return this.f19002a;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f19005d.m8763b(motionEventObtain, this);
        motionEventObtain.recycle();
    }
}
