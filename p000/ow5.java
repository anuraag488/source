package p000;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ow5 extends sv5 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pw5 f27180c;

    public ow5(pw5 pw5Var) {
        this.f27180c = pw5Var;
    }

    @Override // p000.su5
    /* JADX INFO: renamed from: e */
    public final boolean mo8424e() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        pw5 pw5Var = this.f27180c;
        nt5.m8846b(i, pw5Var.f28063f);
        Object[] objArr = pw5Var.f28062e;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27180c.f28063f;
    }
}
