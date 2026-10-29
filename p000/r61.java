package p000;

import android.content.Context;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class r61 {

    /* JADX INFO: renamed from: a */
    public Context f29045a;

    /* JADX INFO: renamed from: b */
    public int f29046b;

    /* JADX INFO: renamed from: c */
    public long f29047c;

    /* JADX INFO: renamed from: d */
    public EdgeEffect f29048d;

    /* JADX INFO: renamed from: e */
    public EdgeEffect f29049e;

    /* JADX INFO: renamed from: f */
    public EdgeEffect f29050f;

    /* JADX INFO: renamed from: g */
    public EdgeEffect f29051g;

    /* JADX INFO: renamed from: h */
    public EdgeEffect f29052h;

    /* JADX INFO: renamed from: i */
    public EdgeEffect f29053i;

    /* JADX INFO: renamed from: j */
    public EdgeEffect f29054j;

    /* JADX INFO: renamed from: k */
    public EdgeEffect f29055k;

    /* JADX INFO: renamed from: f */
    public static boolean m10219f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m10220g(EdgeEffect edgeEffect) {
        float distance;
        if (edgeEffect == null) {
            return false;
        }
        try {
            distance = edgeEffect.getDistance();
        } catch (Throwable unused) {
            distance = 0.0f;
        }
        return !(distance == 0.0f);
    }

    /* JADX INFO: renamed from: a */
    public final EdgeEffect m10221a(d63 d63Var) {
        EdgeEffect edgeEffect;
        Context context = this.f29045a;
        try {
            edgeEffect = new EdgeEffect(context, null);
        } catch (Throwable unused) {
            edgeEffect = new EdgeEffect(context);
        }
        edgeEffect.setColor(this.f29046b);
        if (!w52.m12108c(this.f29047c, 0L)) {
            d63 d63Var2 = d63.f16814a;
            long j = this.f29047c;
            if (d63Var == d63Var2) {
                edgeEffect.setSize((int) (j >> 32), (int) (j & 4294967295L));
            } else {
                edgeEffect.setSize((int) (4294967295L & j), (int) (j >> 32));
            }
        }
        return edgeEffect;
    }

    /* JADX INFO: renamed from: b */
    public final EdgeEffect m10222b() {
        EdgeEffect edgeEffect = this.f29049e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM10221a = m10221a(d63.f16814a);
        this.f29049e = edgeEffectM10221a;
        return edgeEffectM10221a;
    }

    /* JADX INFO: renamed from: c */
    public final EdgeEffect m10223c() {
        EdgeEffect edgeEffect = this.f29050f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM10221a = m10221a(d63.f16815b);
        this.f29050f = edgeEffectM10221a;
        return edgeEffectM10221a;
    }

    /* JADX INFO: renamed from: d */
    public final EdgeEffect m10224d() {
        EdgeEffect edgeEffect = this.f29051g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM10221a = m10221a(d63.f16815b);
        this.f29051g = edgeEffectM10221a;
        return edgeEffectM10221a;
    }

    /* JADX INFO: renamed from: e */
    public final EdgeEffect m10225e() {
        EdgeEffect edgeEffect = this.f29048d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM10221a = m10221a(d63.f16814a);
        this.f29048d = edgeEffectM10221a;
        return edgeEffectM10221a;
    }
}
