package p000;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class ym4 {

    /* JADX INFO: renamed from: d */
    public static final xm4 f35333d = new xm4();

    /* JADX INFO: renamed from: a */
    public boolean f35334a;

    /* JADX INFO: renamed from: b */
    public long f35335b;

    /* JADX INFO: renamed from: c */
    public long f35336c;

    /* JADX INFO: renamed from: a */
    public ym4 mo7561a() {
        this.f35334a = false;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public ym4 mo7562b() {
        this.f35336c = 0L;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public long mo7563c() {
        if (this.f35334a) {
            return this.f35335b;
        }
        C1077qn.m9989o("No deadline");
        return 0L;
    }

    /* JADX INFO: renamed from: d */
    public ym4 mo7564d(long j) {
        this.f35334a = true;
        this.f35335b = j;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo7565e() {
        return this.f35334a;
    }

    /* JADX INFO: renamed from: f */
    public void mo7566f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f35334a && this.f35335b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* JADX INFO: renamed from: g */
    public ym4 mo7567g(long j) {
        if (j >= 0) {
            this.f35336c = TimeUnit.MILLISECONDS.toNanos(j);
            return this;
        }
        C1077qn.m9988n(zi4.m13619s("timeout < 0: ", j));
        return null;
    }
}
