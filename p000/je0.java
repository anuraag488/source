package p000;

import android.content.Context;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class je0 {

    /* JADX INFO: renamed from: a */
    public static final nc4 f22196a = new nc4(new C0515c5((byte) 22));

    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:53:0x010b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0115  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m7085a(g12 g12Var, nt2 nt2Var, yp1 yp1Var, mi0 mi0Var, int i, int i2) {
        nt2 nt2Var2;
        int i3;
        yp1 yp1Var2;
        int i4;
        byte b;
        boolean z;
        yp1 yp1Var3;
        yk3 yk3VarM6916v;
        nt2 nt2Var3;
        i50 i50Var;
        wp1 wp1Var;
        boolean zM6890g;
        Object objM6869O;
        lu2 lu2Var;
        boolean zM6890g2;
        Object obj;
        Object objM6869O2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1530788097);
        int i5 = (ir1Var.m6890g(g12Var) ? 4 : 2) | i;
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i5 | 48;
            nt2Var2 = nt2Var;
        } else {
            nt2Var2 = nt2Var;
            i3 = i5 | (ir1Var.m6890g(nt2Var2) ? 32 : 16);
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                yp1Var2 = yp1Var;
                i3 |= ir1Var.m6894i(yp1Var2) ? 256 : 128;
            }
            i4 = i3;
            b = 1;
            if ((i4 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (ir1Var.m6871T(i4 & 1, z)) {
                if (i6 != 0) {
                    nt2Var3 = kt2.f23428a;
                } else {
                    nt2Var3 = nt2Var2;
                }
                i50Var = ki0.f23136a;
                if (i7 != 0) {
                    objM6869O2 = ir1Var.m6869O();
                    if (objM6869O2 == i50Var) {
                        objM6869O2 = new cd0((byte) 29);
                        ir1Var.m6905n0(objM6869O2);
                    }
                    yp1Var2 = (yp1) objM6869O2;
                }
                wp1Var = (wp1) ir1Var.m6898k(ln0.f24195f);
                int i8 = i4 & 14;
                zM6890g = ir1Var.m6890g(wp1Var) | (i8 == 4);
                objM6869O = ir1Var.m6869O();
                if (zM6890g || objM6869O == i50Var) {
                    objM6869O = new C0671g0((Object) g12Var, (Object) wp1Var, (wm0) null, (byte) 13);
                    ir1Var.m6905n0(objM6869O);
                }
                sw2 sw2VarM13359R = z62.m13359R(g12Var, g12Var, wp1Var, (mq1) objM6869O, ir1Var, i8 | ((i4 << 3) & 112));
                lu2Var = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24280d;
                g12 g12Var2 = (g12) sw2VarM13359R.getValue();
                C0853kz c0853kz = ig1.f21382f;
                zM6890g2 = ir1Var.m6890g(lu2Var);
                Object objM6869O3 = ir1Var.m6869O();
                obj = objM6869O3;
                if (zM6890g2 || objM6869O3 == i50Var) {
                    C0713h5 c0713h5 = new C0713h5(b);
                    c0713h5.f20393b = lu2Var;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c0713h5);
                    obj = c0713h5;
                }
                C0750i5 c0750i5 = new C0750i5((byte) 3);
                c0750i5.f21129b = yp1Var2;
                VarHandle.storeStoreFence();
                yp1Var3 = yp1Var2;
                ev0.m5331F(g12Var2, nt2Var3, (yp1) obj, c0853kz, null, null, vd6.m11834R(-636715878, c0750i5, ir1Var), ir1Var, (i4 & 112) | 1575936, 48);
                nt2Var2 = nt2Var3;
            } else {
                ir1Var.m6874W();
                yp1Var3 = yp1Var2;
            }
            yk3VarM6916v = ir1Var.m6916v();
            if (yk3VarM6916v != null) {
                ee0 ee0Var = new ee0();
                ee0Var.f18026a = g12Var;
                ee0Var.f18027b = nt2Var2;
                ee0Var.f18028c = yp1Var3;
                ee0Var.f18029d = i;
                ee0Var.f18030e = i2;
                VarHandle.storeStoreFence();
                yk3VarM6916v.f35300d = ee0Var;
            }
        }
        i3 |= 384;
        yp1Var2 = yp1Var;
        i4 = i3;
        b = 1;
        if ((i4 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (ir1Var.m6871T(i4 & 1, z)) {
            if (i6 != 0) {
                nt2Var3 = kt2.f23428a;
            } else {
                nt2Var3 = nt2Var2;
            }
            i50Var = ki0.f23136a;
            if (i7 != 0) {
                objM6869O2 = ir1Var.m6869O();
                if (objM6869O2 == i50Var) {
                    objM6869O2 = new cd0((byte) 29);
                    ir1Var.m6905n0(objM6869O2);
                }
                yp1Var2 = (yp1) objM6869O2;
            }
            wp1Var = (wp1) ir1Var.m6898k(ln0.f24195f);
            int i9 = i4 & 14;
            zM6890g = ir1Var.m6890g(wp1Var) | (i9 == 4);
            objM6869O = ir1Var.m6869O();
            if (zM6890g) {
                objM6869O = new C0671g0((Object) g12Var, (Object) wp1Var, (wm0) null, (byte) 13);
                ir1Var.m6905n0(objM6869O);
            } else {
                objM6869O = new C0671g0((Object) g12Var, (Object) wp1Var, (wm0) null, (byte) 13);
                ir1Var.m6905n0(objM6869O);
            }
            sw2 sw2VarM13359R2 = z62.m13359R(g12Var, g12Var, wp1Var, (mq1) objM6869O, ir1Var, i9 | ((i4 << 3) & 112));
            lu2Var = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24280d;
            g12 g12Var3 = (g12) sw2VarM13359R2.getValue();
            C0853kz c0853kz2 = ig1.f21382f;
            zM6890g2 = ir1Var.m6890g(lu2Var);
            Object objM6869O4 = ir1Var.m6869O();
            obj = objM6869O4;
            if (zM6890g2) {
                C0713h5 c0713h6 = new C0713h5(b);
                c0713h6.f20393b = lu2Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0713h6);
                obj = c0713h6;
            } else {
                C0713h5 c0713h7 = new C0713h5(b);
                c0713h7.f20393b = lu2Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0713h7);
                obj = c0713h7;
            }
            C0750i5 c0750i6 = new C0750i5((byte) 3);
            c0750i6.f21129b = yp1Var2;
            VarHandle.storeStoreFence();
            yp1Var3 = yp1Var2;
            ev0.m5331F(g12Var3, nt2Var3, (yp1) obj, c0853kz2, null, null, vd6.m11834R(-636715878, c0750i6, ir1Var), ir1Var, (i4 & 112) | 1575936, 48);
            nt2Var2 = nt2Var3;
        } else {
            ir1Var.m6874W();
            yp1Var3 = yp1Var2;
        }
        yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            ee0 ee0Var2 = new ee0();
            ee0Var2.f18026a = g12Var;
            ee0Var2.f18027b = nt2Var2;
            ee0Var2.f18028c = yp1Var3;
            ee0Var2.f18029d = i;
            ee0Var2.f18030e = i2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = ee0Var2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final yp1 m7086b(mi0 mi0Var) {
        ir1 ir1Var = (ir1) mi0Var;
        C1354y3 c1354y3 = (C1354y3) ir1Var.m6898k(AbstractC0637f4.f18723a);
        byte b = 0;
        z93 z93VarM10793B = sj3.m10793B(ir1Var, 0, 1);
        Object objM6869O = ir1Var.m6869O();
        if (objM6869O == ki0.f23136a) {
            objM6869O = new ge0(z93VarM10793B, c1354y3, null, b);
            ir1Var.m6905n0(objM6869O);
        }
        return (yp1) objM6869O;
    }

    /* JADX INFO: renamed from: c */
    public static final mq1 m7087c(boolean z, ir1 ir1Var, int i) {
        if ((i & 2) != 0) {
            z = true;
        }
        boolean z2 = z;
        Context context = (Context) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14651b);
        he0 he0Var = (he0) ir1Var.m6898k(f22196a);
        dz0 dz0VarM10705T = se0.m10705T(ir1Var);
        yp1 yp1VarM7086b = m7086b(ir1Var);
        Object objM6869O = ir1Var.m6869O();
        if (objM6869O == ki0.f23136a) {
            C0824k6 c0824k6 = new C0824k6(yp1VarM7086b, he0Var, z2, dz0VarM10705T, context, null);
            ir1Var.m6905n0(c0824k6);
            objM6869O = c0824k6;
        }
        return (mq1) objM6869O;
    }
}
