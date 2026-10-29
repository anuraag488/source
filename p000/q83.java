package p000;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class q83 extends jw4 {

    /* JADX INFO: renamed from: b */
    public t30 f28284b;

    /* JADX INFO: renamed from: c */
    public float f28285c;

    /* JADX INFO: renamed from: d */
    public List f28286d;

    /* JADX INFO: renamed from: e */
    public float f28287e;

    /* JADX INFO: renamed from: f */
    public float f28288f;

    /* JADX INFO: renamed from: g */
    public t30 f28289g;

    /* JADX INFO: renamed from: h */
    public int f28290h;

    /* JADX INFO: renamed from: i */
    public int f28291i;

    /* JADX INFO: renamed from: j */
    public float f28292j;

    /* JADX INFO: renamed from: k */
    public float f28293k;

    /* JADX INFO: renamed from: l */
    public float f28294l;

    /* JADX INFO: renamed from: m */
    public float f28295m;

    /* JADX INFO: renamed from: n */
    public boolean f28296n;

    /* JADX INFO: renamed from: o */
    public boolean f28297o;

    /* JADX INFO: renamed from: p */
    public boolean f28298p;

    /* JADX INFO: renamed from: q */
    public pd4 f28299q;

    /* JADX INFO: renamed from: r */
    public C0489bf f28300r;

    /* JADX INFO: renamed from: s */
    public C0489bf f28301s;

    /* JADX INFO: renamed from: t */
    public C0489bf f28302t;

    /* JADX INFO: renamed from: u */
    public pg2 f28303u;

    @Override // p000.jw4
    /* JADX INFO: renamed from: a */
    public final void mo6934a(u31 u31Var) {
        u31 u31Var2;
        pd4 pd4Var;
        if (this.f28296n) {
            zy5.m13862Z(this.f28286d, this.f28300r);
            m9798e();
        } else if (this.f28298p) {
            m9798e();
        }
        this.f28296n = false;
        this.f28298p = false;
        t30 t30Var = this.f28284b;
        if (t30Var != null) {
            u31Var2 = u31Var;
            u31.m11217A(u31Var2, this.f28301s, t30Var, this.f28285c, null, 56);
        } else {
            u31Var2 = u31Var;
        }
        t30 t30Var2 = this.f28289g;
        if (t30Var2 != null) {
            pd4 pd4Var2 = this.f28299q;
            if (this.f28297o || pd4Var2 == null) {
                pd4 pd4Var3 = new pd4(this.f28288f, this.f28292j, this.f28290h, this.f28291i, 16);
                this.f28299q = pd4Var3;
                this.f28297o = false;
                pd4Var = pd4Var3;
            } else {
                pd4Var = pd4Var2;
            }
            u31.m11217A(u31Var2, this.f28301s, t30Var2, this.f28287e, pd4Var, 48);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m9798e() {
        pg2 pg2Var = this.f28303u;
        C0489bf c0489bf = this.f28300r;
        if (this.f28293k == 0.0f && this.f28294l == 1.0f) {
            this.f28301s = c0489bf;
            return;
        }
        if (z62.m13387o(this.f28301s, c0489bf)) {
            this.f28301s = AbstractC0573df.m4495a();
        } else {
            Path.FillType fillType = this.f28301s.f15228a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z = fillType == fillType2;
            this.f28301s.m3565h();
            Path path = this.f28301s.f15228a;
            if (!z) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        ((C0525cf) pg2Var.getValue()).m3995b(c0489bf, false);
        float length = ((C0525cf) pg2Var.getValue()).f15974a.getLength();
        float f = this.f28293k;
        float f2 = this.f28295m;
        float f3 = ((f + f2) % 1.0f) * length;
        float f4 = ((this.f28294l + f2) % 1.0f) * length;
        if (f3 <= f4) {
            ((C0525cf) pg2Var.getValue()).m3994a(f3, f4, this.f28301s);
            return;
        }
        C0489bf c0489bfM4495a = this.f28302t;
        if (c0489bfM4495a == null) {
            c0489bfM4495a = AbstractC0573df.m4495a();
            this.f28302t = c0489bfM4495a;
        }
        c0489bfM4495a.m3564g();
        ((C0525cf) pg2Var.getValue()).m3994a(f3, length, c0489bfM4495a);
        C0489bf.m3558a(this.f28301s, c0489bfM4495a);
        c0489bfM4495a.m3564g();
        ((C0525cf) pg2Var.getValue()).m3994a(0.0f, f4, c0489bfM4495a);
        C0489bf.m3558a(this.f28301s, c0489bfM4495a);
    }

    public final String toString() {
        return this.f28300r.toString();
    }
}
