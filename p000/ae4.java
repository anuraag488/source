package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ae4 {

    /* JADX INFO: renamed from: a */
    public static final i50 f14404a = new i50((byte) 19);

    /* JADX INFO: renamed from: b */
    public static final Object f14405b = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m2948a(nt2 nt2Var, mq1 mq1Var, mi0 mi0Var, int i, int i2) {
        int i3;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1298353104);
        int i4 = i2 & 1;
        byte b = 2;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (ir1Var.m6890g(nt2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ir1Var.m6894i(mq1Var) ? 32 : 16;
        }
        if (ir1Var.m6871T(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                nt2Var = kt2.f23428a;
            }
            Object objM6869O = ir1Var.m6869O();
            if (objM6869O == ki0.f23136a) {
                objM6869O = new ee4(gb5.f19718i);
                ir1Var.m6905n0(objM6869O);
            }
            m2949b((ee4) objM6869O, nt2Var, mq1Var, ir1Var, (i3 << 3) & 1008);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            ga1 ga1Var = new ga1(b);
            ga1Var.f19686c = nt2Var;
            ga1Var.f19688e = mq1Var;
            ga1Var.f19687d = i;
            ga1Var.f19685b = i2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = ga1Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m2949b(ee4 ee4Var, nt2 nt2Var, mq1 mq1Var, mi0 mi0Var, int i) {
        int i2;
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-511989831);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6894i(ee4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6890g(nt2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6894i(mq1Var) ? 256 : 128;
        }
        if (ir1Var.m6871T(i2 & 1, (i2 & 147) != 146)) {
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            gr1 gr1VarM4685N = dt0.m4685N(ir1Var);
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2Var);
            ga3 ga3VarM6902m = ir1Var.m6902m();
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
            C0006a5.m53I(ir1Var, ee4Var.f18034c, ee4Var);
            C0006a5.m53I(ir1Var, ee4Var.f18035d, gr1VarM4685N);
            C0006a5.m53I(ir1Var, ee4Var.f18036e, mq1Var);
            bi0.f15310ap.getClass();
            C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
            C0006a5.m50F(ir1Var);
            C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
            C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
            ir1Var.m6912r(true);
            if (ir1Var.m6858D()) {
                ir1Var.m6885d0(-1259187287);
                ir1Var.m6912r(false);
            } else {
                ir1Var.m6885d0(-1259245908);
                boolean zM6894i = ir1Var.m6894i(ee4Var);
                Object objM6869O = ir1Var.m6869O();
                if (zM6894i || objM6869O == ki0.f23136a) {
                    obj = objM6869O;
                    g32 g32Var = new g32((byte) 28);
                    g32Var.f19558b = ee4Var;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(g32Var);
                    obj = g32Var;
                }
                obj = objM6869O;
                lb5.m7914W(ir1Var, (wp1) obj);
                ir1Var.m6912r(false);
            }
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C1403zf c1403zf = new C1403zf((byte) 11);
            c1403zf.f36036c = ee4Var;
            c1403zf.f36037d = nt2Var;
            c1403zf.f36038e = mq1Var;
            c1403zf.f36035b = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c1403zf;
        }
    }
}
