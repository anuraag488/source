package p000;

import java.lang.invoke.VarHandle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qp2 implements Iterator, cc2 {

    /* JADX INFO: renamed from: a */
    public final sp2 f28655a;

    /* JADX INFO: renamed from: b */
    public int f28656b;

    /* JADX INFO: renamed from: c */
    public int f28657c = -1;

    /* JADX INFO: renamed from: d */
    public int f28658d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ byte f28659e;

    public qp2(sp2 sp2Var, byte b) {
        this.f28659e = b;
        this.f28655a = sp2Var;
        this.f28658d = sp2Var.f30467h;
        m10002b();
    }

    /* JADX INFO: renamed from: a */
    public final void m10001a() {
        if (this.f28655a.f30467h == this.f28658d) {
            return;
        }
        C1077qn.m9983c();
    }

    /* JADX INFO: renamed from: b */
    public final void m10002b() {
        while (true) {
            int i = this.f28656b;
            sp2 sp2Var = this.f28655a;
            if (i >= sp2Var.f30465f || sp2Var.f30462c[i] >= 0) {
                return;
            } else {
                this.f28656b = i + 1;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28656b < this.f28655a.f30465f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.f28659e;
        sp2 sp2Var = this.f28655a;
        switch (b) {
            case 0:
                m10001a();
                int i = this.f28656b;
                if (i >= sp2Var.f30465f) {
                    xy4.m12795x();
                    return null;
                }
                this.f28656b = i + 1;
                this.f28657c = i;
                rp2 rp2Var = new rp2();
                rp2Var.f29511a = sp2Var;
                rp2Var.f29512b = i;
                rp2Var.f29513c = sp2Var.f30467h;
                VarHandle.storeStoreFence();
                m10002b();
                return rp2Var;
            case 1:
                m10001a();
                int i2 = this.f28656b;
                if (i2 >= sp2Var.f30465f) {
                    xy4.m12795x();
                    return null;
                }
                this.f28656b = i2 + 1;
                this.f28657c = i2;
                Object obj = sp2Var.f30460a[i2];
                m10002b();
                return obj;
            default:
                m10001a();
                int i3 = this.f28656b;
                if (i3 >= sp2Var.f30465f) {
                    xy4.m12795x();
                    return null;
                }
                this.f28656b = i3 + 1;
                this.f28657c = i3;
                Object obj2 = sp2Var.f30461b[i3];
                m10002b();
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        m10001a();
        if (this.f28657c == -1) {
            C1077qn.m9989o("Call next() before removing element from the iterator.");
            return;
        }
        sp2 sp2Var = this.f28655a;
        sp2Var.m10894c();
        sp2Var.m10900j(this.f28657c);
        this.f28657c = -1;
        this.f28658d = sp2Var.f30467h;
    }
}
