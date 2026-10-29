package p000;

/* JADX INFO: renamed from: rl */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1112rl {
    public static final C1075ql Companion = new C1075ql();

    /* JADX INFO: renamed from: a */
    public String f29385a;

    /* JADX INFO: renamed from: b */
    public long f29386b;

    /* JADX INFO: renamed from: c */
    public String f29387c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1112rl)) {
            return false;
        }
        C1112rl c1112rl = (C1112rl) obj;
        return z62.m13387o(this.f29385a, c1112rl.f29385a) && i41.m6646e(this.f29386b, c1112rl.f29386b) && z62.m13387o(this.f29387c, c1112rl.f29387c);
    }

    public final int hashCode() {
        int iHashCode = this.f29385a.hashCode() * 31;
        long j = this.f29386b;
        r50 r50Var = i41.f21117b;
        return this.f29387c.hashCode() + zi4.m13612l(iHashCode, j, 31);
    }

    public final String toString() {
        String str = this.f29385a;
        String strM6656o = i41.m6656o(this.f29386b);
        return zi4.m13623w(zi4.m13625y("AppCrash(threadName=", str, ", timestamp=", strM6656o, ", stacktrace="), this.f29387c, ")");
    }
}
