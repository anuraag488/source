package p000;

/* JADX INFO: renamed from: ox */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1013ox extends C1087qx {
    public C1013ox(String str, String str2) {
        this(new C0925mx(str, str2.toCharArray()), (Character) '=');
    }

    @Override // p000.C1087qx
    /* JADX INFO: renamed from: b */
    public final int mo8881b(byte[] bArr, CharSequence charSequence) throws C1050px {
        CharSequence charSequenceM10153h = m10153h(charSequence);
        int length = charSequenceM10153h.length();
        C0925mx c0925mx = this.f28859a;
        if (!c0925mx.f25274h[length % c0925mx.f25271e]) {
            throw new C1050px("Invalid input length " + charSequenceM10153h.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceM10153h.length()) {
            int i3 = i + 2;
            int iM8425a = (c0925mx.m8425a(charSequenceM10153h.charAt(i + 1)) << 12) | (c0925mx.m8425a(charSequenceM10153h.charAt(i)) << 18);
            int i4 = i2 + 1;
            bArr[i2] = (byte) (iM8425a >>> 16);
            if (i3 < charSequenceM10153h.length()) {
                int i5 = i + 3;
                int iM8425a2 = iM8425a | (c0925mx.m8425a(charSequenceM10153h.charAt(i3)) << 6);
                int i6 = i2 + 2;
                bArr[i4] = (byte) ((iM8425a2 >>> 8) & 255);
                if (i5 < charSequenceM10153h.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((iM8425a2 | c0925mx.m8425a(charSequenceM10153h.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i2 = i4;
                i = i3;
            }
        }
        return i2;
    }

    @Override // p000.C1087qx
    /* JADX INFO: renamed from: e */
    public final void mo8882e(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        dt0.m4721w(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            C0925mx c0925mx = this.f28859a;
            char[] cArr = c0925mx.f25268b;
            char[] cArr2 = c0925mx.f25268b;
            sb.append(cArr[i6 >>> 18]);
            sb.append(cArr2[(i6 >>> 12) & 63]);
            sb.append(cArr2[(i6 >>> 6) & 63]);
            sb.append(cArr2[i6 & 63]);
        }
        if (i2 < i) {
            m10151d(sb, bArr, i2, i - i2);
        }
    }

    @Override // p000.C1087qx
    /* JADX INFO: renamed from: g */
    public final C1087qx mo8883g(C0925mx c0925mx, Character ch) {
        return new C1013ox(c0925mx, ch);
    }

    public C1013ox(C0925mx c0925mx, Character ch) {
        super(c0925mx, ch);
        dt0.m4716r(c0925mx.f25268b.length == 64);
    }
}
