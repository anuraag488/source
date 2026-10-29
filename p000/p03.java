package p000;

import android.net.NetworkRequest;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class p03 {

    /* JADX INFO: renamed from: b */
    public static final String f27260b = wn2.m12327g("NetworkRequestCompat");

    /* JADX INFO: renamed from: a */
    public final Object f27261a;

    public p03(NetworkRequest networkRequest) {
        this.f27261a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p03) && z62.m13387o(this.f27261a, ((p03) obj).f27261a);
    }

    public final int hashCode() {
        Object obj = this.f27261a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.f27261a + ")";
    }
}
