package p000;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class oo1 {

    /* JADX INFO: renamed from: a */
    public static final no1 f26923a = no1.f25980a;

    /* JADX INFO: renamed from: a */
    public static no1 m9218a(pn1 pn1Var) {
        while (pn1Var != null) {
            if (pn1Var.f27798u != null && pn1Var.f27788k) {
                pn1Var.m9579g();
            }
            pn1Var = pn1Var.f27800w;
        }
        return f26923a;
    }

    /* JADX INFO: renamed from: b */
    public static void m9219b(jo1 jo1Var) {
        if (eo1.m5212J(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(jo1Var.f22468a.getClass().getName()), jo1Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9220c(pn1 pn1Var, String str) {
        m9219b(new jo1(pn1Var, "Attempting to reuse fragment " + pn1Var + " with previous ID " + str));
        m9218a(pn1Var).getClass();
        mo1[] mo1VarArr = mo1.f25080a;
    }
}
