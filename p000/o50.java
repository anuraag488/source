package p000;

import java.lang.invoke.VarHandle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class o50 extends t50 {

    /* JADX INFO: renamed from: d */
    public final byte[] f26351d;

    public o50(byte[] bArr) {
        this.f30784a = 0;
        bArr.getClass();
        this.f26351d = bArr;
    }

    @Override // p000.t50
    /* JADX INFO: renamed from: b */
    public byte mo7013b(int i) {
        return this.f26351d[i];
    }

    @Override // p000.t50
    /* JADX INFO: renamed from: e */
    public void mo7014e(int i, byte[] bArr) {
        System.arraycopy(this.f26351d, 0, bArr, 0, i);
    }

    @Override // p000.t50
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof t50) && size() == ((t50) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof o50)) {
                return obj.equals(this);
            }
            o50 o50Var = (o50) obj;
            int i = this.f30784a;
            int i2 = o50Var.f30784a;
            if (i == 0 || i2 == 0 || i == i2) {
                int size = size();
                if (size > o50Var.size()) {
                    xy4.m12779g(size, size());
                    return false;
                }
                if (size > o50Var.size()) {
                    StringBuilder sbM3883o = c75.m3883o("Ran off end of other: 0, ", size, ", ");
                    sbM3883o.append(o50Var.size());
                    throw new IllegalArgumentException(sbM3883o.toString());
                }
                byte[] bArr = o50Var.f26351d;
                int iMo7016m = mo7016m() + size;
                int iMo7016m2 = mo7016m();
                int iMo7016m3 = o50Var.mo7016m();
                while (iMo7016m2 < iMo7016m) {
                    if (this.f26351d[iMo7016m2] == bArr[iMo7016m3]) {
                        iMo7016m2++;
                        iMo7016m3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p000.t50
    /* JADX INFO: renamed from: g */
    public byte mo7015g(int i) {
        return this.f26351d[i];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        g50 g50Var = new g50((byte) 0);
        g50Var.f19618d = this;
        g50Var.f19616b = 0;
        g50Var.f19617c = size();
        VarHandle.storeStoreFence();
        return g50Var;
    }

    /* JADX INFO: renamed from: m */
    public int mo7016m() {
        return 0;
    }

    @Override // p000.t50
    public int size() {
        return this.f26351d.length;
    }
}
