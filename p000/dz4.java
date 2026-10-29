package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class dz4 {
    static {
        qq2.m10016K(500, 0, new bs0(0.2f, 0.0f, 0.0f, 1.0f), 2);
        qq2.m10016K(500, 0, new bs0(0.3f, 0.0f, 0.8f, 0.15f), 2);
    }

    /* JADX INFO: renamed from: a */
    public static final void m4819a(nt2 nt2Var, long j, long j2, pd4 pd4Var, pd4 pd4Var2, float f, float f2, float f3, float f4, mi0 mi0Var, int i) {
        long j3;
        long j4;
        pd4 pd4Var3;
        pd4 pd4Var4;
        float f5;
        float f6;
        float f7;
        float f8;
        long jM6745e;
        long jM6745e2;
        pd4 pd4Var5;
        float f9;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(958856149);
        int i2 = i | (ir1Var.m6890g(nt2Var) ? 4 : 2) | 47916176;
        if (ir1Var.m6871T(i2 & 1, (38347923 & i2) != 38347922)) {
            ir1Var.m6876Y();
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                float f10 = bz4.f15711a;
                jM6745e = ic0.m6745e(25, ir1Var);
                jM6745e2 = ic0.m6745e(31, ir1Var);
                nc4 nc4Var = ij0.f21473h;
                pd4Var3 = new pd4(((ky0) ir1Var.m6898k(nc4Var)).mo3575E(4.0f), 0.0f, 1, 0, 26);
                pd4Var5 = new pd4(((ky0) ir1Var.m6898k(nc4Var)).mo3575E(4.0f), 0.0f, 1, 0, 26);
                f5 = bz4.f15713c;
                f7 = bz4.f15712b;
                f6 = 1.0f;
                f9 = f7;
            } else {
                ir1Var.m6874W();
                jM6745e = j;
                jM6745e2 = j2;
                pd4Var3 = pd4Var;
                pd4Var5 = pd4Var2;
                f5 = f;
                f6 = f2;
                f7 = f3;
                f9 = f4;
            }
            ir1Var.m6913s();
            nt2 nt2VarM5458a = f14.m5458a(n74.m8579g(nt2Var, bz4.f15711a), true, new t63((byte) 6));
            xq2 xq2VarM9704c = q20.m9704c(ig1.f21378b, false);
            long j5 = jM6745e2;
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM5458a);
            bi0.f15310ap.getClass();
            if (ir1Var.f21685a == null) {
                dt0.m4682E();
                throw null;
            }
            ir1Var.m6893h0();
            if (ir1Var.f21682S) {
                ir1Var.m6900l(wf2.f33290T);
            } else {
                ir1Var.m6911q0();
            }
            C0006a5.m53I(ir1Var, ia5.f21216g, xq2VarM9704c);
            C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
            C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
            C0006a5.m50F(ir1Var);
            C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
            long j6 = jM6745e;
            pd4 pd4Var6 = pd4Var5;
            float f11 = f9;
            j3 = j6;
            j4 = j5;
            pd4Var4 = pd4Var6;
            f8 = f11;
            i25.m6610b(ir1Var, zt5.m13783n(n74.f25506c, j6, j5, pd4Var3, pd4Var6, f5, f6, f7, f11));
            ir1Var.m6912r(true);
        } else {
            ir1Var.m6874W();
            j3 = j;
            j4 = j2;
            pd4Var3 = pd4Var;
            pd4Var4 = pd4Var2;
            f5 = f;
            f6 = f2;
            f7 = f3;
            f8 = f4;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            cz4 cz4Var = new cz4();
            cz4Var.f16640a = nt2Var;
            cz4Var.f16641b = j3;
            cz4Var.f16642c = j4;
            cz4Var.f16643d = pd4Var3;
            cz4Var.f16644e = pd4Var4;
            cz4Var.f16645f = f5;
            cz4Var.f16646g = f6;
            cz4Var.f16647h = f7;
            cz4Var.f16648i = f8;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = cz4Var;
        }
    }
}
