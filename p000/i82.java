package p000;

import android.content.Context;
import android.util.CloseGuard;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i82 implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final Object f21167a;

    /* JADX INFO: renamed from: b */
    public final ar3 f21168b;

    /* JADX INFO: renamed from: c */
    public final m82 f21169c;

    /* JADX INFO: renamed from: d */
    public q72 f21170d;

    public i82(m82 m82Var) {
        Object obj = new Object();
        this.f21167a = obj;
        js1 js1Var = new js1();
        js1Var.f22555a = new CloseGuard();
        VarHandle.storeStoreFence();
        ar3 ar3Var = new ar3((byte) 13);
        ar3Var.f14813b = js1Var;
        VarHandle.storeStoreFence();
        this.f21168b = ar3Var;
        new HashSet();
        this.f21169c = m82Var;
        synchronized (obj) {
            this.f21170d = new C0973o7("isolate not initialized", (byte) 13);
        }
    }

    /* JADX INFO: renamed from: a */
    public static i82 m6692a(m82 m82Var, q50 q50Var) {
        i82 i82Var = new i82(m82Var);
        synchronized (i82Var.f21167a) {
            try {
                m82 m82Var2 = i82Var.f21169c;
                m82Var2.getClass();
                qz1 qz1VarM8223e = i82Var.f21169c.m8223e(q50Var, m82Var2.f24732i.contains("JS_FEATURE_ISOLATE_CLIENT") ? new h82(i82Var) : null);
                x72 x72Var = new x72();
                x72Var.f34038c = new Object();
                x72Var.f34040e = new HashSet();
                x72Var.f34041f = new HashMap();
                x72Var.f34037b = i82Var;
                x72Var.f34039d = qz1VarM8223e;
                x72Var.f34036a = 20971520;
                VarHandle.storeStoreFence();
                i82Var.f21170d = x72Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        ((CloseGuard) ((js1) i82Var.f21168b.f14813b).f22555a).open("close");
        return i82Var;
    }

    /* JADX INFO: renamed from: b */
    public static i82 m6693b(m82 m82Var, String str) {
        i82 i82Var = new i82(m82Var);
        vi4 vi4Var = new vi4(2, str);
        synchronized (i82Var.f21167a) {
            i82Var.f21170d = new ar3(vi4Var);
        }
        ((CloseGuard) ((js1) i82Var.f21168b.f14813b).f22555a).open("close");
        return i82Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f21167a) {
            this.f21170d.close();
            this.f21170d = new C0973o7("isolate closed", (byte) 13);
        }
        m82 m82Var = this.f21169c;
        synchronized (m82Var.f24724a) {
            m82Var.f24729f.remove(this);
        }
        ((CloseGuard) ((js1) this.f21168b.f14813b).f22555a).close();
    }

    /* JADX INFO: renamed from: e */
    public final zl2 m6694e(String str) {
        zl2 zl2VarMo3137e;
        synchronized (this.f21167a) {
            zl2VarMo3137e = this.f21170d.mo3137e(str);
        }
        return zl2VarMo3137e;
    }

    public final void finalize() throws Throwable {
        try {
            ((CloseGuard) ((js1) this.f21168b.f14813b).f22555a).warnIfOpen();
            close();
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m6695g(vi4 vi4Var) {
        synchronized (this.f21167a) {
            try {
                if (vi4Var.f32651a == 3) {
                    Log.e("JavaScriptIsolate", "isolate exceeded its heap memory limit - killing sandbox");
                    m82 m82Var = this.f21169c;
                    Context context = m82Var.f24728e;
                    l82 l82Var = (l82) m82Var.f24727d.getAndSet(null);
                    if (l82Var != null) {
                        context.unbindService(l82Var);
                    }
                    Executor mainExecutor = context.getMainExecutor();
                    RunnableC1054q0 runnableC1054q0 = new RunnableC1054q0((byte) 10);
                    runnableC1054q0.f28115b = m82Var;
                    VarHandle.storeStoreFence();
                    mainExecutor.execute(runnableC1054q0);
                }
                q72 q72Var = this.f21170d;
                if (!q72Var.mo3135b()) {
                    return false;
                }
                this.f21170d = new ar3(vi4Var);
                q72Var.mo9753a(vi4Var);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final vi4 m6696j() {
        synchronized (this.f21167a) {
            try {
                vi4 vi4Var = new vi4(2, "sandbox dead");
                if (m6695g(vi4Var)) {
                    return vi4Var;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
