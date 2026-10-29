package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class li1 {

    /* JADX INFO: renamed from: a */
    public static final float[] f24045a;

    static {
        long[] jArr = tv3.f31472a;
        int iM11187d = tv3.m11187d(0);
        int iMax = iM11187d > 0 ? Math.max(7, tv3.m11186c(iM11187d)) : 0;
        if (iMax != 0) {
            int i = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i];
            Arrays.fill(jArr2, 0, i, -9187201950435737472L);
            jArr = jArr2;
        }
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        float[] fArr = new float[iMax];
        f24045a = new float[0];
    }
}
