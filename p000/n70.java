package p000;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n70 {

    /* JADX INFO: renamed from: c */
    public static final n70 f25486c = new n70(hb0.m6322h1(new ArrayList()), null);

    /* JADX INFO: renamed from: a */
    public final Set f25487a;

    /* JADX INFO: renamed from: b */
    public final n40 f25488b;

    public n70(Set set, n40 n40Var) {
        this.f25487a = set;
        this.f25488b = n40Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n70)) {
            return false;
        }
        n70 n70Var = (n70) obj;
        return n70Var.f25487a.equals(this.f25487a) && z62.m13387o(n70Var.f25488b, this.f25488b);
    }

    public final int hashCode() {
        int iHashCode = (this.f25487a.hashCode() + 1517) * 41;
        n40 n40Var = this.f25488b;
        return iHashCode + (n40Var != null ? n40Var.hashCode() : 0);
    }
}
