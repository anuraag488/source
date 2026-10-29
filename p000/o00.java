package p000;

import android.graphics.BlendModeColorFilter;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class o00 {

    /* JADX INFO: renamed from: a */
    public BlendModeColorFilter f26229a;

    /* JADX INFO: renamed from: b */
    public long f26230b;

    /* JADX INFO: renamed from: c */
    public int f26231c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00)) {
            return false;
        }
        long j = this.f26230b;
        o00 o00Var = (o00) obj;
        long j2 = o00Var.f26230b;
        int i = pb0.f27502i;
        return ws4.m12408a(j, j2) && this.f26231c == o00Var.f26231c;
    }

    public final int hashCode() {
        long j = this.f26230b;
        int i = pb0.f27502i;
        return Integer.hashCode(this.f26231c) + (Long.hashCode(j) * 31);
    }

    public final String toString() {
        return zi4.m13622v("BlendModeColorFilter(color=", pb0.m9470i(this.f26230b), ", blendMode=", qq2.m10015J(this.f26231c), ")");
    }
}
