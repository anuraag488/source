package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class k62 {

    /* JADX INFO: renamed from: a */
    public static final Charset f22939a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f22940b;

    static {
        Charset.forName("US-ASCII");
        f22939a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f22940b = bArr;
        ByteBuffer.wrap(bArr);
        ta0.m10997e(bArr, 0, bArr.length, false);
    }

    /* JADX INFO: renamed from: a */
    public static void m7408a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        xy4.m12782k(str);
    }

    /* JADX INFO: renamed from: b */
    public static int m7409b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
