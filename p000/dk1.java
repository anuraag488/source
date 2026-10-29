package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dk1 implements mr3 {

    /* JADX INFO: renamed from: a */
    public InterfaceC1188tn f17113a;

    /* JADX INFO: renamed from: b */
    public InterfaceC1299wn f17114b;

    /* JADX INFO: renamed from: c */
    public float f17115c;

    /* JADX INFO: renamed from: d */
    public ur0 f17116d;

    /* JADX INFO: renamed from: e */
    public float f17117e;

    /* JADX INFO: renamed from: f */
    public bk1 f17118f;

    /* JADX INFO: renamed from: a */
    public final int m4519a(List list, int i, int i2, int i3, bk1 bk1Var) {
        long jM7022b;
        if (list.isEmpty()) {
            jM7022b = j52.m7022b(0, 0);
        } else {
            C1411zn c1411zn = new C1411zn(bk1Var, ll0.m8009a(0, i, 0, Integer.MAX_VALUE), i2, i3);
            sq2 sq2Var = (sq2) hb0.m6302N0(list, 0);
            int iMo5825b0 = sq2Var != null ? sq2Var.mo5825b0(i) : 0;
            int iMo5823W = sq2Var != null ? sq2Var.mo5823W(iMo5825b0) : 0;
            boolean z = true;
            if (list.size() <= 1) {
                z = false;
            }
            int i4 = 0;
            if (c1411zn.m13643b(z, 0, j52.m7022b(i, Integer.MAX_VALUE), sq2Var == null ? null : j52.m7021a(j52.m7022b(iMo5823W, iMo5825b0)), 0, 0, 0, false, false).f35264b) {
                j52 j52VarM3611a = bk1Var.m3611a(0, 0, sq2Var != null);
                jM7022b = j52.m7022b(j52VarM3611a != null ? (int) (j52VarM3611a.f22027a & 4294967295L) : 0, 0);
            } else {
                int size = list.size();
                int i5 = i;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                while (i6 < size) {
                    int i11 = i5 - iMo5823W;
                    int i12 = i6 + 1;
                    int iMax = Math.max(i10, iMo5825b0);
                    sq2 sq2Var2 = (sq2) hb0.m6302N0(list, i12);
                    int iMo5825b1 = sq2Var2 != null ? sq2Var2.mo5825b0(i) : 0;
                    int iMo5823W2 = sq2Var2 != null ? sq2Var2.mo5823W(iMo5825b1) + i2 : 0;
                    int i13 = i12 - i8;
                    int i14 = i9;
                    int i15 = iMo5825b1;
                    int i16 = iMo5823W2;
                    yj1 yj1VarM13643b = c1411zn.m13643b(i6 + 2 < list.size() ? z : false, i13, j52.m7022b(i11, Integer.MAX_VALUE), sq2Var2 == null ? null : j52.m7021a(j52.m7022b(iMo5823W2, iMo5825b1)), i14, i4, iMax, false, false);
                    if (yj1VarM13643b.f35263a) {
                        int i17 = iMax + i3 + i4;
                        xj1 xj1VarM13642a = c1411zn.m13642a(yj1VarM13643b, sq2Var2 != null ? z : false, i14, i17, i11, i13);
                        int i18 = i16 - i2;
                        i9 = i14 + 1;
                        if (yj1VarM13643b.f35264b) {
                            if (xj1VarM13642a != null) {
                                long j = xj1VarM13642a.f34319c;
                                if (!xj1VarM13642a.f34320d) {
                                    i17 += ((int) (j & 4294967295L)) + i3;
                                }
                            }
                            i4 = i17;
                            i7 = i12;
                            break;
                        }
                        i10 = 0;
                        i4 = i17;
                        iMo5823W = i18;
                        i8 = i12;
                        i5 = i;
                    } else {
                        i5 = i11;
                        i9 = i14;
                        i10 = iMax;
                        iMo5823W = i16;
                    }
                    i6 = i12;
                    i7 = i6;
                    iMo5825b0 = i15;
                }
                jM7022b = j52.m7022b(i4 - i3, i7);
            }
        }
        return (int) (jM7022b >> 32);
    }

    @Override // p000.mr3
    /* JADX INFO: renamed from: c */
    public final void mo4520c(int i, int[] iArr, int[] iArr2, zq2 zq2Var) {
        this.f17113a.mo10373g(zq2Var, i, iArr, zq2Var.getLayoutDirection(), iArr2);
    }

    @Override // p000.mr3
    /* JADX INFO: renamed from: d */
    public final long mo4521d(int i, int i2, int i3, boolean z) {
        pr3 pr3Var = or3.f26994a;
        return !z ? ll0.m8009a(i, i2, 0, i3) : C0638f5.m5548s(i, i2, 0, i3);
    }

    @Override // p000.mr3
    /* JADX INFO: renamed from: e */
    public final int mo4522e(db3 db3Var) {
        return db3Var.mo4420i0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk1)) {
            return false;
        }
        dk1 dk1Var = (dk1) obj;
        return this.f17113a.equals(dk1Var.f17113a) && this.f17114b.equals(dk1Var.f17114b) && p11.m9352c(this.f17115c, dk1Var.f17115c) && this.f17116d.equals(dk1Var.f17116d) && p11.m9352c(this.f17117e, dk1Var.f17117e) && z62.m13387o(this.f17118f, dk1Var.f17118f);
    }

    @Override // p000.mr3
    /* JADX INFO: renamed from: h */
    public final int mo4523h(db3 db3Var) {
        return db3Var.mo4421j0();
    }

    public final int hashCode() {
        return this.f17118f.hashCode() + zi4.m13609i(Integer.MAX_VALUE, zi4.m13609i(Integer.MAX_VALUE, c75.m3874f(this.f17117e, (this.f17116d.hashCode() + c75.m3874f(this.f17115c, (this.f17114b.hashCode() + ((this.f17113a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, 31)) * 31, 31), 31), 31);
    }

    @Override // p000.mr3
    /* JADX INFO: renamed from: j */
    public final yq2 mo4524j(db3[] db3VarArr, zq2 zq2Var, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        df2 df2Var = df2.f17011a;
        ck1 ck1Var = new ck1();
        ck1Var.f16077a = iArr2;
        ck1Var.f16078b = i3;
        ck1Var.f16079c = i4;
        ck1Var.f16080d = i5;
        ck1Var.f16081e = db3VarArr;
        ck1Var.f16082f = this;
        ck1Var.f16083g = i2;
        ck1Var.f16084h = df2Var;
        ck1Var.f16085i = iArr;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(i, i2, w71.f33134a, ck1Var);
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.f17113a + ", verticalArrangement=" + this.f17114b + ", mainAxisSpacing=" + p11.m9353d(this.f17115c) + ", crossAxisAlignment=" + this.f17116d + ", crossAxisArrangementSpacing=" + p11.m9353d(this.f17117e) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.f17118f + ")";
    }
}
