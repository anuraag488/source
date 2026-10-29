package p000;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ow1 implements ListIterator, cc2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f27159a;

    /* JADX INFO: renamed from: b */
    public int f27160b;

    /* JADX INFO: renamed from: c */
    public int f27161c;

    /* JADX INFO: renamed from: d */
    public int f27162d;

    /* JADX INFO: renamed from: e */
    public Object f27163e;

    public ow1(w94 w94Var, int i) {
        this.f27159a = (byte) 3;
        this.f27163e = w94Var;
        this.f27160b = i - 1;
        this.f27161c = -1;
        this.f27162d = ((dc4) k94.m7449f(w94Var.f33182a)).f16983e;
    }

    /* JADX INFO: renamed from: a */
    public void m9316a() {
        if (((AbstractList) ((rl2) this.f27163e).f29395e).modCount == this.f27162d) {
            return;
        }
        C1077qn.m9983c();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f27159a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                m9316a();
                rl2 rl2Var = (rl2) this.f27163e;
                int i = this.f27160b;
                this.f27160b = i + 1;
                rl2Var.add(i, obj);
                this.f27161c = -1;
                this.f27162d = ((AbstractList) rl2Var).modCount;
                return;
            case 2:
                m9317b();
                sl2 sl2Var = (sl2) this.f27163e;
                int i2 = this.f27160b;
                this.f27160b = i2 + 1;
                sl2Var.add(i2, obj);
                this.f27161c = -1;
                this.f27162d = ((AbstractList) sl2Var).modCount;
                return;
            default:
                m9318c();
                w94 w94Var = (w94) this.f27163e;
                w94Var.add(this.f27160b + 1, obj);
                this.f27161c = -1;
                this.f27160b++;
                this.f27162d = ((dc4) k94.m7449f(w94Var.f33182a)).f16983e;
                return;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m9317b() {
        if (((AbstractList) ((sl2) this.f27163e)).modCount == this.f27162d) {
            return;
        }
        C1077qn.m9983c();
    }

    /* JADX INFO: renamed from: c */
    public void m9318c() {
        if (((dc4) k94.m7449f(((w94) this.f27163e).f33182a)).f16983e == this.f27162d) {
            return;
        }
        C1077qn.m9983c();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f27159a) {
            case 0:
                return this.f27160b < this.f27162d;
            case 1:
                return this.f27160b < ((rl2) this.f27163e).f29393c;
            case 2:
                return this.f27160b < ((sl2) this.f27163e).f30374b;
            default:
                return this.f27160b < ((w94) this.f27163e).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f27159a) {
            case 0:
                return this.f27160b > this.f27161c;
            case 1:
                return this.f27160b > 0;
            case 2:
                return this.f27160b > 0;
            default:
                return this.f27160b >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f27159a) {
            case 0:
                cw2 cw2Var = ((qw1) this.f27163e).f28847a;
                int i = this.f27160b;
                this.f27160b = i + 1;
                return (mt2) cw2Var.m4206g(i);
            case 1:
                m9316a();
                int i2 = this.f27160b;
                rl2 rl2Var = (rl2) this.f27163e;
                if (i2 >= rl2Var.f29393c) {
                    xy4.m12795x();
                    return null;
                }
                this.f27160b = i2 + 1;
                this.f27161c = i2;
                return rl2Var.f29391a[rl2Var.f29392b + i2];
            case 2:
                m9317b();
                int i3 = this.f27160b;
                sl2 sl2Var = (sl2) this.f27163e;
                if (i3 >= sl2Var.f30374b) {
                    xy4.m12795x();
                    return null;
                }
                this.f27160b = i3 + 1;
                this.f27161c = i3;
                return sl2Var.f30373a[i3];
            default:
                m9318c();
                int i4 = this.f27160b + 1;
                this.f27161c = i4;
                w94 w94Var = (w94) this.f27163e;
                zt5.m13767M(i4, w94Var.size());
                Object obj = w94Var.get(i4);
                this.f27160b = i4;
                return obj;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f27159a) {
            case 0:
                return this.f27160b - this.f27161c;
            case 1:
                return this.f27160b;
            case 2:
                return this.f27160b;
            default:
                return this.f27160b + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f27159a) {
            case 0:
                cw2 cw2Var = ((qw1) this.f27163e).f28847a;
                int i = this.f27160b - 1;
                this.f27160b = i;
                return (mt2) cw2Var.m4206g(i);
            case 1:
                m9316a();
                int i2 = this.f27160b;
                if (i2 <= 0) {
                    xy4.m12795x();
                    return null;
                }
                int i3 = i2 - 1;
                this.f27160b = i3;
                this.f27161c = i3;
                rl2 rl2Var = (rl2) this.f27163e;
                return rl2Var.f29391a[rl2Var.f29392b + i3];
            case 2:
                m9317b();
                int i4 = this.f27160b;
                if (i4 <= 0) {
                    xy4.m12795x();
                    return null;
                }
                int i5 = i4 - 1;
                this.f27160b = i5;
                this.f27161c = i5;
                return ((sl2) this.f27163e).f30373a[i5];
            default:
                m9318c();
                int i6 = this.f27160b;
                w94 w94Var = (w94) this.f27163e;
                zt5.m13767M(i6, w94Var.size());
                int i7 = this.f27160b;
                this.f27161c = i7;
                Object obj = w94Var.get(i7);
                this.f27160b--;
                return obj;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f27159a) {
            case 0:
                return (this.f27160b - this.f27161c) - 1;
            case 1:
                i = this.f27160b;
                break;
            case 2:
                i = this.f27160b;
                break;
            default:
                return this.f27160b;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f27159a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                rl2 rl2Var = (rl2) this.f27163e;
                m9316a();
                int i = this.f27161c;
                if (i == -1) {
                    C1077qn.m9989o("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                rl2Var.mo3089b(i);
                this.f27160b = this.f27161c;
                this.f27161c = -1;
                this.f27162d = ((AbstractList) rl2Var).modCount;
                return;
            case 2:
                sl2 sl2Var = (sl2) this.f27163e;
                m9317b();
                int i2 = this.f27161c;
                if (i2 == -1) {
                    C1077qn.m9989o("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                sl2Var.mo3089b(i2);
                this.f27160b = this.f27161c;
                this.f27161c = -1;
                this.f27162d = ((AbstractList) sl2Var).modCount;
                return;
            default:
                m9318c();
                w94 w94Var = (w94) this.f27163e;
                w94Var.remove(this.f27161c);
                this.f27160b--;
                this.f27161c = -1;
                this.f27162d = ((dc4) k94.m7449f(w94Var.f33182a)).f16983e;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f27159a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                m9316a();
                int i = this.f27161c;
                if (i != -1) {
                    ((rl2) this.f27163e).set(i, obj);
                    return;
                } else {
                    C1077qn.m9989o("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                m9317b();
                int i2 = this.f27161c;
                if (i2 != -1) {
                    ((sl2) this.f27163e).set(i2, obj);
                    return;
                } else {
                    C1077qn.m9989o("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                w94 w94Var = (w94) this.f27163e;
                m9318c();
                int i3 = this.f27161c;
                if (i3 < 0) {
                    C1077qn.m9989o("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    w94Var.set(i3, obj);
                    this.f27162d = ((dc4) k94.m7449f(w94Var.f33182a)).f16983e;
                    return;
                }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ow1(qw1 qw1Var, int i, int i2) {
        this(qw1Var, (i2 & 1) != 0 ? 0 : i, 0, qw1Var.f28847a.f16533b);
        this.f27159a = (byte) 0;
    }

    public /* synthetic */ ow1(byte b) {
        this.f27159a = b;
    }

    public ow1(qw1 qw1Var, int i, int i2, int i3) {
        this.f27159a = (byte) 0;
        this.f27163e = qw1Var;
        this.f27160b = i;
        this.f27161c = i2;
        this.f27162d = i3;
    }
}
