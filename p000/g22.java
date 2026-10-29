package p000;

import android.graphics.PathMeasure;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class g22 extends AbstractC0741hx<l22> {

    /* JADX INFO: renamed from: a */
    public long f19501a;

    /* JADX INFO: renamed from: b */
    public long f19502b;

    /* JADX INFO: renamed from: c */
    public pd4 f19503c;

    /* JADX INFO: renamed from: d */
    public pd4 f19504d;

    /* JADX INFO: renamed from: e */
    public float f19505e;

    /* JADX INFO: renamed from: f */
    public float f19506f;

    /* JADX INFO: renamed from: g */
    public float f19507g;

    /* JADX INFO: renamed from: h */
    public float f19508h;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        long j = this.f19501a;
        long j2 = this.f19502b;
        pd4 pd4Var = this.f19503c;
        pd4 pd4Var2 = this.f19504d;
        float f = this.f19505e;
        float f2 = this.f19506f;
        float f3 = this.f19507g;
        float f4 = this.f19508h;
        l22 l22Var = new l22();
        l22Var.f23739q = j;
        l22Var.f23740r = j2;
        l22Var.f23741s = pd4Var;
        l22Var.f23742t = pd4Var2;
        l22Var.f23743u = f;
        l22Var.f23744v = f3;
        l22Var.f23745w = f4;
        o90 o90Var = new o90();
        o90Var.f26473b = -1.0f;
        o90Var.f26477f = new a83(-1);
        VarHandle.storeStoreFence();
        l22Var.f23746x = o90Var;
        n90 n90Var = new n90();
        n90Var.f25544a = -1.0f;
        n90Var.f25545b = -1.0f;
        n90Var.f25546c = 9205357640488583168L;
        n90Var.f25549f = -1.0f;
        pd4 pd4Var3 = new pd4(0.0f, 0.0f, 0, 0, 31);
        n90Var.f25550g = pd4Var3;
        n90Var.f25551h = pd4Var3;
        n90Var.f25555l = rq2.m10392b();
        n90Var.f25556m = rq2.m10392b();
        n90Var.f25557n = AbstractC0573df.m4495a();
        n90Var.f25558o = AbstractC0573df.m4495a();
        n90Var.f25559p = AbstractC0573df.m4495a();
        n90Var.f25560q = AbstractC0573df.m4495a();
        PathMeasure pathMeasure = new PathMeasure();
        C0525cf c0525cf = new C0525cf();
        c0525cf.f15974a = pathMeasure;
        VarHandle.storeStoreFence();
        n90Var.f25561r = c0525cf;
        PathMeasure pathMeasure2 = new PathMeasure();
        C0525cf c0525cf2 = new C0525cf();
        c0525cf2.f15974a = pathMeasure2;
        VarHandle.storeStoreFence();
        n90Var.f25562s = c0525cf2;
        VarHandle.storeStoreFence();
        l22Var.f23747y = n90Var;
        l22Var.f23748z = new z73(0.0f);
        l22Var.f23732C = -1;
        l22Var.f23737H = sc6.m10674o(f2, 0.0f, 1.0f);
        C0777ix c0777ix = new C0777ix((byte) 1);
        c0777ix.f21854b = l22Var;
        VarHandle.storeStoreFence();
        y50 y50Var = new y50(new z50(), c0777ix);
        l22Var.m10154O0(y50Var);
        l22Var.f23738I = y50Var;
        VarHandle.storeStoreFence();
        return l22Var;
    }

    @Override // p000.AbstractC0741hx
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g22) && super.equals(obj) && this.f19506f == ((g22) obj).f19506f;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        l22 l22Var = (l22) mt2Var;
        long j = this.f19501a;
        long j2 = l22Var.f23739q;
        y50 y50Var = l22Var.f23738I;
        int i = pb0.f27502i;
        if (!ws4.m12408a(j2, j)) {
            l22Var.f23739q = j;
            z62.m13348G(y50Var);
        }
        long j3 = this.f19502b;
        if (!ws4.m12408a(l22Var.f23740r, j3)) {
            l22Var.f23740r = j3;
            z62.m13348G(y50Var);
        }
        pd4 pd4Var = this.f19503c;
        if (!z62.m13387o(l22Var.f23741s, pd4Var)) {
            l22Var.f23741s = pd4Var;
            y50Var.m12933O0();
        }
        pd4 pd4Var2 = this.f19504d;
        if (!z62.m13387o(l22Var.f23742t, pd4Var2)) {
            l22Var.f23742t = pd4Var2;
            y50Var.m12933O0();
        }
        float f = this.f19505e;
        if (!p11.m9352c(l22Var.f23743u, f)) {
            l22Var.f23743u = f;
            y50Var.m12933O0();
        }
        float f2 = this.f19507g;
        if (!p11.m9352c(l22Var.f23744v, f2)) {
            l22Var.f23744v = f2;
            l22Var.m7822R0();
        }
        float f3 = this.f19508h;
        if (!p11.m9352c(l22Var.f23745w, f3)) {
            l22Var.f23745w = f3;
            l22Var.m7822R0();
        }
        float fM10674o = sc6.m10674o(this.f19506f, 0.0f, 1.0f);
        float f4 = l22Var.f23737H;
        if (f4 == fM10674o) {
            return;
        }
        l22Var.f23737H = fM10674o;
        if (fM10674o > 0.0f && f4 == 0.0f) {
            l22Var.m7822R0();
        } else if (fM10674o == 0.0f) {
            t82 t82Var = l22Var.f23731B;
            if (t82Var != null) {
                t82Var.mo4993a(null);
            }
            l22Var.f23731B = null;
            l22Var.f23730A = null;
        }
        y50Var.m12933O0();
    }

    @Override // p000.AbstractC0741hx
    public final int hashCode() {
        return Float.hashCode(this.f19506f) + (super.hashCode() * 31);
    }
}
