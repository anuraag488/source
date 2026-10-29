package p000;

import android.content.Context;
import java.lang.invoke.VarHandle;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class x06 {

    /* JADX INFO: renamed from: a */
    public static Context f33904a;

    /* JADX INFO: renamed from: a */
    public static wq6 m12450a(bp6 bp6Var) {
        dm6 dm6Var = new dm6();
        dm6Var.f17198c = new jr6();
        wq6 wq6Var = new wq6();
        fq6 fq6Var = new fq6();
        fq6Var.f19231h = wq6Var;
        VarHandle.storeStoreFence();
        wq6Var.f33645b = fq6Var;
        wq6Var.f33644a = new WeakReference(dm6Var);
        VarHandle.storeStoreFence();
        dm6Var.f17197b = wq6Var;
        dm6Var.f17196a = bp6Var.getClass();
        try {
            dm6Var.f17196a = bp6Var.mo3660b(dm6Var);
            return wq6Var;
        } catch (Exception e) {
            o56 o56Var = new o56(e);
            yy5 yy5Var = ok6.f26826f;
            fq6 fq6Var2 = wq6Var.f33645b;
            if (yy5Var.mo5086d(fq6Var2, null, o56Var)) {
                ok6.m9160d(fq6Var2);
            }
            return wq6Var;
        }
    }
}
