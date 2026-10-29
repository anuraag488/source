package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tz2 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31557a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ mq1 f31558b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ yp1 f31559c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f31560d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f31561e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f31562f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f31563g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ iq1 f31564h;

    public /* synthetic */ tz2(byte b) {
        this.f31557a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        byte b = this.f31557a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                zz2.m13893a((pz2) this.f31560d, (nt2) this.f31561e, (List) this.f31562f, (List) this.f31563g, this.f31559c, (yp1) this.f31564h, this.f31558b, (mi0) obj, vd6.m11838V(1));
                return ju4Var;
            default:
                mq1 mq1Var = this.f31558b;
                mq1 mq1Var2 = (mq1) this.f31560d;
                jl1 jl1Var = (jl1) this.f31561e;
                xk4 xk4Var = (xk4) this.f31562f;
                yp1 yp1Var = this.f31559c;
                nd2 nd2Var = (nd2) this.f31563g;
                mq1 mq1Var3 = (mq1) this.f31564h;
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                boolean zM6871T = ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2);
                InterfaceC0618en interfaceC0618en = ir1Var.f21685a;
                if (!zM6871T) {
                    ir1Var.m6874W();
                    return ju4Var;
                }
                C1225un c1225unM12718d = AbstractC1337xn.m12718d(8.0f);
                C0816jz c0816jz = ig1.f21388l;
                pr3 pr3VarM9243a = or3.m9243a(c1225unM12718d, c0816jz, ir1Var, 54);
                int iHashCode = Long.hashCode(ir1Var.f21683T);
                ga3 ga3VarM6902m = ir1Var.m6902m();
                kt2 kt2Var = kt2.f23428a;
                nt2 nt2VarM10006A = qq2.m10006A(ir1Var, kt2Var);
                bi0.f15310ap.getClass();
                if (interfaceC0618en == null) {
                    dt0.m4682E();
                    throw null;
                }
                ir1Var.m6893h0();
                boolean z3 = ir1Var.f21682S;
                da2 da2Var = wf2.f33290T;
                if (z3) {
                    ir1Var.m6900l(da2Var);
                } else {
                    ir1Var.m6911q0();
                }
                jh0 jh0Var = ia5.f21216g;
                C0006a5.m53I(ir1Var, jh0Var, pr3VarM9243a);
                jh0 jh0Var2 = ia5.f21215f;
                C0006a5.m53I(ir1Var, jh0Var2, ga3VarM6902m);
                Integer numValueOf = Integer.valueOf(iHashCode);
                jh0 jh0Var3 = ia5.f21217h;
                C0006a5.m53I(ir1Var, jh0Var3, numValueOf);
                C0006a5.m50F(ir1Var);
                jh0 jh0Var4 = ia5.f21214e;
                C0006a5.m53I(ir1Var, jh0Var4, nt2VarM10006A);
                if (mq1Var == null) {
                    ir1Var.m6885d0(-1049599907);
                    z = false;
                } else {
                    ir1Var.m6885d0(1628709924);
                    mq1Var.invoke(ir1Var, 0);
                    z = false;
                }
                ir1Var.m6912r(z);
                nt2 nt2VarM10048a = qr3.m10048a(kt2Var, 1.0f);
                pr3 pr3VarM9243a2 = or3.m9243a(AbstractC1337xn.f34434a, c0816jz, ir1Var, 48);
                int iHashCode2 = Long.hashCode(ir1Var.f21683T);
                ga3 ga3VarM6902m2 = ir1Var.m6902m();
                nt2 nt2VarM10006A2 = qq2.m10006A(ir1Var, nt2VarM10048a);
                ir1Var.m6893h0();
                if (ir1Var.f21682S) {
                    ir1Var.m6900l(da2Var);
                } else {
                    ir1Var.m6911q0();
                }
                C0006a5.m53I(ir1Var, jh0Var, pr3VarM9243a2);
                C0006a5.m53I(ir1Var, jh0Var2, ga3VarM6902m2);
                d55.m4373r(iHashCode2, ir1Var, jh0Var3, ir1Var);
                C0006a5.m53I(ir1Var, jh0Var4, nt2VarM10006A2);
                if (mq1Var2 != null) {
                    ir1Var.m6885d0(799227725);
                    long j = ((pb0) ir1Var.m6898k(zl0.f36166a)).f27503a;
                    xl4 xl4Var = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24278b.f22577h;
                    hh0 hh0Var = new hh0((byte) 9);
                    hh0Var.f20573b = mq1Var2;
                    VarHandle.storeStoreFence();
                    k43.m7380b(j, xl4Var, vd6.m11834R(-2060931005, hh0Var, ir1Var), ir1Var, 384);
                    z2 = false;
                    ir1Var.m6912r(false);
                } else {
                    z2 = false;
                    ir1Var.m6885d0(799432418);
                    ir1Var.m6912r(false);
                }
                nt2 nt2VarM10048a2 = qr3.m10048a(kt2Var, 1.0f);
                xq2 xq2VarM9704c = q20.m9704c(ig1.f21381e, z2);
                int iHashCode3 = Long.hashCode(ir1Var.f21683T);
                ga3 ga3VarM6902m3 = ir1Var.m6902m();
                nt2 nt2VarM10006A3 = qq2.m10006A(ir1Var, nt2VarM10048a2);
                ir1Var.m6893h0();
                if (ir1Var.f21682S) {
                    ir1Var.m6900l(da2Var);
                } else {
                    ir1Var.m6911q0();
                }
                C0006a5.m53I(ir1Var, jh0Var, xq2VarM9704c);
                C0006a5.m53I(ir1Var, jh0Var2, ga3VarM6902m3);
                d55.m4373r(iHashCode3, ir1Var, jh0Var3, ir1Var);
                C0006a5.m53I(ir1Var, jh0Var4, nt2VarM10006A3);
                nt2 nt2VarM13539z = zc6.m13539z(jl1Var);
                xl4 xl4Var2 = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24278b.f22577h;
                kj0 kj0Var = zl0.f36166a;
                AbstractC0778iy.m6963a(xk4Var, yp1Var, nt2VarM13539z, false, xl4.m12708a(xl4Var2, ((pb0) ir1Var.m6898k(kj0Var)).f27503a, 0L, null, null, 0L, 0L, null, 16777214), nd2Var, null, 1, 0, null, null, new ga4(((pb0) ir1Var.m6898k(kj0Var)).f27503a), null, ir1Var, 805306368);
                if (mq1Var3 != null) {
                    ir1Var.m6885d0(-351520287);
                    boolean z4 = xk4Var.f34341a.f24092b.length() == 0 ? true : z2;
                    p91 p91VarM9439a = k91.m7438c(n40.m8505o(ir1Var).mo7286c(), 2).m9439a(k91.m7440e(n40.m8505o(ir1Var).mo7287d(), 0.0f, 6));
                    mc1 mc1VarM8273a = k91.m7439d(n40.m8505o(ir1Var).mo7286c(), 2).m8273a(k91.m7441f(n40.m8505o(ir1Var).mo7287d(), 0.0f, 6));
                    C0928n c0928n = new C0928n((byte) 21);
                    c0928n.f25353b = mq1Var3;
                    VarHandle.storeStoreFence();
                    z62.m13372c(z4, null, p91VarM9439a, mc1VarM8273a, null, vd6.m11834R(1607710137, c0928n, ir1Var), ir1Var, 196608);
                    ir1Var.m6912r(z2);
                } else {
                    ir1Var.m6885d0(-351063812);
                    ir1Var.m6912r(z2);
                }
                ir1Var.m6912r(true);
                ir1Var.m6912r(true);
                nt2 nt2VarM8577e = n74.m8577e();
                xq2 xq2VarM9704c2 = q20.m9704c(ig1.f21378b, true);
                int iHashCode4 = Long.hashCode(ir1Var.f21683T);
                ga3 ga3VarM6902m4 = ir1Var.m6902m();
                nt2 nt2VarM10006A4 = qq2.m10006A(ir1Var, nt2VarM8577e);
                ir1Var.m6893h0();
                if (ir1Var.f21682S) {
                    ir1Var.m6900l(da2Var);
                } else {
                    ir1Var.m6911q0();
                }
                C0006a5.m53I(ir1Var, jh0Var, xq2VarM9704c2);
                C0006a5.m53I(ir1Var, jh0Var2, ga3VarM6902m4);
                d55.m4373r(iHashCode4, ir1Var, jh0Var3, ir1Var);
                C0006a5.m53I(ir1Var, jh0Var4, nt2VarM10006A4);
                boolean z5 = xk4Var.f34341a.f24092b.length() > 0 ? true : z2;
                p91 p91VarM9439a2 = k91.m7438c(n40.m8505o(ir1Var).mo7286c(), 2).m9439a(k91.m7440e(n40.m8505o(ir1Var).mo7287d(), 0.0f, 6));
                mc1 mc1VarM8273a2 = k91.m7439d(n40.m8505o(ir1Var).mo7286c(), 2).m8273a(k91.m7441f(n40.m8505o(ir1Var).mo7287d(), 0.0f, 6));
                i21 i21Var = new i21((byte) 2);
                i21Var.f21061b = yp1Var;
                VarHandle.storeStoreFence();
                z62.m13372c(z5, null, p91VarM9439a2, mc1VarM8273a2, null, vd6.m11834R(-1045824838, i21Var, ir1Var), ir1Var, 196608);
                ir1Var.m6912r(true);
                ir1Var.m6912r(true);
                return ju4Var;
        }
    }
}
