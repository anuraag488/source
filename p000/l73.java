package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l73 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f23833a;

    /* JADX INFO: renamed from: b */
    public final Object f23834b;

    public l73(Object obj, Object obj2) {
        this.f23833a = obj;
        this.f23834b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l73)) {
            return false;
        }
        l73 l73Var = (l73) obj;
        return z62.m13387o(this.f23833a, l73Var.f23833a) && z62.m13387o(this.f23834b, l73Var.f23834b);
    }

    public final int hashCode() {
        Object obj = this.f23833a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f23834b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f23833a + ", " + this.f23834b + ')';
    }
}
