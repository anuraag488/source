package p000;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class o44 extends CharacterStyle {

    /* JADX INFO: renamed from: a */
    public int f26334a;

    /* JADX INFO: renamed from: b */
    public float f26335b;

    /* JADX INFO: renamed from: c */
    public float f26336c;

    /* JADX INFO: renamed from: d */
    public float f26337d;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f26337d, this.f26335b, this.f26336c, this.f26334a);
    }
}
