package p000;

import java.lang.invoke.VarHandle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mo2 implements na0, Iterable, cc2 {

    /* JADX INFO: renamed from: a */
    public long f25081a;

    /* JADX INFO: renamed from: b */
    public long f25082b;

    /* JADX INFO: renamed from: c */
    public boolean f25083c;

    static {
        new mo2(1L, 0L);
    }

    public mo2(long j, long j2) {
        this.f25081a = j;
        if (j < j2) {
            long j3 = j2 % 1;
            long j4 = j % 1;
            long j5 = ((j3 < 0 ? j3 + 1 : j3) - (j4 < 0 ? j4 + 1 : j4)) % 1;
            j2 -= j5 < 0 ? j5 + 1 : j5;
        }
        this.f25082b = j2;
        this.f25083c = true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mo2)) {
            return false;
        }
        if (isEmpty() && ((mo2) obj).isEmpty()) {
            return true;
        }
        mo2 mo2Var = (mo2) obj;
        return this.f25081a == mo2Var.f25081a && this.f25082b == mo2Var.f25082b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Long.hashCode(this.f25082b) + (Long.hashCode(this.f25081a) * 31);
    }

    public final boolean isEmpty() {
        return this.f25081a > this.f25082b;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [boolean, int] */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        long j = this.f25081a;
        long j2 = this.f25082b;
        long j3 = this.f25083c ? 1L : 0L;
        lo2 lo2Var = new lo2();
        lo2Var.f24227a = (int) j3;
        lo2Var.f24228b = j2;
        boolean z = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        lo2Var.f24229c = z;
        if (!z) {
            j = j2;
        }
        lo2Var.f24230d = j;
        VarHandle.storeStoreFence();
        return lo2Var;
    }

    public final String toString() {
        return this.f25081a + ".." + this.f25082b;
    }
}
