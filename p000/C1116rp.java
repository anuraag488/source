package p000;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: rp */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class C1116rp extends ym4 {

    /* JADX INFO: renamed from: h */
    public static final hf0 f29486h;

    /* JADX INFO: renamed from: i */
    public static C1116rp f29487i;

    /* JADX INFO: renamed from: j */
    public static final ReentrantLock f29488j;

    /* JADX INFO: renamed from: k */
    public static final Condition f29489k;

    /* JADX INFO: renamed from: l */
    public static final char f29490l;

    /* JADX INFO: renamed from: m */
    public static final long f29491m;

    /* JADX INFO: renamed from: e */
    public byte f29492e;

    /* JADX INFO: renamed from: f */
    public int f29493f = -1;

    /* JADX INFO: renamed from: g */
    public long f29494g;

    static {
        hf0 hf0Var = new hf0((byte) 5);
        hf0Var.f20529c = new C1116rp[8];
        f29486h = hf0Var;
        ReentrantLock reentrantLock = new ReentrantLock();
        f29488j = reentrantLock;
        f29489k = reentrantLock.newCondition();
        f29490l = (char) 60000;
        f29491m = 60000000000L;
    }

    /* JADX INFO: renamed from: h */
    public final void m10384h() {
        long j = this.f35336c;
        boolean z = this.f35334a;
        if (j != 0 || z) {
            ReentrantLock reentrantLock = f29488j;
            reentrantLock.lock();
            try {
                if (this.f29492e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f29492e = (byte) 1;
                d24.m4324y(this);
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m10385i() {
        ReentrantLock reentrantLock = f29488j;
        reentrantLock.lock();
        try {
            byte b = this.f29492e;
            this.f29492e = (byte) 0;
            if (b != 1) {
                return b == 2;
            }
            f29486h.m6383q(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: j */
    public void mo4413j() {
    }
}
