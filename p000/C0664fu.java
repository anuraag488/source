package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: fu */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0664fu {

    /* JADX INFO: renamed from: a */
    public String f19283a;

    /* JADX INFO: renamed from: b */
    public ArrayList f19284b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0664fu)) {
            return false;
        }
        C0664fu c0664fu = (C0664fu) obj;
        return this.f19283a.equals(c0664fu.f19283a) && this.f19284b.equals(c0664fu.f19284b);
    }

    public final int hashCode() {
        return this.f19284b.hashCode() ^ ((this.f19283a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f19283a + ", usedDates=" + this.f19284b + "}";
    }
}
