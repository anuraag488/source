package p000;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class em1 extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f18256a;

    /* JADX INFO: renamed from: b */
    public Object f18257b;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f18256a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f18257b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f18257b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f18256a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f18257b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f18257b);
                break;
        }
    }
}
