package p000;

import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class a41 extends i73 implements pm3 {

    /* JADX INFO: renamed from: f */
    public Drawable f91f;

    /* JADX INFO: renamed from: g */
    public d83 f92g;

    /* JADX INFO: renamed from: h */
    public d83 f93h;

    /* JADX INFO: renamed from: i */
    public dg4 f94i;

    @Override // p000.i73
    /* JADX INFO: renamed from: a */
    public final boolean mo35a(float f) {
        this.f91f.setAlpha(sc6.m10675p(qq2.m10010E(f * 255.0f), 0, 255));
        return true;
    }

    @Override // p000.i73
    /* JADX INFO: renamed from: b */
    public final boolean mo36b(o00 o00Var) {
        this.f91f.setColorFilter(o00Var != null ? o00Var.f26229a : null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.pm3
    /* JADX INFO: renamed from: c */
    public final void mo37c() {
        Drawable drawable = this.f91f;
        drawable.setCallback((Drawable.Callback) this.f94i.getValue());
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // p000.pm3
    /* JADX INFO: renamed from: d */
    public final void mo38d() {
        mo41h();
    }

    @Override // p000.i73
    /* JADX INFO: renamed from: e */
    public final void mo39e(df2 df2Var) {
        int i;
        Drawable drawable = this.f91f;
        int iOrdinal = df2Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                C0670g.m5864c();
                return;
            }
        } else {
            i = 0;
        }
        drawable.setLayoutDirection(i);
    }

    @Override // p000.i73
    /* JADX INFO: renamed from: g */
    public final long mo40g() {
        return ((h74) this.f93h.getValue()).f20418a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.pm3
    /* JADX INFO: renamed from: h */
    public final void mo41h() {
        Drawable drawable = this.f91f;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // p000.i73
    /* JADX INFO: renamed from: i */
    public final void mo42i(u31 u31Var) {
        h70 h70VarM7248w = u31Var.mo7035J().m7248w();
        ((Number) this.f92g.getValue()).intValue();
        Drawable drawable = this.f91f;
        drawable.setBounds(0, 0, qq2.m10010E(h74.m6273e(u31Var.mo11227d())), qq2.m10010E(h74.m6271c(u31Var.mo11227d())));
        try {
            h70VarM7248w.mo6253j();
            Canvas canvas = AbstractC1362yb.f35080a;
            drawable.draw(((C1325xb) h70VarM7248w).f34122a);
        } finally {
            h70VarM7248w.mo6251g();
        }
    }
}
