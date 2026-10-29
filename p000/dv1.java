package p000;

import android.os.VibrationEffect;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dv1 {

    /* JADX INFO: renamed from: a */
    public final List f17423a;

    /* JADX INFO: renamed from: b */
    public final VibrationEffect f17424b;

    public dv1(List list, VibrationEffect vibrationEffect) {
        this.f17423a = list;
        this.f17424b = vibrationEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv1)) {
            return false;
        }
        dv1 dv1Var = (dv1) obj;
        return z62.m13387o(this.f17423a, dv1Var.f17423a) && z62.m13387o(this.f17424b, dv1Var.f17424b);
    }

    public final int hashCode() {
        List list = this.f17423a;
        return this.f17424b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "HapticEffect(primitives=" + this.f17423a + ", fallbackEffect=" + this.f17424b + ")";
    }
}
