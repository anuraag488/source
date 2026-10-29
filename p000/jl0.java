package p000;

import android.net.NetworkRequest;
import java.lang.invoke.VarHandle;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jl0 {

    /* JADX INFO: renamed from: j */
    public static final jl0 f22381j;

    /* JADX INFO: renamed from: a */
    public s03 f22382a;

    /* JADX INFO: renamed from: b */
    public p03 f22383b;

    /* JADX INFO: renamed from: c */
    public boolean f22384c;

    /* JADX INFO: renamed from: d */
    public boolean f22385d;

    /* JADX INFO: renamed from: e */
    public boolean f22386e;

    /* JADX INFO: renamed from: f */
    public boolean f22387f;

    /* JADX INFO: renamed from: g */
    public long f22388g;

    /* JADX INFO: renamed from: h */
    public long f22389h;

    /* JADX INFO: renamed from: i */
    public Set f22390i;

    static {
        s03 s03Var = s03.f29788a;
        jl0 jl0Var = new jl0();
        jl0Var.f22383b = new p03(null);
        jl0Var.f22382a = s03Var;
        jl0Var.f22384c = false;
        jl0Var.f22385d = false;
        jl0Var.f22386e = false;
        jl0Var.f22387f = false;
        jl0Var.f22388g = -1L;
        jl0Var.f22389h = -1L;
        jl0Var.f22390i = b81.f15153a;
        VarHandle.storeStoreFence();
        f22381j = jl0Var;
    }

    public jl0(p03 p03Var, s03 s03Var, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
        this.f22383b = p03Var;
        this.f22382a = s03Var;
        this.f22384c = z;
        this.f22385d = z2;
        this.f22386e = z3;
        this.f22387f = z4;
        this.f22388g = j;
        this.f22389h = j2;
        this.f22390i = set;
    }

    /* JADX INFO: renamed from: a */
    public final NetworkRequest m7163a() {
        return (NetworkRequest) this.f22383b.f27261a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !jl0.class.equals(obj.getClass())) {
            return false;
        }
        jl0 jl0Var = (jl0) obj;
        if (this.f22384c == jl0Var.f22384c && this.f22385d == jl0Var.f22385d && this.f22386e == jl0Var.f22386e && this.f22387f == jl0Var.f22387f && this.f22388g == jl0Var.f22388g && this.f22389h == jl0Var.f22389h && z62.m13387o(m7163a(), jl0Var.m7163a()) && this.f22382a == jl0Var.f22382a) {
            return z62.m13387o(this.f22390i, jl0Var.f22390i);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f22382a.hashCode() * 31) + (this.f22384c ? 1 : 0)) * 31) + (this.f22385d ? 1 : 0)) * 31) + (this.f22386e ? 1 : 0)) * 31) + (this.f22387f ? 1 : 0)) * 31;
        long j = this.f22388g;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f22389h;
        int iHashCode2 = (this.f22390i.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31;
        NetworkRequest networkRequestM7163a = m7163a();
        return iHashCode2 + (networkRequestM7163a != null ? networkRequestM7163a.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.f22382a + ", requiresCharging=" + this.f22384c + ", requiresDeviceIdle=" + this.f22385d + ", requiresBatteryNotLow=" + this.f22386e + ", requiresStorageNotLow=" + this.f22387f + ", contentTriggerUpdateDelayMillis=" + this.f22388g + ", contentTriggerMaxDelayMillis=" + this.f22389h + ", contentUriTriggers=" + this.f22390i + ", }";
    }
}
