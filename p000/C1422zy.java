package p000;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: zy */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1422zy {

    /* JADX INFO: renamed from: a */
    public LinkedHashMap f36457a;

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C1422zy) && z62.m13387o(((C1422zy) obj).f36457a, this.f36457a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f36457a.hashCode();
    }
}
