package p000;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class el2 implements LineHeightSpan {

    /* JADX INFO: renamed from: a */
    public final float f18200a;

    /* JADX INFO: renamed from: b */
    public final int f18201b;

    /* JADX INFO: renamed from: c */
    public final boolean f18202c;

    /* JADX INFO: renamed from: d */
    public final boolean f18203d;

    /* JADX INFO: renamed from: e */
    public final float f18204e;

    /* JADX INFO: renamed from: f */
    public final int f18205f;

    /* JADX INFO: renamed from: g */
    public int f18206g = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: h */
    public int f18207h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i */
    public int f18208i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j */
    public int f18209j = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: k */
    public int f18210k;

    /* JADX INFO: renamed from: l */
    public int f18211l;

    public el2(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.f18200a = f;
        this.f18201b = i;
        this.f18202c = z;
        this.f18203d = z2;
        this.f18204e = f2;
        this.f18205f = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            r32.m10187b("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        double dCeil;
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.f18201b;
        int i7 = this.f18205f;
        boolean z3 = this.f18203d;
        boolean z4 = this.f18202c;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.f18206g == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int iCeil = (int) Math.ceil(this.f18200a);
            int i9 = iCeil - i8;
            if (i7 != 1 || i9 > 0) {
                float fAbs = this.f18204e;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                if (i9 <= 0) {
                    dCeil = Math.ceil(i9 * fAbs);
                } else {
                    dCeil = Math.ceil((1.0f - fAbs) * i9);
                }
                int i10 = (int) dCeil;
                int i11 = fontMetricsInt.descent;
                int i12 = i10 + i11;
                this.f18208i = i12;
                int i13 = i12 - iCeil;
                this.f18207h = i13;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i13 = fontMetricsInt.ascent;
                    }
                    this.f18206g = i13;
                    if (z3) {
                        i12 = i11;
                    }
                    this.f18209j = i12;
                    this.f18210k = fontMetricsInt.ascent - i13;
                    this.f18211l = i12 - i11;
                } else if (i7 == 2) {
                    int i14 = fontMetricsInt.ascent;
                    this.f18206g = z4 ? Math.max(i14, i13) : Math.min(i14, i13);
                    int i15 = fontMetricsInt.descent;
                    int i16 = this.f18208i;
                    this.f18209j = z3 ? Math.min(i15, i16) : Math.max(i15, i16);
                    this.f18210k = 0;
                    this.f18211l = 0;
                }
            } else {
                int i17 = fontMetricsInt.ascent;
                this.f18207h = i17;
                int i18 = fontMetricsInt.descent;
                this.f18208i = i18;
                this.f18206g = i17;
                this.f18209j = i18;
                this.f18210k = 0;
                this.f18211l = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.f18206g : this.f18207h;
        fontMetricsInt.descent = z2 ? this.f18209j : this.f18208i;
    }
}
