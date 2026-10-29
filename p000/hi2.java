package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hi2 {

    /* JADX INFO: renamed from: a */
    public si2 f20597a;

    /* JADX INFO: renamed from: b */
    public fi2 f20598b;

    /* JADX INFO: renamed from: c */
    public sg2 f20599c;

    /* JADX INFO: renamed from: d */
    public C0795je f20600d;

    /* JADX INFO: renamed from: a */
    public final void m6407a(int i, Object obj, mi0 mi0Var, int i2) {
        int i3;
        Object obj2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-462424778);
        int i4 = (ir1Var.m6886e(i) ? 4 : 2) | i2 | (ir1Var.m6894i(obj) ? 32 : 16) | (ir1Var.m6890g(this) ? 256 : 128);
        byte b = 0;
        byte b2 = 1;
        if (ir1Var.m6871T(i4 & 1, (i4 & 147) != 146)) {
            sh2 sh2Var = this.f20597a.f30312r;
            gi2 gi2Var = new gi2(b);
            gi2Var.f19805c = this;
            gi2Var.f19804b = i;
            VarHandle.storeStoreFence();
            i3 = i;
            obj2 = obj;
            y70.m13022b(obj2, i3, sh2Var, vd6.m11834R(-824725566, gi2Var, ir1Var), ir1Var, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        } else {
            i3 = i;
            obj2 = obj;
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            mh2 mh2Var = new mh2(b2);
            mh2Var.f24914b = this;
            mh2Var.f24915c = i3;
            mh2Var.f24916d = obj2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = mh2Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m6408b(int i) {
        fi2 fi2Var = this.f20598b;
        fi2Var.getClass();
        r62 r62VarM7079d = fi2Var.f19015a.m7079d(i);
        return ((yp1) r62VarM7079d.f29058c.f22482c).invoke(Integer.valueOf(i - r62VarM7079d.f29056a));
    }

    /* JADX INFO: renamed from: c */
    public final int m6409c() {
        fi2 fi2Var = this.f20598b;
        fi2Var.getClass();
        return fi2Var.f19015a.f22193b;
    }

    /* JADX INFO: renamed from: d */
    public final Object m6410d(int i) {
        Object objInvoke;
        C0795je c0795je = this.f20600d;
        Object[] objArr = (Object[]) c0795je.f22195d;
        int i2 = i - c0795je.f22193b;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        if (obj != null) {
            return obj;
        }
        fi2 fi2Var = this.f20598b;
        fi2Var.getClass();
        r62 r62VarM7079d = fi2Var.f19015a.m7079d(i);
        int i3 = i - r62VarM7079d.f29056a;
        yp1 yp1Var = (yp1) r62VarM7079d.f29058c.f22481b;
        return (yp1Var == null || (objInvoke = yp1Var.invoke(Integer.valueOf(i3))) == null) ? new hw0(i) : objInvoke;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hi2) {
            return z62.m13387o(this.f20598b, ((hi2) obj).f20598b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20598b.hashCode();
    }
}
