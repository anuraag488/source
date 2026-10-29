package p000;

import java.lang.invoke.VarHandle;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pe1 {

    /* JADX INFO: renamed from: a */
    public final String f27561a;

    /* JADX INFO: renamed from: b */
    public final Map f27562b;

    public pe1(String str, Map map) {
        this.f27561a = str;
        this.f27562b = map;
    }

    /* JADX INFO: renamed from: a */
    public static z32 m9500a(String str) {
        z32 z32Var = new z32((byte) 15);
        z32Var.f35739c = null;
        z32Var.f35738b = str;
        VarHandle.storeStoreFence();
        return z32Var;
    }

    /* JADX INFO: renamed from: b */
    public static pe1 m9501b(String str) {
        return new pe1(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe1)) {
            return false;
        }
        pe1 pe1Var = (pe1) obj;
        return this.f27561a.equals(pe1Var.f27561a) && this.f27562b.equals(pe1Var.f27562b);
    }

    public final int hashCode() {
        return this.f27562b.hashCode() + (this.f27561a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f27561a + ", properties=" + this.f27562b.values() + "}";
    }
}
