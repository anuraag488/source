package p000;

import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class my1 extends ii4 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ byte f25291e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f25292f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ my1(String str, Object obj, byte b) {
        super(str, true);
        this.f25291e = b;
        this.f25292f = obj;
    }

    @Override // p000.ii4
    /* JADX INFO: renamed from: a */
    public final long mo6810a() {
        int i = 0;
        switch (this.f25291e) {
            case 0:
                oy1 oy1Var = (oy1) this.f25292f;
                oy1Var.getClass();
                try {
                    oy1Var.f27229w.m12445k(2, 0, false);
                    break;
                } catch (IOException e) {
                    oy1Var.m9328a(2, 2, e);
                }
                return -1L;
            case 1:
                p31 p31Var = (p31) this.f25292f;
                long jNanoTime = System.nanoTime();
                long j = Long.MIN_VALUE;
                hk3 hk3Var = null;
                int i2 = 0;
                for (hk3 hk3Var2 : (ConcurrentLinkedQueue) p31Var.f27340e) {
                    synchronized (hk3Var2) {
                        if (p31Var.m9360b(hk3Var2, jNanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j2 = jNanoTime - hk3Var2.f20657y;
                            if (j2 > j) {
                                hk3Var = hk3Var2;
                                j = j2;
                            }
                        }
                    }
                }
                long j3 = p31Var.f27337b;
                if (j < j3 && i <= p31Var.f27336a) {
                    if (i > 0) {
                        return j3 - j;
                    }
                    if (i2 > 0) {
                        return j3;
                    }
                    return -1L;
                }
                synchronized (hk3Var) {
                    if (!hk3Var.f20656x.isEmpty()) {
                        return 0L;
                    }
                    if (hk3Var.f20657y + j != jNanoTime) {
                        return 0L;
                    }
                    hk3Var.f20650r = true;
                    ((ConcurrentLinkedQueue) p31Var.f27340e).remove(hk3Var);
                    zv4.m13809d(hk3Var.f20644l);
                    if (!((ConcurrentLinkedQueue) p31Var.f27340e).isEmpty()) {
                        return 0L;
                    }
                    ((oi4) p31Var.f27338c).m9122a();
                    return 0L;
                }
            default:
                ((wp1) this.f25292f).invoke();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my1(p31 p31Var, String str) {
        super(str, true);
        this.f25291e = (byte) 1;
        this.f25292f = p31Var;
    }
}
