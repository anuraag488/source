package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class g01 {

    /* JADX INFO: renamed from: a */
    public static final C0641f8 f19457a = new C0641f8("UNDEFINED", (byte) 8);

    /* JADX INFO: renamed from: b */
    public static final C0641f8 f19458b = new C0641f8("REUSABLE_CLAIMED", (byte) 8);

    /* JADX INFO: renamed from: a */
    public static final void m5867a(wm0 wm0Var, Object obj) {
        if (!(wm0Var instanceof f01)) {
            wm0Var.resumeWith(obj);
            return;
        }
        f01 f01Var = (f01) wm0Var;
        so0 so0Var = f01Var.f18626d;
        ym0 ym0Var = f01Var.f18627e;
        Throwable thM4638b = dp3.m4638b(obj);
        Object ff0Var = thM4638b == null ? obj : new ff0(thM4638b, false);
        if (m5869c(so0Var, ym0Var.getContext())) {
            f01Var.f18628f = ff0Var;
            f01Var.f20971c = 1;
            m5868b(so0Var, ym0Var.getContext(), f01Var);
            return;
        }
        eb1 eb1VarM5204a = em4.m5204a();
        if (eb1VarM5204a.f17948b >= 4294967296L) {
            f01Var.f18628f = ff0Var;
            f01Var.f20971c = 1;
            eb1VarM5204a.m5044P(f01Var);
            return;
        }
        eb1VarM5204a.m5049U(true);
        try {
            t82 t82Var = (t82) ym0Var.getContext().get(o85.f26448h);
            if (t82Var == null || t82Var.mo4995b()) {
                Object obj2 = f01Var.f18629g;
                ro0 context = ym0Var.getContext();
                Object objM4555b = dm4.m4555b(context, obj2);
                zt4 zt4VarM3805J = objM4555b != dm4.f17189a ? c20.m3805J(ym0Var, context, objM4555b) : null;
                try {
                    ym0Var.resumeWith(obj);
                    if (zt4VarM3805J == null || zt4VarM3805J.m13753l0()) {
                        dm4.m4554a(context, objM4555b);
                    }
                } catch (Throwable th) {
                    if (zt4VarM3805J == null || zt4VarM3805J.m13753l0()) {
                        dm4.m4554a(context, objM4555b);
                    }
                    throw th;
                }
            } else {
                f01Var.resumeWith(k43.m7389n(t82Var.mo5006u()));
            }
            while (eb1VarM5204a.m5052X()) {
            }
        } catch (Throwable th2) {
            try {
                f01Var.m6536g(th2);
            } finally {
                eb1VarM5204a.m5043O(true);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m5868b(so0 so0Var, ro0 ro0Var, Runnable runnable) {
        try {
            so0Var.mo5041K(ro0Var, runnable);
        } catch (Throwable th) {
            throw new e01(th, so0Var, ro0Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m5869c(so0 so0Var, ro0 ro0Var) throws e01 {
        try {
            return so0Var.mo6962M(ro0Var);
        } catch (Throwable th) {
            throw new e01(th, so0Var, ro0Var);
        }
    }
}
