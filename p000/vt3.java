package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vt3 extends yt3 implements Iterator {

    /* JADX INFO: renamed from: a */
    public wt3 f32859a;

    /* JADX INFO: renamed from: b */
    public wt3 f32860b;

    @Override // p000.yt3
    /* JADX INFO: renamed from: a */
    public final void mo11987a(wt3 wt3Var) {
        wt3 wt3Var2 = this.f32859a;
        wt3 wt3Var3 = null;
        if (wt3Var2 == wt3Var && wt3Var == this.f32860b) {
            this.f32860b = null;
            this.f32859a = null;
            wt3Var2 = null;
        }
        wt3 wt3Var4 = wt3Var2;
        if (wt3Var2 == wt3Var) {
            wt3Var4 = wt3Var2.f33722d;
            this.f32859a = wt3Var4;
        }
        wt3 wt3Var5 = this.f32860b;
        if (wt3Var5 == wt3Var) {
            if (wt3Var5 != wt3Var4 && wt3Var4 != null) {
                wt3Var3 = wt3Var5.f33721c;
            }
            this.f32860b = wt3Var3;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f32860b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        wt3 wt3Var = this.f32860b;
        wt3 wt3Var2 = this.f32859a;
        this.f32860b = (wt3Var == wt3Var2 || wt3Var2 == null) ? null : wt3Var.f33721c;
        return wt3Var;
    }
}
