package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class q24 {

    /* JADX INFO: renamed from: a */
    public final Class f28160a;

    /* JADX INFO: renamed from: b */
    public final Class f28161b;

    public q24(Class cls, Class cls2) {
        this.f28160a = cls;
        this.f28161b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q24)) {
            return false;
        }
        q24 q24Var = (q24) obj;
        return q24Var.f28160a.equals(this.f28160a) && q24Var.f28161b.equals(this.f28161b);
    }

    public final int hashCode() {
        return Objects.hash(this.f28160a, this.f28161b);
    }

    public final String toString() {
        return this.f28160a.getSimpleName() + " with serialization type: " + this.f28161b.getSimpleName();
    }
}
