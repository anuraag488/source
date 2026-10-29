package p000;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class il0 {

    /* JADX INFO: renamed from: a */
    public Uri f21526a;

    /* JADX INFO: renamed from: b */
    public boolean f21527b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!il0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        il0 il0Var = (il0) obj;
        return z62.m13387o(this.f21526a, il0Var.f21526a) && this.f21527b == il0Var.f21527b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21527b) + (this.f21526a.hashCode() * 31);
    }
}
