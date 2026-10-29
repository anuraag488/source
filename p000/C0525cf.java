package p000;

import android.graphics.PathMeasure;

/* JADX INFO: renamed from: cf */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0525cf {

    /* JADX INFO: renamed from: a */
    public PathMeasure f15974a;

    /* JADX INFO: renamed from: a */
    public final boolean m3994a(float f, float f2, C0489bf c0489bf) {
        PathMeasure pathMeasure = this.f15974a;
        if (c0489bf instanceof C0489bf) {
            return pathMeasure.getSegment(f, f2, c0489bf.f15228a, true);
        }
        qm5.m9919j("Unable to obtain android.graphics.Path");
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m3995b(C0489bf c0489bf, boolean z) {
        this.f15974a.setPath(c0489bf != null ? c0489bf.f15228a : null, z);
    }
}
