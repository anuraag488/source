package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class u80 {

    /* JADX INFO: renamed from: a */
    public static final char[] f31715a = new char[117];

    /* JADX INFO: renamed from: b */
    public static final byte[] f31716b = new byte[126];

    static {
        for (int i = 0; i < 32; i++) {
        }
        m11302a(8, 'b');
        m11302a(9, 't');
        m11302a(10, 'n');
        m11302a(12, 'f');
        m11302a(13, 'r');
        m11302a(47, '/');
        m11302a(34, '\"');
        m11302a(92, '\\');
        byte[] bArr = f31716b;
        for (int i2 = 0; i2 < 33; i2++) {
            bArr[i2] = 127;
        }
        bArr[9] = 3;
        bArr[10] = 3;
        bArr[13] = 3;
        bArr[32] = 3;
        bArr[44] = 4;
        bArr[58] = 5;
        bArr[123] = 6;
        bArr[125] = 7;
        bArr[91] = 8;
        bArr[93] = 9;
        bArr[34] = 1;
        bArr[92] = 2;
    }

    /* JADX INFO: renamed from: a */
    public static void m11302a(int i, char c) {
        if (c != 'u') {
            f31715a[c] = (char) i;
        }
    }
}
