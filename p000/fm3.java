package p000;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fm3 extends u12 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gm3 f19123c;

    public fm3(gm3 gm3Var) {
        this.f19123c = gm3Var;
    }

    @Override // p000.o12
    /* JADX INFO: renamed from: g */
    public final boolean mo5203g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        gm3 gm3Var = this.f19123c;
        dt0.m4717s(i, gm3Var.f19883f);
        Object[] objArr = gm3Var.f19882e;
        int i2 = i * 2;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19123c.f19883f;
    }
}
