package p000;

import android.os.Bundle;
import java.lang.invoke.VarHandle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class oe6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f26658a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ AtomicReference f26659b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ mg6 f26660c;

    public /* synthetic */ oe6(byte b) {
        this.f26658a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26658a) {
            case 0:
                AtomicReference atomicReference = this.f26659b;
                synchronized (atomicReference) {
                    try {
                        try {
                            oa6 oa6Var = (oa6) this.f26660c.f36084a;
                            atomicReference.set(Boolean.valueOf(oa6Var.f26512d.m9225E(oa6Var.m9029p().m4936A(), e56.f17770a0)));
                            this.f26659b.notify();
                        } catch (Throwable th) {
                            this.f26659b.notify();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.f26659b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            oa6 oa6Var2 = (oa6) this.f26660c.f36084a;
                            atomicReference2.set(oa6Var2.f26512d.m9221A(oa6Var2.m9029p().m4936A(), e56.f17773b0));
                            this.f26659b.notify();
                        } catch (Throwable th3) {
                            this.f26659b.notify();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
            case 2:
                AtomicReference atomicReference3 = this.f26659b;
                synchronized (atomicReference3) {
                    try {
                        try {
                            oa6 oa6Var3 = (oa6) this.f26660c.f36084a;
                            atomicReference3.set(Integer.valueOf(oa6Var3.f26512d.m9223C(oa6Var3.m9029p().m4936A(), e56.f17779d0)));
                            this.f26659b.notify();
                        } catch (Throwable th5) {
                            this.f26659b.notify();
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                return;
            default:
                mg6 mg6Var = this.f26660c;
                s86 s86Var = ((oa6) mg6Var.f36084a).f26513e;
                oa6.m9014j(s86Var);
                Bundle bundleM10190a = s86Var.f29973L.m10190a();
                oj6 oj6VarM9027n = ((oa6) mg6Var.f36084a).m9027n();
                AtomicReference atomicReference4 = this.f26659b;
                oj6VarM9027n.mo5038t();
                oj6VarM9027n.m9741u();
                cp6 cp6VarM9142L = oj6VarM9027n.m9142L(false);
                yb6 yb6Var = new yb6((byte) 6);
                yb6Var.f35105c = oj6VarM9027n;
                yb6Var.f35104b = atomicReference4;
                yb6Var.f35106d = cp6VarM9142L;
                yb6Var.f35107e = bundleM10190a;
                VarHandle.storeStoreFence();
                oj6VarM9027n.m9140J(yb6Var);
                return;
        }
    }
}
