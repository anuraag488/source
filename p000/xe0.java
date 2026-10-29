package p000;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xe0 extends AbstractCollection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ye0 f34189a;

    public xe0(ye0 ye0Var) {
        this.f34189a = ye0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f34189a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ye0 ye0Var = this.f34189a;
        Map mapM13099b = ye0Var.m13099b();
        return mapM13099b != null ? mapM13099b.values().iterator() : new ue0(ye0Var, (byte) 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f34189a.size();
    }
}
