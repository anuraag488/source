package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class go4 implements xq2 {

    /* JADX INFO: renamed from: a */
    public C0655fl f19994a;

    /* JADX INFO: renamed from: b */
    public float f19995b;

    /* JADX INFO: renamed from: c */
    public e73 f19996c;

    @Override // p000.xq2
    /* JADX INFO: renamed from: a */
    public final int mo6053a(s62 s62Var, List list, int i) {
        Integer numValueOf;
        int iMo3579U = s62Var.mo3579U(this.f19995b);
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
        return Math.max(iMo3579U, numValueOf != null ? numValueOf.intValue() : 0);
    }

    @Override // p000.xq2
    /* JADX INFO: renamed from: b */
    public final int mo5762b(s62 s62Var, List list, int i) {
        int size = list.size();
        int iMo5824Z = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iMo5824Z += ((sq2) list.get(i2)).mo5824Z(i);
        }
        return iMo5824Z;
    }

    @Override // p000.xq2
    /* JADX INFO: renamed from: f */
    public final yq2 mo5763f(zq2 zq2Var, List list, long j) {
        int iM7539i;
        ho4 ho4Var;
        e73 e73Var = this.f19996c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sq2 sq2Var = (sq2) list.get(i);
            if (z62.m13387o(qq2.m10035s(sq2Var), "navigationIcon")) {
                db3 db3VarMo5826e = sq2Var.mo5826e(kl0.m7532b(j, 0, 0, 0, 0, 14));
                List list2 = list;
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    sq2 sq2Var2 = (sq2) list.get(i2);
                    if (z62.m13387o(qq2.m10035s(sq2Var2), "actionIcons")) {
                        db3 db3VarMo5826e2 = sq2Var2.mo5826e(kl0.m7532b(j, 0, 0, 0, 0, 14));
                        float fM5681t = AbstractC0647fd.m5681t(e73Var, zq2Var.getLayoutDirection());
                        float fM5680s = AbstractC0647fd.m5680s(e73Var, zq2Var.getLayoutDirection());
                        int iMax = Math.max(zq2Var.mo3579U(AbstractC0913ml.f24992a), db3VarMo5826e.f16899a);
                        if (kl0.m7539i(j) == Integer.MAX_VALUE) {
                            iM7539i = kl0.m7539i(j);
                        } else {
                            int iM7539i2 = (((kl0.m7539i(j) - iMax) - db3VarMo5826e2.f16899a) - zq2Var.mo3579U(fM5681t)) - zq2Var.mo3579U(fM5680s);
                            iM7539i = iM7539i2 < 0 ? 0 : iM7539i2;
                        }
                        int i3 = iM7539i;
                        int size3 = list2.size();
                        for (int i4 = 0; i4 < size3; i4++) {
                            sq2 sq2Var3 = (sq2) list.get(i4);
                            if (z62.m13387o(qq2.m10035s(sq2Var3), "title")) {
                                db3 db3VarMo5826e3 = sq2Var3.mo5826e(kl0.m7532b(j, 0, i3, 0, 0, 12));
                                dx1 dx1Var = AbstractC0681ga.f19682b;
                                if (db3VarMo5826e3.mo4419e0(dx1Var) != Integer.MIN_VALUE) {
                                    db3VarMo5826e3.mo4419e0(dx1Var);
                                }
                                a91 a91Var = this.f19994a.f19065a;
                                float fM13399h = (a91Var == null || (ho4Var = a91Var.f176a) == null) ? 0.0f : ho4Var.f20759d.m13399h();
                                int iM10010E = Float.isNaN(fM13399h) ? 0 : qq2.m10010E(fM13399h);
                                int iMax2 = Math.max(zq2Var.mo3579U(this.f19995b), db3VarMo5826e3.f16900b) + zq2Var.mo3579U(e73Var.mo3505d()) + zq2Var.mo3579U(e73Var.mo3504c());
                                if (kl0.m7538h(j) != Integer.MAX_VALUE) {
                                    int i5 = iMax2 + iM10010E;
                                    iMax2 = i5 >= 0 ? i5 : 0;
                                }
                                int iMo3579U = zq2Var.mo3579U(e73Var.mo3505d());
                                int iMo3579U2 = zq2Var.mo3579U(e73Var.mo3504c());
                                int iMo3579U3 = zq2Var.mo3579U(AbstractC0647fd.m5681t(e73Var, zq2Var.getLayoutDirection()));
                                int iMo3579U4 = zq2Var.mo3579U(AbstractC0647fd.m5680s(e73Var, zq2Var.getLayoutDirection()));
                                int i6 = (iMo3579U + iMax2) - iMo3579U2;
                                int iM7539i3 = kl0.m7539i(j);
                                fo4 fo4Var = new fo4();
                                fo4Var.f19182a = db3VarMo5826e;
                                fo4Var.f19183b = iMo3579U3;
                                fo4Var.f19184c = i6;
                                fo4Var.f19185d = db3VarMo5826e3;
                                fo4Var.f19186e = db3VarMo5826e2;
                                fo4Var.f19187f = j;
                                fo4Var.f19188g = iMo3579U4;
                                VarHandle.storeStoreFence();
                                return zq2Var.mo3583l0(iM7539i3, iMax2, w71.f33134a, fo4Var);
                            }
                        }
                        yl2.m13171b("Collection contains no element matching the predicate.");
                        xy4.m12794w();
                        return null;
                    }
                }
                yl2.m13171b("Collection contains no element matching the predicate.");
                xy4.m12794w();
                return null;
            }
        }
        yl2.m13171b("Collection contains no element matching the predicate.");
        xy4.m12794w();
        return null;
    }

    @Override // p000.xq2
    /* JADX INFO: renamed from: g */
    public final int mo6054g(s62 s62Var, List list, int i) {
        Integer numValueOf;
        int iMo3579U = s62Var.mo3579U(this.f19995b);
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
        return Math.max(iMo3579U, numValueOf != null ? numValueOf.intValue() : 0);
    }

    @Override // p000.xq2
    /* JADX INFO: renamed from: i */
    public final int mo6055i(s62 s62Var, List list, int i) {
        int size = list.size();
        int iMo5823W = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iMo5823W += ((sq2) list.get(i2)).mo5823W(i);
        }
        return iMo5823W;
    }
}
