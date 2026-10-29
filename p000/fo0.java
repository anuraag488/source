package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fo0 implements xq2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ uj2 f19161a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ pk4 f19162b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ yz4 f19163c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ zo0 f19164d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ yp1 f19165e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ xk4 f19166f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ vi3 f19167g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ ky0 f19168h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ e30 f19169i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ int f19170j;

    @Override // p000.xq2
    /* JADX INFO: renamed from: b */
    public final int mo5762b(s62 s62Var, List list, int i) {
        uj2 uj2Var = this.f19161a;
        uj2Var.f31912a.m12312a(s62Var.getLayoutDirection());
        C1122rv c1122rv = uj2Var.f31912a.f33437g;
        if (c1122rv != null) {
            return as4.m3261t(c1122rv.mo2952c());
        }
        C1077qn.m9989o("layoutIntrinsics must be called first");
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:104:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:48:0x0101  */
    /* JADX WARN: Code duplicated, block: B:53:0x0113  */
    /* JADX WARN: Code duplicated, block: B:56:0x011e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0124  */
    /* JADX WARN: Code duplicated, block: B:62:0x0128  */
    /* JADX WARN: Code duplicated, block: B:65:0x013a  */
    @Override // p000.xq2
    /* JADX INFO: renamed from: f */
    public final yq2 mo5763f(zq2 zq2Var, List list, long j) {
        jl4 jl4Var;
        int i;
        int iM7541k;
        int iM10675p;
        C1122rv c1122rv;
        kl4 kl4Var;
        jl4 jl4Var2;
        C1122rv c1122rv2;
        fo0 fo0Var;
        uj2 uj2Var;
        il4 il4Var;
        pk4 pk4Var = this.f19162b;
        uj2 uj2Var2 = this.f19161a;
        e94 e94VarM5353c0 = ev0.m5353c0();
        yp1 yp1VarMo3783e = e94VarM5353c0 != null ? e94VarM5353c0.mo3783e() : null;
        e94 e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
        try {
            kl4 kl4VarM11577d = uj2Var2.m11577d();
            ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
            jl4 jl4Var3 = kl4VarM11577d != null ? kl4VarM11577d.f23216a : null;
            wj4 wj4Var = uj2Var2.f31912a;
            df2 layoutDirection = zq2Var.getLayoutDirection();
            boolean z = wj4Var.f33433c;
            if (jl4Var3 != null) {
                yu2 yu2Var = jl4Var3.f22401b;
                il4 il4Var2 = jl4Var3.f22400a;
                C0875lk c0875lk = wj4Var.f33431a;
                xl4 xl4Var = wj4Var.f33432b;
                List list2 = wj4Var.f33436f;
                ky0 ky0Var = wj4Var.f33434d;
                am1 am1Var = wj4Var.f33435e;
                if (yu2Var.f35532a.mo2951b()) {
                    jl4Var = jl4Var3;
                } else {
                    C0875lk c0875lk2 = il4Var2.f21533a;
                    jl4 jl4Var4 = jl4Var3;
                    long j2 = il4Var2.f21542j;
                    if (z62.m13387o(c0875lk2, c0875lk) && il4Var2.f21534b.m12711c(xl4Var) && z62.m13387o(il4Var2.f21535c, list2)) {
                        i = Integer.MAX_VALUE;
                        if (il4Var2.f21536d == Integer.MAX_VALUE && il4Var2.f21537e == z && il4Var2.f21538f == 1 && z62.m13387o(il4Var2.f21539g, ky0Var) && il4Var2.f21540h == layoutDirection && z62.m13387o(il4Var2.f21541i, am1Var) && kl0.m7541k(j) == kl0.m7541k(j2) && (!z || (kl0.m7539i(j) == kl0.m7539i(j2) && kl0.m7538h(j) == kl0.m7538h(j2)))) {
                            jl4Var = jl4Var4;
                            jl4Var2 = new jl4(new il4(il4Var2.f21533a, wj4Var.f33432b, il4Var2.f21535c, il4Var2.f21536d, il4Var2.f21537e, il4Var2.f21538f, il4Var2.f21539g, il4Var2.f21540h, il4Var2.f21541i, j), yu2Var, ll0.m8012d(j, (((long) as4.m3261t(yu2Var.f35536e)) & 4294967295L) | (((long) as4.m3261t(yu2Var.f35535d)) << 32)));
                            kl4Var = kl4VarM11577d;
                        } else {
                            j = j;
                            kl4VarM11577d = kl4VarM11577d;
                            jl4Var = jl4Var4;
                            wj4Var.m12312a(layoutDirection);
                            iM7541k = kl0.m7541k(j);
                            if (!z && kl0.m7535e(j)) {
                                iM10675p = kl0.m7539i(j);
                            } else {
                                iM10675p = i;
                            }
                            if (iM7541k != iM10675p) {
                                c1122rv2 = wj4Var.f33437g;
                                if (c1122rv2 == null) {
                                    C1077qn.m9989o("layoutIntrinsics must be called first");
                                    return null;
                                }
                                iM10675p = sc6.m10675p(as4.m3261t(c1122rv2.mo2952c()), iM7541k, iM10675p);
                            }
                            c1122rv = wj4Var.f33437g;
                            if (c1122rv == null) {
                                C1077qn.m9989o("layoutIntrinsics must be called first");
                                return null;
                            }
                            yu2 yu2Var2 = new yu2(c1122rv, C0638f5.m5548s(0, iM10675p, 0, kl0.m7538h(j)), Integer.MAX_VALUE, 1);
                            kl4Var = kl4VarM11577d;
                            jl4Var2 = new jl4(new il4(wj4Var.f33431a, wj4Var.f33432b, wj4Var.f33436f, Integer.MAX_VALUE, wj4Var.f33433c, 1, wj4Var.f33434d, layoutDirection, wj4Var.f33435e, j), yu2Var2, ll0.m8012d(j, (((long) as4.m3261t(yu2Var2.f35535d)) << 32) | (((long) as4.m3261t(yu2Var2.f35536e)) & 4294967295L)));
                        }
                    } else {
                        jl4Var = jl4Var4;
                    }
                }
                i = Integer.MAX_VALUE;
                wj4Var.m12312a(layoutDirection);
                iM7541k = kl0.m7541k(j);
                if (z) {
                    iM10675p = i;
                } else {
                    iM10675p = kl0.m7539i(j);
                }
                if (iM7541k != iM10675p) {
                    c1122rv2 = wj4Var.f33437g;
                    if (c1122rv2 == null) {
                        C1077qn.m9989o("layoutIntrinsics must be called first");
                        return null;
                    }
                    iM10675p = sc6.m10675p(as4.m3261t(c1122rv2.mo2952c()), iM7541k, iM10675p);
                }
                c1122rv = wj4Var.f33437g;
                if (c1122rv == null) {
                    C1077qn.m9989o("layoutIntrinsics must be called first");
                    return null;
                }
                yu2 yu2Var3 = new yu2(c1122rv, C0638f5.m5548s(0, iM10675p, 0, kl0.m7538h(j)), Integer.MAX_VALUE, 1);
                kl4Var = kl4VarM11577d;
                jl4Var2 = new jl4(new il4(wj4Var.f33431a, wj4Var.f33432b, wj4Var.f33436f, Integer.MAX_VALUE, wj4Var.f33433c, 1, wj4Var.f33434d, layoutDirection, wj4Var.f33435e, j), yu2Var3, ll0.m8012d(j, (((long) as4.m3261t(yu2Var3.f35535d)) << 32) | (((long) as4.m3261t(yu2Var3.f35536e)) & 4294967295L)));
            } else {
                jl4Var = jl4Var3;
                i = Integer.MAX_VALUE;
                wj4Var.m12312a(layoutDirection);
                iM7541k = kl0.m7541k(j);
                if (z) {
                    iM10675p = i;
                } else {
                    iM10675p = kl0.m7539i(j);
                }
                if (iM7541k != iM10675p) {
                    c1122rv2 = wj4Var.f33437g;
                    if (c1122rv2 == null) {
                        C1077qn.m9989o("layoutIntrinsics must be called first");
                        return null;
                    }
                    iM10675p = sc6.m10675p(as4.m3261t(c1122rv2.mo2952c()), iM7541k, iM10675p);
                }
                c1122rv = wj4Var.f33437g;
                if (c1122rv == null) {
                    C1077qn.m9989o("layoutIntrinsics must be called first");
                    return null;
                }
                yu2 yu2Var4 = new yu2(c1122rv, C0638f5.m5548s(0, iM10675p, 0, kl0.m7538h(j)), Integer.MAX_VALUE, 1);
                kl4Var = kl4VarM11577d;
                jl4Var2 = new jl4(new il4(wj4Var.f33431a, wj4Var.f33432b, wj4Var.f33436f, Integer.MAX_VALUE, wj4Var.f33433c, 1, wj4Var.f33434d, layoutDirection, wj4Var.f33435e, j), yu2Var4, ll0.m8012d(j, (((long) as4.m3261t(yu2Var4.f35535d)) << 32) | (((long) as4.m3261t(yu2Var4.f35536e)) & 4294967295L)));
            }
            long j3 = jl4Var2.f22402c;
            Integer numValueOf = Integer.valueOf((int) (j3 >> 32));
            Integer numValueOf2 = Integer.valueOf((int) (j3 & 4294967295L));
            int iIntValue = numValueOf.intValue();
            int iIntValue2 = numValueOf2.intValue();
            yu2 yu2Var5 = jl4Var2.f22401b;
            yu2Var5.f35532a.mo2951b();
            jl4 jl4Var5 = jl4Var;
            if (z62.m13387o(jl4Var5, jl4Var2)) {
                fo0Var = this;
                uj2Var = uj2Var2;
            } else {
                cf2 cf2Var = kl4Var != null ? kl4Var.f23218c : null;
                kl4 kl4Var2 = new kl4();
                kl4Var2.f23216a = jl4Var2;
                kl4Var2.f23217b = null;
                kl4Var2.f23218c = cf2Var;
                VarHandle.storeStoreFence();
                uj2Var = uj2Var2;
                uj2Var.f31920i.setValue(kl4Var2);
                uj2Var.f31927p = false;
                if (pk4Var.m9547i() && pk4Var.m9546h()) {
                    fo0Var = this;
                    if (((cj2) fo0Var.f19163c).m4033a() && ql4.m9900d(((ql4) uj2Var.f31910A.getValue()).f28558a) && ql4.m9900d(((ql4) uj2Var.f31911B.getValue()).f28558a) && uj2Var.m11575b()) {
                        if (!z62.m13387o((jl4Var5 == null || (il4Var = jl4Var5.f22400a) == null) ? null : il4Var.f21533a, jl4Var2.f22400a.f21533a)) {
                            lb5.m7910S(fo0Var.f19164d, null, null, new C0594e0(pk4Var, fo0Var.f19169i, (wm0) null, (byte) 19), 3);
                        }
                    }
                } else {
                    fo0Var = this;
                }
                fo0Var.f19165e.invoke(jl4Var2);
                oh6.m9119y(uj2Var, fo0Var.f19166f, fo0Var.f19167g);
            }
            uj2Var.f31918g.setValue(p11.m9350a(fo0Var.f19168h.mo3586w0(fo0Var.f19170j == 1 ? as4.m3261t(yu2Var5.m13243b(0)) : 0)));
            return zq2Var.mo3583l0(iIntValue, iIntValue2, eq2.m5274M(new l73(AbstractC0681ga.f19681a, Integer.valueOf(Math.round(jl4Var2.f22403d))), new l73(AbstractC0681ga.f19682b, Integer.valueOf(Math.round(jl4Var2.f22404e)))), new dh0((byte) 8));
        } catch (Throwable th) {
            ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
            throw th;
        }
    }
}
