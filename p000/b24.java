package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b24 implements Iterator, wm0, cc2 {

    /* JADX INFO: renamed from: a */
    public byte f15040a;

    /* JADX INFO: renamed from: b */
    public Object f15041b;

    /* JADX INFO: renamed from: c */
    public wm0 f15042c;

    /* JADX INFO: renamed from: a */
    public final RuntimeException m3410a() {
        byte b = this.f15040a;
        if (b == 4) {
            return new NoSuchElementException();
        }
        if (b == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + ((int) this.f15040a));
    }

    /* JADX INFO: renamed from: c */
    public final void m3411c(Object obj, bp3 bp3Var) {
        this.f15041b = obj;
        this.f15040a = (byte) 3;
        this.f15042c = bp3Var;
        ap0 ap0Var = ap0.f14763a;
    }

    @Override // p000.wm0
    public final ro0 getContext() {
        return r71.f29063a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b;
        while (true) {
            b = this.f15040a;
            if (b != 0) {
                break;
            }
            this.f15040a = (byte) 5;
            wm0 wm0Var = this.f15042c;
            this.f15042c = null;
            wm0Var.resumeWith(ju4.f22634a);
        }
        if (b == 1) {
            throw null;
        }
        if (b == 2 || b == 3) {
            return true;
        }
        if (b == 4) {
            return false;
        }
        throw m3410a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.f15040a;
        if (b == 0 || b == 1) {
            if (hasNext()) {
                return next();
            }
            xy4.m12795x();
            return null;
        }
        if (b == 2) {
            this.f15040a = (byte) 1;
            throw null;
        }
        if (b != 3) {
            throw m3410a();
        }
        this.f15040a = (byte) 0;
        Object obj = this.f15041b;
        this.f15041b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p000.wm0
    public final void resumeWith(Object obj) {
        k43.m7376J(obj);
        this.f15040a = (byte) 4;
    }
}
