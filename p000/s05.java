package p000;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class s05 extends r05 {
    public s05(w05 w05Var, WindowInsets windowInsets) {
        super(w05Var, windowInsets);
    }

    @Override // p000.l05, p000.t05
    /* JADX INFO: renamed from: f */
    public List<Rect> mo7775f(int i) {
        return this.f23671c.getBoundingRects(v05.m11690a(i));
    }

    @Override // p000.l05, p000.t05
    /* JADX INFO: renamed from: g */
    public List<Rect> mo7776g(int i) {
        return this.f23671c.getBoundingRectsIgnoringVisibility(v05.m11690a(i));
    }

    public s05(w05 w05Var, s05 s05Var) {
        super(w05Var, s05Var);
    }

    @Override // p000.l05, p000.t05
    /* JADX INFO: renamed from: q */
    public void mo7781q() {
    }
}
