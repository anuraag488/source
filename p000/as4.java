package p000;

import ads_mobile_sdk.C0176jd;
import ads_mobile_sdk.C0313rh;
import ads_mobile_sdk.EnumC0218ld;
import ads_mobile_sdk.su1;
import android.app.ActivityManager;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import androidx.work.impl.WorkDatabase;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class as4 {

    /* JADX INFO: renamed from: a */
    public static final pg0 f14842a = new pg0(-2102896664, false, new xg0(3));

    /* JADX INFO: renamed from: b */
    public static final vl1 f14843b = new vl1(12);

    /* JADX INFO: renamed from: c */
    public static final z45 f14844c = new z45(5);

    /* JADX INFO: renamed from: d */
    public static final kh5 f14845d = new kh5(7);

    /* JADX INFO: renamed from: e */
    public static g12 f14846e;

    /* JADX INFO: renamed from: A */
    public static ct2 m3222A(ct2 ct2Var, df2 df2Var, xl4 xl4Var, ky0 ky0Var, am1 am1Var) {
        if (ct2Var != null && df2Var == ct2Var.f16452a && zc6.m13512I(xl4Var, df2Var).equals(ct2Var.f16453b) && ky0Var.mo3580c() == ct2Var.f16454c.f24459a && am1Var == ct2Var.f16455d) {
            return ct2Var;
        }
        ct2 ct2Var2 = ct2.f16451h;
        if (ct2Var2 != null && df2Var == ct2Var2.f16452a && zc6.m13512I(xl4Var, df2Var).equals(ct2Var2.f16453b) && ky0Var.mo3580c() == ct2Var2.f16454c.f24459a && am1Var == ct2Var2.f16455d) {
            return ct2Var2;
        }
        xl4 xl4VarM13512I = zc6.m13512I(xl4Var, df2Var);
        ly0 ly0VarM9098d = oh6.m9098d(ky0Var.mo3580c(), ky0Var.mo3585r());
        ct2 ct2Var3 = new ct2();
        ct2Var3.f16452a = df2Var;
        ct2Var3.f16453b = xl4VarM13512I;
        ct2Var3.f16454c = ly0VarM9098d;
        ct2Var3.f16455d = am1Var;
        ct2Var3.f16456e = zc6.m13512I(xl4VarM13512I, df2Var);
        ct2Var3.f16457f = Float.NaN;
        ct2Var3.f16458g = Float.NaN;
        VarHandle.storeStoreFence();
        ct2.f16451h = ct2Var3;
        return ct2Var3;
    }

    /* JADX INFO: renamed from: B */
    public static ArrayList m3223B(Context context) {
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = v71.f32439a;
        }
        ArrayList arrayListM6297I0 = hb0.m6297I0(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        int size = arrayListM6297I0.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListM6297I0.get(i3);
            i3++;
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ib0.m6717y0(arrayList, 10));
        int size2 = arrayList.size();
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj2;
            String str2 = runningAppProcessInfo.processName;
            arrayList2.add(new dg3(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, str2.equals(str)));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: C */
    public static final g12 m3224C() {
        g12 g12Var = f14846e;
        if (g12Var != null) {
            return g12Var;
        }
        f12 f12Var = new f12("Filled.Clear", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = uw4.f32218a;
        ga4 ga4Var = new ga4(pb0.f27495b);
        tv1 tv1Var = new tv1((byte) 1);
        tv1Var.m11175k(19.0f, 6.41f);
        tv1Var.m11173i(17.59f, 5.0f);
        tv1Var.m11173i(12.0f, 10.59f);
        tv1Var.m11173i(6.41f, 5.0f);
        tv1Var.m11173i(5.0f, 6.41f);
        tv1Var.m11173i(10.59f, 12.0f);
        tv1Var.m11173i(5.0f, 17.59f);
        tv1Var.m11173i(6.41f, 19.0f);
        tv1Var.m11173i(12.0f, 13.41f);
        tv1Var.m11173i(17.59f, 19.0f);
        tv1Var.m11173i(19.0f, 17.59f);
        tv1Var.m11173i(13.41f, 12.0f);
        tv1Var.m11168d();
        f12.m5445c(f12Var, tv1Var.f31466a, ga4Var, 1.0f, 1.0f, 2, 1.0f, 14336);
        g12 g12VarM5449e = f12Var.m5449e();
        f14846e = g12VarM5449e;
        return g12VarM5449e;
    }

    /* JADX INFO: renamed from: D */
    public static final ro0 m3225D(WorkDatabase workDatabase, ym0 ym0Var) {
        ro0 ro0Var;
        if (workDatabase.m3068k()) {
            um0 um0Var = workDatabase.f14686a;
            if (um0Var == null) {
                z62.m13366Y("coroutineScope");
                throw null;
            }
            ro0Var = um0Var.f31989a;
        } else {
            um0 um0Var2 = workDatabase.f14686a;
            if (um0Var2 == null) {
                z62.m13366Y("coroutineScope");
                throw null;
            }
            ro0Var = um0Var2.f31989a;
        }
        return ro0Var;
    }

    /* JADX INFO: renamed from: E */
    public static final a04 m3226E(Object obj) {
        if (obj != nj0.f25879a) {
            return (a04) obj;
        }
        C1077qn.m9989o("Does not contain segment");
        return null;
    }

    /* JADX INFO: renamed from: F */
    public static final boolean m3227F(Object obj) {
        return obj == nj0.f25879a;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m3228G(int i, Object obj) {
        int arity;
        if (obj instanceof iq1) {
            if (obj instanceof wq1) {
                arity = ((wq1) obj).getArity();
            } else if (obj instanceof wp1) {
                arity = 0;
            } else if (obj instanceof yp1) {
                arity = 1;
            } else if (obj instanceof mq1) {
                arity = 2;
            } else if (obj instanceof nq1) {
                arity = 3;
            } else if (obj instanceof oq1) {
                arity = 4;
            } else if (obj instanceof pq1) {
                arity = 5;
            } else if (obj instanceof qq1) {
                arity = 6;
            } else if (obj instanceof rq1) {
                arity = 7;
            } else if (obj instanceof sq1) {
                arity = 8;
            } else if (obj instanceof tq1) {
                arity = 9;
            } else if (obj instanceof xp1) {
                arity = 10;
            } else if (obj instanceof zp1) {
                arity = 11;
            } else if (obj instanceof bq1) {
                arity = 13;
            } else if (obj instanceof cq1) {
                arity = 14;
            } else if (obj instanceof dq1) {
                arity = 15;
            } else if (obj instanceof eq1) {
                arity = 16;
            } else if (obj instanceof fq1) {
                arity = 17;
            } else if (obj instanceof gq1) {
                arity = 18;
            } else if (obj instanceof hq1) {
                arity = 19;
            } else if (obj instanceof jq1) {
                arity = 20;
            } else {
                arity = obj instanceof kq1 ? 21 : -1;
            }
            if (arity == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: H */
    public static final nt2 m3229H(ei2 ei2Var, b30 b30Var, d63 d63Var) {
        zg2 zg2Var = new zg2();
        zg2Var.f36060a = ei2Var;
        zg2Var.f36061b = b30Var;
        zg2Var.f36062c = d63Var;
        VarHandle.storeStoreFence();
        return zg2Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0195 A[LOOP:7: B:105:0x0193->B:106:0x0195, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:115:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:135:0x021b  */
    /* JADX WARN: Code duplicated, block: B:137:0x021f  */
    /* JADX WARN: Code duplicated, block: B:139:0x0223  */
    /* JADX WARN: Code duplicated, block: B:141:0x0227  */
    /* JADX WARN: Code duplicated, block: B:142:0x0229  */
    /* JADX WARN: Code duplicated, block: B:143:0x022c  */
    /* JADX WARN: Code duplicated, block: B:144:0x022f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0232  */
    /* JADX WARN: Code duplicated, block: B:147:0x0236  */
    /* JADX WARN: Code duplicated, block: B:148:0x0238  */
    /* JADX WARN: Code duplicated, block: B:155:0x0249 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x024b  */
    /* JADX WARN: Code duplicated, block: B:159:0x0257 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x0259  */
    /* JADX WARN: Code duplicated, block: B:162:0x026c  */
    /* JADX WARN: Code duplicated, block: B:193:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x020f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x027a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x0155 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x018e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    /* JADX WARN: Code duplicated, block: B:77:0x0112  */
    /* JADX WARN: Code duplicated, block: B:81:0x011c  */
    /* JADX WARN: Code duplicated, block: B:87:0x012b  */
    /* JADX WARN: Code duplicated, block: B:89:0x013b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0143  */
    /* JADX WARN: Code duplicated, block: B:96:0x015c A[LOOP:5: B:95:0x015a->B:96:0x015c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x0172  */
    /* JADX INFO: renamed from: I */
    public static long m3230I(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        int i7;
        long j2;
        char cCharAt;
        m41 m41Var;
        long jM3252k;
        int i8;
        int iMin;
        int i9;
        int i10;
        int i11;
        int iMin2;
        int i12;
        int i13;
        double d;
        long jM10011F;
        char cCharAt2;
        char cCharAt3;
        char cCharAt4;
        char cCharAt5;
        int i14;
        int i15;
        char cCharAt6;
        if (str.length() == 0) {
            C1077qn.m9987m("The string is empty");
            return 0L;
        }
        char cCharAt7 = str.charAt(0);
        int i16 = 1;
        char c = '-';
        char c2 = '+';
        if (cCharAt7 != '+') {
            i2 = cCharAt7 != '-' ? 0 : 1;
            i = i2;
        } else {
            i = 0;
            i2 = 1;
        }
        if (str.length() <= i2) {
            C1077qn.m9987m("No components");
            return 0L;
        }
        if (str.charAt(i2) != 'P') {
            C1077qn.m9987m("");
            return 0L;
        }
        int i17 = i2 + 1;
        if (i17 == str.length()) {
            C1077qn.m9987m("");
            return 0L;
        }
        int i18 = 0;
        m41 m41Var2 = null;
        long jM6622q = 0;
        long j3 = 0;
        while (i17 < str.length()) {
            char cCharAt8 = str.charAt(i17);
            if (cCharAt8 != 'T') {
                eo2 eo2Var = eo2.f18330c;
                int i19 = i16;
                char cCharAt9 = str.charAt(i17);
                if (cCharAt9 != c2) {
                    if (cCharAt9 != c) {
                        i3 = i17;
                    } else {
                        i3 = i17 + 1;
                        i4 = -1;
                    }
                    while (i3 < str.length() && str.charAt(i3) == '0') {
                        i3++;
                    }
                    j = 0;
                    while (true) {
                        if (i3 < str.length()) {
                            cCharAt5 = str.charAt(i3);
                            i5 = i17;
                            if ('0' > cCharAt5 && cCharAt5 < ':') {
                                i14 = cCharAt5 - '0';
                                i15 = i;
                                long j4 = eo2Var.f18331a;
                                if (j > j4 || (j == j4 && i14 > eo2Var.f18332b)) {
                                    i6 = i15;
                                    while (i3 < str.length() && '0' <= (cCharAt6 = str.charAt(i3)) && cCharAt6 < ':') {
                                        i3++;
                                    }
                                    if (i3 != str.length()) {
                                        if (i3 != i5 + ((cCharAt8 == '+' || cCharAt8 == '-') ? i19 : 0)) {
                                            j = 4611686018427387903L;
                                        }
                                    }
                                    C1077qn.m9987m("");
                                    return 0L;
                                }
                                j = (j << 3) + (j << i19) + ((long) i14);
                                i3++;
                                i17 = i5;
                                eo2Var = eo2Var;
                                i = i15;
                            }
                            j2 = j;
                            if (str.charAt(i3) == '.') {
                                i8 = i3 + 1;
                                iMin = Math.min(i3 + 7, str.length());
                                i10 = 0;
                                for (i9 = i8; i9 < iMin; i9++) {
                                    cCharAt4 = str.charAt(i9);
                                    if ('0' <= cCharAt4 || cCharAt4 >= ':') {
                                        for (i11 = 0; i11 < 6 - (i9 - i8); i11++) {
                                            i10 = (i10 << 1) + (i10 << 3);
                                        }
                                        iMin2 = Math.min(i9 + 9, str.length());
                                        i3 = i9;
                                        i12 = 0;
                                        while (i3 < iMin2) {
                                            cCharAt3 = str.charAt(i3);
                                            int i20 = iMin2;
                                            if ('0' <= cCharAt3 || cCharAt3 >= ':') {
                                                for (i13 = 0; i13 < 9 - (i3 - i9); i13++) {
                                                    i12 = (i12 << 1) + (i12 << 3);
                                                }
                                                while (i3 < str.length() && '0' <= (cCharAt2 = str.charAt(i3)) && cCharAt2 < ':') {
                                                    i3++;
                                                }
                                                if (i3 != i8 || i3 == str.length() || str.charAt(i3) != 'S') {
                                                    C1077qn.m9987m("");
                                                    return 0L;
                                                }
                                                long j5 = (((long) i10) * 1000000000) + ((long) i12);
                                                long j6 = i4;
                                                m41 m41Var3 = m41.SECONDS;
                                                double d2 = j5;
                                                switch (m41Var3.ordinal()) {
                                                    case 0:
                                                        d = 1.0E-15d;
                                                        jM10011F = qq2.m10011F(d2 * d);
                                                        break;
                                                    case 1:
                                                        d = 1.0E-12d;
                                                        jM10011F = qq2.m10011F(d2 * d);
                                                        break;
                                                    case 2:
                                                        d = 1.0E-9d;
                                                        jM10011F = qq2.m10011F(d2 * d);
                                                        break;
                                                    case 3:
                                                        d = 1.0E-6d;
                                                        jM10011F = qq2.m10011F(d2 * d);
                                                        break;
                                                    case 4:
                                                        d = 6.0E-5d;
                                                        jM10011F = qq2.m10011F(d2 * d);
                                                        break;
                                                    case 5:
                                                        d = 0.0036d;
                                                        jM10011F = qq2.m10011F(d2 * d);
                                                        break;
                                                    case 6:
                                                        d = 0.0864d;
                                                        jM10011F = qq2.m10011F(d2 * d);
                                                        break;
                                                    default:
                                                        nm0.m8798k(m41Var3, "Unknown unit: ");
                                                        jM10011F = 0;
                                                        break;
                                                }
                                                j3 = jM10011F * j6;
                                            } else {
                                                i12 = (cCharAt3 - '0') + (i12 << 3) + (i12 << 1);
                                                i3++;
                                                iMin2 = i20;
                                            }
                                        }
                                        while (i13 < 9 - (i3 - i9)) {
                                            i12 = (i12 << 1) + (i12 << 3);
                                        }
                                        while (i3 < str.length()) {
                                            i3++;
                                        }
                                        if (i3 != i8) {
                                        }
                                        C1077qn.m9987m("");
                                        return 0L;
                                    }
                                    i10 = (cCharAt4 - '0') + (i10 << 3) + (i10 << 1);
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i3 = i9;
                                i12 = 0;
                                while (i3 < iMin2) {
                                    cCharAt3 = str.charAt(i3);
                                    int i21 = iMin2;
                                    if ('0' <= cCharAt3) {
                                    }
                                    while (i13 < 9 - (i3 - i9)) {
                                        i12 = (i12 << 1) + (i12 << 3);
                                    }
                                    while (i3 < str.length()) {
                                        i3++;
                                    }
                                    if (i3 != i8) {
                                    }
                                    C1077qn.m9987m("");
                                    return 0L;
                                }
                                while (i13 < 9 - (i3 - i9)) {
                                    i12 = (i12 << 1) + (i12 << 3);
                                }
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                C1077qn.m9987m("");
                                return 0L;
                            }
                            cCharAt = str.charAt(i3);
                            if (cCharAt == 'D') {
                                m41Var = m41.DAYS;
                            } else if (cCharAt == 'H') {
                                m41Var = m41.HOURS;
                            } else if (cCharAt == 'M') {
                                m41Var = m41.MINUTES;
                            } else if (cCharAt != 'S') {
                                m41Var = null;
                            } else {
                                m41Var = m41.SECONDS;
                            }
                            if (m41Var == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (m41Var2 == null && m41Var2.compareTo(m41Var) <= 0) {
                                C1077qn.m9987m("Unexpected order of duration components");
                                return 0L;
                            }
                            if (m41Var == m41.DAYS) {
                                if (i18 != 0) {
                                    C1077qn.m9987m("");
                                    return 0L;
                                }
                                jM6622q = i25.m6622q(j2, m41Var) * ((long) i4);
                            } else {
                                if (i18 == 0) {
                                    C1077qn.m9987m("");
                                    return 0L;
                                }
                                jM3252k = m3252k(jM6622q, i25.m6622q(j2, m41Var) * ((long) i4));
                                if (jM3252k == 9223372036854759646L) {
                                    C1077qn.m9987m("");
                                    return 0L;
                                }
                                jM6622q = jM3252k;
                            }
                            i17 = i3 + 1;
                            m41Var2 = m41Var;
                            i16 = i19;
                            i = i6;
                            c = '-';
                            c2 = '+';
                        } else {
                            i5 = i17;
                        }
                        i6 = i;
                        if (i3 == str.length()) {
                            if (cCharAt8 != '+' || cCharAt8 == '-') {
                                i7 = i19;
                            } else {
                                i7 = 0;
                            }
                            if (i3 == i5 + i7) {
                            }
                            j2 = j;
                            if (str.charAt(i3) == '.') {
                                i8 = i3 + 1;
                                iMin = Math.min(i3 + 7, str.length());
                                i10 = 0;
                                while (i9 < iMin) {
                                    cCharAt4 = str.charAt(i9);
                                    if ('0' <= cCharAt4) {
                                    }
                                    while (i11 < 6 - (i9 - i8)) {
                                        i10 = (i10 << 1) + (i10 << 3);
                                    }
                                    iMin2 = Math.min(i9 + 9, str.length());
                                    i3 = i9;
                                    i12 = 0;
                                    while (i3 < iMin2) {
                                        cCharAt3 = str.charAt(i3);
                                        int i22 = iMin2;
                                        if ('0' <= cCharAt3) {
                                        }
                                        while (i13 < 9 - (i3 - i9)) {
                                            i12 = (i12 << 1) + (i12 << 3);
                                        }
                                        while (i3 < str.length()) {
                                            i3++;
                                        }
                                        if (i3 != i8) {
                                        }
                                        C1077qn.m9987m("");
                                        return 0L;
                                    }
                                    while (i13 < 9 - (i3 - i9)) {
                                        i12 = (i12 << 1) + (i12 << 3);
                                    }
                                    while (i3 < str.length()) {
                                        i3++;
                                    }
                                    if (i3 != i8) {
                                    }
                                    C1077qn.m9987m("");
                                    return 0L;
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i3 = i9;
                                i12 = 0;
                                while (i3 < iMin2) {
                                    cCharAt3 = str.charAt(i3);
                                    int i23 = iMin2;
                                    if ('0' <= cCharAt3) {
                                    }
                                    while (i13 < 9 - (i3 - i9)) {
                                        i12 = (i12 << 1) + (i12 << 3);
                                    }
                                    while (i3 < str.length()) {
                                        i3++;
                                    }
                                    if (i3 != i8) {
                                    }
                                    C1077qn.m9987m("");
                                    return 0L;
                                }
                                while (i13 < 9 - (i3 - i9)) {
                                    i12 = (i12 << 1) + (i12 << 3);
                                }
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                C1077qn.m9987m("");
                                return 0L;
                            }
                            cCharAt = str.charAt(i3);
                            if (cCharAt == 'D') {
                                m41Var = m41.DAYS;
                            } else if (cCharAt == 'H') {
                                m41Var = m41.HOURS;
                            } else if (cCharAt == 'M') {
                                m41Var = m41.MINUTES;
                            } else if (cCharAt != 'S') {
                                m41Var = null;
                            } else {
                                m41Var = m41.SECONDS;
                            }
                            if (m41Var == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (m41Var2 == null) {
                            }
                            if (m41Var == m41.DAYS) {
                                if (i18 != 0) {
                                    C1077qn.m9987m("");
                                    return 0L;
                                }
                                jM6622q = i25.m6622q(j2, m41Var) * ((long) i4);
                            } else {
                                if (i18 == 0) {
                                    C1077qn.m9987m("");
                                    return 0L;
                                }
                                jM3252k = m3252k(jM6622q, i25.m6622q(j2, m41Var) * ((long) i4));
                                if (jM3252k == 9223372036854759646L) {
                                    C1077qn.m9987m("");
                                    return 0L;
                                }
                                jM6622q = jM3252k;
                            }
                            i17 = i3 + 1;
                            m41Var2 = m41Var;
                            i16 = i19;
                            i = i6;
                            c = '-';
                            c2 = '+';
                        }
                        C1077qn.m9987m("");
                        return 0L;
                    }
                }
                i3 = i17 + 1;
                i4 = i19;
                while (i3 < str.length()) {
                    i3++;
                }
                j = 0;
                while (true) {
                    if (i3 < str.length()) {
                        cCharAt5 = str.charAt(i3);
                        i5 = i17;
                        if ('0' > cCharAt5) {
                        }
                    } else {
                        i5 = i17;
                    }
                    i6 = i;
                    if (i3 == str.length()) {
                        if (cCharAt8 != '+') {
                            i7 = i19;
                        } else {
                            i7 = i19;
                        }
                        if (i3 == i5 + i7) {
                        }
                        j2 = j;
                        if (str.charAt(i3) == '.') {
                            i8 = i3 + 1;
                            iMin = Math.min(i3 + 7, str.length());
                            i10 = 0;
                            while (i9 < iMin) {
                                cCharAt4 = str.charAt(i9);
                                if ('0' <= cCharAt4) {
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i3 = i9;
                                i12 = 0;
                                while (i3 < iMin2) {
                                    cCharAt3 = str.charAt(i3);
                                    int i24 = iMin2;
                                    if ('0' <= cCharAt3) {
                                    }
                                    while (i13 < 9 - (i3 - i9)) {
                                        i12 = (i12 << 1) + (i12 << 3);
                                    }
                                    while (i3 < str.length()) {
                                        i3++;
                                    }
                                    if (i3 != i8) {
                                    }
                                    C1077qn.m9987m("");
                                    return 0L;
                                }
                                while (i13 < 9 - (i3 - i9)) {
                                    i12 = (i12 << 1) + (i12 << 3);
                                }
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                C1077qn.m9987m("");
                                return 0L;
                            }
                            while (i11 < 6 - (i9 - i8)) {
                                i10 = (i10 << 1) + (i10 << 3);
                            }
                            iMin2 = Math.min(i9 + 9, str.length());
                            i3 = i9;
                            i12 = 0;
                            while (i3 < iMin2) {
                                cCharAt3 = str.charAt(i3);
                                int i25 = iMin2;
                                if ('0' <= cCharAt3) {
                                }
                                while (i13 < 9 - (i3 - i9)) {
                                    i12 = (i12 << 1) + (i12 << 3);
                                }
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                C1077qn.m9987m("");
                                return 0L;
                            }
                            while (i13 < 9 - (i3 - i9)) {
                                i12 = (i12 << 1) + (i12 << 3);
                            }
                            while (i3 < str.length()) {
                                i3++;
                            }
                            if (i3 != i8) {
                            }
                            C1077qn.m9987m("");
                            return 0L;
                        }
                        cCharAt = str.charAt(i3);
                        if (cCharAt == 'D') {
                            m41Var = m41.DAYS;
                        } else if (cCharAt == 'H') {
                            m41Var = m41.HOURS;
                        } else if (cCharAt == 'M') {
                            m41Var = m41.MINUTES;
                        } else if (cCharAt != 'S') {
                            m41Var = null;
                        } else {
                            m41Var = m41.SECONDS;
                        }
                        if (m41Var == null) {
                            throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                        }
                        if (m41Var2 == null) {
                        }
                        if (m41Var == m41.DAYS) {
                            if (i18 != 0) {
                                C1077qn.m9987m("");
                                return 0L;
                            }
                            jM6622q = i25.m6622q(j2, m41Var) * ((long) i4);
                        } else {
                            if (i18 == 0) {
                                C1077qn.m9987m("");
                                return 0L;
                            }
                            jM3252k = m3252k(jM6622q, i25.m6622q(j2, m41Var) * ((long) i4));
                            if (jM3252k == 9223372036854759646L) {
                                C1077qn.m9987m("");
                                return 0L;
                            }
                            jM6622q = jM3252k;
                        }
                        i17 = i3 + 1;
                        m41Var2 = m41Var;
                        i16 = i19;
                        i = i6;
                        c = '-';
                        c2 = '+';
                    }
                    C1077qn.m9987m("");
                    return 0L;
                    j = (j << 3) + (j << i19) + ((long) i14);
                    i3++;
                    i17 = i5;
                    eo2Var = eo2Var;
                    i = i15;
                }
            } else {
                if (i18 != 0 || (i17 = i17 + 1) == str.length()) {
                    C1077qn.m9987m("");
                    return 0L;
                }
                i18 = i16;
            }
        }
        int i26 = i;
        long jM6652k = i41.m6652k(m3239R(jM6622q, m41.MILLISECONDS), m3239R(j3, m41.NANOSECONDS));
        return (i26 == 0 || i41.m6646e(jM6652k, i41.f21120e)) ? jM6652k : i41.m6657p(jM6652k);
    }

    /* JADX INFO: renamed from: J */
    public static final Object m3231J(WorkDatabase workDatabase, boolean z, boolean z2, yp1 yp1Var) {
        workDatabase.m3058a();
        wm0 wm0Var = null;
        if (workDatabase.m3068k() && !workDatabase.m3069l() && workDatabase.f14693h.get() != null) {
            C1077qn.m9989o("Cannot access database on a different coroutine context inherited from a suspending transaction.");
            return null;
        }
        ss0 ss0Var = new ss0(null, yp1Var, workDatabase, z, z2);
        Thread.interrupted();
        return y70.m13014O(r71.f29063a, new C1260vl((Object) ss0Var, wm0Var, (byte) 12));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: K */
    public static final Object m3232K(WorkDatabase workDatabase, boolean z, ro4 ro4Var, ym0 ym0Var) throws Throwable {
        us0 us0Var;
        if (ym0Var instanceof us0) {
            us0Var = (us0) ym0Var;
            int i = us0Var.f32144x;
            if ((i & Integer.MIN_VALUE) != 0) {
                us0Var.f32144x = i - Integer.MIN_VALUE;
            } else {
                us0Var = new us0(ym0Var);
            }
        } else {
            us0Var = new us0(ym0Var);
        }
        Object objM3225D = us0Var.f32143w;
        Object obj = ap0.f14763a;
        int i2 = us0Var.f32144x;
        if (i2 == 0) {
            k43.m7376J(objM3225D);
            if (workDatabase.m3068k() && workDatabase.m3071n() && workDatabase.m3069l()) {
                vs0 vs0Var = new vs0((wm0) null, ro4Var, workDatabase, z);
                us0Var.f32144x = 1;
                Object objM3077t = workDatabase.m3077t(z, vs0Var, us0Var);
                if (objM3077t != obj) {
                    return objM3077t;
                }
            } else {
                us0Var.f32140t = workDatabase;
                us0Var.f32141u = ro4Var;
                us0Var.f32142v = z;
                us0Var.f32144x = 2;
                objM3225D = m3225D(workDatabase, us0Var);
                if (objM3225D != obj) {
                }
            }
        }
        if (i2 == 1) {
            k43.m7376J(objM3225D);
            return objM3225D;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                k43.m7376J(objM3225D);
                return objM3225D;
            }
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = us0Var.f32142v;
        ro4Var = us0Var.f32141u;
        workDatabase = us0Var.f32140t;
        k43.m7376J(objM3225D);
        ts0 ts0Var = new ts0(null, ro4Var, workDatabase, z);
        us0Var.f32140t = null;
        us0Var.f32141u = null;
        us0Var.f32144x = 3;
        Object objM7921b0 = lb5.m7921b0((ro0) objM3225D, ts0Var, us0Var);
        return objM7921b0 == obj ? obj : objM7921b0;
    }

    /* JADX INFO: renamed from: L */
    public static final fm2 m3233L(boolean z, mi0 mi0Var) {
        dm2 dm2Var;
        ir1 ir1Var = (ir1) mi0Var;
        AccessibilityManager accessibilityManager = (AccessibilityManager) ((Context) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14651b)).getSystemService("accessibility");
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        Object obj = objM6869O;
        if (objM6869O == i50Var) {
            fm2 fm2Var = new fm2();
            fm2Var.f19119a = z;
            Boolean bool = Boolean.FALSE;
            fm2Var.f19120b = k43.m7398w(bool);
            em2 em2Var = new em2();
            em2Var.f18258a = k43.m7398w(bool);
            VarHandle.storeStoreFence();
            fm2Var.f19121c = em2Var;
            if (z) {
                dm2Var = new dm2();
                dm2Var.f17187a = k43.m7398w(bool);
                dm2Var.f17188b = k43.m7398w(bool);
                VarHandle.storeStoreFence();
            } else {
                dm2Var = null;
            }
            fm2Var.f19122d = dm2Var;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(fm2Var);
            obj = fm2Var;
        }
        fm2 fm2Var2 = (fm2) obj;
        lk2 lk2Var = (lk2) ir1Var.m6898k(rm2.f29413a);
        boolean zM6890g = ir1Var.m6890g(fm2Var2) | ir1Var.m6894i(accessibilityManager);
        Object objM6869O2 = ir1Var.m6869O();
        Object obj2 = objM6869O2;
        if (zM6890g || objM6869O2 == i50Var) {
            C0558d0 c0558d0 = new C0558d0((byte) 2);
            c0558d0.f16655b = fm2Var2;
            c0558d0.f16656c = accessibilityManager;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(c0558d0);
            obj2 = c0558d0;
        }
        yp1 yp1Var = (yp1) obj2;
        boolean zM6890g2 = ir1Var.m6890g(fm2Var2) | ir1Var.m6894i(accessibilityManager);
        Object objM6869O3 = ir1Var.m6869O();
        byte b = 0;
        Object obj3 = objM6869O3;
        if (zM6890g2 || objM6869O3 == i50Var) {
            C0675g4 c0675g4 = new C0675g4(b);
            c0675g4.f19600b = fm2Var2;
            c0675g4.f19601c = accessibilityManager;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(c0675g4);
            obj3 = c0675g4;
        }
        m3248g(lk2Var, yp1Var, (wp1) obj3, ir1Var, 0);
        return fm2Var2;
    }

    /* JADX INFO: renamed from: M */
    public static final double m3234M(double d, double d2) {
        return Math.copySign(Math.pow(Math.abs(d), d2), d);
    }

    /* JADX INFO: renamed from: N */
    public static final Object m3235N(nw3 nw3Var, boolean z, Object obj, mq1 mq1Var) {
        Object ff0Var;
        Object objM4990V;
        try {
            if (mq1Var instanceof AbstractC0888lx) {
                m3259r(2, mq1Var);
                ff0Var = mq1Var.invoke(obj, nw3Var);
            } else {
                ff0Var = C0006a5.m62R(mq1Var, obj, nw3Var);
            }
        } catch (e01 e) {
            Throwable th = e.f17555a;
            nw3Var.m4989U(new ff0(th, false));
            throw th;
        } catch (Throwable th2) {
            ff0Var = new ff0(th2, false);
        }
        ap0 ap0Var = ap0.f14763a;
        if (ff0Var == ap0Var || (objM4990V = nw3Var.m4990V(ff0Var)) == f92.f18856b) {
            return ap0Var;
        }
        nw3Var.mo8876k0();
        if (!(objM4990V instanceof ff0)) {
            return f92.m5616a(objM4990V);
        }
        if (!z) {
            Throwable th3 = ((ff0) objM4990V).f18941a;
            if ((th3 instanceof zm4) && ((zm4) th3).f36187a == nw3Var) {
                if (ff0Var instanceof ff0) {
                    throw ((ff0) ff0Var).f18941a;
                }
                return ff0Var;
            }
        }
        throw ((ff0) objM4990V).f18941a;
    }

    /* JADX INFO: renamed from: O */
    public static void m3236O(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(zi4.m13621u(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        z62.m13362U(as4.class.getName(), classCastException);
        throw classCastException;
    }

    /* JADX INFO: renamed from: P */
    public static final long m3237P(double d, m41 m41Var) {
        double dM6621p = i25.m6621p(d, m41Var, m41.NANOSECONDS);
        if (Double.isNaN(dM6621p)) {
            C1077qn.m9987m("Duration value cannot be NaN.");
            return 0L;
        }
        long jM10011F = qq2.m10011F(dM6621p);
        return (-4611686018426999999L > jM10011F || jM10011F >= 4611686018427000000L) ? m3266y(qq2.m10011F(i25.m6621p(d, m41Var, m41.MILLISECONDS))) : m3267z(jM10011F);
    }

    /* JADX INFO: renamed from: Q */
    public static final long m3238Q(int i, m41 m41Var) {
        if (m41Var.compareTo(m41.SECONDS) > 0) {
            return m3239R(i, m41Var);
        }
        long j = i;
        m41 m41Var2 = m41.NANOSECONDS;
        return m3267z(TimeUnit.NANOSECONDS.convert(j, m41Var.f24636a));
    }

    /* JADX INFO: renamed from: R */
    public static final long m3239R(long j, m41 m41Var) {
        m41 m41Var2 = m41.NANOSECONDS;
        TimeUnit timeUnit = m41Var.f24636a;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) <= j && j <= jConvert) {
            return m3267z(timeUnit2.convert(j, timeUnit));
        }
        if (m41Var.compareTo(m41.MILLISECONDS) < 0) {
            return m3265x(sc6.m10676q(TimeUnit.MILLISECONDS.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        return m3265x(i25.m6622q(Math.abs(j), m41Var) * jSignum);
    }

    /* JADX INFO: renamed from: S */
    public static final p42 m3240S(g42 g42Var) {
        int i = g42Var.f19606a;
        int i2 = g42Var.f19607b;
        int i3 = g42Var.f19608c;
        int i4 = g42Var.f19609d;
        p42 p42Var = new p42();
        p42Var.f27372a = i;
        p42Var.f27373b = i2;
        p42Var.f27374c = i3;
        p42Var.f27375d = i4;
        VarHandle.storeStoreFence();
        return p42Var;
    }

    /* JADX INFO: renamed from: T */
    public static final void m3241T(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            t32.m10968a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        t32.m10968a("minLines " + i + " must be less than or equal to maxLines " + i2);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0254  */
    /* JADX WARN: Code duplicated, block: B:102:0x0258  */
    /* JADX WARN: Code duplicated, block: B:105:0x0264  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00db  */
    /* JADX WARN: Code duplicated, block: B:72:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:75:0x0114  */
    /* JADX WARN: Code duplicated, block: B:77:0x011c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0133  */
    /* JADX WARN: Code duplicated, block: B:81:0x0135  */
    /* JADX WARN: Code duplicated, block: B:85:0x0157  */
    /* JADX WARN: Code duplicated, block: B:88:0x0179  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:94:0x01de  */
    /* JADX WARN: Code duplicated, block: B:97:0x0201  */
    /* JADX WARN: Code duplicated, block: B:98:0x0203  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m3242a(long j, long j2, boolean z, wp1 wp1Var, int i, List list, nt2 nt2Var, mi0 mi0Var, int i2, int i3) {
        int i4;
        int i5;
        boolean z2;
        nt2 nt2Var2;
        ir1 ir1Var;
        yk3 yk3VarM6916v;
        nt2 nt2Var3;
        b20 b20Var;
        lu2 lu2Var;
        float f;
        Object objM6869O;
        i50 i50Var;
        nv2 nv2Var;
        float f2;
        xb4 xb4VarM8766b;
        nt2 nt2Var4;
        boolean z3;
        boolean zM6890g;
        Object obj;
        Object objM6869O2;
        xq2 xq2VarM9704c;
        int iHashCode;
        ga3 ga3VarM6902m;
        nt2 nt2VarM10006A;
        boolean z4;
        boolean z5 = z;
        ir1 ir1Var2 = (ir1) mi0Var;
        ir1Var2.m6889f0(-421648142);
        if ((i2 & 6) == 0) {
            i4 = (ir1Var2.m6888f(j) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ir1Var2.m6888f(j2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ir1Var2.m6892h(z5) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ir1Var2.m6894i(wp1Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= ir1Var2.m6886e(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= ir1Var2.m6890g(list) ? 131072 : 65536;
        }
        int i6 = i3 & 64;
        if (i6 == 0) {
            if ((1572864 & i2) == 0) {
                i4 |= ir1Var2.m6890g(nt2Var) ? 1048576 : 524288;
            }
            i5 = i4;
            if ((599187 & i4) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (ir1Var2.m6871T(i5 & 1, z2)) {
                if (i6 != 0) {
                    nt2Var3 = kt2.f23428a;
                } else {
                    nt2Var3 = nt2Var;
                }
                b20 b20Var2 = (b20) list.get(i);
                b20 b20Var3 = (b20) hb0.m6302N0(list, i - 1);
                b20Var = (b20) hb0.m6302N0(list, i + 1);
                lu2Var = ((lq2) ir1Var2.m6898k(pq2.f27894b)).f24280d;
                if (z5) {
                    f = 12.0f;
                } else {
                    f = 24.0f;
                }
                fr3 fr3VarM6151a = gr3.m6151a(((p11) AbstractC0947ni.m8765a(f, lu2Var.mo7289f(), ir1Var2).getValue()).f27285a);
                objM6869O = ir1Var2.m6869O();
                i50Var = ki0.f23136a;
                if (objM6869O == i50Var) {
                    objM6869O = sj3.m10810f();
                    ir1Var2.m6905n0(objM6869O);
                }
                nv2Var = (nv2) objM6869O;
                if (((Boolean) z62.m13392t(nv2Var, ir1Var2, 6).getValue()).booleanValue()) {
                    f2 = 0.92f;
                } else {
                    f2 = 1.0f;
                }
                xb4VarM8766b = AbstractC0947ni.m8766b(f2, lu2Var.mo7289f(), ir1Var2);
                nt2 nt2VarM8579g = n74.m8579g(nt2Var3, 48.0f);
                d63 d63Var = d63.f16814a;
                nt2Var4 = nt2Var3;
                if (b20Var != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z10 z10Var = new z10((byte) 0);
                z10Var.f35693c = b20Var3;
                z10Var.f35694d = b20Var2;
                z10Var.f35695e = b20Var;
                z10Var.f35692b = z3;
                VarHandle.storeStoreFence();
                nt2 nt2VarM10829y = sj3.m10829y(nt2VarM8579g, z10Var);
                zM6890g = ir1Var2.m6890g(xb4VarM8766b);
                Object objM6869O3 = ir1Var2.m6869O();
                obj = objM6869O3;
                if (zM6890g || objM6869O3 == i50Var) {
                    C0676g5 c0676g5 = new C0676g5((byte) 2);
                    c0676g5.f19614b = xb4VarM8766b;
                    VarHandle.storeStoreFence();
                    ir1Var2.m6905n0(c0676g5);
                    obj = c0676g5;
                }
                nt2 nt2VarM6619m = i25.m6619m(m3258q(se0.m10693F(nt2VarM10829y, (yp1) obj), j, fr3VarM6151a), fr3VarM6151a);
                objM6869O2 = ir1Var2.m6869O();
                if (objM6869O2 == i50Var) {
                    objM6869O2 = lb5.m7942w(r71.f29063a, ir1Var2);
                    ir1Var2.m6905n0(objM6869O2);
                }
                C1297wl c1297wl = new C1297wl((byte) 1);
                c1297wl.f33457b = (zo0) objM6869O2;
                c1297wl.f33458c = wp1Var;
                c1297wl.f33459d = b20Var2;
                VarHandle.storeStoreFence();
                nt2 nt2VarM3258q = m3258q(n74.m8579g(n74.m8585m(kx5.m7744y(nt2VarM6619m, nv2Var, null, false, null, c1297wl, 28), null, 3), 32.0f), j2, gr3.f20083a);
                xq2VarM9704c = q20.m9704c(ig1.f21382f, false);
                iHashCode = Long.hashCode(ir1Var2.f21683T);
                ga3VarM6902m = ir1Var2.m6902m();
                nt2VarM10006A = qq2.m10006A(ir1Var2, nt2VarM3258q);
                bi0.f15310ap.getClass();
                if (ir1Var2.f21685a != null) {
                    dt0.m4682E();
                    throw null;
                }
                ir1Var2.m6893h0();
                if (ir1Var2.f21682S) {
                    ir1Var2.m6900l(wf2.f33290T);
                } else {
                    ir1Var2.m6911q0();
                }
                C0006a5.m53I(ir1Var2, ia5.f21216g, xq2VarM9704c);
                C0006a5.m53I(ir1Var2, ia5.f21215f, ga3VarM6902m);
                C0006a5.m53I(ir1Var2, ia5.f21217h, Integer.valueOf(iHashCode));
                C0006a5.m50F(ir1Var2);
                C0006a5.m53I(ir1Var2, ia5.f21214e, nt2VarM10006A);
                z5 = z;
                if (z5) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                p91 p91VarM9439a = k91.m7438c(lu2Var.mo7286c(), 2).m9439a(k91.m7440e(lu2Var.mo7287d(), 0.0f, 6));
                mc1 mc1VarM8273a = k91.m7439d(lu2Var.mo7286c(), 2).m8273a(k91.m7441f(lu2Var.mo7287d(), 0.0f, 6));
                x10 x10Var = new x10((byte) 0);
                x10Var.f33906b = j;
                VarHandle.storeStoreFence();
                z62.m13372c(z4, null, p91VarM9439a, mc1VarM8273a, null, vd6.m11834R(-227603116, x10Var, ir1Var2), ir1Var2, 196608);
                ir1 ir1Var3 = ir1Var2;
                ir1Var3.m6912r(true);
                nt2Var2 = nt2Var4;
                ir1Var = ir1Var3;
            } else {
                ir1 ir1Var4 = ir1Var2;
                ir1Var4.m6874W();
                nt2Var2 = nt2Var;
                ir1Var = ir1Var4;
            }
            yk3VarM6916v = ir1Var.m6916v();
            if (yk3VarM6916v != null) {
                y10 y10Var = new y10();
                y10Var.f34801a = j;
                y10Var.f34802b = j2;
                y10Var.f34803c = z5;
                y10Var.f34804d = wp1Var;
                y10Var.f34805e = i;
                y10Var.f34806f = list;
                y10Var.f34807g = nt2Var2;
                y10Var.f34808h = i2;
                y10Var.f34809i = i3;
                VarHandle.storeStoreFence();
                yk3VarM6916v.f35300d = y10Var;
            }
        }
        i4 |= 1572864;
        i5 = i4;
        if ((599187 & i4) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (ir1Var2.m6871T(i5 & 1, z2)) {
            if (i6 != 0) {
                nt2Var3 = kt2.f23428a;
            } else {
                nt2Var3 = nt2Var;
            }
            b20 b20Var4 = (b20) list.get(i);
            b20 b20Var5 = (b20) hb0.m6302N0(list, i - 1);
            b20Var = (b20) hb0.m6302N0(list, i + 1);
            lu2Var = ((lq2) ir1Var2.m6898k(pq2.f27894b)).f24280d;
            if (z5) {
                f = 12.0f;
            } else {
                f = 24.0f;
            }
            fr3 fr3VarM6151a2 = gr3.m6151a(((p11) AbstractC0947ni.m8765a(f, lu2Var.mo7289f(), ir1Var2).getValue()).f27285a);
            objM6869O = ir1Var2.m6869O();
            i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                objM6869O = sj3.m10810f();
                ir1Var2.m6905n0(objM6869O);
            }
            nv2Var = (nv2) objM6869O;
            if (((Boolean) z62.m13392t(nv2Var, ir1Var2, 6).getValue()).booleanValue()) {
                f2 = 0.92f;
            } else {
                f2 = 1.0f;
            }
            xb4VarM8766b = AbstractC0947ni.m8766b(f2, lu2Var.mo7289f(), ir1Var2);
            nt2 nt2VarM8579g2 = n74.m8579g(nt2Var3, 48.0f);
            d63 d63Var2 = d63.f16814a;
            nt2Var4 = nt2Var3;
            if (b20Var != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            z10 z10Var2 = new z10((byte) 0);
            z10Var2.f35693c = b20Var5;
            z10Var2.f35694d = b20Var4;
            z10Var2.f35695e = b20Var;
            z10Var2.f35692b = z3;
            VarHandle.storeStoreFence();
            nt2 nt2VarM10829y2 = sj3.m10829y(nt2VarM8579g2, z10Var2);
            zM6890g = ir1Var2.m6890g(xb4VarM8766b);
            Object objM6869O4 = ir1Var2.m6869O();
            obj = objM6869O4;
            if (zM6890g) {
                C0676g5 c0676g6 = new C0676g5((byte) 2);
                c0676g6.f19614b = xb4VarM8766b;
                VarHandle.storeStoreFence();
                ir1Var2.m6905n0(c0676g6);
                obj = c0676g6;
            } else {
                C0676g5 c0676g7 = new C0676g5((byte) 2);
                c0676g7.f19614b = xb4VarM8766b;
                VarHandle.storeStoreFence();
                ir1Var2.m6905n0(c0676g7);
                obj = c0676g7;
            }
            nt2 nt2VarM6619m2 = i25.m6619m(m3258q(se0.m10693F(nt2VarM10829y2, (yp1) obj), j, fr3VarM6151a2), fr3VarM6151a2);
            objM6869O2 = ir1Var2.m6869O();
            if (objM6869O2 == i50Var) {
                objM6869O2 = lb5.m7942w(r71.f29063a, ir1Var2);
                ir1Var2.m6905n0(objM6869O2);
            }
            C1297wl c1297wl2 = new C1297wl((byte) 1);
            c1297wl2.f33457b = (zo0) objM6869O2;
            c1297wl2.f33458c = wp1Var;
            c1297wl2.f33459d = b20Var4;
            VarHandle.storeStoreFence();
            nt2 nt2VarM3258q2 = m3258q(n74.m8579g(n74.m8585m(kx5.m7744y(nt2VarM6619m2, nv2Var, null, false, null, c1297wl2, 28), null, 3), 32.0f), j2, gr3.f20083a);
            xq2VarM9704c = q20.m9704c(ig1.f21382f, false);
            iHashCode = Long.hashCode(ir1Var2.f21683T);
            ga3VarM6902m = ir1Var2.m6902m();
            nt2VarM10006A = qq2.m10006A(ir1Var2, nt2VarM3258q2);
            bi0.f15310ap.getClass();
            if (ir1Var2.f21685a != null) {
                dt0.m4682E();
                throw null;
            }
            ir1Var2.m6893h0();
            if (ir1Var2.f21682S) {
                ir1Var2.m6900l(wf2.f33290T);
            } else {
                ir1Var2.m6911q0();
            }
            C0006a5.m53I(ir1Var2, ia5.f21216g, xq2VarM9704c);
            C0006a5.m53I(ir1Var2, ia5.f21215f, ga3VarM6902m);
            C0006a5.m53I(ir1Var2, ia5.f21217h, Integer.valueOf(iHashCode));
            C0006a5.m50F(ir1Var2);
            C0006a5.m53I(ir1Var2, ia5.f21214e, nt2VarM10006A);
            z5 = z;
            if (z5) {
                z4 = true;
            } else {
                z4 = false;
            }
            p91 p91VarM9439a2 = k91.m7438c(lu2Var.mo7286c(), 2).m9439a(k91.m7440e(lu2Var.mo7287d(), 0.0f, 6));
            mc1 mc1VarM8273a2 = k91.m7439d(lu2Var.mo7286c(), 2).m8273a(k91.m7441f(lu2Var.mo7287d(), 0.0f, 6));
            x10 x10Var2 = new x10((byte) 0);
            x10Var2.f33906b = j;
            VarHandle.storeStoreFence();
            z62.m13372c(z4, null, p91VarM9439a2, mc1VarM8273a2, null, vd6.m11834R(-227603116, x10Var2, ir1Var2), ir1Var2, 196608);
            ir1 ir1Var5 = ir1Var2;
            ir1Var5.m6912r(true);
            nt2Var2 = nt2Var4;
            ir1Var = ir1Var5;
        } else {
            ir1 ir1Var6 = ir1Var2;
            ir1Var6.m6874W();
            nt2Var2 = nt2Var;
            ir1Var = ir1Var6;
        }
        yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            y10 y10Var2 = new y10();
            y10Var2.f34801a = j;
            y10Var2.f34802b = j2;
            y10Var2.f34803c = z5;
            y10Var2.f34804d = wp1Var;
            y10Var2.f34805e = i;
            y10Var2.f34806f = list;
            y10Var2.f34807g = nt2Var2;
            y10Var2.f34808h = i2;
            y10Var2.f34809i = i3;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = y10Var2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m3243b(cj0 cj0Var, pg0 pg0Var, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1162003659);
        int i2 = i | (ir1Var.m6890g(cj0Var) ? 4 : 2);
        if (ir1Var.m6871T(i2 & 1, (i2 & 19) != 18)) {
            ga3 ga3Var = cj0Var.f16058a;
            ga3Var.getClass();
            ArrayList arrayList = new ArrayList(ga3Var.f20461b);
            for (Map.Entry entry : (oa3) ga3Var.entrySet()) {
                arrayList.add(((nw4) entry.getValue()).mo3606a((xh3) entry.getKey()));
            }
            zh3[] zh3VarArr = (zh3[]) arrayList.toArray(new zh3[0]);
            m3245d((zh3[]) Arrays.copyOf(zh3VarArr, zh3VarArr.length), pg0Var, ir1Var, 48);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            ne0 ne0Var = new ne0((byte) 19);
            ne0Var.f25728b = cj0Var;
            ne0Var.f25729c = pg0Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = ne0Var;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m3244c(zh3 zh3Var, mq1 mq1Var, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-149765515);
        ir1Var.m6881b0(zh3Var);
        mq1Var.invoke(ir1Var, Integer.valueOf((i >> 3) & 14));
        ir1Var.m6914t();
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            mg0 mg0Var = new mg0((byte) 1);
            mg0Var.f24879c = zh3Var;
            mg0Var.f24880d = mq1Var;
            mg0Var.f24878b = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = mg0Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    public static final void m3245d(zh3[] zh3VarArr, mq1 mq1Var, mi0 mi0Var, int i) {
        ga3 ga3VarM5626d;
        boolean z;
        yk3 yk3VarM6916v;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(415205898);
        x52 x52Var = ir1Var.f21708x;
        ga3 ga3VarM6902m = ir1Var.m6902m();
        ir1Var.m6877Z(C0313rh.f10778d1, qi0.f28499b);
        boolean z2 = ir1Var.f21682S;
        j43 j43Var = qi0.f28501d;
        if (z2) {
            ga3 ga3VarM6607F = i25.m6607F(zh3VarArr, ga3VarM6902m, ga3.f19690d);
            ga3VarM6902m.getClass();
            fa3 fa3Var = new fa3(ga3VarM6902m);
            fa3Var.f18880g = ga3VarM6902m;
            fa3Var.putAll(ga3VarM6607F);
            ga3VarM5626d = fa3Var.mo5624a();
            ir1Var.m6877Z(204, j43Var);
            ir1Var.m6861G();
            ir1Var.m6907o0(ga3VarM5626d);
            ir1Var.m6861G();
            ir1Var.m6907o0(ga3VarM6607F);
            ir1Var.m6912r(false);
            ir1Var.f21673J = true;
        } else {
            l84 l84Var = ir1Var.f21670G;
            ga3 ga3Var = (ga3) l84Var.m7852h(l84Var.f23853g, 0);
            l84 l84Var2 = ir1Var.f21670G;
            ga3 ga3Var2 = (ga3) l84Var2.m7852h(l84Var2.f23853g, 1);
            ga3 ga3VarM6607F2 = i25.m6607F(zh3VarArr, ga3VarM6902m, ga3Var2);
            if (!ir1Var.m6858D() || ir1Var.f21709y || !ga3Var2.equals(ga3VarM6607F2)) {
                ga3VarM6902m.getClass();
                fa3 fa3Var2 = new fa3(ga3VarM6902m);
                fa3Var2.f18880g = ga3VarM6902m;
                fa3Var2.putAll(ga3VarM6607F2);
                ga3VarM5626d = fa3Var2.mo5624a();
                ir1Var.m6877Z(204, j43Var);
                ir1Var.m6861G();
                ir1Var.m6907o0(ga3VarM5626d);
                ir1Var.m6861G();
                ir1Var.m6907o0(ga3VarM6607F2);
                ir1Var.m6912r(false);
                if (ir1Var.f21709y || !ga3VarM5626d.equals(ga3Var)) {
                    z = true;
                }
                if (z && !ir1Var.f21682S) {
                    ir1Var.m6867M(ga3VarM5626d);
                }
                x52Var.m12486c(ir1Var.f21707w ? 1 : 0);
                ir1Var.f21707w = z;
                ir1Var.f21674K = ga3VarM5626d;
                ir1Var.m6875X(202, 0, qi0.f28500c, ga3VarM5626d);
                mq1Var.invoke(ir1Var, Integer.valueOf((i >> 3) & 14));
                ir1Var.m6912r(false);
                ir1Var.m6912r(false);
                ir1Var.f21707w = x52Var.m12485b() != 0;
                ir1Var.f21674K = null;
                yk3VarM6916v = ir1Var.m6916v();
                if (yk3VarM6916v != null) {
                    mg0 mg0Var = new mg0((byte) 2);
                    mg0Var.f24879c = zh3VarArr;
                    mg0Var.f24880d = mq1Var;
                    mg0Var.f24878b = i;
                    VarHandle.storeStoreFence();
                    yk3VarM6916v.f35300d = mg0Var;
                }
            }
            ir1Var.f21696l = ir1Var.f21670G.m7863s() + ir1Var.f21696l;
            ga3VarM5626d = ga3Var;
        }
        z = false;
        if (z) {
            ir1Var.m6867M(ga3VarM5626d);
        }
        x52Var.m12486c(ir1Var.f21707w ? 1 : 0);
        ir1Var.f21707w = z;
        ir1Var.f21674K = ga3VarM5626d;
        ir1Var.m6875X(202, 0, qi0.f28500c, ga3VarM5626d);
        mq1Var.invoke(ir1Var, Integer.valueOf((i >> 3) & 14));
        ir1Var.m6912r(false);
        ir1Var.m6912r(false);
        ir1Var.f21707w = x52Var.m12485b() != 0;
        ir1Var.f21674K = null;
        yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            mg0 mg0Var2 = new mg0((byte) 2);
            mg0Var2.f24879c = zh3VarArr;
            mg0Var2.f24880d = mq1Var;
            mg0Var2.f24878b = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = mg0Var2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static final void m3246e(nt2 nt2Var, si2 si2Var, e73 e73Var, InterfaceC1299wn interfaceC1299wn, C0779iz c0779iz, yp1 yp1Var, mi0 mi0Var, int i) {
        int i2;
        e73 e73Var2;
        InterfaceC1299wn interfaceC1299wn2;
        C0779iz c0779iz2;
        int i3;
        InterfaceC1299wn interfaceC1299wn3;
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-2090523020);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(nt2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | (ir1Var.m6890g(si2Var) ? 32 : 16) | 27776 | (ir1Var.m6894i(yp1Var) ? 131072 : 65536);
        byte b = 0;
        byte b2 = 1;
        if (ir1Var.m6871T(i4 & 1, (74899 & i4) != 74898)) {
            ir1Var.m6876Y();
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                e73Var2 = (e73) ir1Var.m6898k(ra1.f29113a);
                i3 = i4 & (-897);
                c0779iz2 = ig1.f21390n;
                interfaceC1299wn3 = AbstractC1337xn.f34436c;
            } else {
                ir1Var.m6874W();
                i3 = i4 & (-897);
                e73Var2 = e73Var;
                interfaceC1299wn3 = interfaceC1299wn;
                c0779iz2 = c0779iz;
            }
            ir1Var.m6913s();
            gr1 gr1VarM4685N = dt0.m4685N(ir1Var);
            boolean zM6894i = ((458752 & i3) == 131072) | ir1Var.m6894i(gr1VarM4685N);
            Object objM6869O = ir1Var.m6869O();
            if (zM6894i || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                tg2 tg2Var = new tg2(b2);
                tg2Var.f31142b = yp1Var;
                tg2Var.f31143c = gr1VarM4685N;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(tg2Var);
                obj = tg2Var;
            }
            obj = objM6869O;
            interfaceC1299wn2 = interfaceC1299wn3;
            sj3.m10808d(nt2Var, si2Var, e73Var2, interfaceC1299wn2, c0779iz2, null, false, null, (yp1) obj, ir1Var, (i3 & 1022) | 221184);
        } else {
            ir1Var.m6874W();
            e73Var2 = e73Var;
            interfaceC1299wn2 = interfaceC1299wn;
            c0779iz2 = c0779iz;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            ug2 ug2Var = new ug2(b);
            ug2Var.f31852c = nt2Var;
            ug2Var.f31853d = si2Var;
            ug2Var.f31854e = e73Var2;
            ug2Var.f31855f = interfaceC1299wn2;
            ug2Var.f31856g = c0779iz2;
            ug2Var.f31857h = yp1Var;
            ug2Var.f31851b = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = ug2Var;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m3247f(nt2 nt2Var, si2 si2Var, e73 e73Var, InterfaceC1188tn interfaceC1188tn, C0816jz c0816jz, yp1 yp1Var, mi0 mi0Var, int i) {
        e73 e73Var2;
        C0816jz c0816jz2;
        int i2;
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-628563084);
        int i3 = i | 24720 | (ir1Var.m6894i(yp1Var) ? 131072 : 65536);
        byte b = 0;
        byte b2 = 1;
        if (ir1Var.m6871T(i3 & 1, (74899 & i3) != 74898)) {
            ir1Var.m6876Y();
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                si2Var = ui2.m11560a(ir1Var);
                e73 e73Var3 = (e73) ir1Var.m6898k(ra1.f29113a);
                c0816jz2 = ig1.f21387k;
                e73Var2 = e73Var3;
                i2 = i3 & (-1009);
            } else {
                ir1Var.m6874W();
                i2 = i3 & (-1009);
                e73Var2 = e73Var;
                c0816jz2 = c0816jz;
            }
            si2 si2Var2 = si2Var;
            ir1Var.m6913s();
            gr1 gr1VarM4685N = dt0.m4685N(ir1Var);
            boolean zM6894i = ((i2 & 458752) == 131072) | ir1Var.m6894i(gr1VarM4685N);
            Object objM6869O = ir1Var.m6869O();
            if (zM6894i || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                tg2 tg2Var = new tg2(b);
                tg2Var.f31142b = yp1Var;
                tg2Var.f31143c = gr1VarM4685N;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(tg2Var);
                obj = tg2Var;
            }
            obj = objM6869O;
            sj3.m10809e(nt2Var, si2Var2, e73Var2, interfaceC1188tn, c0816jz2, null, false, null, (yp1) obj, ir1Var, 221190);
            si2Var = si2Var2;
        } else {
            ir1Var.m6874W();
            e73Var2 = e73Var;
            c0816jz2 = c0816jz;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C1373ym c1373ym = new C1373ym(b2);
            c1373ym.f35321b = nt2Var;
            c1373ym.f35322c = si2Var;
            c1373ym.f35323d = e73Var2;
            c1373ym.f35324e = interfaceC1188tn;
            c1373ym.f35325f = c0816jz2;
            c1373ym.f35326g = yp1Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c1373ym;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m3248g(lk2 lk2Var, yp1 yp1Var, wp1 wp1Var, mi0 mi0Var, int i) {
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1868327245);
        int i2 = i | (ir1Var.m6890g(lk2Var) ? 4 : 2) | (ir1Var.m6894i(yp1Var) ? 32 : 16) | (ir1Var.m6894i(wp1Var) ? 256 : 128);
        byte b = 0;
        byte b2 = 1;
        if (ir1Var.m6871T(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objM6869O = ir1Var.m6869O();
            if (z || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                C1164t c1164t = new C1164t(b2);
                c1164t.f30700c = lk2Var;
                c1164t.f30699b = yp1Var;
                c1164t.f30701d = wp1Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c1164t);
                obj = c1164t;
            }
            obj = objM6869O;
            lb5.m7923d(lk2Var, (yp1) obj, ir1Var);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0712h4 c0712h4 = new C0712h4(b);
            c0712h4.f20357b = lk2Var;
            c0712h4.f20358c = yp1Var;
            c0712h4.f20359d = wp1Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0712h4;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final ow4 m3249h(g42 g42Var, String str) {
        p42 p42VarM3240S = m3240S(g42Var);
        ow4 ow4Var = new ow4();
        ow4Var.f27178a = str;
        ow4Var.f27179b = k43.m7398w(p42VarM3240S);
        VarHandle.storeStoreFence();
        return ow4Var;
    }

    /* JADX INFO: renamed from: i */
    public static int m3250i(List list, int i) {
        return (list.hashCode() + i) * 31;
    }

    /* JADX INFO: renamed from: j */
    public static C0176jd m3251j(wa2 wa2Var) {
        jd3 jd3Var;
        su1 su1Var = su1.f11748a;
        try {
            gb5 gb5Var = EnumC0218ld.f6781b;
            int iMo3526e = wa2Var.m12186z("type_num").mo3526e();
            gb5Var.getClass();
            EnumC0218ld enumC0218ldM5955h = gb5.m5955h(iMo3526e);
            long jMo3530q = wa2Var.m12186z("value").mo3530q();
            int iMo3526e2 = wa2Var.m12186z("precision_num").mo3526e();
            if (iMo3526e2 == 1) {
                jd3Var = jd3.f22180b;
            } else if (iMo3526e2 != 2) {
                jd3Var = iMo3526e2 != 3 ? jd3.f22179a : jd3.f22182d;
            } else {
                jd3Var = jd3.f22181c;
            }
            return new C0176jd(enumC0218ldM5955h, jMo3530q, jd3Var, wa2Var.m12186z("currency").mo3532s());
        } catch (Exception e) {
            ArrayList arrayList = i20.m6589n(e).f5884s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList.add(message);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final long m3252k(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : sc6.m10676q(j + j2, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    /* JADX INFO: renamed from: l */
    public static final nt2 m3253l(sg2 sg2Var, mi0 mi0Var) {
        nc4 nc4Var = pq2.f27894b;
        db4 db4VarMo7286c = ((lq2) ((ir1) mi0Var).m6898k(nc4Var)).f24280d.mo7286c();
        db4 db4VarMo7289f = ((lq2) ((ir1) mi0Var).m6898k(nc4Var)).f24280d.mo7289f();
        db4 db4VarMo7288e = ((lq2) ((ir1) mi0Var).m6898k(nc4Var)).f24280d.mo7288e();
        sg2Var.getClass();
        wg2 wg2Var = new wg2();
        wg2Var.f33365a = db4VarMo7286c;
        wg2Var.f33366b = db4VarMo7289f;
        wg2Var.f33367c = db4VarMo7288e;
        VarHandle.storeStoreFence();
        return wg2Var;
    }

    /* JADX INFO: renamed from: m */
    public static float m3254m(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    /* JADX INFO: renamed from: n */
    public static Collection m3255n(Object obj) {
        if ((obj instanceof cc2) && !(obj instanceof dc2)) {
            m3236O(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            z62.m13362U(as4.class.getName(), e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: o */
    public static Map m3256o(Object obj) {
        if ((obj instanceof cc2) && !(obj instanceof fc2)) {
            m3236O(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            z62.m13362U(as4.class.getName(), e);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0095  */
    /* JADX INFO: renamed from: p */
    public static C0176jd m3257p(wa2 wa2Var) {
        long jMo3530q;
        EnumC0218ld enumC0218ld;
        jd3 jd3Var;
        String strM2258a = su1.m2258a(wa2Var, "type", "");
        String strM2258a2 = su1.m2258a(wa2Var, "precision", "");
        String strM2258a3 = su1.m2258a(wa2Var, "currency", "");
        try {
            jMo3530q = wa2Var.m12186z("value").mo3530q();
        } catch (Exception unused) {
            jMo3530q = 0;
        }
        int iHashCode = strM2258a.hashCode();
        if (iHashCode != 66934) {
            if (iHashCode != 66944) {
                if (iHashCode == 1349395245 && strM2258a.equals("ONE_PIXEL")) {
                    jMo3530q /= 1000;
                    enumC0218ld = EnumC0218ld.f6786g;
                } else {
                    enumC0218ld = EnumC0218ld.f6783d;
                }
            } else if (strM2258a.equals("CPM")) {
                enumC0218ld = EnumC0218ld.f6784e;
            } else {
                enumC0218ld = EnumC0218ld.f6783d;
            }
        } else if (strM2258a.equals("CPC")) {
            enumC0218ld = EnumC0218ld.f6785f;
        } else {
            enumC0218ld = EnumC0218ld.f6783d;
        }
        EnumC0218ld enumC0218ld2 = enumC0218ld;
        long j = jMo3530q;
        int iHashCode2 = strM2258a2.hashCode();
        if (iHashCode2 != -2131980260) {
            if (iHashCode2 != 399232571) {
                if (iHashCode2 == 1271254246 && strM2258a2.equals("PUBLISHER_PROVIDED")) {
                    jd3Var = jd3.f22181c;
                } else {
                    jd3Var = jd3.f22179a;
                }
            } else if (strM2258a2.equals("PRECISE")) {
                jd3Var = jd3.f22182d;
            } else {
                jd3Var = jd3.f22179a;
            }
        } else if (strM2258a2.equals("ESTIMATED")) {
            jd3Var = jd3.f22180b;
        } else {
            jd3Var = jd3.f22179a;
        }
        return new C0176jd(enumC0218ld2, j, jd3Var, strM2258a3);
    }

    /* JADX INFO: renamed from: q */
    public static final nt2 m3258q(nt2 nt2Var, long j, p44 p44Var) {
        C0813jw c0813jw = new C0813jw();
        c0813jw.f22696a = j;
        c0813jw.f22697b = 1.0f;
        c0813jw.f22698c = p44Var;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(c0813jw);
    }

    /* JADX INFO: renamed from: r */
    public static void m3259r(int i, Object obj) {
        if (obj == null || m3228G(i, obj)) {
            return;
        }
        m3236O(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    /* JADX INFO: renamed from: s */
    public static si1 m3260s(si1 si1Var, int i) {
        y30 y30Var = y30.f34832a;
        if (i < 0 && i != -2 && i != -1) {
            C1077qn.m9988n(c75.m3877i(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i == -1) {
            y30Var = y30.f34833b;
            i = 0;
        }
        boolean z = si1Var instanceof yq1;
        r71 r71Var = r71.f29063a;
        return z ? ((yq1) si1Var).mo193a(r71Var, i, y30Var) : new h80(i, y30Var, r71Var, si1Var);
    }

    /* JADX INFO: renamed from: t */
    public static final int m3261t(float f) {
        return Math.round((float) Math.ceil(f));
    }

    /* JADX INFO: renamed from: u */
    public static kj0 m3262u(wp1 wp1Var) {
        ia5 ia5Var = ia5.f21230u;
        kj0 kj0Var = new kj0(wp1Var, (byte) 1);
        kj0Var.f23162c = ia5Var;
        VarHandle.storeStoreFence();
        return kj0Var;
    }

    /* JADX INFO: renamed from: v */
    public static final kj0 m3263v(yp1 yp1Var) {
        kj0 kj0Var = new kj0(new fj0((byte) 1), (byte) 0);
        kj0Var.f23162c = new lj0(yp1Var);
        VarHandle.storeStoreFence();
        return kj0Var;
    }

    /* JADX INFO: renamed from: w */
    public static final int m3264w(float f, float f2, float f3, int i, int i2) {
        if (i == i2) {
            return -1;
        }
        int i3 = i - 2;
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = i - 1;
        return qq2.m10010E((f3 * (i4 <= 1 ? i4 : 1)) + (f2 * i3) + f);
    }

    /* JADX INFO: renamed from: x */
    public static final long m3265x(long j) {
        long j2 = (j << 1) + 1;
        i41.f21117b.getClass();
        int i = k41.f22856a;
        return j2;
    }

    /* JADX INFO: renamed from: y */
    public static final long m3266y(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? m3265x(sc6.m10676q(j, -4611686018427387903L, 4611686018427387903L)) : m3267z(j * 1000000);
    }

    /* JADX INFO: renamed from: z */
    public static final long m3267z(long j) {
        r50 r50Var = i41.f21117b;
        long j2 = j << 1;
        int i = k41.f22856a;
        return j2;
    }
}
