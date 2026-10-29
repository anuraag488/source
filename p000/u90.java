package p000;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class u90 {

    /* JADX INFO: renamed from: a */
    public int f31736a;

    /* JADX INFO: renamed from: b */
    public Method f31737b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u90)) {
            return false;
        }
        u90 u90Var = (u90) obj;
        return this.f31736a == u90Var.f31736a && this.f31737b.getName().equals(u90Var.f31737b.getName());
    }

    public final int hashCode() {
        return this.f31737b.getName().hashCode() + (this.f31736a * 31);
    }
}
