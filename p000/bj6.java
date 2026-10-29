package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bj6 {

    /* JADX INFO: renamed from: a */
    public final String f15337a;

    /* JADX INFO: renamed from: b */
    public final boolean f15338b;

    public bj6(String str, boolean z) {
        y42.m12851X(str);
        this.f15337a = str;
        y42.m12851X("com.google.android.gms");
        this.f15338b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj6)) {
            return false;
        }
        bj6 bj6Var = (bj6) obj;
        return AbstractC1356y5.m12927u(this.f15337a, bj6Var.f15337a) && AbstractC1356y5.m12927u("com.google.android.gms", "com.google.android.gms") && AbstractC1356y5.m12927u(null, null) && this.f15338b == bj6Var.f15338b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15337a, "com.google.android.gms", null, 4225, Boolean.valueOf(this.f15338b)});
    }

    public final String toString() {
        String str = this.f15337a;
        if (str != null) {
            return str;
        }
        y42.m12854a0(null);
        throw null;
    }
}
