package p000;

import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i12 {

    /* JADX INFO: renamed from: a */
    public Resources.Theme f21004a;

    /* JADX INFO: renamed from: b */
    public int f21005b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i12)) {
            return false;
        }
        i12 i12Var = (i12) obj;
        return z62.m13387o(this.f21004a, i12Var.f21004a) && this.f21005b == i12Var.f21005b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21005b) + (this.f21004a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(theme=" + this.f21004a + ", id=" + this.f21005b + ")";
    }
}
