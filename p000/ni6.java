package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ni6 {

    /* JADX INFO: renamed from: a */
    public static final Charset f25875a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f25876b;

    static {
        Charset.forName("US-ASCII");
        f25875a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f25876b = bArr;
        ByteBuffer.wrap(bArr);
    }
}
