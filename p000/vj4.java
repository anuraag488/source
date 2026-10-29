package p000;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vj4 extends CharacterStyle {

    /* JADX INFO: renamed from: a */
    public boolean f32682a;

    /* JADX INFO: renamed from: b */
    public boolean f32683b;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f32682a);
        textPaint.setStrikeThruText(this.f32683b);
    }
}
