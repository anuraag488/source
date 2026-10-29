package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kc4 implements Iterator, cc2 {

    /* JADX INFO: renamed from: a */
    public ba4 f23064a;

    /* JADX INFO: renamed from: b */
    public Iterator f23065b;

    /* JADX INFO: renamed from: c */
    public Object f23066c;

    /* JADX INFO: renamed from: d */
    public Object f23067d;

    /* JADX INFO: renamed from: e */
    public int f23068e;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23067d != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (((lc4) k94.m7449f(this.f23064a.f15190a)).f23953d != this.f23068e) {
            C1077qn.m9983c();
            return null;
        }
        this.f23066c = this.f23067d;
        Iterator it = this.f23065b;
        this.f23067d = it.hasNext() ? it.next() : null;
        Object obj = this.f23066c;
        if (obj != null) {
            return obj;
        }
        xy4.m12787p();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        ba4 ba4Var = this.f23064a;
        if (((lc4) k94.m7449f(ba4Var.f15190a)).f23953d != this.f23068e) {
            C1077qn.m9983c();
            return;
        }
        Object obj = this.f23066c;
        if (obj == null) {
            xy4.m12787p();
            return;
        }
        ba4Var.remove(obj);
        this.f23066c = null;
        this.f23068e = ((lc4) k94.m7449f(ba4Var.f15190a)).f23953d;
    }
}
