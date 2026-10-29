package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: bb */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0485bb {

    /* JADX INFO: renamed from: a */
    public static final C0891m f15192a = new C0891m(7);

    /* JADX INFO: renamed from: b */
    public static final C0891m f15193b = new C0891m(8);

    /* JADX INFO: renamed from: c */
    public static final gv0 f15194c;

    static {
        gb5 gb5Var = new gb5();
        gv0 gv0Var = new gv0();
        gv0Var.f20145a = gb5Var;
        VarHandle.storeStoreFence();
        f15194c = gv0Var;
    }

    /* JADX INFO: renamed from: a */
    public static nt2 m3534a(nt2 nt2Var, C0940nb c0940nb, boolean z, w10 w10Var) {
        d63 d63Var = d63.f16814a;
        C1249va c1249va = new C1249va();
        c1249va.f32482a = c0940nb;
        c1249va.f32483b = d63Var;
        c1249va.f32484c = z;
        c1249va.f32485d = w10Var;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(c1249va);
    }

    /* JADX INFO: renamed from: b */
    public static final z84 m3535b(C0940nb c0940nb, ky0 ky0Var, yp1 yp1Var, InterfaceC1407zj interfaceC1407zj) {
        C1286wa c1286wa = new C1286wa((byte) 0);
        c1286wa.f33186b = ky0Var;
        VarHandle.storeStoreFence();
        jp0 jp0Var = new jp0((byte) 7, false);
        jp0Var.f22481b = c0940nb;
        jp0Var.f22482c = yp1Var;
        jp0Var.f22483d = c1286wa;
        VarHandle.storeStoreFence();
        z84 z84Var = new z84();
        z84Var.f35873a = jp0Var;
        z84Var.f35874b = f15194c;
        z84Var.f35875c = interfaceC1407zj;
        z84Var.f35876d = dy3.f17504b;
        VarHandle.storeStoreFence();
        return z84Var;
    }

    /* JADX INFO: renamed from: c */
    public static final Object m3536c(C0940nb c0940nb, float f, C0903mb c0903mb, uv0 uv0Var, Object obj, InterfaceC1407zj interfaceC1407zj, of4 of4Var) {
        float fM11656f = uv0Var.m11656f(obj);
        nl3 nl3Var = new nl3();
        nl3Var.f25933a = Float.isNaN(((z73) c0940nb.f25612i).m13399h()) ? 0.0f : ((z73) c0940nb.f25612i).m13399h();
        if (!Float.isNaN(fM11656f)) {
            float f2 = nl3Var.f25933a;
            if (f2 != fM11656f) {
                ne0 ne0Var = new ne0((byte) 1);
                ne0Var.f25728b = c0903mb;
                ne0Var.f25729c = nl3Var;
                VarHandle.storeStoreFence();
                Object objM10102g = qs5.m10102g(f2, fM11656f, f, interfaceC1407zj, ne0Var, of4Var);
                if (objM10102g == ap0.f14763a) {
                    return objM10102g;
                }
            }
        }
        return ju4.f22634a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final Object m3537d(wp1 wp1Var, mq1 mq1Var, ym0 ym0Var) {
        C1361ya c1361ya;
        if (ym0Var instanceof C1361ya) {
            c1361ya = (C1361ya) ym0Var;
            int i = c1361ya.f35061u;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1361ya.f35061u = i - Integer.MIN_VALUE;
            } else {
                c1361ya = new C1361ya(ym0Var);
            }
        } else {
            c1361ya = new C1361ya(ym0Var);
        }
        Object obj = c1361ya.f35060t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = c1361ya.f35061u;
        wm0 wm0Var = null;
        try {
            if (i2 == 0) {
                k43.m7376J(obj);
                C0671g0 c0671g0 = new C0671g0((Object) wp1Var, (Object) mq1Var, wm0Var, (byte) 2);
                c1361ya.f35061u = 1;
                if (zp0.m13685q(c0671g0, c1361ya) == ap0Var) {
                    return ap0Var;
                }
            } else {
                if (i2 != 1) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
            }
        } catch (C1175ta unused) {
        }
        return ju4.f22634a;
    }
}
