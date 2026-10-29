package p000;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: cy */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0555cy extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f16593a;

    /* JADX INFO: renamed from: b */
    public float f16594b;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f16593a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f16594b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f16594b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f16593a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f16594b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f16594b);
                break;
        }
    }
}
