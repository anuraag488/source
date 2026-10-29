package p000;

import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.VarHandle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class qv2 {

    /* JADX INFO: renamed from: k */
    public static final Object f28821k = new Object();

    /* JADX INFO: renamed from: a */
    public Object f28822a;

    /* JADX INFO: renamed from: b */
    public zt3 f28823b;

    /* JADX INFO: renamed from: c */
    public int f28824c;

    /* JADX INFO: renamed from: d */
    public boolean f28825d;

    /* JADX INFO: renamed from: e */
    public volatile Object f28826e;

    /* JADX INFO: renamed from: f */
    public volatile Object f28827f;

    /* JADX INFO: renamed from: g */
    public int f28828g;

    /* JADX INFO: renamed from: h */
    public boolean f28829h;

    /* JADX INFO: renamed from: i */
    public boolean f28830i;

    /* JADX INFO: renamed from: j */
    public RunnableC1029pc f28831j;

    /* JADX INFO: renamed from: a */
    public static void m10128a(String str) {
        C0989on.m9190f0().f26895r.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        C1077qn.m9989o(zi4.m13621u("Cannot invoke ", str, " on a background thread"));
    }

    /* JADX INFO: renamed from: b */
    public final void m10129b(im2 im2Var) {
        if (im2Var.f21554b) {
            int i = im2Var.f21555c;
            int i2 = this.f28828g;
            if (i >= i2) {
                return;
            }
            im2Var.f21555c = i2;
            ar3 ar3Var = im2Var.f21553a;
            Object obj = this.f28826e;
            ar3Var.getClass();
            lk2 lk2Var = (lk2) obj;
            nz0 nz0Var = (nz0) ar3Var.f14813b;
            if (lk2Var == null || !nz0Var.f26212c0) {
                return;
            }
            throw new IllegalStateException("Fragment " + nz0Var + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10130c(im2 im2Var) {
        if (this.f28829h) {
            this.f28830i = true;
            return;
        }
        this.f28829h = true;
        do {
            this.f28830i = false;
            if (im2Var != null) {
                m10129b(im2Var);
                im2Var = null;
            } else {
                zt3 zt3Var = this.f28823b;
                zt3Var.getClass();
                xt3 xt3Var = new xt3();
                xt3Var.f34620c = zt3Var;
                xt3Var.f34619b = true;
                VarHandle.storeStoreFence();
                zt3Var.f36362c.put(xt3Var, Boolean.FALSE);
                while (xt3Var.hasNext()) {
                    m10129b((im2) ((Map.Entry) xt3Var.next()).getValue());
                    if (this.f28830i) {
                        break;
                    }
                }
            }
        } while (this.f28830i);
        this.f28829h = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m10131d(Object obj) {
        boolean z;
        synchronized (this.f28822a) {
            z = this.f28827f == f28821k;
            this.f28827f = obj;
        }
        if (z) {
            C0989on c0989onM9190f0 = C0989on.m9190f0();
            RunnableC1029pc runnableC1029pc = this.f28831j;
            ax0 ax0Var = c0989onM9190f0.f26895r;
            if (ax0Var.f14926t == null) {
                synchronized (ax0Var.f14924r) {
                    try {
                        if (ax0Var.f14926t == null) {
                            ax0Var.f14926t = Handler.createAsync(Looper.getMainLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            ax0Var.f14926t.post(runnableC1029pc);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10132e(Object obj) {
        m10128a("setValue");
        this.f28828g++;
        this.f28826e = obj;
        m10130c(null);
    }
}
