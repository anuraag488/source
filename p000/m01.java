package p000;

import android.view.DisplayCutout;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class m01 {

    /* JADX INFO: renamed from: a */
    public DisplayCutout f24510a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m01.class != obj.getClass()) {
            return false;
        }
        return this.f24510a.equals(((m01) obj).f24510a);
    }

    public final int hashCode() {
        return this.f24510a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f24510a + "}";
    }
}
