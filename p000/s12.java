package p000;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class s12 extends u12 {

    /* JADX INFO: renamed from: c */
    public final transient int f29822c;

    /* JADX INFO: renamed from: d */
    public final transient int f29823d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ u12 f29824e;

    public s12(u12 u12Var, int i, int i2) {
        this.f29824e = u12Var;
        this.f29822c = i;
        this.f29823d = i2;
    }

    @Override // p000.o12
    /* JADX INFO: renamed from: c */
    public final Object[] mo5200c() {
        return this.f29824e.mo5200c();
    }

    @Override // p000.o12
    /* JADX INFO: renamed from: d */
    public final int mo5201d() {
        return this.f29824e.mo5202e() + this.f29822c + this.f29823d;
    }

    @Override // p000.o12
    /* JADX INFO: renamed from: e */
    public final int mo5202e() {
        return this.f29824e.mo5202e() + this.f29822c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        dt0.m4717s(i, this.f29823d);
        return this.f29824e.get(i + this.f29822c);
    }

    @Override // p000.u12, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p000.u12, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29823d;
    }

    @Override // p000.u12, java.util.List
    /* JADX INFO: renamed from: t */
    public final u12 subList(int i, int i2) {
        dt0.m4721w(i, i2, this.f29823d);
        int i3 = this.f29822c;
        return this.f29824e.subList(i + i3, i2 + i3);
    }

    @Override // p000.u12, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
