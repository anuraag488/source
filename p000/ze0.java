package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ze0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f36009a;

    /* JADX INFO: renamed from: b */
    public int f36010b;

    /* JADX INFO: renamed from: c */
    public int f36011c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ af0 f36012d;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f36010b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        af0 af0Var = this.f36012d;
        if (af0Var.f14432d != this.f36009a) {
            C1077qn.m9983c();
            return null;
        }
        if (!hasNext()) {
            xy4.m12795x();
            return null;
        }
        int i = this.f36010b;
        this.f36011c = i;
        Object obj = af0Var.m2956d()[i];
        int i2 = this.f36010b + 1;
        if (i2 >= af0Var.f14433e) {
            i2 = -1;
        }
        this.f36010b = i2;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        af0 af0Var = this.f36012d;
        if (af0Var.f14432d != this.f36009a) {
            C1077qn.m9983c();
            return;
        }
        dt0.m4722x("no calls to next() since the last call to remove()", this.f36011c >= 0);
        this.f36009a += 32;
        af0Var.remove(af0Var.m2956d()[this.f36011c]);
        this.f36010b--;
        this.f36011c = -1;
    }
}
