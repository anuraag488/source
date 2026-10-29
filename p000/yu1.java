package p000;

import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.VarHandle;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yu1 extends so0 implements mx0 {

    /* JADX INFO: renamed from: b */
    public final Handler f35528b;

    /* JADX INFO: renamed from: c */
    public final String f35529c;

    /* JADX INFO: renamed from: d */
    public final boolean f35530d;

    /* JADX INFO: renamed from: e */
    public final yu1 f35531e;

    public yu1(Handler handler, String str, boolean z) {
        this.f35528b = handler;
        this.f35529c = str;
        this.f35530d = z;
        this.f35531e = z ? this : new yu1(handler, str, true);
    }

    @Override // p000.mx0
    /* JADX INFO: renamed from: A */
    public final w01 mo6961A(long j, Runnable runnable, ro0 ro0Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (!this.f35528b.postDelayed(runnable, j)) {
            m13240O(ro0Var, runnable);
            return l13.f23702a;
        }
        xu1 xu1Var = new xu1();
        xu1Var.f34628a = this;
        xu1Var.f34629b = runnable;
        VarHandle.storeStoreFence();
        return xu1Var;
    }

    @Override // p000.so0
    /* JADX INFO: renamed from: K */
    public final void mo5041K(ro0 ro0Var, Runnable runnable) {
        if (this.f35528b.post(runnable)) {
            return;
        }
        m13240O(ro0Var, runnable);
    }

    @Override // p000.so0
    /* JADX INFO: renamed from: M */
    public final boolean mo6962M(ro0 ro0Var) {
        return (this.f35530d && z62.m13387o(Looper.myLooper(), this.f35528b.getLooper())) ? false : true;
    }

    @Override // p000.so0
    /* JADX INFO: renamed from: N */
    public final so0 mo5042N(int i, String str) {
        vd6.m11848g(i);
        return vd6.m11823G(this, str);
    }

    /* JADX INFO: renamed from: O */
    public final void m13240O(ro0 ro0Var, Runnable runnable) {
        y70.m13032l(ro0Var, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        pw0 pw0Var = l01.f23664a;
        gw0.f20149b.mo5041K(ro0Var, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yu1)) {
            return false;
        }
        yu1 yu1Var = (yu1) obj;
        return yu1Var.f35528b == this.f35528b && yu1Var.f35530d == this.f35530d;
    }

    public final int hashCode() {
        return (this.f35530d ? 1231 : 1237) ^ System.identityHashCode(this.f35528b);
    }

    @Override // p000.mx0
    /* JADX INFO: renamed from: j */
    public final void mo5055j(long j, b70 b70Var) {
        RunnableC1285w9 runnableC1285w9 = new RunnableC1285w9((byte) 11);
        runnableC1285w9.f33164b = b70Var;
        runnableC1285w9.f33165c = this;
        VarHandle.storeStoreFence();
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (!this.f35528b.postDelayed(runnableC1285w9, j)) {
            m13240O(b70Var.f15139e, runnableC1285w9);
            return;
        }
        na1 na1Var = new na1((byte) 7);
        na1Var.f25595b = this;
        na1Var.f25596c = runnableC1285w9;
        VarHandle.storeStoreFence();
        b70Var.m3499w(na1Var);
    }

    @Override // p000.so0
    public final String toString() {
        yu1 yu1Var;
        String str;
        pw0 pw0Var = l01.f23664a;
        yu1 yu1Var2 = mp2.f25111a;
        if (this == yu1Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                yu1Var = yu1Var2.f35531e;
            } catch (UnsupportedOperationException unused) {
                yu1Var = null;
            }
            str = this == yu1Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f35529c;
        if (string == null) {
            string = this.f35528b.toString();
        }
        if (!this.f35530d) {
            return string;
        }
        return string + ".immediate";
    }

    public yu1(Handler handler) {
        this(handler, null, false);
    }
}
