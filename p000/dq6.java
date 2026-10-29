package p000;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dq6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f17288a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f17289b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f17290c;

    public /* synthetic */ dq6(byte b) {
        this.f17288a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17288a) {
            case 0:
                ((bl0) this.f17289b).mo3614l(((n56) this.f17290c).m8537a());
                break;
            default:
                nr6 nr6Var = (nr6) this.f17289b;
                try {
                    nr6Var.m8828l(((Callable) this.f17290c).call());
                } catch (Exception e) {
                    nr6Var.m8830n(e);
                } catch (Throwable th) {
                    nr6Var.m8830n(new RuntimeException(th));
                    return;
                }
                break;
        }
    }
}
