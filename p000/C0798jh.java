package p000;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: jh */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0798jh extends TextPaint {

    /* JADX INFO: renamed from: a */
    public C1253ve f22260a;

    /* JADX INFO: renamed from: b */
    public uj4 f22261b;

    /* JADX INFO: renamed from: c */
    public byte f22262c;

    /* JADX INFO: renamed from: d */
    public m44 f22263d;

    /* JADX INFO: renamed from: e */
    public pb0 f22264e;

    /* JADX INFO: renamed from: f */
    public t30 f22265f;

    /* JADX INFO: renamed from: g */
    public wy0 f22266g;

    /* JADX INFO: renamed from: h */
    public h74 f22267h;

    /* JADX INFO: renamed from: i */
    public qq2 f22268i;

    /* JADX INFO: renamed from: a */
    public final C1253ve m7108a() {
        C1253ve c1253ve = this.f22260a;
        if (c1253ve != null) {
            return c1253ve;
        }
        C1253ve c1253ve2 = new C1253ve(this);
        this.f22260a = c1253ve2;
        return c1253ve2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final void m7109b(int i) {
        if (i == this.f22262c) {
            return;
        }
        m7108a().m11880j(i);
        this.f22262c = i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX INFO: renamed from: c */
    public final void m7110c(t30 t30Var, long j, float f) {
        if (t30Var == null) {
            this.f22266g = null;
            this.f22265f = null;
            this.f22267h = null;
            setShader(null);
            return;
        }
        if (t30Var instanceof ga4) {
            m7111d(i25.m6602A(((ga4) t30Var).f19691a, f));
            return;
        }
        if (!(t30Var instanceof u30)) {
            C0670g.m5864c();
            return;
        }
        if (z62.m13387o(this.f22265f, t30Var)) {
            h74 h74Var = this.f22267h;
            if (!(h74Var == null ? false : h74.m6270b(h74Var.f20418a, j))) {
                if (j != 9205357640488583168L) {
                    this.f22265f = t30Var;
                    this.f22267h = h74.m6269a(j);
                    C1053q c1053q = new C1053q((byte) 4);
                    c1053q.f28113b = t30Var;
                    VarHandle.storeStoreFence();
                    this.f22266g = s94.m10566b(c1053q);
                }
            }
        } else if (j != 9205357640488583168L) {
            this.f22265f = t30Var;
            this.f22267h = h74.m6269a(j);
            C1053q c1053q2 = new C1053q((byte) 4);
            c1053q2.f28113b = t30Var;
            VarHandle.storeStoreFence();
            this.f22266g = s94.m10566b(c1053q2);
        }
        C1253ve c1253veM7108a = m7108a();
        wy0 wy0Var = this.f22266g;
        Shader shader = wy0Var != null ? (Shader) wy0Var.getValue() : null;
        c1253veM7108a.f32550c = shader;
        ((Paint) c1253veM7108a.f32549b).setShader(shader);
        this.f22264e = null;
        dt0.m4692U(this, f);
    }

    /* JADX INFO: renamed from: d */
    public final void m7111d(long j) {
        pb0 pb0Var = this.f22264e;
        if ((pb0Var == null ? false : ws4.m12408a(pb0Var.f27503a, j)) || j == 16) {
            return;
        }
        this.f22264e = pb0.m9462a(j);
        setColor(zy5.m13858V(j));
        this.f22266g = null;
        this.f22265f = null;
        this.f22267h = null;
        setShader(null);
    }

    /* JADX INFO: renamed from: e */
    public final void m7112e(qq2 qq2Var) {
        if (qq2Var == null || z62.m13387o(this.f22268i, qq2Var)) {
            return;
        }
        this.f22268i = qq2Var;
        if (qq2Var.equals(uf1.f31820j)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(qq2Var instanceof pd4)) {
            C0670g.m5864c();
            return;
        }
        m7108a().m11885o(1);
        C1253ve c1253veM7108a = m7108a();
        pd4 pd4Var = (pd4) qq2Var;
        ((Paint) c1253veM7108a.f32549b).setStrokeWidth(pd4Var.f27547j);
        C1253ve c1253veM7108a2 = m7108a();
        ((Paint) c1253veM7108a2.f32549b).setStrokeMiter(pd4Var.f27548k);
        m7108a().m11884n(pd4Var.f27550m);
        m7108a().m11883m(pd4Var.f27549l);
        ((Paint) m7108a().f32549b).setPathEffect(null);
    }

    /* JADX INFO: renamed from: f */
    public final void m7113f(m44 m44Var) {
        if (m44Var == null || z62.m13387o(this.f22263d, m44Var)) {
            return;
        }
        this.f22263d = m44Var;
        if (m44Var.equals(m44.f24642d)) {
            clearShadowLayer();
            return;
        }
        m44 m44Var2 = this.f22263d;
        float f = m44Var2.f24645c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (m44Var2.f24644b >> 32)), Float.intBitsToFloat((int) (this.f22263d.f24644b & 4294967295L)), zy5.m13858V(this.f22263d.f24643a));
    }

    /* JADX INFO: renamed from: g */
    public final void m7114g(uj4 uj4Var) {
        if (uj4Var == null || z62.m13387o(this.f22261b, uj4Var)) {
            return;
        }
        this.f22261b = uj4Var;
        int i = uj4Var.f31941a;
        setUnderlineText((i | 1) == i);
        int i2 = this.f22261b.f31941a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
