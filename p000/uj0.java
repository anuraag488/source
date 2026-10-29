package p000;

import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uj0 {

    /* JADX INFO: renamed from: d */
    public static final HashMap f31901d = new HashMap();

    /* JADX INFO: renamed from: e */
    public static final ExecutorC0952nn f31902e = new ExecutorC0952nn((byte) 1);

    /* JADX INFO: renamed from: a */
    public Executor f31903a;

    /* JADX INFO: renamed from: b */
    public hk0 f31904b;

    /* JADX INFO: renamed from: c */
    public nr6 f31905c;

    /* JADX INFO: renamed from: a */
    public static Object m11570a(nr6 nr6Var) throws ExecutionException, TimeoutException {
        js1 js1Var = new js1();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        js1Var.f22555a = countDownLatch;
        VarHandle.storeStoreFence();
        Executor executor = f31902e;
        nr6Var.m8820d(executor, js1Var);
        nr6Var.m8819c(executor, js1Var);
        nr6Var.m8817a(executor, js1Var);
        if (!countDownLatch.await(5L, TimeUnit.SECONDS)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (nr6Var.m8826j()) {
            return nr6Var.m8824h();
        }
        throw new ExecutionException(nr6Var.m8823g());
    }

    /* JADX INFO: renamed from: b */
    public final synchronized nr6 m11571b() {
        try {
            nr6 nr6Var = this.f31905c;
            if (nr6Var == null || (nr6Var.m8825i() && !this.f31905c.m8826j())) {
                Executor executor = this.f31903a;
                hk0 hk0Var = this.f31904b;
                Objects.requireNonNull(hk0Var);
                sj0 sj0Var = new sj0((byte) 0);
                sj0Var.f30325b = hk0Var;
                VarHandle.storeStoreFence();
                this.f31905c = y62.m12991r(sj0Var, executor);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f31905c;
    }

    /* JADX INFO: renamed from: c */
    public final wj0 m11572c() {
        synchronized (this) {
            try {
                nr6 nr6Var = this.f31905c;
                if (nr6Var != null && nr6Var.m8826j()) {
                    return (wj0) this.f31905c.m8824h();
                }
                try {
                    return (wj0) m11570a(m11571b());
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final nr6 m11573d(wj0 wj0Var) {
        Executor executor = this.f31903a;
        tj0 tj0Var = new tj0((byte) 0);
        tj0Var.f31190b = this;
        tj0Var.f31191c = wj0Var;
        VarHandle.storeStoreFence();
        nr6 nr6VarM12991r = y62.m12991r(tj0Var, executor);
        C1163sz c1163sz = new C1163sz((byte) 2);
        c1163sz.f30676b = this;
        c1163sz.f30677c = wj0Var;
        VarHandle.storeStoreFence();
        return nr6VarM12991r.m8827k(executor, c1163sz);
    }
}
