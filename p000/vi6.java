package p000;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vi6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32653a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ s56 f32654b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ jj6 f32655c;

    public /* synthetic */ vi6(byte b) {
        this.f32653a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32653a) {
            case 0:
                jj6 jj6Var = this.f32655c;
                synchronized (jj6Var) {
                    try {
                        jj6Var.f22342a = false;
                        oj6 oj6Var = jj6Var.f22344c;
                        if (!oj6Var.m9143M()) {
                            d76 d76Var = ((oa6) oj6Var.f36084a).f26514f;
                            oa6.m9016l(d76Var);
                            d76Var.f16831L.m12504a("Connected to service");
                            s56 s56Var = this.f32654b;
                            oj6Var.mo5038t();
                            y42.m12854a0(s56Var);
                            oj6Var.f26789h = s56Var;
                            oj6Var.m9139I();
                            oj6Var.m9141K();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                jj6 jj6Var2 = this.f32655c;
                synchronized (jj6Var2) {
                    try {
                        jj6Var2.f22342a = false;
                        oj6 oj6Var2 = jj6Var2.f22344c;
                        if (!oj6Var2.m9143M()) {
                            d76 d76Var2 = ((oa6) oj6Var2.f36084a).f26514f;
                            oa6.m9016l(d76Var2);
                            d76Var2.f16842q.m12504a("Connected to remote service");
                            s56 s56Var2 = this.f32654b;
                            oj6Var2.mo5038t();
                            oj6Var2.f26789h = s56Var2;
                            oj6Var2.m9139I();
                            oj6Var2.m9141K();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                oj6 oj6Var3 = this.f32655c.f22344c;
                ScheduledExecutorService scheduledExecutorService = oj6Var3.f26792k;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    oj6Var3.f26792k = null;
                    return;
                }
                return;
        }
    }
}
