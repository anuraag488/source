package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class a86 implements sn6, e43, y33, v33 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f167a;

    /* JADX INFO: renamed from: b */
    public Executor f168b;

    /* JADX INFO: renamed from: c */
    public Object f169c;

    /* JADX INFO: renamed from: d */
    public Object f170d;

    public a86(Executor executor, w33 w33Var) {
        this.f167a = (byte) 1;
        this.f169c = new Object();
        this.f168b = executor;
        this.f170d = w33Var;
    }

    @Override // p000.sn6
    /* JADX INFO: renamed from: a */
    public final void mo139a(nr6 nr6Var) {
        byte b = 25;
        switch (this.f167a) {
            case 0:
                if (nr6Var.f26060d) {
                    synchronized (this.f169c) {
                        try {
                            if (((v33) this.f170d) != null) {
                                Executor executor = this.f168b;
                                RunnableC1029pc runnableC1029pc = new RunnableC1029pc(b);
                                runnableC1029pc.f27515b = this;
                                VarHandle.storeStoreFence();
                                executor.execute(runnableC1029pc);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
            case 1:
                synchronized (this.f169c) {
                    break;
                }
                Executor executor2 = this.f168b;
                oz5 oz5Var = new oz5((byte) 21);
                oz5Var.f27249b = nr6Var;
                oz5Var.f27250c = this;
                VarHandle.storeStoreFence();
                executor2.execute(oz5Var);
                return;
            case 2:
                if (nr6Var.m8826j() || nr6Var.f26060d) {
                    return;
                }
                synchronized (this.f169c) {
                    try {
                        if (((y33) this.f170d) != null) {
                            Executor executor3 = this.f168b;
                            oz5 oz5Var2 = new oz5((byte) 22);
                            oz5Var2.f27249b = nr6Var;
                            oz5Var2.f27250c = this;
                            VarHandle.storeStoreFence();
                            executor3.execute(oz5Var2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 3:
                if (nr6Var.m8826j()) {
                    synchronized (this.f169c) {
                        try {
                            if (((e43) this.f170d) != null) {
                                Executor executor4 = this.f168b;
                                ar1 ar1Var = new ar1(b);
                                ar1Var.f14798b = nr6Var;
                                ar1Var.f14799c = this;
                                VarHandle.storeStoreFence();
                                executor4.execute(ar1Var);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return;
                }
                return;
            default:
                ar1 ar1Var2 = new ar1((byte) 29);
                ar1Var2.f14798b = nr6Var;
                ar1Var2.f14799c = this;
                VarHandle.storeStoreFence();
                this.f168b.execute(ar1Var2);
                return;
        }
    }

    @Override // p000.v33
    /* JADX INFO: renamed from: e */
    public void mo140e() {
        ((nr6) this.f170d).m8831o();
    }

    @Override // p000.y33
    /* JADX INFO: renamed from: g */
    public void mo141g(Exception exc) {
        ((nr6) this.f170d).m8830n(exc);
    }

    @Override // p000.e43
    public void onSuccess(Object obj) {
        ((nr6) this.f170d).m8828l(obj);
    }

    public /* synthetic */ a86(byte b) {
        this.f167a = b;
    }

    public a86(Executor executor, le4 le4Var, nr6 nr6Var) {
        this.f167a = (byte) 4;
        this.f168b = executor;
        this.f169c = le4Var;
        this.f170d = nr6Var;
    }
}
