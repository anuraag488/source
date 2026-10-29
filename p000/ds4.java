package p000;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Trace;
import android.util.Log;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ds4 {

    /* JADX INFO: renamed from: a */
    public static final i50 f17333a;

    /* JADX INFO: renamed from: b */
    public static Paint f17334b;

    static {
        Trace.beginSection("TypefaceCompat static init");
        i50 i50Var = new i50((byte) 21);
        new ConcurrentHashMap();
        f17333a = i50Var;
        new bp2(16);
        f17334b = null;
        Trace.endSection();
    }

    /* JADX INFO: renamed from: a */
    public static Typeface m4675a(Context context, zm1[] zm1VarArr, int i) {
        Trace.beginSection("TypefaceCompat.createFromFontInfo");
        try {
            f17333a.getClass();
            Typeface typefaceBuild = null;
            try {
                FontFamily fontFamilyM6667i = i50.m6667i(zm1VarArr, context.getContentResolver());
                if (fontFamilyM6667i != null) {
                    typefaceBuild = new Typeface.CustomFallbackBuilder(fontFamilyM6667i).setStyle(i50.m6666h(fontFamilyM6667i, i).getStyle()).build();
                }
            } catch (Exception e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            }
            Trace.endSection();
            return typefaceBuild;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Font m4676b(Typeface typeface) {
        Paint paint = f17334b;
        if (paint == null) {
            paint = new Paint();
            f17334b = paint;
        }
        paint.setTextSize(10.0f);
        f17334b.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f17334b);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
