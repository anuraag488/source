package p000;

import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class o35 {

    /* JADX INFO: renamed from: a */
    public static final o35 f26318a = new o35();

    /* JADX INFO: renamed from: a */
    public final long m8936a(Paint paint) {
        int i = pb0.f27502i;
        long colorLong = paint.getColorLong();
        long j = 63 & colorLong;
        return j < 16 ? colorLong : (colorLong & (-64)) | (j + 1);
    }

    /* JADX INFO: renamed from: b */
    public final void m8937b(Paint paint, int i) {
        paint.setBlendMode(d24.m4295J(i));
    }

    /* JADX INFO: renamed from: c */
    public final void m8938c(Paint paint, long j) {
        int i = (int) (63 & j);
        paint.setColor((i == oc0.f26570x.f23931c || i == oc0.f26565s.f23931c || i == oc0.f26566t.f23931c) ? sc6.m10656a0(pb0.m9463b(j, oc0.f26551e)) : sc6.m10656a0(j));
    }
}
