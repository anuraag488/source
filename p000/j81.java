package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class j81 {

    /* JADX INFO: renamed from: a */
    public String f22086a;

    /* JADX INFO: renamed from: a */
    public static j81 m7046a(String str) {
        j81 j81Var = new j81();
        if (str == null) {
            xy4.m12782k("name is null");
            return null;
        }
        j81Var.f22086a = str;
        VarHandle.storeStoreFence();
        return j81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j81) {
            return this.f22086a.equals(((j81) obj).f22086a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22086a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return zi4.m13623w(new StringBuilder("Encoding{name=\""), this.f22086a, "\"}");
    }
}
