package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bf6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f15245a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ AtomicReference f15246b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ mg6 f15247c;

    public /* synthetic */ bf6(byte b) {
        this.f15245a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15245a) {
            case 0:
                AtomicReference atomicReference = this.f15246b;
                synchronized (atomicReference) {
                    try {
                        try {
                            oa6 oa6Var = (oa6) this.f15247c.f36084a;
                            atomicReference.set(Long.valueOf(oa6Var.f26512d.m9222B(oa6Var.m9029p().m4936A(), e56.f17776c0)));
                            this.f15246b.notify();
                        } catch (Throwable th) {
                            this.f15246b.notify();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.f15246b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            oa6 oa6Var2 = (oa6) this.f15247c.f36084a;
                            atomicReference2.set(Double.valueOf(oa6Var2.f26512d.m9224D(oa6Var2.m9029p().m4936A(), e56.f17782e0)));
                            this.f15246b.notify();
                        } catch (Throwable th3) {
                            this.f15246b.notify();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
            default:
                oj6 oj6VarM9027n = ((oa6) this.f15247c.f36084a).m9027n();
                ll6 ll6VarM8036a = ll6.m8036a(ch6.f16035e);
                AtomicReference atomicReference3 = this.f15246b;
                oj6VarM9027n.mo5038t();
                oj6VarM9027n.m9741u();
                cp6 cp6VarM9142L = oj6VarM9027n.m9142L(false);
                yb6 yb6Var = new yb6((byte) 7);
                yb6Var.f35105c = oj6VarM9027n;
                yb6Var.f35104b = atomicReference3;
                yb6Var.f35107e = cp6VarM9142L;
                yb6Var.f35106d = ll6VarM8036a;
                VarHandle.storeStoreFence();
                oj6VarM9027n.m9140J(yb6Var);
                return;
        }
    }
}
