package p000;

import java.lang.invoke.VarHandle;
import java.util.Set;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class v54 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f32423a = 0;

    static {
        qq2.m10016K(300, 0, h51.f20396a, 2);
    }

    /* JADX INFO: renamed from: a */
    public static final void m11750a(nt2 nt2Var, mq1 mq1Var, mi0 mi0Var, int i) {
        nt2 nt2Var2;
        mq1 mq1Var2;
        ty0 ty0Var;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1361920385);
        byte b = 16;
        int i2 = (ir1Var.m6890g(nt2Var) ? 4 : 2) | i | (ir1Var.m6894i(mq1Var) ? 32 : 16);
        if (ir1Var.m6871T(i2 & 1, (i2 & 19) != 18)) {
            String strM11818B = vd6.m11818B(C0995R.string.m3c_bottom_sheet_drag_handle_description, ir1Var);
            nt2 nt2VarM8574b = n74.m8574b(kt2.f23428a, 1.0f);
            xq2 xq2VarM9704c = q20.m9704c(ig1.f21382f, false);
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM8574b);
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
            float f = vn4.f32749a;
            g73 g73Var = zn4.f36210a;
            int iMo3579U = ((ky0) ir1Var.m6898k(ij0.f21473h)).mo3579U(4.0f);
            cj2 cj2Var = (cj2) ((yz4) ir1Var.m6898k(ij0.f21486u));
            d83 d83VarM7398w = cj2Var.f16063b;
            if (d83VarM7398w == null) {
                wp1 wp1Var = cj2Var.f16062a;
                if (wp1Var == null || (ty0Var = (ty0) wp1Var.invoke()) == null) {
                    ty0Var = ty0.f31524c;
                }
                d83VarM7398w = k43.m7398w(ty0Var);
                cj2Var.f16063b = d83VarM7398w;
                cj2Var.f16062a = null;
            }
            long j = ((ty0) d83VarM7398w.getValue()).f31525a;
            boolean zM6886e = ir1Var.m6886e(iMo3579U) | ir1Var.m6886e(1) | ir1Var.m6888f(j);
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            Object obj = objM6869O;
            if (zM6886e || objM6869O == i50Var) {
                ao4 ao4Var = new ao4();
                ao4Var.f14749a = iMo3579U;
                ao4Var.f14750b = j;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(ao4Var);
                obj = ao4Var;
            }
            ao4 ao4Var2 = (ao4) obj;
            dx2 dx2Var = AbstractC0926my.f25287a;
            boolean zM6892h = ir1Var.m6892h(false) | ir1Var.m6890g(dx2Var);
            Object objM6869O2 = ir1Var.m6869O();
            Object obj2 = objM6869O2;
            if (zM6892h || objM6869O2 == i50Var) {
                co4 co4Var = new co4();
                co4Var.f16184a = dx2Var;
                co4Var.f16185b = new tw2(Boolean.FALSE);
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(co4Var);
                obj2 = co4Var;
            }
            co4 co4Var2 = (co4) obj2;
            C0914mm c0914mm = new C0914mm((byte) 3);
            c0914mm.f25018b = strM11818B;
            VarHandle.storeStoreFence();
            nt2Var2 = nt2Var;
            mq1Var2 = mq1Var;
            zn4.m13648c(ao4Var2, vd6.m11834R(1497042086, c0914mm, ir1Var), co4Var2, nt2Var2, false, mq1Var2, ir1Var, ((i2 << 9) & 7168) | 48 | ((i2 << 21) & 234881024));
            ir1Var.m6912r(true);
        } else {
            nt2Var2 = nt2Var;
            mq1Var2 = mq1Var;
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            er1 er1Var = new er1(b);
            er1Var.f18412b = nt2Var2;
            er1Var.f18413c = mq1Var2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = er1Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final d64 m11751b(Set set, mi0 mi0Var, int i, int i2) {
        e64 e64Var = e64.f17842a;
        if ((i2 & 2) != 0) {
            set = AbstractC0990oo.m9216k0(new e64[]{e64Var, e64.f17844c, e64.f17843b});
        }
        ir1 ir1Var = (ir1) mi0Var;
        Object objM6869O = ir1Var.m6869O();
        byte b = 0;
        i50 i50Var = ki0.f23136a;
        if (objM6869O == i50Var) {
            objM6869O = new r54(b);
            ir1Var.m6905n0(objM6869O);
        }
        yp1 yp1Var = (yp1) objM6869O;
        int i3 = ((i >> 3) & 126) | 384;
        ir1 ir1Var2 = (ir1) mi0Var;
        ky0 ky0Var = (ky0) ir1Var2.m6898k(ij0.f21473h);
        boolean zM6890g = ir1Var2.m6890g(ky0Var) | ir1Var2.m6884d(56.0f);
        Object objM6869O2 = ir1Var2.m6869O();
        Object obj = objM6869O2;
        if (zM6890g || objM6869O2 == i50Var) {
            C1286wa c1286wa = new C1286wa((byte) 1);
            c1286wa.f33186b = ky0Var;
            VarHandle.storeStoreFence();
            ir1Var2.m6905n0(c1286wa);
            obj = c1286wa;
        }
        wp1 wp1Var = (wp1) obj;
        boolean zM6890g2 = ir1Var2.m6890g(ky0Var) | ir1Var2.m6884d(125.0f);
        Object objM6869O3 = ir1Var2.m6869O();
        Object obj2 = objM6869O3;
        if (zM6890g2 || objM6869O3 == i50Var) {
            C1286wa c1286wa2 = new C1286wa((byte) 2);
            c1286wa2.f33186b = ky0Var;
            VarHandle.storeStoreFence();
            ir1Var2.m6905n0(c1286wa2);
            obj2 = c1286wa2;
        }
        wp1 wp1Var2 = (wp1) obj2;
        Object[] objArr = {set, yp1Var, Boolean.TRUE};
        n14 n14Var = new n14((byte) 5);
        C1164t c1164t = new C1164t((byte) 26);
        c1164t.f30700c = set;
        c1164t.f30701d = wp1Var;
        c1164t.f30699b = yp1Var;
        VarHandle.storeStoreFence();
        yg3 yg3VarM5407a = ev3.m5407a(n14Var, c1164t);
        byte b2 = 6;
        boolean zM6890g3 = ((((i3 & 14) ^ 6) > 4 && ir1Var2.m6894i(set)) || (i3 & 6) == 4) | ir1Var2.m6890g(wp1Var) | ir1Var2.m6890g(wp1Var2) | ir1Var2.m6890g(yp1Var) | ir1Var2.m6892h(true);
        Object objM6869O4 = ir1Var2.m6869O();
        Object obj3 = objM6869O4;
        if (zM6890g3 || objM6869O4 == i50Var) {
            C0590dx c0590dx = new C0590dx(b2);
            c0590dx.f17475e = set;
            c0590dx.f17472b = wp1Var;
            c0590dx.f17473c = e64Var;
            c0590dx.f17474d = yp1Var;
            VarHandle.storeStoreFence();
            ir1Var2.m6905n0(c0590dx);
            obj3 = c0590dx;
        }
        return (d64) dt0.m4688Q(objArr, yg3VarM5407a, (wp1) obj3, ir1Var2, 0);
    }
}
