package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xt3 extends yt3 implements Iterator {

    /* JADX INFO: renamed from: a */
    public wt3 f34618a;

    /* JADX INFO: renamed from: b */
    public boolean f34619b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ zt3 f34620c;

    @Override // p000.yt3
    /* JADX INFO: renamed from: a */
    public final void mo11987a(wt3 wt3Var) {
        wt3 wt3Var2 = this.f34618a;
        if (wt3Var == wt3Var2) {
            wt3 wt3Var3 = wt3Var2.f33722d;
            this.f34618a = wt3Var3;
            this.f34619b = wt3Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f34619b) {
            return this.f34620c.f36360a != null;
        }
        wt3 wt3Var = this.f34618a;
        return (wt3Var == null || wt3Var.f33721c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f34619b) {
            this.f34619b = false;
            wt3 wt3Var = this.f34620c.f36360a;
            this.f34618a = wt3Var;
            return wt3Var;
        }
        wt3 wt3Var2 = this.f34618a;
        wt3 wt3Var3 = wt3Var2 != null ? wt3Var2.f33721c : null;
        this.f34618a = wt3Var3;
        return wt3Var3;
    }
}
