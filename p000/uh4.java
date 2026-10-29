package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uh4 {

    /* JADX INFO: renamed from: b */
    public static final uh4 f31878b = new uh4(w71.f33134a);

    /* JADX INFO: renamed from: a */
    public final Map f31879a;

    public uh4(Map map) {
        this.f31879a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uh4) {
            return z62.m13387o(this.f31879a, ((uh4) obj).f31879a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31879a.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.f31879a + ')';
    }
}
