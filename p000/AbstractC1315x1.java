package p000;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: x1 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1315x1 extends AbstractList implements List, dc2 {
    /* JADX INFO: renamed from: a */
    public abstract int mo3088a();

    /* JADX INFO: renamed from: b */
    public abstract Object mo3089b(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return mo3089b(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo3088a();
    }
}
