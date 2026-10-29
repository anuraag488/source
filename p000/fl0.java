package p000;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fl0 implements a24 {

    /* JADX INFO: renamed from: a */
    public AtomicReference f19066a;

    @Override // p000.a24
    public final Iterator iterator() {
        a24 a24Var = (a24) this.f19066a.getAndSet(null);
        if (a24Var != null) {
            return a24Var.iterator();
        }
        C1077qn.m9989o("This sequence can be consumed only once.");
        return null;
    }
}
