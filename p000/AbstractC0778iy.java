package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: iy */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0778iy {
    static {
        dt0.m4704f(40.0f, 40.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m6963a(xk4 xk4Var, yp1 yp1Var, nt2 nt2Var, boolean z, xl4 xl4Var, nd2 nd2Var, ld2 ld2Var, int i, int i2, xy4 xy4Var, yp1 yp1Var2, ga4 ga4Var, nq1 nq1Var, mi0 mi0Var, int i3) {
        boolean z2;
        ld2 ld2Var2;
        boolean z3;
        xy4 xy4Var2;
        yp1 yp1Var3;
        nq1 nq1Var2;
        yp1 yp1Var4;
        nq1 nq1Var3;
        int i4;
        ld2 ld2Var3;
        nt2 nt2Var2 = nt2Var;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-971111025);
        int i5 = i3 | (ir1Var.m6890g(xk4Var) ? 4 : 2) | (ir1Var.m6894i(yp1Var) ? 32 : 16) | (ir1Var.m6890g(nt2Var2) ? 256 : 128) | 27648 | (ir1Var.m6890g(xl4Var) ? 131072 : 65536) | (ir1Var.m6890g(nd2Var) ? 1048576 : 524288) | 113246208;
        int i6 = (ir1Var.m6890g(ga4Var) ? 16384 : 8192) | 200118;
        if (ir1Var.m6871T(i5 & 1, ((306783379 & i5) == 306783378 && (74899 & i6) == 74898) ? false : true)) {
            ir1Var.m6876Y();
            int i7 = i3 & 1;
            i50 i50Var = ki0.f23136a;
            if (i7 == 0 || ir1Var.m6856B()) {
                xy4 xy4Var3 = wv1.f33779v;
                Object objM6869O = ir1Var.m6869O();
                Object obj = objM6869O;
                if (objM6869O == i50Var) {
                    C0499bp c0499bp = new C0499bp((byte) 3);
                    ir1Var.m6905n0(c0499bp);
                    obj = c0499bp;
                }
                xy4Var2 = xy4Var3;
                yp1Var4 = (yp1) obj;
                nq1Var3 = zp0.f36239b;
                z2 = true;
                i4 = 1;
                ld2Var3 = ld2.f23963a;
            } else {
                ir1Var.m6874W();
                z2 = z;
                ld2Var3 = ld2Var;
                i4 = i2;
                xy4Var2 = xy4Var;
                yp1Var4 = yp1Var2;
                nq1Var3 = nq1Var;
            }
            ir1Var.m6913s();
            nd2Var.getClass();
            k12 k12VarM7357a = k12.m7357a(-1);
            if (k12VarM7357a.f22814a == -1) {
                k12VarM7357a = null;
            }
            l12 l12Var = new l12(0, true, 1, k12VarM7357a != null ? k12VarM7357a.f22814a : 1, zm2.f36182c);
            boolean z4 = ((i5 & 14) == 4) | ((i5 & 112) == 32);
            Object objM6869O2 = ir1Var.m6869O();
            Object obj2 = objM6869O2;
            if (z4 || objM6869O2 == i50Var) {
                C0558d0 c0558d0 = new C0558d0((byte) 14);
                c0558d0.f16655b = xk4Var;
                c0558d0.f16656c = yp1Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0558d0);
                obj2 = c0558d0;
            }
            int i8 = (i5 & 910) | ((i5 >> 6) & 7168) | 1794048 | ((i6 << 9) & 29360128);
            ld2Var2 = ld2Var3;
            int i9 = i4;
            yp1Var3 = yp1Var4;
            nq1Var2 = nq1Var3;
            nt2Var2 = nt2Var;
            oh6.m9096b(xk4Var, (yp1) obj2, nt2Var2, xl4Var, xy4Var2, yp1Var3, ga4Var, true, i, i9 == true ? 1 : 0, l12Var, ld2Var2, z2, nq1Var2, ir1Var, i8, 224640);
            z3 = i9;
        } else {
            ir1Var.m6874W();
            z2 = z;
            ld2Var2 = ld2Var;
            z3 = i2;
            xy4Var2 = xy4Var;
            yp1Var3 = yp1Var2;
            nq1Var2 = nq1Var;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0742hy c0742hy = new C0742hy();
            c0742hy.f20917a = xk4Var;
            c0742hy.f20918b = yp1Var;
            c0742hy.f20919c = nt2Var2;
            c0742hy.f20920d = z2;
            c0742hy.f20921e = xl4Var;
            c0742hy.f20922f = nd2Var;
            c0742hy.f20923g = ld2Var2;
            c0742hy.f20924h = i;
            c0742hy.f20925i = z3;
            c0742hy.f20926j = xy4Var2;
            c0742hy.f20927k = yp1Var3;
            c0742hy.f20928l = ga4Var;
            c0742hy.f20929m = nq1Var2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0742hy;
        }
    }
}
