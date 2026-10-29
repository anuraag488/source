package p000;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vp3 extends View {

    /* JADX INFO: renamed from: f */
    public static final int[] f32774f = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: g */
    public static final int[] f32775g = new int[0];

    /* JADX INFO: renamed from: a */
    public su4 f32776a;

    /* JADX INFO: renamed from: b */
    public Boolean f32777b;

    /* JADX INFO: renamed from: c */
    public Long f32778c;

    /* JADX INFO: renamed from: d */
    public RunnableC1054q0 f32779d;

    /* JADX INFO: renamed from: e */
    public C1053q f32780e;

    private final void setRippleState(boolean z) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f32779d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.f32778c;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || jLongValue >= 5) {
            int[] iArr = z ? f32774f : f32775g;
            su4 su4Var = this.f32776a;
            if (su4Var != null) {
                su4Var.setState(iArr);
            }
        } else {
            RunnableC1054q0 runnableC1054q0 = new RunnableC1054q0((byte) 12);
            runnableC1054q0.f28115b = this;
            VarHandle.storeStoreFence();
            this.f32779d = runnableC1054q0;
            postDelayed(runnableC1054q0, 50L);
        }
        this.f32778c = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(vp3 vp3Var) {
        su4 su4Var = vp3Var.f32776a;
        if (su4Var != null) {
            su4Var.setState(f32775g);
        }
        vp3Var.f32779d = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m11946b(ff3 ff3Var, boolean z, long j, int i, long j2, float f, C1053q c1053q) {
        long j3 = ff3Var.f18951a;
        if (this.f32776a == null || !Boolean.valueOf(z).equals(this.f32777b)) {
            su4 su4Var = new su4(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
            su4Var.f30570a = z;
            VarHandle.storeStoreFence();
            setBackground(su4Var);
            this.f32776a = su4Var;
            this.f32777b = Boolean.valueOf(z);
        }
        su4 su4Var2 = this.f32776a;
        this.f32780e = c1053q;
        m11949e(j, i, j2, f);
        if (z) {
            su4Var2.setHotspot(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (4294967295L & j3)));
        } else {
            su4Var2.setHotspot(su4Var2.getBounds().centerX(), su4Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    /* JADX INFO: renamed from: c */
    public final void m11947c() {
        this.f32780e = null;
        RunnableC1054q0 runnableC1054q0 = this.f32779d;
        if (runnableC1054q0 != null) {
            removeCallbacks(runnableC1054q0);
            this.f32779d.run();
        } else {
            su4 su4Var = this.f32776a;
            if (su4Var != null) {
                su4Var.setState(f32775g);
            }
        }
        su4 su4Var2 = this.f32776a;
        if (su4Var2 == null) {
            return;
        }
        su4Var2.setVisible(false, false);
        unscheduleDrawable(su4Var2);
    }

    /* JADX INFO: renamed from: d */
    public final void m11948d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            m11947c();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m11949e(long j, int i, long j2, float f) {
        su4 su4Var = this.f32776a;
        if (su4Var == null) {
            return;
        }
        if (su4Var.getRadius() != i) {
            su4Var.setRadius(i);
        }
        long jM9464c = pb0.m9464c(j2, f > 1.0f ? 1.0f : f, 0.0f, 0.0f, 0.0f, 14);
        pb0 pb0Var = su4Var.f30571b;
        if (!(pb0Var == null ? false : ws4.m12408a(pb0Var.f27503a, jM9464c))) {
            su4Var.f30571b = pb0.m9462a(jM9464c);
            su4Var.setColor(ColorStateList.valueOf(zy5.m13858V(jM9464c)));
        }
        Rect rect = new Rect(0, 0, qq2.m10010E(Float.intBitsToFloat((int) (j >> 32))), qq2.m10010E(Float.intBitsToFloat((int) (j & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        su4Var.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C1053q c1053q = this.f32780e;
        if (c1053q != null) {
            c1053q.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }
}
