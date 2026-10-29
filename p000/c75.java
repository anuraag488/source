package p000;

import ads_mobile_sdk.dk1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c75 {
    /* JADX INFO: renamed from: _a */
    public static int m3868_a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            default:
                return 0;
        }
    }

    public static int _a$1(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static final int _getNumber(int i) {
        if (i == 8) {
            dk1.m702a();
            throw null;
        }
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return -1;
            default:
                throw null;
        }
    }

    public static final int _getNumber$2(int i) {
        if (i == 8) {
            dk1.m702a();
            throw null;
        }
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return -1;
            default:
                throw null;
        }
    }

    public static final int _getNumber$5(int i) {
        if (i == 4) {
            dk1.m702a();
            throw null;
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return -1;
        }
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m3869a(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return -1;
        }
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ byte m3870b(int i) {
        switch (i) {
            case 1:
                return (byte) 0;
            case 2:
                return (byte) 1;
            case 3:
                return (byte) 2;
            case 4:
                return (byte) 3;
            case 5:
                return (byte) 4;
            case 6:
                return (byte) 5;
            case 7:
                return (byte) 6;
            case 8:
                return (byte) 7;
            case 9:
                return (byte) 8;
            case 10:
                return (byte) 9;
            case 11:
                return (byte) 10;
            case 12:
                return (byte) 11;
            case 13:
                return (byte) 12;
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m3871c(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 3;
            case 3:
                return 5;
            case 4:
                return 7;
            case 5:
                return 9;
            case 6:
                return 11;
            case 7:
                return 13;
            case 8:
                return 15;
            case 9:
                return 17;
            case 10:
                return 19;
            case 11:
                return 2;
            case 12:
                return 4;
            case 13:
                return 8;
            case 14:
                return 16;
            case 15:
                return 32;
            case 16:
                return 64;
            case 17:
                return 128;
            case 18:
                return 256;
            case 19:
                return 512;
            case 20:
                return 1024;
            case 21:
                return 2048;
            case 22:
                return 4096;
            case 23:
                return 8192;
            case 24:
                return 16384;
            case 25:
                return 32768;
            case 26:
                return 65536;
            case 27:
                return 131072;
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ byte m3872d(int i) {
        if (i == 1) {
            return (byte) 0;
        }
        if (i == 2) {
            return (byte) 1;
        }
        if (i == 3) {
            return (byte) 2;
        }
        if (i == 4) {
            return (byte) 3;
        }
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ byte m3873e(int i) {
        if (i == 1) {
            return (byte) 0;
        }
        if (i == 2) {
            return (byte) 1;
        }
        if (i == 3) {
            return (byte) 2;
        }
        if (i == 4) {
            return (byte) 3;
        }
        if (i == 5) {
            return (byte) 4;
        }
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static int m3874f(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    /* JADX INFO: renamed from: g */
    public static int m3875g(int i, int i2, int i3) {
        return i3 - (Integer.numberOfLeadingZeros(i) * i2);
    }

    /* JADX INFO: renamed from: h */
    public static int m3876h(ArrayList arrayList, int i, int i2) {
        return (arrayList.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: i */
    public static String m3877i(int i, String str) {
        return str + i;
    }

    /* JADX INFO: renamed from: j */
    public static String m3878j(String str, int i, String str2) {
        return str + i + str2;
    }

    /* JADX INFO: renamed from: k */
    public static String m3879k(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    /* JADX INFO: renamed from: l */
    public static String m3880l(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: m */
    public static String m3881m(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: n */
    public static String m3882n(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    /* JADX INFO: renamed from: o */
    public static StringBuilder m3883o(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m3884p(Object obj) {
        if (obj == null) {
            return;
        }
        xy4.m12778e();
    }
}
