package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ij */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0763ij implements xq2 {

    /* JADX INFO: renamed from: a */
    public C1184tj f21464a;

    /* JADX INFO: renamed from: b */
    public boolean f21465b;

    @Override // p000.xq2
    /* JADX INFO: renamed from: a */
    public final int mo6053a(s62 s62Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo5827h = ((sq2) list.get(0)).mo5827h(i);
        int iM7689T = kx5.m7689T(list);
        int i2 = 1;
        if (1 <= iM7689T) {
            while (true) {
                int iMo5827h2 = ((sq2) list.get(i2)).mo5827h(i);
                if (iMo5827h2 > iMo5827h) {
                    iMo5827h = iMo5827h2;
                }
                if (i2 == iM7689T) {
                    break;
                }
                i2++;
            }
        }
        return iMo5827h;
    }

    @Override // p000.xq2
    /* JADX INFO: renamed from: b */
    public final int mo5762b(s62 s62Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo5824Z = ((sq2) list.get(0)).mo5824Z(i);
        int iM7689T = kx5.m7689T(list);
        int i2 = 1;
        if (1 <= iM7689T) {
            while (true) {
                int iMo5824Z2 = ((sq2) list.get(i2)).mo5824Z(i);
                if (iMo5824Z2 > iMo5824Z) {
                    iMo5824Z = iMo5824Z2;
                }
                if (i2 == iM7689T) {
                    break;
                }
                i2++;
            }
        }
        return iMo5824Z;
    }

    @Override // p000.xq2
    /* JADX INFO: renamed from: f */
    public final yq2 mo5763f(zq2 zq2Var, List list, long j) {
        d83 d83Var = this.f21464a.f31187b;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            db3 db3VarMo5826e = ((sq2) list.get(i)).mo5826e(j);
            iMax = Math.max(iMax, db3VarMo5826e.f16899a);
            iMax2 = Math.max(iMax2, db3VarMo5826e.f16900b);
            arrayList.add(db3VarMo5826e);
        }
        byte b = 1;
        if (zq2Var.mo3587z()) {
            this.f21465b = true;
            d83Var.setValue(w52.m12106a((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        } else if (!this.f21465b) {
            d83Var.setValue(w52.m12106a((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        }
        return zq2Var.mo3583l0(iMax, iMax2, w71.f33134a, new C1183ti(arrayList, b));
    }

    @Override // p000.xq2
    /* JADX INFO: renamed from: g */
    public final int mo6054g(s62 s62Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo5825b0 = ((sq2) list.get(0)).mo5825b0(i);
        int iM7689T = kx5.m7689T(list);
        int i2 = 1;
        if (1 <= iM7689T) {
            while (true) {
                int iMo5825b1 = ((sq2) list.get(i2)).mo5825b0(i);
                if (iMo5825b1 > iMo5825b0) {
                    iMo5825b0 = iMo5825b1;
                }
                if (i2 == iM7689T) {
                    break;
                }
                i2++;
            }
        }
        return iMo5825b0;
    }

    @Override // p000.xq2
    /* JADX INFO: renamed from: i */
    public final int mo6055i(s62 s62Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo5823W = ((sq2) list.get(0)).mo5823W(i);
        int iM7689T = kx5.m7689T(list);
        int i2 = 1;
        if (1 <= iM7689T) {
            while (true) {
                int iMo5823W2 = ((sq2) list.get(i2)).mo5823W(i);
                if (iMo5823W2 > iMo5823W) {
                    iMo5823W = iMo5823W2;
                }
                if (i2 == iM7689T) {
                    break;
                }
                i2++;
            }
        }
        return iMo5823W;
    }
}
