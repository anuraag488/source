package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class gy1 {

    /* JADX INFO: renamed from: a */
    public static final s50 f20183a;

    /* JADX INFO: renamed from: b */
    public static final String[] f20184b;

    /* JADX INFO: renamed from: c */
    public static final String[] f20185c;

    /* JADX INFO: renamed from: d */
    public static final String[] f20186d;

    static {
        s50 s50Var = new s50("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n".getBytes(z80.f35863a));
        s50Var.f29914c = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n";
        f20183a = s50Var;
        f20184b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f20185c = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            strArr[i] = zv4.m13812g("%8s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        f20186d = strArr;
        String[] strArr2 = f20185c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = zi4.m13623w(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = f20185c;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = zi4.m13623w(sb, strArr3[i4], "|PADDED");
        }
        int length = f20185c.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = f20185c;
            if (strArr4[i7] == null) {
                strArr4[i7] = f20186d[i7];
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX INFO: renamed from: a */
    public static String m6195a(boolean z, int i, int i2, int i3, int i4) {
        String strM9042W;
        String[] strArr = f20184b;
        String strM13812g = i3 < strArr.length ? strArr[i3] : zv4.m13812g("0x%02x", Integer.valueOf(i3));
        if (i4 == 0) {
            strM9042W = "";
        } else {
            String[] strArr2 = f20186d;
            if (i3 == 2 || i3 == 3) {
                strM9042W = strArr2[i4];
            } else if (i3 == 4 || i3 == 6) {
                strM9042W = i4 == 1 ? "ACK" : strArr2[i4];
            } else if (i3 == 7 || i3 == 8) {
                strM9042W = strArr2[i4];
            } else {
                String[] strArr3 = f20185c;
                String str = i4 < strArr3.length ? strArr3[i4] : strArr2[i4];
                if (i3 != 5 || (i4 & 4) == 0) {
                    strM9042W = (i3 != 0 || (i4 & 32) == 0) ? str : od4.m9042W(str, "PRIORITY", "COMPRESSED");
                } else {
                    strM9042W = od4.m9042W(str, "HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return zv4.m13812g("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), strM13812g, strM9042W);
    }
}
