package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pw5 extends bw5 {

    /* JADX INFO: renamed from: d */
    public final transient jm3 f28061d;

    /* JADX INFO: renamed from: e */
    public final transient Object[] f28062e;

    /* JADX INFO: renamed from: f */
    public final transient int f28063f;

    public pw5(jm3 jm3Var, Object[] objArr, int i) {
        this.f28061d = jm3Var;
        this.f28062e = objArr;
        this.f28063f = i;
    }

    @Override // p000.su5
    /* JADX INFO: renamed from: a */
    public final int mo4228a(Object[] objArr) {
        return mo3751d().mo4228a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f28061d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo3751d().listIterator(0);
    }

    @Override // p000.bw5
    /* JADX INFO: renamed from: m */
    public final sv5 mo3752m() {
        return new ow5(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f28063f;
    }
}
