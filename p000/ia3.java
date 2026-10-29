package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ia3 implements Iterator, cc2 {

    /* JADX INFO: renamed from: a */
    public final aq4[] f21202a;

    /* JADX INFO: renamed from: b */
    public int f21203b;

    /* JADX INFO: renamed from: c */
    public boolean f21204c = true;

    public ia3(zp4 zp4Var, aq4[] aq4VarArr) {
        this.f21202a = aq4VarArr;
        aq4VarArr[0].m3115a(zp4Var.f36256d, Integer.bitCount(zp4Var.f36253a) * 2, 0);
        this.f21203b = 0;
        m6707a();
    }

    /* JADX INFO: renamed from: a */
    public final void m6707a() {
        int i = this.f21203b;
        aq4[] aq4VarArr = this.f21202a;
        aq4 aq4Var = aq4VarArr[i];
        if (aq4Var.f14780c < aq4Var.f14779b) {
            return;
        }
        while (-1 < i) {
            int iM6708b = m6708b(i);
            if (iM6708b == -1) {
                aq4 aq4Var2 = aq4VarArr[i];
                int i2 = aq4Var2.f14780c;
                Object[] objArr = aq4Var2.f14778a;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    aq4Var2.f14780c = i2 + 1;
                    iM6708b = m6708b(i);
                }
            }
            if (iM6708b != -1) {
                this.f21203b = iM6708b;
                return;
            }
            if (i > 0) {
                aq4 aq4Var3 = aq4VarArr[i - 1];
                int i3 = aq4Var3.f14780c;
                int length2 = aq4Var3.f14778a.length;
                aq4Var3.f14780c = i3 + 1;
            }
            aq4VarArr[i].m3115a(zp4.f36252e.f36256d, 0, 0);
            i--;
        }
        this.f21204c = false;
    }

    /* JADX INFO: renamed from: b */
    public final int m6708b(int i) {
        aq4[] aq4VarArr = this.f21202a;
        aq4 aq4Var = aq4VarArr[i];
        int i2 = aq4Var.f14780c;
        if (i2 < aq4Var.f14779b) {
            return i;
        }
        Object[] objArr = aq4Var.f14778a;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        zp4 zp4Var = (zp4) objArr[i2];
        if (i == 6) {
            aq4 aq4Var2 = aq4VarArr[i + 1];
            Object[] objArr2 = zp4Var.f36256d;
            aq4Var2.m3115a(objArr2, objArr2.length, 0);
        } else {
            aq4VarArr[i + 1].m3115a(zp4Var.f36256d, Integer.bitCount(zp4Var.f36253a) * 2, 0);
        }
        return m6708b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21204c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f21204c) {
            xy4.m12795x();
            return null;
        }
        Object next = this.f21202a[this.f21203b].next();
        m6707a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
