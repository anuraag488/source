package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class dy3 {

    /* JADX INFO: renamed from: a */
    public static final ay3 f17503a = new ay3();

    /* JADX INFO: renamed from: b */
    public static final xz0 f17504b = new xz0(1);

    /* JADX INFO: renamed from: c */
    public static final by3 f17505c = new by3();

    /* JADX INFO: renamed from: a */
    public static nt2 m4797a(gk4 gk4Var, d63 d63Var, boolean z, boolean z2) {
        zx3 zx3Var = new zx3();
        zx3Var.f36445a = gk4Var;
        zx3Var.f36446b = d63Var;
        zx3Var.f36447c = z;
        zx3Var.f36448d = z2;
        VarHandle.storeStoreFence();
        return zx3Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m4798b(vy3 vy3Var, long j, ym0 ym0Var) {
        cy3 cy3Var;
        nl3 nl3Var;
        vy3 vy3Var2;
        if (ym0Var instanceof cy3) {
            cy3Var = (cy3) ym0Var;
            int i = cy3Var.f16618w;
            if ((i & Integer.MIN_VALUE) != 0) {
                cy3Var.f16618w = i - Integer.MIN_VALUE;
            } else {
                cy3Var = new cy3(ym0Var);
            }
        } else {
            cy3Var = new cy3(ym0Var);
        }
        Object obj = cy3Var.f16617v;
        ap0 ap0Var = ap0.f14763a;
        int i2 = cy3Var.f16618w;
        if (i2 == 0) {
            k43.m7376J(obj);
            nl3Var = new nl3();
            xw2 xw2Var = xw2.f34665a;
            rb3 rb3Var = new rb3(vy3Var, j, nl3Var, (wm0) null);
            cy3Var.f16615t = vy3Var;
            cy3Var.f16616u = nl3Var;
            cy3Var.f16618w = 1;
            if (vy3Var.m12034g(xw2Var, rb3Var, cy3Var) == ap0Var) {
                return ap0Var;
            }
            vy3Var2 = vy3Var;
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nl3 nl3Var2 = cy3Var.f16616u;
            vy3 vy3Var3 = cy3Var.f16615t;
            k43.m7376J(obj);
            nl3Var = nl3Var2;
            vy3Var2 = vy3Var3;
        }
        return b33.m3423a(vy3Var2.m12036i(nl3Var.f25933a));
    }
}
