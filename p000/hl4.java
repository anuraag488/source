package p000;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.invoke.VarHandle;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hl4 {

    /* JADX INFO: renamed from: a */
    public TextPaint f20674a;

    /* JADX INFO: renamed from: b */
    public TextUtils.TruncateAt f20675b;

    /* JADX INFO: renamed from: c */
    public boolean f20676c;

    /* JADX INFO: renamed from: d */
    public boolean f20677d;

    /* JADX INFO: renamed from: e */
    public n83 f20678e;

    /* JADX INFO: renamed from: f */
    public Layout f20679f;

    /* JADX INFO: renamed from: g */
    public int f20680g;

    /* JADX INFO: renamed from: h */
    public int f20681h;

    /* JADX INFO: renamed from: i */
    public int f20682i;

    /* JADX INFO: renamed from: j */
    public float f20683j;

    /* JADX INFO: renamed from: k */
    public float f20684k;

    /* JADX INFO: renamed from: l */
    public Paint.FontMetricsInt f20685l;

    /* JADX INFO: renamed from: m */
    public int f20686m;

    /* JADX INFO: renamed from: n */
    public el2[] f20687n;

    /* JADX INFO: renamed from: o */
    public Rect f20688o;

    /* JADX INFO: renamed from: p */
    public C1122rv f20689p;

    /* JADX INFO: renamed from: a */
    public final int m6428a() {
        boolean z = this.f20677d;
        Layout layout = this.f20679f;
        return (z ? layout.getLineBottom(this.f20680g - 1) : layout.getHeight()) + this.f20681h + this.f20682i + this.f20686m;
    }

    /* JADX INFO: renamed from: b */
    public final float m6429b(int i) {
        if (i == this.f20680g - 1) {
            return this.f20683j + this.f20684k;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public final C1122rv m6430c() {
        C1122rv c1122rv = this.f20689p;
        if (c1122rv != null) {
            return c1122rv;
        }
        Layout layout = this.f20679f;
        C1122rv c1122rv2 = new C1122rv((byte) 4, 0 == true ? 1 : 0);
        c1122rv2.f29651b = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iM6342h0 = hd4.m6342h0(layout.getText(), '\n', length, 4);
            length = iM6342h0 < 0 ? layout.getText().length() : iM6342h0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < layout.getText().length());
        c1122rv2.f29652c = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        c1122rv2.f29653d = arrayList2;
        c1122rv2.f29654e = new boolean[arrayList.size()];
        arrayList.size();
        VarHandle.storeStoreFence();
        this.f20689p = c1122rv2;
        return c1122rv2;
    }

    /* JADX INFO: renamed from: d */
    public final float m6431d(int i) {
        Paint.FontMetricsInt fontMetricsInt = this.f20685l;
        return this.f20681h + ((i != this.f20680g + (-1) || fontMetricsInt == null) ? this.f20679f.getLineBaseline(i) : m6436i(i) - fontMetricsInt.ascent);
    }

    /* JADX INFO: renamed from: e */
    public final float m6432e(int i) {
        Layout layout = this.f20679f;
        Paint.FontMetricsInt fontMetricsInt = this.f20685l;
        int i2 = this.f20680g;
        if (i != i2 - 1 || fontMetricsInt == null) {
            return this.f20681h + layout.getLineBottom(i) + (i == i2 + (-1) ? this.f20682i : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    /* JADX INFO: renamed from: f */
    public final int m6433f(int i) {
        Layout layout = this.f20679f;
        ThreadLocal threadLocal = ll4.f24138a;
        return (layout.getEllipsisCount(i) <= 0 || this.f20675b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    /* JADX INFO: renamed from: g */
    public final int m6434g(int i) {
        int i2 = this.f20680g;
        if (i2 <= 0) {
            return 0;
        }
        int lineForOffset = this.f20679f.getLineForOffset(i);
        int i3 = i2 - 1;
        return lineForOffset > i3 ? i3 : lineForOffset;
    }

    /* JADX INFO: renamed from: h */
    public final float m6435h(int i) {
        return m6432e(i) - m6436i(i);
    }

    /* JADX INFO: renamed from: i */
    public final float m6436i(int i) {
        return this.f20679f.getLineTop(i) + (i == 0 ? 0 : this.f20681h);
    }

    /* JADX INFO: renamed from: j */
    public final float m6437j(int i, boolean z) {
        return m6429b(m6434g(i)) + m6430c().m10455n(i, true, z);
    }

    /* JADX INFO: renamed from: k */
    public final float m6438k(int i, boolean z) {
        return m6429b(m6434g(i)) + m6430c().m10455n(i, false, z);
    }

    /* JADX INFO: renamed from: l */
    public final n83 m6439l() {
        Layout layout = this.f20679f;
        n83 n83Var = this.f20678e;
        if (n83Var != null) {
            return n83Var;
        }
        CharSequence text = layout.getText();
        int length = layout.getText().length();
        Locale textLocale = this.f20674a.getTextLocale();
        n83 n83Var2 = new n83((byte) 2);
        n83Var2.f25534d = text;
        if (text.length() < 0) {
            r32.m10186a("input start index is outside the CharSequence");
        }
        if (length < 0 || length > text.length()) {
            r32.m10186a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(textLocale);
        n83Var2.f25535e = wordInstance;
        n83Var2.f25532b = Math.max(0, -50);
        n83Var2.f25533c = Math.min(text.length(), length + 50);
        wordInstance.setText(new w80(text, length));
        VarHandle.storeStoreFence();
        this.f20678e = n83Var2;
        return n83Var2;
    }
}
