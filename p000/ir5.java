package p000;

import android.os.Handler;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ir5 {

    /* JADX INFO: renamed from: d */
    public static volatile km5 f21717d;

    /* JADX INFO: renamed from: a */
    public final oc6 f21718a;

    /* JADX INFO: renamed from: b */
    public final oz5 f21719b;

    /* JADX INFO: renamed from: c */
    public volatile long f21720c;

    public ir5(oc6 oc6Var) {
        y42.m12854a0(oc6Var);
        this.f21718a = oc6Var;
        oz5 oz5Var = new oz5((byte) 9);
        oz5Var.f27249b = oc6Var;
        oz5Var.f27250c = this;
        VarHandle.storeStoreFence();
        this.f21719b = oz5Var;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo6922a();

    /* JADX INFO: renamed from: b */
    public final void m6923b(long j) {
        m6924c();
        if (j >= 0) {
            oc6 oc6Var = this.f21718a;
            oc6Var.mo9022e().getClass();
            this.f21720c = System.currentTimeMillis();
            if (m6925d().postDelayed(this.f21719b, j)) {
                return;
            }
            oc6Var.mo9019b().f16835j.m12505b(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6924c() {
        this.f21720c = 0L;
        m6925d().removeCallbacks(this.f21719b);
    }

    /* JADX INFO: renamed from: d */
    public final Handler m6925d() {
        km5 km5Var;
        if (f21717d != null) {
            return f21717d;
        }
        synchronized (ir5.class) {
            try {
                if (f21717d == null) {
                    f21717d = new km5(this.f21718a.mo9021d().getMainLooper(), (byte) 2);
                }
                km5Var = f21717d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return km5Var;
    }
}
