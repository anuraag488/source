package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pi4 {

    /* JADX INFO: renamed from: h */
    public static final pi4 f27637h;

    /* JADX INFO: renamed from: i */
    public static final Logger f27638i;

    /* JADX INFO: renamed from: a */
    public w42 f27639a;

    /* JADX INFO: renamed from: b */
    public int f27640b;

    /* JADX INFO: renamed from: c */
    public boolean f27641c;

    /* JADX INFO: renamed from: d */
    public long f27642d;

    /* JADX INFO: renamed from: e */
    public ArrayList f27643e;

    /* JADX INFO: renamed from: f */
    public ArrayList f27644f;

    /* JADX INFO: renamed from: g */
    public RunnableC1029pc f27645g;

    static {
        String strM13623w = zi4.m13623w(new StringBuilder(), zv4.f36421g, " TaskRunner");
        xv4 xv4Var = new xv4();
        xv4Var.f34646a = strM13623w;
        xv4Var.f34647b = true;
        VarHandle.storeStoreFence();
        w42 w42Var = new w42((byte) 16, false);
        w42Var.f33090b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), xv4Var);
        VarHandle.storeStoreFence();
        pi4 pi4Var = new pi4();
        pi4Var.f27639a = w42Var;
        pi4Var.f27640b = 10000;
        pi4Var.f27643e = new ArrayList();
        pi4Var.f27644f = new ArrayList();
        RunnableC1029pc runnableC1029pc = new RunnableC1029pc((byte) 6);
        runnableC1029pc.f27515b = pi4Var;
        VarHandle.storeStoreFence();
        pi4Var.f27645g = runnableC1029pc;
        VarHandle.storeStoreFence();
        f27637h = pi4Var;
        f27638i = Logger.getLogger(pi4.class.getName());
    }

    /* JADX INFO: renamed from: a */
    public final void m9532a(ii4 ii4Var, long j) {
        byte[] bArr = zv4.f36415a;
        oi4 oi4Var = ii4Var.f21462c;
        if (oi4Var.f26766d != ii4Var) {
            C1077qn.m9989o("Check failed.");
            return;
        }
        boolean z = oi4Var.f26768f;
        oi4Var.f26768f = false;
        oi4Var.f26766d = null;
        this.f27643e.remove(oi4Var);
        if (j != -1 && !z && !oi4Var.f26765c) {
            oi4Var.m9125d(ii4Var, j, true);
        }
        if (oi4Var.f26767e.isEmpty()) {
            return;
        }
        this.f27644f.add(oi4Var);
    }

    /* JADX INFO: renamed from: b */
    public final ii4 m9533b() {
        ii4 ii4Var;
        long j;
        boolean z;
        ArrayList arrayList = this.f27643e;
        w42 w42Var = this.f27639a;
        ArrayList arrayList2 = this.f27644f;
        byte[] bArr = zv4.f36415a;
        while (!arrayList2.isEmpty()) {
            long jNanoTime = System.nanoTime();
            int size = arrayList2.size();
            int i = 0;
            long jMin = Long.MAX_VALUE;
            int i2 = 0;
            ii4 ii4Var2 = null;
            while (true) {
                if (i2 >= size) {
                    ii4Var = null;
                    j = jMin;
                    z = false;
                    break;
                }
                Object obj = arrayList2.get(i2);
                i2++;
                ii4Var = null;
                ii4 ii4Var3 = (ii4) ((oi4) obj).f26767e.get(i);
                long j2 = jMin;
                long jMax = Math.max(0L, ii4Var3.f21463d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, j2);
                } else {
                    j = j2;
                    if (ii4Var2 != null) {
                        z = true;
                        break;
                    }
                    ii4Var2 = ii4Var3;
                    jMin = j;
                }
                i = 0;
            }
            if (ii4Var2 != null) {
                byte[] bArr2 = zv4.f36415a;
                ii4Var2.f21463d = -1L;
                oi4 oi4Var = ii4Var2.f21462c;
                oi4Var.f26767e.remove(ii4Var2);
                arrayList2.remove(oi4Var);
                oi4Var.f26766d = ii4Var2;
                arrayList.add(oi4Var);
                if (z || (!this.f27641c && !arrayList2.isEmpty())) {
                    ((ThreadPoolExecutor) w42Var.f33090b).execute(this.f27645g);
                }
                return ii4Var2;
            }
            if (this.f27641c) {
                if (j >= this.f27642d - jNanoTime) {
                    return ii4Var;
                }
                notify();
                return ii4Var;
            }
            this.f27641c = true;
            this.f27642d = jNanoTime + j;
            try {
                try {
                    long j3 = j / 1000000;
                    long j4 = j - (1000000 * j3);
                    if (j3 > r13 || j > 0) {
                        wait(j3, (int) j4);
                    }
                } catch (InterruptedException unused) {
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        ((oi4) arrayList.get(size2)).m9123b();
                    }
                    for (int size3 = arrayList2.size() - 1; -1 < size3; size3--) {
                        oi4 oi4Var2 = (oi4) arrayList2.get(size3);
                        oi4Var2.m9123b();
                        if (oi4Var2.f26767e.isEmpty()) {
                            arrayList2.remove(size3);
                        }
                    }
                }
                this.f27641c = false;
            } catch (Throwable th) {
                this.f27641c = false;
                throw th;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m9534c(oi4 oi4Var) {
        byte[] bArr = zv4.f36415a;
        if (oi4Var.f26766d == null) {
            boolean zIsEmpty = oi4Var.f26767e.isEmpty();
            ArrayList arrayList = this.f27644f;
            if (zIsEmpty) {
                arrayList.remove(oi4Var);
            } else if (!arrayList.contains(oi4Var)) {
                arrayList.add(oi4Var);
            }
        }
        boolean z = this.f27641c;
        w42 w42Var = this.f27639a;
        if (z) {
            notify();
        } else {
            ((ThreadPoolExecutor) w42Var.f33090b).execute(this.f27645g);
        }
    }

    /* JADX INFO: renamed from: d */
    public final oi4 m9535d() {
        int i;
        synchronized (this) {
            i = this.f27640b;
            this.f27640b = i + 1;
        }
        String strM3877i = c75.m3877i(i, "Q");
        oi4 oi4Var = new oi4();
        oi4Var.f26763a = this;
        oi4Var.f26764b = strM3877i;
        oi4Var.f26767e = new ArrayList();
        VarHandle.storeStoreFence();
        return oi4Var;
    }

    /* JADX INFO: renamed from: e */
    public final void m9536e(ii4 ii4Var) {
        byte[] bArr = zv4.f36415a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(ii4Var.f21460a);
        try {
            long jMo6810a = ii4Var.mo6810a();
            synchronized (this) {
                m9532a(ii4Var, jMo6810a);
            }
        } finally {
            synchronized (this) {
                m9532a(ii4Var, -1L);
                threadCurrentThread.setName(name);
            }
        }
    }
}
