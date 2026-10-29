package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class zh2 extends st2 {

    /* JADX INFO: renamed from: a */
    public wp1 f36087a;

    /* JADX INFO: renamed from: b */
    public yh2 f36088b;

    /* JADX INFO: renamed from: c */
    public d63 f36089c;

    /* JADX INFO: renamed from: d */
    public boolean f36090d;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        wp1 wp1Var = this.f36087a;
        yh2 yh2Var = this.f36088b;
        d63 d63Var = this.f36089c;
        boolean z = this.f36090d;
        di2 di2Var = new di2();
        di2Var.f17075o = wp1Var;
        di2Var.f17076p = yh2Var;
        di2Var.f17077q = d63Var;
        di2Var.f17078r = z;
        ai2 ai2Var = new ai2((byte) 0);
        ai2Var.f14522b = di2Var;
        VarHandle.storeStoreFence();
        di2Var.f17080t = ai2Var;
        di2Var.m4512O0();
        VarHandle.storeStoreFence();
        return di2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh2)) {
            return false;
        }
        zh2 zh2Var = (zh2) obj;
        return this.f36087a == zh2Var.f36087a && z62.m13387o(this.f36088b, zh2Var.f36088b) && this.f36089c == zh2Var.f36089c && this.f36090d == zh2Var.f36090d;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        di2 di2Var = (di2) mt2Var;
        wp1 wp1Var = this.f36087a;
        yh2 yh2Var = this.f36088b;
        d63 d63Var = this.f36089c;
        boolean z = this.f36090d;
        di2Var.f17075o = wp1Var;
        di2Var.f17076p = yh2Var;
        if (di2Var.f17077q != d63Var) {
            di2Var.f17077q = d63Var;
            y70.m13004E(di2Var);
        }
        if (di2Var.f17078r == z) {
            return;
        }
        di2Var.f17078r = z;
        di2Var.m4512O0();
        y70.m13004E(di2Var);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + zi4.m13611k((this.f36089c.hashCode() + ((this.f36088b.hashCode() + (this.f36087a.hashCode() * 31)) * 31)) * 31, 31, this.f36090d);
    }
}
