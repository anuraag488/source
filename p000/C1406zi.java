package p000;

import java.util.List;

/* JADX INFO: renamed from: zi */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1406zi implements xq2 {

    /* JADX INFO: renamed from: a */
    public C0727hj f36102a;

    /* JADX INFO: renamed from: b */
    public db3[] f36103b;

    /* JADX INFO: renamed from: c */
    public db3[] f36104c;

    /* JADX INFO: renamed from: d */
    public int f36105d;

    /* JADX INFO: renamed from: e */
    public int f36106e;

    /* JADX INFO: renamed from: f */
    public int f36107f;

    /* JADX INFO: renamed from: g */
    public int f36108g;

    /* JADX INFO: renamed from: h */
    public C1369yi f36109h;

    /* JADX INFO: renamed from: i */
    public C1369yi f36110i;

    @Override // p000.xq2
    /* JADX INFO: renamed from: a */
    public final int mo6053a(s62 s62Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((sq2) list.get(0)).mo5827h(i));
            int iM7689T = kx5.m7689T(list);
            int i2 = 1;
            if (1 <= iM7689T) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((sq2) list.get(i2)).mo5827h(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iM7689T) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p000.xq2
    /* JADX INFO: renamed from: b */
    public final int mo5762b(s62 s62Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((sq2) list.get(0)).mo5824Z(i));
            int iM7689T = kx5.m7689T(list);
            int i2 = 1;
            if (1 <= iM7689T) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((sq2) list.get(i2)).mo5824Z(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iM7689T) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p000.xq2
    /* JADX INFO: renamed from: f */
    public final yq2 mo5763f(zq2 zq2Var, List list, long j) {
        l73 l73Var;
        C0727hj c0727hj = this.f36102a;
        int size = list.size();
        db3[] db3VarArr = new db3[size];
        List list2 = list;
        int size2 = list2.size();
        long j2 = 0;
        for (int i = 0; i < size2; i++) {
            sq2 sq2Var = (sq2) list.get(i);
            Object objMo4423m = sq2Var.mo4423m();
            C0529cj c0529cj = objMo4423m instanceof C0529cj ? (C0529cj) objMo4423m : null;
            if (c0529cj != null && ((Boolean) c0529cj.f16056a.getValue()).booleanValue()) {
                db3 db3VarMo5826e = sq2Var.mo5826e(j);
                long j3 = (((long) db3VarMo5826e.f16900b) & 4294967295L) | (((long) db3VarMo5826e.f16899a) << 32);
                db3VarArr[i] = db3VarMo5826e;
                j2 = j3;
            }
        }
        int size3 = list2.size();
        for (int i2 = 0; i2 < size3; i2++) {
            sq2 sq2Var2 = (sq2) list.get(i2);
            if (db3VarArr[i2] == null) {
                db3VarArr[i2] = sq2Var2.mo5826e(j);
            }
        }
        if (zq2Var.mo3587z()) {
            l73Var = new l73(Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (j2 & 4294967295L)));
        } else {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                db3 db3Var = db3VarArr[i5];
                if (db3Var != null) {
                    Object objMo4423m2 = ((sq2) list.get(i5)).mo4423m();
                    C0529cj c0529cj2 = objMo4423m2 instanceof C0529cj ? (C0529cj) objMo4423m2 : null;
                    if (c0529cj2 == null || !((Boolean) c0529cj2.f16057b.getValue()).booleanValue()) {
                        int i6 = db3Var.f16899a;
                        if (i6 > i3) {
                            i3 = i6;
                        }
                        int i7 = db3Var.f16900b;
                        if (i7 > i4) {
                            i4 = i7;
                        }
                    }
                }
            }
            l73Var = new l73(Integer.valueOf(i3), Integer.valueOf(i4));
        }
        int iIntValue = ((Number) l73Var.f23833a).intValue();
        int iIntValue2 = ((Number) l73Var.f23834b).intValue();
        boolean zMo3587z = zq2Var.mo3587z();
        w71 w71Var = w71.f33134a;
        if (zMo3587z) {
            this.f36103b = db3VarArr;
            this.f36105d = iIntValue;
            this.f36107f = iIntValue2;
            return zq2Var.mo3583l0(iIntValue, iIntValue2, w71Var, this.f36109h);
        }
        c0727hj.f20617c.setValue(w52.m12106a((((long) iIntValue) << 32) | (((long) iIntValue2) & 4294967295L)));
        this.f36104c = db3VarArr;
        this.f36106e = iIntValue;
        this.f36108g = iIntValue2;
        return zq2Var.mo3583l0(iIntValue, iIntValue2, w71Var, this.f36110i);
    }

    @Override // p000.xq2
    /* JADX INFO: renamed from: g */
    public final int mo6054g(s62 s62Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((sq2) list.get(0)).mo5825b0(i));
            int iM7689T = kx5.m7689T(list);
            int i2 = 1;
            if (1 <= iM7689T) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((sq2) list.get(i2)).mo5825b0(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iM7689T) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p000.xq2
    /* JADX INFO: renamed from: i */
    public final int mo6055i(s62 s62Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((sq2) list.get(0)).mo5823W(i));
            int iM7689T = kx5.m7689T(list);
            int i2 = 1;
            if (1 <= iM7689T) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((sq2) list.get(i2)).mo5823W(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iM7689T) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
