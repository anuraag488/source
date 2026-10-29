package p000;

import java.lang.invoke.VarHandle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ut2 {

    /* JADX INFO: renamed from: b */
    public static final ut2 f32155b;

    /* JADX INFO: renamed from: a */
    public Map f32156a;

    static {
        Map mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap());
        ut2 ut2Var = new ut2();
        ut2Var.f32156a = mapUnmodifiableMap;
        VarHandle.storeStoreFence();
        f32155b = ut2Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ut2) {
            return this.f32156a.equals(((ut2) obj).f32156a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32156a.hashCode();
    }

    public final String toString() {
        return this.f32156a.toString();
    }
}
