package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class wv4 {

    /* JADX INFO: renamed from: a */
    public static final kx5 f33788a;

    static {
        kx5 sv4Var;
        if (AbstractC1176tb.m11018a()) {
            sv4Var = new qv4((byte) 0);
        } else {
            sv4Var = sv4.f30596p != null ? new sv4((byte) 1) : new qv4((byte) 1);
        }
        f33788a = sv4Var;
    }

    /* JADX INFO: renamed from: a */
    public static int m12429a(int i, String str) throws uv4 {
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 2048) {
                i2 += (127 - cCharAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(str, i) < 65536) {
                        throw new uv4(zi4.m13618r(i, length, "Unpaired surrogate at index ", " of "));
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }
}
