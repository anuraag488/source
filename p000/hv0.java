package p000;

import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hv0 {

    /* JADX INFO: renamed from: a */
    public BitmapDrawable f20888a;

    /* JADX INFO: renamed from: b */
    public boolean f20889b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv0)) {
            return false;
        }
        hv0 hv0Var = (hv0) obj;
        return this.f20888a.equals(hv0Var.f20888a) && this.f20889b == hv0Var.f20889b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20889b) + (this.f20888a.hashCode() * 31);
    }
}
