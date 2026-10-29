package p000;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: th */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1182th implements fy4 {

    /* JADX INFO: renamed from: a */
    public ViewConfiguration f31159a;

    @Override // p000.fy4
    /* JADX INFO: renamed from: a */
    public final float mo5856a() {
        return this.f31159a.getScaledMaximumFlingVelocity();
    }

    @Override // p000.fy4
    /* JADX INFO: renamed from: b */
    public final long mo5857b() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // p000.fy4
    /* JADX INFO: renamed from: c */
    public final long mo5858c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // p000.fy4
    /* JADX INFO: renamed from: d */
    public final float mo5859d() {
        return this.f31159a.getScaledTouchSlop();
    }

    @Override // p000.fy4
    /* JADX INFO: renamed from: e */
    public final float mo5860e() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f31159a.getScaledHandwritingSlop();
        }
        return 2.0f;
    }

    @Override // p000.fy4
    /* JADX INFO: renamed from: f */
    public final float mo5861f() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f31159a.getScaledHandwritingGestureLineMargin();
        }
        return 16.0f;
    }
}
