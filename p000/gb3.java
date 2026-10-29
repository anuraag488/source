package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gb3 extends ReplacementSpan {

    /* JADX INFO: renamed from: a */
    public Paint.FontMetricsInt f19706a;

    /* JADX INFO: renamed from: b */
    public int f19707b;

    /* JADX INFO: renamed from: c */
    public int f19708c;

    /* JADX INFO: renamed from: d */
    public boolean f19709d;

    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt m5952a() {
        Paint.FontMetricsInt fontMetricsInt = this.f19706a;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        z62.m13366Y("fontMetrics");
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final int m5953b() {
        if (!this.f19709d) {
            r32.m10187b("PlaceholderSpan is not laid out yet.");
        }
        return this.f19708c;
    }

    /* JADX INFO: renamed from: c */
    public final int m5954c() {
        if (!this.f19709d) {
            r32.m10187b("PlaceholderSpan is not laid out yet.");
        }
        return this.f19707b;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.f19709d = true;
        paint.getTextSize();
        this.f19706a = paint.getFontMetricsInt();
        if (m5952a().descent <= m5952a().ascent) {
            r32.m10186a("Invalid fontMetrics: line height can not be negative.");
        }
        this.f19707b = (int) Math.ceil(0.0d);
        this.f19708c = (int) Math.ceil(0.0d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = m5952a().ascent;
            fontMetricsInt.descent = m5952a().descent;
            fontMetricsInt.leading = m5952a().leading;
            if (fontMetricsInt.ascent > (-m5953b())) {
                fontMetricsInt.ascent = -m5953b();
            }
            fontMetricsInt.top = Math.min(m5952a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(m5952a().bottom, fontMetricsInt.descent);
        }
        return m5954c();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
