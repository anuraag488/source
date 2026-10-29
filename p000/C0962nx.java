package p000;

/* JADX INFO: renamed from: nx */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0962nx extends C1087qx {

    /* JADX INFO: renamed from: g */
    public final char[] f26159g;

    public C0962nx(C0925mx c0925mx) {
        super(c0925mx, (Character) null);
        this.f26159g = new char[512];
        char[] cArr = c0925mx.f25268b;
        dt0.m4716r(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.f26159g;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // p000.C1087qx
    /* JADX INFO: renamed from: b */
    public final int mo8881b(byte[] bArr, CharSequence charSequence) throws C1050px {
        if (charSequence.length() % 2 == 1) {
            throw new C1050px("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            C0925mx c0925mx = this.f28859a;
            bArr[i2] = (byte) ((c0925mx.m8425a(cCharAt) << 4) | c0925mx.m8425a(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // p000.C1087qx
    /* JADX INFO: renamed from: e */
    public final void mo8882e(StringBuilder sb, byte[] bArr, int i) {
        dt0.m4721w(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.f26159g;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }

    @Override // p000.C1087qx
    /* JADX INFO: renamed from: g */
    public final C1087qx mo8883g(C0925mx c0925mx, Character ch) {
        return new C0962nx(c0925mx);
    }
}
