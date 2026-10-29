package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ml2 implements Iterator {

    /* JADX INFO: renamed from: a */
    public ol2 f24997a;

    /* JADX INFO: renamed from: b */
    public ol2 f24998b = null;

    /* JADX INFO: renamed from: c */
    public int f24999c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ pl2 f25000d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ byte f25001e;

    public ml2(pl2 pl2Var, byte b) {
        this.f25001e = b;
        this.f25000d = pl2Var;
        this.f24997a = pl2Var.f27733f.f26845d;
        this.f24999c = pl2Var.f27732e;
    }

    /* JADX INFO: renamed from: a */
    public final ol2 m8344a() {
        ol2 ol2Var = this.f24997a;
        pl2 pl2Var = this.f25000d;
        if (ol2Var == pl2Var.f27733f) {
            xy4.m12795x();
            return null;
        }
        if (pl2Var.f27732e != this.f24999c) {
            C1077qn.m9983c();
            return null;
        }
        this.f24997a = ol2Var.f26845d;
        this.f24998b = ol2Var;
        return ol2Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24997a != this.f25000d.f27733f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f25001e) {
            case 0:
                return m8344a();
            default:
                return m8344a().f26847f;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        ol2 ol2Var = this.f24998b;
        if (ol2Var == null) {
            xy4.m12787p();
            return;
        }
        pl2 pl2Var = this.f25000d;
        pl2Var.m9563c(ol2Var, true);
        this.f24998b = null;
        this.f24999c = pl2Var.f27732e;
    }
}
