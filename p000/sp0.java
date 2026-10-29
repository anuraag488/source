package p000;

import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sp0 {

    /* JADX INFO: renamed from: c */
    public static final h50 f30456c = new h50((byte) 4);

    /* JADX INFO: renamed from: a */
    public z53 f30457a;

    /* JADX INFO: renamed from: b */
    public AtomicReference f30458b;

    /* JADX INFO: renamed from: a */
    public final h50 m10888a() {
        sp0 sp0Var = (sp0) this.f30458b.get();
        return sp0Var == null ? f30456c : sp0Var.m10888a();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10889b() {
        sp0 sp0Var = (sp0) this.f30458b.get();
        return sp0Var != null && sp0Var.m10889b();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10890c() {
        sp0 sp0Var = (sp0) this.f30458b.get();
        return sp0Var != null && sp0Var.m10890c();
    }

    /* JADX INFO: renamed from: d */
    public final void m10891d(String str, long j, C1381yu c1381yu) {
        String strM13620t = zi4.m13620t("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strM13620t, null);
        }
        z53 z53Var = this.f30457a;
        yj0 yj0Var = new yj0();
        yj0Var.f35261b = str;
        yj0Var.f35260a = j;
        yj0Var.f35262c = c1381yu;
        VarHandle.storeStoreFence();
        z53Var.m13340a(yj0Var);
    }
}
