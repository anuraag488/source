package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jq3 implements q22 {

    /* JADX INFO: renamed from: a */
    public final boolean f22515a;

    /* JADX INFO: renamed from: b */
    public final float f22516b;

    /* JADX INFO: renamed from: c */
    public final long f22517c;

    /* JADX INFO: renamed from: d */
    public final p44 f22518d;

    /* JADX INFO: renamed from: e */
    public final boolean f22519e;

    public jq3(boolean z, float f, long j, p44 p44Var, boolean z2) {
        if (p44Var == null) {
            p11 p11VarM9350a = p11.m9350a(f);
            p11VarM9350a = p11.m9352c(p11VarM9350a.f27285a, Float.NaN) ? null : p11VarM9350a;
            p44Var = p11VarM9350a != null ? gr3.m6151a(p11VarM9350a.f27285a) : null;
            if (p44Var == null) {
                p44Var = k43.f22879x;
            }
        }
        this.f22515a = z;
        this.f22516b = f;
        this.f22517c = j;
        this.f22518d = p44Var;
        this.f22519e = z2;
    }

    @Override // p000.q22
    /* JADX INFO: renamed from: a */
    public final px0 mo7265a(nv2 nv2Var) {
        wd3 wd3Var = new wd3((byte) 5);
        wd3Var.f33259b = this;
        VarHandle.storeStoreFence();
        cy0 cy0Var = new cy0();
        cy0Var.f16600q = nv2Var;
        cy0Var.f16601r = this.f22515a;
        cy0Var.f16602s = this.f22516b;
        cy0Var.f16603t = wd3Var;
        cy0Var.f16604u = true;
        cy0Var.f16605v = this.f22519e;
        cy0Var.f16606w = true;
        cy0Var.f16607x = true;
        js1 js1Var = new js1();
        js1Var.f22555a = cy0Var;
        VarHandle.storeStoreFence();
        cy0Var.f16598D = js1Var;
        by0 by0Var = new by0((byte) 1);
        by0Var.f15677b = cy0Var;
        VarHandle.storeStoreFence();
        cy0Var.f16599E = by0Var;
        VarHandle.storeStoreFence();
        return cy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq3)) {
            return false;
        }
        jq3 jq3Var = (jq3) obj;
        if (this.f22515a != jq3Var.f22515a || !p11.m9352c(this.f22516b, jq3Var.f22516b)) {
            return false;
        }
        long j = jq3Var.f22517c;
        int i = pb0.f27502i;
        return ws4.m12408a(this.f22517c, j) && this.f22518d.equals(jq3Var.f22518d) && this.f22519e == jq3Var.f22519e;
    }

    @Override // p000.q22
    public final int hashCode() {
        int iM3874f = c75.m3874f(this.f22516b, Boolean.hashCode(this.f22515a) * 31, 961);
        int i = pb0.f27502i;
        return Boolean.hashCode(true) + zi4.m13611k(zi4.m13611k(zi4.m13611k((this.f22518d.hashCode() + zi4.m13612l(iM3874f, this.f22517c, 31)) * 31, 31, true), 31, this.f22519e), 31, true);
    }
}
