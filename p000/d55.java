package p000;

import ads_mobile_sdk.C0313rh;
import com.materialkolor.ktx.DynamicColorKt;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d55 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f16792a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, C0313rh.f10756T0, C0313rh.f10758U0, C0313rh.f10738K0, C0313rh.f10760V0, C0313rh.f10762W0, C0313rh.f10787g1, C0313rh.f10790h1, C0313rh.f10793i1, C0313rh.f10796j1, C0313rh.f10799k1, C0313rh.f10802l1, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146};

    /* JADX INFO: renamed from: a */
    public static String m4356a(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m4357b(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    break;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ boolean m4358c(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ byte m4359d(int i) {
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
            case 14:
                return (byte) 13;
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ byte m4360e(int i) {
        byte b = 1;
        if (i != 1) {
            b = 2;
            if (i != 2) {
                b = 3;
                if (i != 3) {
                    if (i == 4) {
                        return (byte) 4;
                    }
                    throw null;
                }
            }
        }
        return b;
    }

    /* JADX INFO: renamed from: f */
    public static double m4361f(double d, double d2, double d3, double d4) {
        return (d3 - (d * d2)) / d4;
    }

    /* JADX INFO: renamed from: g */
    public static long m4362g(mq4 mq4Var, o41 o41Var, y41 y41Var) {
        return DynamicColorKt.getColor(mq4Var.m8369a().m8942b().m8371c(o41Var).m8369a(), y41Var);
    }

    /* JADX INFO: renamed from: h */
    public static gf0 m4363h(String str) {
        q32.m9722d(str);
        return new gf0();
    }

    /* JADX INFO: renamed from: i */
    public static sq4 m4364i(lc0 lc0Var, C1035pi c1035pi, ir1 ir1Var) {
        sq4 sq4VarM10941a = sw4.m10941a(c1035pi, new C1183ti(lc0Var, (byte) 2));
        ir1Var.m6905n0(sq4VarM10941a);
        return sq4VarM10941a;
    }

    /* JADX INFO: renamed from: j */
    public static Object m4365j(ir1 ir1Var, int i, dp4 dp4Var) {
        ir1Var.m6885d0(i);
        ir1Var.m6912r(false);
        return dp4Var.f17258a.mo11188l();
    }

    /* JADX INFO: renamed from: k */
    public static Object m4366k(ir1 ir1Var, int i, boolean z, zh0 zh0Var) {
        ir1Var.m6885d0(i);
        ir1Var.m6912r(z);
        return zh0Var.mo11188l();
    }

    /* JADX INFO: renamed from: l */
    public static String m4367l(String str, int i, String str2, int i2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    /* JADX INFO: renamed from: m */
    public static String m4368m(String str, StringBuilder sb) {
        return str + ((Object) sb);
    }

    /* JADX INFO: renamed from: n */
    public static String m4369n(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: o */
    public static StringBuilder m4370o(String str, float f, String str2, float f2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(f);
        sb.append(str2);
        sb.append(f2);
        sb.append(str3);
        return sb;
    }

    /* JADX INFO: renamed from: p */
    public static List m4371p(float f, int i, int i2) {
        return Collections.singletonList(new ev1(f, i, i2));
    }

    /* JADX INFO: renamed from: q */
    public static void m4372q(int i, int i2, int i3, int i4, int i5) {
        i20.m6579d(i);
        i20.m6579d(i2);
        i20.m6579d(i3);
        i20.m6579d(i4);
        i20.m6579d(i5);
    }

    /* JADX INFO: renamed from: r */
    public static void m4373r(int i, ir1 ir1Var, jh0 jh0Var, ir1 ir1Var2) {
        C0006a5.m53I(ir1Var, jh0Var, Integer.valueOf(i));
        C0006a5.m50F(ir1Var2);
    }

    /* JADX INFO: renamed from: s */
    public static void m4374s(jp0 jp0Var, long j) {
        jp0Var.m7248w().mo6251g();
        jp0Var.m7230T(j);
    }

    /* JADX INFO: renamed from: t */
    public static gf0 m4375t(String str) {
        t32.m10969b(str);
        return new gf0();
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ int m4376u(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ String m4377v(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ int[] m4378w(int i) {
        int[] iArr = new int[i];
        System.arraycopy(f16792a, 0, iArr, 0, i);
        return iArr;
    }
}
