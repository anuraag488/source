package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class id0 implements xq2, mr3 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1299wn f21274a;

    /* JADX INFO: renamed from: b */
    public final C0779iz f21275b;

    public id0(InterfaceC1299wn interfaceC1299wn, C0779iz c0779iz) {
        this.f21274a = interfaceC1299wn;
        this.f21275b = c0779iz;
    }

    @Override // p000.xq2
    /* JADX INFO: renamed from: a */
    public final int mo6053a(s62 s62Var, List list, int i) {
        int iMo3579U = s62Var.mo3579U(this.f21274a.mo11068a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            sq2 sq2Var = (sq2) list.get(i3);
            float fM13044y = y70.m13044y(y70.m13043x(sq2Var));
            int iMo5827h = sq2Var.mo5827h(i);
            if (fM13044y == 0.0f) {
                i2 += iMo5827h;
            } else if (fM13044y > 0.0f) {
                f += fM13044y;
                iMax = Math.max(iMax, Math.round(iMo5827h / fM13044y));
            }
        }
        return ((list.size() - 1) * iMo3579U) + Math.round(iMax * f) + i2;
    }

    @Override // p000.xq2
    /* JADX INFO: renamed from: b */
    public final int mo5762b(s62 s62Var, List list, int i) {
        int iMo3579U = s62Var.mo3579U(this.f21274a.mo11068a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iMo3579U, i);
        List list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            sq2 sq2Var = (sq2) list.get(i2);
            float fM13044y = y70.m13044y(y70.m13043x(sq2Var));
            if (fM13044y == 0.0f) {
                int iMin2 = Math.min(sq2Var.mo5827h(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, sq2Var.mo5824Z(iMin2));
            } else if (fM13044y > 0.0f) {
                f += fM13044y;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            sq2 sq2Var2 = (sq2) list.get(i3);
            float fM13044y2 = y70.m13044y(y70.m13043x(sq2Var2));
            if (fM13044y2 > 0.0f) {
                iMax = Math.max(iMax, sq2Var2.mo5824Z(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM13044y2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // p000.mr3
    /* JADX INFO: renamed from: c */
    public final void mo4520c(int i, int[] iArr, int[] iArr2, zq2 zq2Var) {
        this.f21274a.mo10874h(zq2Var, i, iArr, iArr2);
    }

    @Override // p000.mr3
    /* JADX INFO: renamed from: d */
    public final long mo4521d(int i, int i2, int i3, boolean z) {
        return !z ? ll0.m8009a(0, i3, i, i2) : C0638f5.m5547r(0, i3, i, i2);
    }

    @Override // p000.mr3
    /* JADX INFO: renamed from: e */
    public final int mo4522e(db3 db3Var) {
        return db3Var.f16899a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id0)) {
            return false;
        }
        id0 id0Var = (id0) obj;
        return this.f21274a.equals(id0Var.f21274a) && this.f21275b.equals(id0Var.f21275b);
    }

    @Override // p000.xq2
    /* JADX INFO: renamed from: f */
    public final yq2 mo5763f(zq2 zq2Var, List list, long j) {
        return ks5.m7624z(this, kl0.m7540j(j), kl0.m7541k(j), kl0.m7538h(j), kl0.m7539i(j), zq2Var.mo3579U(this.f21274a.mo11068a()), zq2Var, list, new db3[list.size()], 0, list.size(), null, 0);
    }

    @Override // p000.xq2
    /* JADX INFO: renamed from: g */
    public final int mo6054g(s62 s62Var, List list, int i) {
        int iMo3579U = s62Var.mo3579U(this.f21274a.mo11068a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            sq2 sq2Var = (sq2) list.get(i3);
            float fM13044y = y70.m13044y(y70.m13043x(sq2Var));
            int iMo5825b0 = sq2Var.mo5825b0(i);
            if (fM13044y == 0.0f) {
                i2 += iMo5825b0;
            } else if (fM13044y > 0.0f) {
                f += fM13044y;
                iMax = Math.max(iMax, Math.round(iMo5825b0 / fM13044y));
            }
        }
        return ((list.size() - 1) * iMo3579U) + Math.round(iMax * f) + i2;
    }

    @Override // p000.mr3
    /* JADX INFO: renamed from: h */
    public final int mo4523h(db3 db3Var) {
        return db3Var.f16900b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f21275b.f21896a) + (this.f21274a.hashCode() * 31);
    }

    @Override // p000.xq2
    /* JADX INFO: renamed from: i */
    public final int mo6055i(s62 s62Var, List list, int i) {
        int iMo3579U = s62Var.mo3579U(this.f21274a.mo11068a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iMo3579U, i);
        List list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            sq2 sq2Var = (sq2) list.get(i2);
            float fM13044y = y70.m13044y(y70.m13043x(sq2Var));
            if (fM13044y == 0.0f) {
                int iMin2 = Math.min(sq2Var.mo5827h(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, sq2Var.mo5823W(iMin2));
            } else if (fM13044y > 0.0f) {
                f += fM13044y;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            sq2 sq2Var2 = (sq2) list.get(i3);
            float fM13044y2 = y70.m13044y(y70.m13043x(sq2Var2));
            if (fM13044y2 > 0.0f) {
                iMax = Math.max(iMax, sq2Var2.mo5823W(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM13044y2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // p000.mr3
    /* JADX INFO: renamed from: j */
    public final yq2 mo4524j(db3[] db3VarArr, zq2 zq2Var, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        qb0 qb0Var = new qb0((byte) 1);
        qb0Var.f28353c = db3VarArr;
        qb0Var.f28354d = this;
        qb0Var.f28352b = i2;
        qb0Var.f28355e = zq2Var;
        qb0Var.f28356f = iArr;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(i2, i, w71.f33134a, qb0Var);
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f21274a + ", horizontalAlignment=" + this.f21275b + ")";
    }
}
