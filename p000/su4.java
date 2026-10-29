package p000;

import android.graphics.Rect;
import android.graphics.drawable.RippleDrawable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class su4 extends RippleDrawable {

    /* JADX INFO: renamed from: a */
    public boolean f30570a;

    /* JADX INFO: renamed from: b */
    public pb0 f30571b;

    /* JADX INFO: renamed from: c */
    public boolean f30572c;

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f30570a) {
            this.f30572c = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f30572c = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f30572c;
    }
}
