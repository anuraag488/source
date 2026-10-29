package p000;

import java.lang.invoke.VarHandle;
import java.util.Map;

/* JADX INFO: renamed from: ni */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0947ni {

    /* JADX INFO: renamed from: a */
    public static final db4 f25829a = qq2.m10014I(0.0f, 0.0f, null, 7);

    static {
        Map map = wy4.f33864a;
        qq2.m10014I(0.0f, 0.0f, p11.m9350a(0.4f), 3);
        h74.m6269a((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L));
        b33.m3423a((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L));
        o52.m8954a(4294967297L);
        w52.m12106a(4294967297L);
    }

    /* JADX INFO: renamed from: a */
    public static final xb4 m8765a(float f, ag1 ag1Var, mi0 mi0Var) {
        return m8767c(p11.m9350a(f), sw4.f30614c, ag1Var, null, "DpAnimation", mi0Var, 0, 8);
    }

    /* JADX INFO: renamed from: b */
    public static final xb4 m8766b(float f, ag1 ag1Var, mi0 mi0Var) {
        ag1 ag1Var2;
        if (ag1Var == f25829a) {
            ir1 ir1Var = (ir1) mi0Var;
            ir1Var.m6885d0(1144115775);
            boolean zM6884d = ir1Var.m6884d(0.01f);
            Object objM6869O = ir1Var.m6869O();
            if (zM6884d || objM6869O == ki0.f23136a) {
                objM6869O = qq2.m10014I(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                ir1Var.m6905n0(objM6869O);
            }
            ir1Var.m6912r(false);
            ag1Var2 = (db4) objM6869O;
        } else {
            ir1 ir1Var2 = (ir1) mi0Var;
            ir1Var2.m6885d0(1144225701);
            ir1Var2.m6912r(false);
            ag1Var2 = ag1Var;
        }
        return m8767c(Float.valueOf(f), sw4.f30612a, ag1Var2, null, "FloatAnimation", mi0Var, 0, 0);
    }

    /* JADX INFO: renamed from: c */
    public static final xb4 m8767c(Object obj, sq4 sq4Var, InterfaceC1407zj interfaceC1407zj, Float f, String str, mi0 mi0Var, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        ir1 ir1Var = (ir1) mi0Var;
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (objM6869O == i50Var) {
            objM6869O = k43.m7398w(null);
            ir1Var.m6905n0(objM6869O);
        }
        sw2 sw2Var = (sw2) objM6869O;
        Object objM6869O2 = ir1Var.m6869O();
        if (objM6869O2 == i50Var) {
            objM6869O2 = new C0910mi(obj, sq4Var, f);
            ir1Var.m6905n0(objM6869O2);
        }
        C0910mi c0910mi = (C0910mi) objM6869O2;
        sw2 sw2VarM7369C = k43.m7369C(null, ir1Var);
        if (f != null && (interfaceC1407zj instanceof db4)) {
            db4 db4Var = (db4) interfaceC1407zj;
            if (!z62.m13387o(db4Var.f16906c, f)) {
                interfaceC1407zj = new db4(db4Var.f16904a, db4Var.f16905b, f);
            }
        }
        sw2 sw2VarM7369C2 = k43.m7369C(interfaceC1407zj, ir1Var);
        Object objM6869O3 = ir1Var.m6869O();
        if (objM6869O3 == i50Var) {
            objM6869O3 = ev0.m5333H(-1, null, null, 6);
            ir1Var.m6905n0(objM6869O3);
        }
        b80 b80Var = (b80) objM6869O3;
        byte b = 4;
        boolean zM6894i = ir1Var.m6894i(b80Var) | ((((i & 14) ^ 6) > 4 && ir1Var.m6894i(obj)) || (6 & i) == 4);
        Object objM6869O4 = ir1Var.m6869O();
        Object obj2 = objM6869O4;
        if (zM6894i || objM6869O4 == i50Var) {
            C0675g4 c0675g4 = new C0675g4(b);
            c0675g4.f19600b = b80Var;
            c0675g4.f19601c = obj;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(c0675g4);
            obj2 = c0675g4;
        }
        lb5.m7914W(ir1Var, (wp1) obj2);
        boolean zM6894i2 = ir1Var.m6894i(b80Var) | ir1Var.m6894i(c0910mi) | ir1Var.m6890g(sw2VarM7369C2) | ir1Var.m6890g(sw2VarM7369C);
        Object objM6869O5 = ir1Var.m6869O();
        if (zM6894i2 || objM6869O5 == i50Var) {
            C0934n5 c0934n5 = new C0934n5(b80Var, c0910mi, sw2VarM7369C2, sw2VarM7369C, null);
            ir1Var.m6905n0(c0934n5);
            objM6869O5 = c0934n5;
        }
        lb5.m7926g(ir1Var, (mq1) objM6869O5, b80Var);
        xb4 xb4Var = (xb4) sw2Var.getValue();
        return xb4Var == null ? c0910mi.f24929c : xb4Var;
    }
}
