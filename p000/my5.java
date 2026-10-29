package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class my5 implements sn6, e43, y33, v33 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25304a;

    /* JADX INFO: renamed from: b */
    public Executor f25305b;

    /* JADX INFO: renamed from: c */
    public xm0 f25306c;

    /* JADX INFO: renamed from: d */
    public nr6 f25307d;

    public /* synthetic */ my5(byte b) {
        this.f25304a = b;
    }

    @Override // p000.sn6
    /* JADX INFO: renamed from: a */
    public final void mo139a(nr6 nr6Var) {
        switch (this.f25304a) {
            case 0:
                ar1 ar1Var = new ar1((byte) 14);
                ar1Var.f14798b = nr6Var;
                ar1Var.f14799c = this;
                VarHandle.storeStoreFence();
                this.f25305b.execute(ar1Var);
                break;
            default:
                ar1 ar1Var2 = new ar1((byte) 17);
                ar1Var2.f14798b = nr6Var;
                ar1Var2.f14799c = this;
                VarHandle.storeStoreFence();
                this.f25305b.execute(ar1Var2);
                break;
        }
    }

    @Override // p000.v33
    /* JADX INFO: renamed from: e */
    public void mo140e() {
        this.f25307d.m8831o();
    }

    @Override // p000.y33
    /* JADX INFO: renamed from: g */
    public void mo141g(Exception exc) {
        this.f25307d.m8830n(exc);
    }

    @Override // p000.e43
    public void onSuccess(Object obj) {
        this.f25307d.m8828l(obj);
    }
}
