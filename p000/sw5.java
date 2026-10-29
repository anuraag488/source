package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sw5 extends bw5 {

    /* JADX INFO: renamed from: d */
    public final transient jm3 f30621d;

    /* JADX INFO: renamed from: e */
    public final transient xw5 f30622e;

    public sw5(jm3 jm3Var, xw5 xw5Var) {
        this.f30621d = jm3Var;
        this.f30622e = xw5Var;
    }

    @Override // p000.su5
    /* JADX INFO: renamed from: a */
    public final int mo4228a(Object[] objArr) {
        return this.f30622e.mo4228a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f30621d.get(obj) != null;
    }

    @Override // p000.bw5, p000.su5
    /* JADX INFO: renamed from: d */
    public final sv5 mo3751d() {
        return this.f30622e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f30622e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f30621d.f22427d;
    }
}
