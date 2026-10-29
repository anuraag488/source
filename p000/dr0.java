package p000;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class dr0 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f17298a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof dr0) {
            return this.f17298a.equals(((dr0) obj).f17298a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17298a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f17298a + ")";
    }
}
