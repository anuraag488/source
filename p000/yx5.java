package p000;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class yx5 implements yz5 {

    /* JADX INFO: renamed from: d */
    public static final Object f35601d = new Object();

    /* JADX INFO: renamed from: e */
    public static final vd3 f35602e = new vd3(e06.class);

    /* JADX INFO: renamed from: f */
    public static final boolean f35603f;

    /* JADX INFO: renamed from: g */
    public static final sx5 f35604g;

    /* JADX INFO: renamed from: a */
    public volatile Object f35605a;

    /* JADX INFO: renamed from: b */
    public volatile px5 f35606b;

    /* JADX INFO: renamed from: c */
    public volatile wx5 f35607c;

    static {
        boolean z;
        sx5 ux5Var;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f35603f = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                ux5Var = new vx5();
            } catch (Error | Exception e) {
                try {
                    ux5Var = new tx5();
                } catch (Error | Exception e2) {
                    th3 = e2;
                    ux5Var = new ux5();
                }
                th = th3;
                th2 = e;
            }
        } else {
            try {
                ux5Var = new tx5();
            } catch (NoClassDefFoundError unused2) {
                ux5Var = new ux5();
            }
        }
        th = null;
        th2 = null;
        f35604g = ux5Var;
        if (th != null) {
            vd3 vd3Var = f35602e;
            Logger loggerM11815a = vd3Var.m11815a();
            Level level = Level.SEVERE;
            loggerM11815a.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            vd3Var.m11815a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m13271c(wx5 wx5Var) {
        wx5Var.f33842a = null;
        while (true) {
            wx5 wx5Var2 = this.f35607c;
            if (wx5Var2 != wx5.f33841c) {
                wx5 wx5Var3 = null;
                while (wx5Var2 != null) {
                    wx5 wx5Var4 = wx5Var2.f33843b;
                    if (wx5Var2.f33842a != null) {
                        wx5Var3 = wx5Var2;
                    } else if (wx5Var3 != null) {
                        wx5Var3.f33843b = wx5Var4;
                        if (wx5Var3.f33842a == null) {
                        }
                    } else if (!f35604g.mo10953h(this, wx5Var2, wx5Var4)) {
                    }
                    wx5Var2 = wx5Var4;
                }
                return;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract Throwable mo4846d();
}
