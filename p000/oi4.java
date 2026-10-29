package p000;

import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class oi4 {

    /* JADX INFO: renamed from: a */
    public pi4 f26763a;

    /* JADX INFO: renamed from: b */
    public String f26764b;

    /* JADX INFO: renamed from: c */
    public boolean f26765c;

    /* JADX INFO: renamed from: d */
    public ii4 f26766d;

    /* JADX INFO: renamed from: e */
    public ArrayList f26767e;

    /* JADX INFO: renamed from: f */
    public boolean f26768f;

    /* JADX INFO: renamed from: a */
    public final void m9122a() {
        byte[] bArr = zv4.f36415a;
        synchronized (this.f26763a) {
            if (m9123b()) {
                this.f26763a.m9534c(this);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9123b() {
        ArrayList arrayList = this.f26767e;
        ii4 ii4Var = this.f26766d;
        if (ii4Var != null && ii4Var.f21461b) {
            this.f26768f = true;
        }
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((ii4) arrayList.get(size)).f21461b) {
                ii4 ii4Var2 = (ii4) arrayList.get(size);
                pi4 pi4Var = pi4.f27637h;
                if (pi4.f27638i.isLoggable(Level.FINE)) {
                    ev0.m5359i0(ii4Var2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public final void m9124c(ii4 ii4Var, long j) {
        synchronized (this.f26763a) {
            if (!this.f26765c) {
                if (m9125d(ii4Var, j, false)) {
                    this.f26763a.m9534c(this);
                }
            } else if (ii4Var.f21461b) {
                pi4 pi4Var = pi4.f27637h;
                if (pi4.f27638i.isLoggable(Level.FINE)) {
                    ev0.m5359i0(ii4Var, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                pi4 pi4Var2 = pi4.f27637h;
                if (pi4.f27638i.isLoggable(Level.FINE)) {
                    ev0.m5359i0(ii4Var, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076 A[LOOP:0: B:23:0x0064->B:27:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x007a A[EDGE_INSN: B:39:0x007a->B:29:0x007a BREAK  A[LOOP:0: B:23:0x0064->B:27:0x0076], SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public final boolean m9125d(ii4 ii4Var, long j, boolean z) {
        int size;
        int size2;
        int i;
        Object obj;
        String strConcat;
        ArrayList arrayList = this.f26767e;
        oi4 oi4Var = ii4Var.f21462c;
        if (oi4Var != this) {
            if (oi4Var != null) {
                C1077qn.m9989o("task is in multiple queues");
                return false;
            }
            ii4Var.f21462c = this;
        }
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        int iIndexOf = arrayList.indexOf(ii4Var);
        if (iIndexOf == -1) {
            ii4Var.f21463d = j2;
            pi4 pi4Var = pi4.f27637h;
            if (pi4.f27638i.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(ev0.m5350Z(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(ev0.m5350Z(j2 - jNanoTime));
                }
                ev0.m5359i0(ii4Var, this, strConcat);
            }
            size = arrayList.size();
            size2 = 0;
            i = 0;
            while (true) {
                if (i < size) {
                    size2 = -1;
                    break;
                }
                obj = arrayList.get(i);
                i++;
                if (((ii4) obj).f21463d - jNanoTime > j) {
                    break;
                }
                size2++;
            }
            if (size2 == -1) {
                size2 = arrayList.size();
            }
            arrayList.add(size2, ii4Var);
            if (size2 == 0) {
                return true;
            }
        } else if (ii4Var.f21463d <= j2) {
            pi4 pi4Var2 = pi4.f27637h;
            if (pi4.f27638i.isLoggable(Level.FINE)) {
                ev0.m5359i0(ii4Var, this, "already scheduled");
                return false;
            }
        } else {
            arrayList.remove(iIndexOf);
            ii4Var.f21463d = j2;
            pi4 pi4Var3 = pi4.f27637h;
            if (pi4.f27638i.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(ev0.m5350Z(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(ev0.m5350Z(j2 - jNanoTime));
                }
                ev0.m5359i0(ii4Var, this, strConcat);
            }
            size = arrayList.size();
            size2 = 0;
            i = 0;
            while (true) {
                if (i < size) {
                    size2 = -1;
                    break;
                }
                obj = arrayList.get(i);
                i++;
                if (((ii4) obj).f21463d - jNanoTime > j) {
                    break;
                    break;
                }
                size2++;
            }
            if (size2 == -1) {
                size2 = arrayList.size();
            }
            arrayList.add(size2, ii4Var);
            if (size2 == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m9126e() {
        byte[] bArr = zv4.f36415a;
        synchronized (this.f26763a) {
            this.f26765c = true;
            if (m9123b()) {
                this.f26763a.m9534c(this);
            }
        }
    }

    public final String toString() {
        return this.f26764b;
    }
}
