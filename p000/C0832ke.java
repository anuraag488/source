package p000;

import android.graphics.RectF;
import android.text.Layout;

/* JADX INFO: renamed from: ke */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0832ke implements Layout.TextInclusionStrategy {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ C1017p0 f23080a;

    @Override // android.text.Layout.TextInclusionStrategy
    public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
        return ((Boolean) this.f23080a.invoke(rectF, rectF2)).booleanValue();
    }
}
