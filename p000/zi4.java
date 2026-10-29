package p000;

import ads_mobile_sdk.AbstractC0137h;
import ads_mobile_sdk.dk1;
import ads_mobile_sdk.xw1;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class zi4 {
    /* JADX INFO: renamed from: A */
    public static void m13598A(String str, String str2, String str3, Throwable th) {
        AbstractC0137h.m1112b(str + str2 + str3, th);
    }

    /* JADX INFO: renamed from: B */
    public static void m13599B(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    /* JADX INFO: renamed from: _a */
    public static int m13600_a(int i) {
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
            case 13:
                return 14;
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
        if (i != 2) {
            return i != 1000 ? 0 : 4;
        }
        return 3;
    }

    public static final int _getNumber$1(int i) {
        if (i == 11) {
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
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return -1;
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m13601a(int i) {
        return i != 1 ? m13604d(i) : m13603c(i);
    }

    /* JADX INFO: renamed from: b */
    public static Number m13602b(int i, kb2 kb2Var) {
        if (i == 1) {
            return Double.valueOf(kb2Var.mo7472D());
        }
        if (i == 2) {
            return new ng2(kb2Var.mo7479P());
        }
        if (i == 3) {
            String strMo7479P = kb2Var.mo7479P();
            if (strMo7479P.indexOf(46) >= 0) {
                return m13605e(strMo7479P, kb2Var);
            }
            try {
                return Long.valueOf(Long.parseLong(strMo7479P));
            } catch (NumberFormatException unused) {
                return m13605e(strMo7479P, kb2Var);
            }
        }
        String strMo7479P2 = kb2Var.mo7479P();
        try {
            return AbstractC0647fd.m5654L(strMo7479P2);
        } catch (NumberFormatException e) {
            StringBuilder sbM10844j = sk5.m10844j("Cannot parse ", strMo7479P2, "; at path ");
            sbM10844j.append(kb2Var.mo7500u());
            throw new za2(sbM10844j.toString(), e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m13603c(int i) {
        return !cn4.m4052a();
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m13604d(int i) {
        Boolean bool;
        if (cn4.m4052a()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
            } catch (Exception unused) {
                cn4.f16161a.info("Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static Double m13605e(String str, kb2 kb2Var) throws op2 {
        try {
            Double dValueOf = Double.valueOf(str);
            if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                boolean z = true;
                if (kb2Var.f23055o != 1) {
                    z = false;
                }
                if (!z) {
                    throw new op2("JSON forbids NaN and infinities: " + dValueOf + "; at path " + kb2Var.mo7500u());
                }
            }
            return dValueOf;
        } catch (NumberFormatException e) {
            StringBuilder sbM10844j = sk5.m10844j("Cannot parse ", str, "; at path ");
            sbM10844j.append(kb2Var.mo7500u());
            throw new za2(sbM10844j.toString(), e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ byte m13606f(int i) {
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
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ short m13607g(int i) {
        if (i == 1) {
            return (short) 0;
        }
        if (i == 2) {
            return (short) 1;
        }
        if (i == 3) {
            return (short) 2;
        }
        if (i == 4) {
            return (short) 1000;
        }
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m13608h(int i) {
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

    /* JADX INFO: renamed from: i */
    public static int m13609i(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    /* JADX INFO: renamed from: j */
    public static int m13610j(int i, int i2, int i3, int i4, int i5) {
        return Math.max(((i * i2) / i3) + i4, i5);
    }

    /* JADX INFO: renamed from: k */
    public static int m13611k(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    /* JADX INFO: renamed from: l */
    public static int m13612l(int i, long j, int i2) {
        return (Long.hashCode(j) + i) * i2;
    }

    /* JADX INFO: renamed from: m */
    public static int m13613m(int i, String str, int i2) {
        return (str.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: n */
    public static int m13614n(xl4 xl4Var, int i, int i2) {
        return (xl4Var.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: o */
    public static xw1 m13615o(LinkedHashMap linkedHashMap, String str, ki5 ki5Var, LinkedHashMap linkedHashMap2) {
        linkedHashMap.put(str, ki5Var);
        return new xw1(linkedHashMap2);
    }

    /* JADX INFO: renamed from: p */
    public static ClassCastException m13616p(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    /* JADX INFO: renamed from: q */
    public static String m13617q(char c, String str, String str2) {
        return str + str2 + c;
    }

    /* JADX INFO: renamed from: r */
    public static String m13618r(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    /* JADX INFO: renamed from: s */
    public static String m13619s(String str, long j) {
        return str + j;
    }

    /* JADX INFO: renamed from: t */
    public static String m13620t(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: u */
    public static String m13621u(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: v */
    public static String m13622v(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    /* JADX INFO: renamed from: w */
    public static String m13623w(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: x */
    public static StringBuilder m13624x(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    /* JADX INFO: renamed from: y */
    public static StringBuilder m13625y(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m13626z(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            ds3.m4665g();
            return;
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }
}
