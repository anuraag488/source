package p000;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bk3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public j60 f15363a;

    /* JADX INFO: renamed from: b */
    public volatile AtomicInteger f15364b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ ek3 f15365c;

    @Override // java.lang.Runnable
    public final void run() {
        h33 h33Var;
        String strConcat = "OkHttp ".concat(this.f15365c.f18172b.f15462a.m4810f());
        ek3 ek3Var = this.f15365c;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            ek3Var.f18174d.m10384h();
            boolean z = false;
            try {
                try {
                    try {
                        this.f15363a.onResponse(ek3Var, ek3Var.m5156g());
                        h33Var = ek3Var.f18171a;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            hb3 hb3Var = hb3.f20468a;
                            hb3 hb3Var2 = hb3.f20468a;
                            StringBuilder sb = new StringBuilder("Callback failure for ");
                            sb.append((ek3Var.f18183m ? "canceled " : "") + "call to " + ek3Var.f18172b.f15462a.m4810f());
                            String string = sb.toString();
                            hb3Var2.getClass();
                            hb3.m6326f(4, string, e);
                        } else {
                            this.f15363a.onFailure(ek3Var, e);
                        }
                        h33Var = ek3Var.f18171a;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        ek3Var.m5153d();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            se0.m10720f(iOException, th);
                            this.f15363a.onFailure(ek3Var, iOException);
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                }
                h33Var.f20312a.m12116C(this);
                threadCurrentThread.setName(name);
            } catch (Throwable th3) {
                ek3Var.f18171a.f20312a.m12116C(this);
                throw th3;
            }
        } catch (Throwable th4) {
            threadCurrentThread.setName(name);
            throw th4;
        }
    }
}
