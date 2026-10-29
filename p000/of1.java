package p000;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class of1 implements Iterator, cc2 {

    /* JADX INFO: renamed from: a */
    public byte f26666a;

    /* JADX INFO: renamed from: b */
    public File f26667b;

    /* JADX INFO: renamed from: c */
    public ArrayDeque f26668c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ iy0 f26669d;

    /* JADX INFO: renamed from: a */
    public final kf1 m9054a(File file) {
        int iOrdinal = ((qf1) this.f26669d.f21874d).ordinal();
        if (iOrdinal == 0) {
            return new nf1(file);
        }
        if (iOrdinal == 1) {
            return new lf1(file);
        }
        C0670g.m5864c();
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9055b() {
        File file;
        this.f26666a = (byte) 3;
        ArrayDeque arrayDeque = this.f26668c;
        while (true) {
            pf1 pf1Var = (pf1) arrayDeque.peek();
            if (pf1Var == null) {
                file = null;
                break;
            }
            File fileMo7961a = pf1Var.mo7961a();
            if (fileMo7961a == null) {
                arrayDeque.pop();
            } else {
                if (fileMo7961a.equals(pf1Var.f27578a) || !fileMo7961a.isDirectory() || arrayDeque.size() >= this.f26669d.f21872b) {
                    file = fileMo7961a;
                    break;
                }
                arrayDeque.push(m9054a(fileMo7961a));
            }
        }
        if (file == null) {
            this.f26666a = (byte) 2;
            return false;
        }
        this.f26667b = file;
        this.f26666a = (byte) 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.f26666a;
        if (b == 0) {
            return m9055b();
        }
        if (b == 1) {
            return true;
        }
        if (b == 2) {
            return false;
        }
        C1077qn.m9987m("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.f26666a;
        if (b == 1) {
            this.f26666a = (byte) 0;
            return this.f26667b;
        }
        if (b == 2 || !m9055b()) {
            xy4.m12795x();
            return null;
        }
        this.f26666a = (byte) 0;
        return this.f26667b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
