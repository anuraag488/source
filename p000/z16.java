package p000;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class z16 {
    /* JADX INFO: renamed from: a */
    public static int m13289a(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public static void m13290b(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            return;
        }
        C1077qn.m9987m("byteBuffer must be a direct ByteBuffer.");
    }
}
