package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: renamed from: xe */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1328xe {

    /* JADX INFO: renamed from: a */
    public C0452af f34183a;

    /* JADX INFO: renamed from: b */
    public long f34184b;

    /* JADX INFO: renamed from: c */
    public hl4 f34185c;

    /* JADX INFO: renamed from: d */
    public CharSequence f34186d;

    /* JADX INFO: renamed from: e */
    public float f34187e;

    /* JADX INFO: renamed from: f */
    public List f34188f;

    /* JADX WARN: Code duplicated, block: B:100:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:76:0x0177  */
    /* JADX WARN: Code duplicated, block: B:89:0x0190  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v7, types: [el2] */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47, types: [el2] */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [el2] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v5, types: [el2[]] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [android.graphics.Paint$FontMetricsInt] */
    /* JADX INFO: renamed from: a */
    public final hl4 m12673a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        Layout.Alignment alignment;
        hl4 hl4Var;
        int i8;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutM13038r;
        char c;
        ?? r9;
        int i9;
        boolean z;
        boolean z2;
        long jM8034a;
        int i10;
        long jM8034a2;
        long jM8034a3;
        char c2;
        int iM6435h;
        ?? r10;
        boolean z3;
        boolean z4;
        boolean z5;
        ?? r6;
        ?? r7;
        ?? r3;
        ?? r4;
        mb3 mb3Var;
        float fM12675c = m12675c();
        C0452af c0452af = this.f34183a;
        C0798jh c0798jh = c0452af.f14422f;
        int i11 = c0452af.f14427k;
        if2 if2Var = c0452af.f14424h;
        xl4 xl4Var = c0452af.f14418b;
        C1365ye c1365ye = AbstractC1402ze.f36008a;
        zb3 zb3Var = xl4Var.f34391c;
        boolean z6 = (zb3Var == null || (mb3Var = zb3Var.f35919a) == null) ? false : mb3Var.f24799a;
        hl4 hl4Var2 = new hl4();
        hl4Var2.f20674a = c0798jh;
        hl4Var2.f20675b = truncateAt;
        hl4Var2.f20676c = z6;
        hl4Var2.f20688o = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicM8035b = ll4.m8035b(i11);
        Layout.Alignment alignment2 = xi4.f34307a;
        boolean z7 = true;
        if (i == 0) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i == 1) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i != 3) {
            alignment = i != 4 ? Layout.Alignment.ALIGN_NORMAL : xi4.f34308b;
        } else {
            alignment = xi4.f34307a;
        }
        Layout.Alignment alignment3 = alignment;
        boolean z8 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, C0555cy.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            if (!if2Var.f21337g) {
                if2Var.f21336f = BoringLayout.isBoring(if2Var.f21331a, if2Var.f21332b, ll4.m8035b(if2Var.f21333c), true, null);
                if2Var.f21337g = true;
            }
            BoringLayout.Metrics metrics = if2Var.f21336f;
            double d = fM12675c;
            int iCeil = (int) Math.ceil(d);
            if (metrics == null || if2Var.m6791b() > fM12675c || z8) {
                hl4Var = null;
                int length2 = charSequence.length();
                int iCeil2 = (int) Math.ceil(d);
                i8 = i3;
                boolean z9 = z6;
                textDirectionHeuristic = textDirectionHeuristicM8035b;
                z6 = z9;
                layoutM13038r = y70.m13038r(charSequence, c0798jh, iCeil, length2, textDirectionHeuristic, alignment3, i8, truncateAt, iCeil2, i2, z9, i5, i6, i7, i4);
                z7 = false;
            } else {
                if (iCeil < 0) {
                    r32.m10186a("negative width");
                }
                if (iCeil < 0) {
                    r32.m10186a("negative ellipsized width");
                }
                hl4Var = null;
                layoutM13038r = new BoringLayout(charSequence, c0798jh, iCeil, alignment3, 1.0f, 0.0f, metrics, z6, truncateAt, iCeil, true);
                i8 = i3;
                textDirectionHeuristic = textDirectionHeuristicM8035b;
            }
            hl4Var2.f20679f = layoutM13038r;
            Trace.endSection();
            int iMin = Math.min(layoutM13038r.getLineCount(), i8);
            hl4Var2.f20680g = iMin;
            int i12 = iMin - 1;
            hl4Var2.f20677d = iMin >= i8 && (layoutM13038r.getEllipsisCount(i12) > 0 || layoutM13038r.getLineEnd(i12) != charSequence.length());
            if ((layoutM13038r.getText() instanceof Spanned) && (C0638f5.m5554y((Spanned) layoutM13038r.getText(), el2.class) || layoutM13038r.getText().length() <= 0)) {
                c = 0;
                r9 = (el2[]) ((Spanned) layoutM13038r.getText()).getSpans(0, layoutM13038r.getText().length(), el2.class);
            } else {
                r9 = hl4Var;
                c = 0;
            }
            hl4Var2.f20687n = r9;
            if (r9 == 0) {
                r4 = r3;
                i9 = 2;
            } else {
                if (r9.length == 0) {
                    r4 = hl4Var;
                } else {
                    r3 = r9[c];
                }
                if (r4 != 0) {
                    r4 = r3;
                    if (r4.f18202c) {
                        i9 = 2;
                        z = r4.f18205f == 2;
                    } else {
                        r4 = r3;
                        i9 = 2;
                    }
                } else {
                    r4 = r3;
                    i9 = 2;
                }
            }
            if (r9 == 0) {
                r7 = r6;
                z2 = false;
            } else {
                if (r9.length == 0) {
                    r7 = hl4Var;
                } else {
                    r6 = r9[0];
                }
                if (r7 != 0) {
                    r7 = r6;
                    if (r7.f18203d && r7.f18205f == i9) {
                        z2 = true;
                    } else {
                        r7 = r6;
                        z2 = false;
                    }
                } else {
                    r7 = r6;
                    z2 = false;
                }
            }
            char c3 = ' ';
            if (z && z2) {
                jM8034a3 = ll4.f24139b;
                jM8034a = jM8034a3;
                i10 = 1;
            } else {
                jM8034a = ll4.f24139b;
                if (z6) {
                    i10 = 1;
                    jM8034a2 = jM8034a;
                } else {
                    if (z7 ? ((BoringLayout) layoutM13038r).isFallbackLineSpacingEnabled() : ((StaticLayout) layoutM13038r).isFallbackLineSpacingEnabled()) {
                        i10 = 1;
                    } else {
                        TextPaint paint = layoutM13038r.getPaint();
                        CharSequence text = layoutM13038r.getText();
                        Rect rectM7617r = ks5.m7617r(paint, text, layoutM13038r.getLineStart(0), layoutM13038r.getLineEnd(0));
                        int lineAscent = layoutM13038r.getLineAscent(0);
                        int i13 = rectM7617r.top;
                        int topPadding = i13 < lineAscent ? lineAscent - i13 : layoutM13038r.getTopPadding();
                        i10 = 1;
                        if (iMin != 1) {
                            rectM7617r = ks5.m7617r(paint, text, layoutM13038r.getLineStart(i12), layoutM13038r.getLineEnd(i12));
                        }
                        int lineDescent = layoutM13038r.getLineDescent(i12);
                        int i14 = rectM7617r.bottom;
                        int bottomPadding = i14 > lineDescent ? i14 - lineDescent : layoutM13038r.getBottomPadding();
                        if (topPadding != 0 || bottomPadding != 0) {
                            jM8034a2 = ll4.m8034a(topPadding, bottomPadding);
                        }
                    }
                    jM8034a2 = jM8034a;
                }
                jM8034a3 = ll4.m8034a(z ? 0 : (int) (jM8034a2 >> 32), z2 ? 0 : (int) (jM8034a2 & 4294967295L));
            }
            if (r9 != 0) {
                int length3 = r9.length;
                int i15 = 0;
                int iMax = 0;
                int iMax2 = 0;
                while (i15 < length3) {
                    ?? r14 = r9[i15];
                    char c4 = c3;
                    int i16 = r14.f18210k;
                    if (i16 < 0) {
                        iMax = Math.max(iMax, Math.abs(i16));
                    }
                    int i17 = r14.f18211l;
                    if (i17 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i17));
                    }
                    i15++;
                    c3 = c4;
                }
                c2 = c3;
                jM8034a = (iMax == 0 && iMax2 == 0) ? ll4.f24139b : ll4.m8034a(iMax, iMax2);
            } else {
                c2 = ' ';
            }
            hl4Var2.f20681h = Math.max((int) (jM8034a3 >> c2), (int) (jM8034a >> c2));
            hl4Var2.f20682i = Math.max((int) (jM8034a3 & 4294967295L), (int) (jM8034a & 4294967295L));
            TextPaint textPaint = hl4Var2.f20674a;
            el2[] el2VarArr = hl4Var2.f20687n;
            int i18 = hl4Var2.f20680g - i10;
            if (layoutM13038r.getLineStart(i18) != layoutM13038r.getLineEnd(i18) || el2VarArr == null || el2VarArr.length == 0) {
                iM6435h = 0;
                r10 = hl4Var;
            } else {
                SpannableString spannableString = new SpannableString("\u200b");
                if (el2VarArr.length == 0) {
                    ds3.m4667k("Array is empty.");
                    return hl4Var;
                }
                el2 el2Var = el2VarArr[0];
                int length4 = spannableString.length();
                if (i18 == 0 || !(z5 = el2Var.f18203d)) {
                    z3 = el2Var.f18203d;
                    z4 = z3;
                } else {
                    z4 = z5;
                    z3 = false;
                }
                spannableString.setSpan(new el2(el2Var.f18200a, length4, z3, z4, el2Var.f18204e, el2Var.f18205f), 0, spannableString.length(), 33);
                StaticLayout staticLayoutM13038r = y70.m13038r(spannableString, textPaint, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, bf2.f15236a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, hl4Var2.f20676c, 0, 0, 0, 0);
                Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
                iM6435h = 0;
                fontMetricsInt.ascent = staticLayoutM13038r.getLineAscent(0);
                fontMetricsInt.descent = staticLayoutM13038r.getLineDescent(0);
                fontMetricsInt.top = staticLayoutM13038r.getLineTop(0);
                fontMetricsInt.bottom = staticLayoutM13038r.getLineBottom(0);
                r10 = fontMetricsInt;
            }
            if (r10 != 0) {
                iM6435h = ((Paint.FontMetricsInt) r10).bottom - ((int) hl4Var2.m6435h(i12));
            }
            hl4Var2.f20686m = iM6435h;
            hl4Var2.f20685l = r10;
            hl4Var2.f20683j = vd6.m11862u(layoutM13038r, i12, layoutM13038r.getPaint());
            hl4Var2.f20684k = vd6.m11863v(layoutM13038r, i12, layoutM13038r.getPaint());
            VarHandle.storeStoreFence();
            return hl4Var2;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ab  */
    /* JADX INFO: renamed from: b */
    public final long m12674b(jl3 jl3Var, int i, ds3 ds3Var) {
        b04 yg3Var;
        int i2;
        int[] iArrM4331e;
        hl4 hl4Var = this.f34185c;
        RectF rectFM6071I = gq6.m6071I(jl3Var);
        boolean z = false;
        int i3 = (i != 0 && i == 1) ? 1 : 0;
        C1017p0 c1017p0 = new C1017p0((byte) 2);
        c1017p0.f27254b = ds3Var;
        VarHandle.storeStoreFence();
        Layout layout = hl4Var.f20679f;
        if (Build.VERSION.SDK_INT >= 34) {
            iArrM4331e = AbstractC0561d3.m4331e(hl4Var, rectFM6071I, i3, c1017p0);
        } else {
            C1122rv c1122rvM6430c = hl4Var.m6430c();
            if (i3 == 1) {
                yg3Var = new yg3(layout.getText(), hl4Var.m6439l(), (byte) 9);
            } else {
                CharSequence text = layout.getText();
                TextPaint textPaint = hl4Var.f20674a;
                nh3 nh3Var = new nh3((byte) 17, z);
                nh3Var.f25810b = text;
                nh3Var.f25811c = textPaint;
                VarHandle.storeStoreFence();
                yg3Var = nh3Var;
            }
            int lineForVertical = layout.getLineForVertical((int) rectFM6071I.top);
            if (rectFM6071I.top <= hl4Var.m6432e(lineForVertical) || (lineForVertical = lineForVertical + 1) < hl4Var.f20680g) {
                int i4 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFM6071I.bottom);
                if (lineForVertical2 != 0 || rectFM6071I.bottom >= hl4Var.m6436i(0)) {
                    int iM4322w = d24.m4322w(hl4Var, layout, c1122rvM6430c, i4, rectFM6071I, yg3Var, c1017p0, true);
                    while (true) {
                        i2 = i4;
                        if (iM4322w != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i4 = i2 + 1;
                        iM4322w = d24.m4322w(hl4Var, layout, c1122rvM6430c, i4, rectFM6071I, yg3Var, c1017p0, true);
                    }
                    if (iM4322w == -1) {
                        iArrM4331e = null;
                    } else {
                        int i5 = lineForVertical2;
                        int iM4322w2 = d24.m4322w(hl4Var, layout, c1122rvM6430c, i5, rectFM6071I, yg3Var, c1017p0, false);
                        while (iM4322w2 == -1 && i2 < i5) {
                            i5--;
                            iM4322w2 = d24.m4322w(hl4Var, layout, c1122rvM6430c, i5, rectFM6071I, yg3Var, c1017p0, false);
                        }
                        if (iM4322w2 == -1) {
                            iArrM4331e = null;
                        } else {
                            iArrM4331e = new int[]{yg3Var.mo3386b(iM4322w + 1), yg3Var.mo3387c(iM4322w2 - 1)};
                        }
                    }
                } else {
                    iArrM4331e = null;
                }
            } else {
                iArrM4331e = null;
            }
        }
        return iArrM4331e == null ? ql4.f28556b : sc6.m10657b(iArrM4331e[0], iArrM4331e[1]);
    }

    /* JADX INFO: renamed from: c */
    public final float m12675c() {
        return kl0.m7539i(this.f34184b);
    }

    /* JADX INFO: renamed from: d */
    public final void m12676d(h70 h70Var) {
        Canvas canvas = AbstractC1362yb.f35080a;
        Canvas canvas2 = ((C1325xb) h70Var).f34122a;
        hl4 hl4Var = this.f34185c;
        if (hl4Var.f20677d) {
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, m12675c(), this.f34187e);
        }
        int i = hl4Var.f20681h;
        if (canvas2.getClipBounds(hl4Var.f20688o)) {
            if (i != 0) {
                canvas2.translate(0.0f, i);
            }
            ThreadLocal threadLocal = ll4.f24138a;
            Object yi4Var = threadLocal.get();
            if (yi4Var == null) {
                yi4Var = new yi4();
                threadLocal.set(yi4Var);
            }
            yi4 yi4Var2 = (yi4) yi4Var;
            yi4Var2.f35245a = canvas2;
            try {
                hl4Var.f20679f.draw(yi4Var2);
                yi4Var2.f35245a = null;
                if (i != 0) {
                    canvas2.translate(0.0f, (-1.0f) * i);
                }
            } catch (Throwable th) {
                yi4Var2.f35245a = null;
                throw th;
            }
        }
        if (hl4Var.f20677d) {
            canvas2.restore();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m12677e(h70 h70Var, long j, m44 m44Var, uj4 uj4Var, qq2 qq2Var) {
        C0798jh c0798jh = this.f34183a.f14422f;
        byte b = c0798jh.f22262c;
        c0798jh.m7111d(j);
        c0798jh.m7113f(m44Var);
        c0798jh.m7114g(uj4Var);
        c0798jh.m7112e(qq2Var);
        c0798jh.m7109b(3);
        new C0633f0(1, this, C1328xe.class, "paint", "paint(Landroidx/compose/ui/graphics/Canvas;)V", 0, (byte) 1).invoke(h70Var);
        c0798jh.m7109b(b);
    }

    /* JADX INFO: renamed from: f */
    public final void m12678f(h70 h70Var, t30 t30Var, float f, m44 m44Var, uj4 uj4Var, qq2 qq2Var) {
        C0798jh c0798jh = this.f34183a.f14422f;
        byte b = c0798jh.f22262c;
        float fM12675c = m12675c();
        c0798jh.m7110c(t30Var, (((long) Float.floatToRawIntBits(this.f34187e)) & 4294967295L) | (Float.floatToRawIntBits(fM12675c) << 32), f);
        c0798jh.m7113f(m44Var);
        c0798jh.m7114g(uj4Var);
        c0798jh.m7112e(qq2Var);
        c0798jh.m7109b(3);
        new C0633f0(1, this, C1328xe.class, "paint", "paint(Landroidx/compose/ui/graphics/Canvas;)V", 0, (byte) 2).invoke(h70Var);
        c0798jh.m7109b(b);
    }
}
