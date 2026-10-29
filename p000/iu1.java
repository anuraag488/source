package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class iu1 extends jw4 {

    /* JADX INFO: renamed from: b */
    public float[] f21786b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f21787c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public boolean f21788d = true;

    /* JADX INFO: renamed from: e */
    public long f21789e = pb0.f27501h;

    /* JADX INFO: renamed from: f */
    public List f21790f;

    /* JADX INFO: renamed from: g */
    public boolean f21791g;

    /* JADX INFO: renamed from: h */
    public C0489bf f21792h;

    /* JADX INFO: renamed from: i */
    public yp1 f21793i;

    /* JADX INFO: renamed from: j */
    public final b71 f21794j;

    /* JADX INFO: renamed from: k */
    public String f21795k;

    /* JADX INFO: renamed from: l */
    public float f21796l;

    /* JADX INFO: renamed from: m */
    public float f21797m;

    /* JADX INFO: renamed from: n */
    public float f21798n;

    /* JADX INFO: renamed from: o */
    public float f21799o;

    /* JADX INFO: renamed from: p */
    public float f21800p;

    /* JADX INFO: renamed from: q */
    public float f21801q;

    /* JADX INFO: renamed from: r */
    public float f21802r;

    /* JADX INFO: renamed from: s */
    public boolean f21803s;

    public iu1() {
        int i = uw4.f32218a;
        this.f21790f = v71.f32439a;
        this.f21791g = true;
        b71 b71Var = new b71((byte) 8);
        b71Var.f15141b = this;
        VarHandle.storeStoreFence();
        this.f21794j = b71Var;
        this.f21795k = "";
        this.f21799o = 1.0f;
        this.f21800p = 1.0f;
        this.f21803s = true;
    }

    @Override // p000.jw4
    /* JADX INFO: renamed from: a */
    public final void mo6934a(u31 u31Var) {
        if (this.f21803s) {
            float[] fArrM10392b = this.f21786b;
            if (fArrM10392b == null) {
                fArrM10392b = rq2.m10392b();
                this.f21786b = fArrM10392b;
            } else {
                rq2.m10395e(fArrM10392b);
            }
            rq2.m10399i(fArrM10392b, this.f21801q + this.f21797m, this.f21802r + this.f21798n);
            rq2.m10396f(fArrM10392b, this.f21796l);
            rq2.m10397g(fArrM10392b, this.f21799o, this.f21800p);
            rq2.m10399i(fArrM10392b, -this.f21797m, -this.f21798n);
            this.f21803s = false;
        }
        if (this.f21791g) {
            if (!this.f21790f.isEmpty()) {
                C0489bf c0489bfM4495a = this.f21792h;
                if (c0489bfM4495a == null) {
                    c0489bfM4495a = AbstractC0573df.m4495a();
                    this.f21792h = c0489bfM4495a;
                }
                zy5.m13862Z(this.f21790f, c0489bfM4495a);
            }
            this.f21791g = false;
        }
        jp0 jp0VarMo7035J = u31Var.mo7035J();
        long jM7219E = jp0VarMo7035J.m7219E();
        jp0VarMo7035J.m7248w().mo6253j();
        try {
            ar3 ar3Var = (ar3) jp0VarMo7035J.f22481b;
            float[] fArr = this.f21786b;
            if (fArr != null) {
                ((jp0) ar3Var.f14813b).m7248w().mo6260q(rq2.m10391a(fArr).f29528a);
            }
            C0489bf c0489bf = this.f21792h;
            if (!this.f21790f.isEmpty() && c0489bf != null) {
                ((jp0) ar3Var.f14813b).m7248w().mo6262s(c0489bf);
            }
            ArrayList arrayList = this.f21787c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((jw4) arrayList.get(i)).mo6934a(u31Var);
            }
        } finally {
            d55.m4374s(jp0VarMo7035J, jM7219E);
        }
    }

    @Override // p000.jw4
    /* JADX INFO: renamed from: b */
    public final yp1 mo6935b() {
        return this.f21793i;
    }

    @Override // p000.jw4
    /* JADX INFO: renamed from: d */
    public final void mo6936d(b71 b71Var) {
        this.f21793i = b71Var;
    }

    /* JADX INFO: renamed from: e */
    public final void m6937e(int i, jw4 jw4Var) {
        ArrayList arrayList = this.f21787c;
        if (i < arrayList.size()) {
            arrayList.set(i, jw4Var);
        } else {
            arrayList.add(jw4Var);
        }
        m6939g(jw4Var);
        jw4Var.mo6936d(this.f21794j);
        m7329c();
    }

    /* JADX INFO: renamed from: f */
    public final void m6938f(long j) {
        if (this.f21788d && j != 16) {
            long j2 = this.f21789e;
            if (j2 == 16) {
                this.f21789e = j;
                return;
            }
            int i = uw4.f32218a;
            if (pb0.m9469h(j2) == pb0.m9469h(j) && pb0.m9468g(j2) == pb0.m9468g(j) && pb0.m9466e(j2) == pb0.m9466e(j)) {
                return;
            }
            this.f21788d = false;
            this.f21789e = pb0.f27501h;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m6939g(jw4 jw4Var) {
        if (!(jw4Var instanceof q83)) {
            if (jw4Var instanceof iu1) {
                iu1 iu1Var = (iu1) jw4Var;
                if (iu1Var.f21788d && this.f21788d) {
                    m6938f(iu1Var.f21789e);
                    return;
                } else {
                    this.f21788d = false;
                    this.f21789e = pb0.f27501h;
                    return;
                }
            }
            return;
        }
        q83 q83Var = (q83) jw4Var;
        t30 t30Var = q83Var.f28284b;
        if (this.f21788d && t30Var != null) {
            if (t30Var instanceof ga4) {
                m6938f(((ga4) t30Var).f19691a);
            } else {
                this.f21788d = false;
                this.f21789e = pb0.f27501h;
            }
        }
        t30 t30Var2 = q83Var.f28289g;
        if (this.f21788d && t30Var2 != null) {
            if (t30Var2 instanceof ga4) {
                m6938f(((ga4) t30Var2).f19691a);
            } else {
                this.f21788d = false;
                this.f21789e = pb0.f27501h;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f21795k);
        ArrayList arrayList = this.f21787c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            jw4 jw4Var = (jw4) arrayList.get(i);
            sb.append("\t");
            sb.append(jw4Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
