package p000;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rc4 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final jg3 f29154a;

    /* JADX INFO: renamed from: b */
    public final qb4 f29155b;

    /* JADX INFO: renamed from: c */
    public final boolean f29156c;

    /* JADX INFO: renamed from: d */
    public final int f29157d;

    public rc4(jg3 jg3Var, qb4 qb4Var, boolean z, int i) {
        this.f29154a = jg3Var;
        this.f29155b = qb4Var;
        this.f29156c = z;
        this.f29157d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM7103d;
        h35 h35VarM7105b;
        boolean z = this.f29156c;
        jg3 jg3Var = this.f29154a;
        qb4 qb4Var = this.f29155b;
        if (z) {
            int i = this.f29157d;
            jg3Var.getClass();
            String str = qb4Var.f28367a.f17648a;
            synchronized (jg3Var.f22256j) {
                h35VarM7105b = jg3Var.m7105b(str);
            }
            zM7103d = jg3.m7103d(str, h35VarM7105b, i);
        } else {
            int i2 = this.f29157d;
            jg3Var.getClass();
            String str2 = qb4Var.f28367a.f17648a;
            synchronized (jg3Var.f22256j) {
                try {
                    if (jg3Var.f22251e.get(str2) != null) {
                        wn2.m12326e().m12328b(jg3.f22246k, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                    } else {
                        Set set = (Set) jg3Var.f22253g.get(str2);
                        if (set != null && set.contains(qb4Var)) {
                            zM7103d = jg3.m7103d(str2, jg3Var.m7105b(str2), i2);
                        }
                    }
                    zM7103d = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        wn2.m12326e().m12328b(wn2.m12327g("StopWorkRunnable"), "StopWorkRunnable for " + this.f29155b.f28367a.f17648a + "; Processor.stopWork = " + zM7103d + ", reason: " + this.f29157d);
    }
}
