package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: ou */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1010ou {

    /* JADX INFO: renamed from: a */
    public long f27100a;

    /* JADX INFO: renamed from: b */
    public C0588dv f27101b;

    /* JADX INFO: renamed from: c */
    public C0467au f27102c;

    /* JADX INFO: renamed from: a */
    public static C1010ou m9267a(long j, C0588dv c0588dv, C0467au c0467au) {
        C1010ou c1010ou = new C1010ou();
        c1010ou.f27100a = j;
        if (c0588dv == null) {
            xy4.m12782k("Null transportContext");
            return null;
        }
        c1010ou.f27101b = c0588dv;
        if (c0467au == null) {
            xy4.m12782k("Null event");
            return null;
        }
        c1010ou.f27102c = c0467au;
        VarHandle.storeStoreFence();
        return c1010ou;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1010ou) {
            C1010ou c1010ou = (C1010ou) obj;
            if (this.f27100a == c1010ou.f27100a && this.f27101b.equals(c1010ou.f27101b) && this.f27102c.equals(c1010ou.f27102c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f27100a;
        return this.f27102c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f27101b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f27100a + ", transportContext=" + this.f27101b + ", event=" + this.f27102c + "}";
    }
}
