package p000;

import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hs2 {

    /* JADX INFO: renamed from: a */
    public final Bitmap f20826a;

    /* JADX INFO: renamed from: b */
    public final Map f20827b;

    public hs2(Bitmap bitmap, Map map) {
        this.f20826a = bitmap;
        this.f20827b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs2)) {
            return false;
        }
        hs2 hs2Var = (hs2) obj;
        return this.f20826a.equals(hs2Var.f20826a) && z62.m13387o(this.f20827b, hs2Var.f20827b);
    }

    public final int hashCode() {
        return this.f20827b.hashCode() + (this.f20826a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(bitmap=" + this.f20826a + ", extras=" + this.f20827b + ')';
    }
}
