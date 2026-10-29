package p000;

import android.os.Trace;
import java.lang.invoke.VarHandle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yn5 {

    /* JADX INFO: renamed from: a */
    public HashMap f35372a;

    /* JADX INFO: renamed from: a */
    public static yn5 m13184a(jn5 jn5Var, String str, boolean z) {
        String str2;
        ry5.m10503a("Cronet ResolvedFlags#resolve");
        try {
            int[] iArrM13185b = m13185b("155.0.8059.16");
            HashMap map = new HashMap();
            for (Map.Entry entry : jn5Var.m7192l().entrySet()) {
                try {
                    Iterator it = ((or6) entry.getValue()).m9245l().iterator();
                    while (true) {
                        tn5 tn5Var = null;
                        if (it.hasNext()) {
                            er6 er6Var = (er6) it.next();
                            if (z || er6Var.m5314r()) {
                                if (er6Var.m5316t()) {
                                    String strM5310n = er6Var.m5310n();
                                    if (strM5310n.equals(str) || (strM5310n.endsWith(".") && str.startsWith(strM5310n))) {
                                    }
                                }
                                if (er6Var.m5317u()) {
                                    int[] iArrM13185b2 = m13185b(er6Var.m5311o());
                                    int i = 0;
                                    while (true) {
                                        int length = iArrM13185b.length;
                                        int length2 = iArrM13185b2.length;
                                        if (i < Math.max(length, length2)) {
                                            int i2 = i < length ? iArrM13185b[i] : 0;
                                            int i3 = i < length2 ? iArrM13185b2[i] : 0;
                                            if (i2 <= i3) {
                                                if (i2 >= i3) {
                                                    i++;
                                                }
                                            }
                                        }
                                    }
                                }
                                int iM5318v = er6Var.m5318v();
                                int i4 = iM5318v - 1;
                                if (iM5318v == 0) {
                                    throw null;
                                }
                                if (i4 == 0) {
                                    boolean zM5315s = er6Var.m5315s();
                                    tn5Var = new tn5();
                                    tn5Var.f31275a = Boolean.valueOf(zM5315s);
                                    VarHandle.storeStoreFence();
                                } else if (i4 == 1) {
                                    long jM5309m = er6Var.m5309m();
                                    tn5Var = new tn5();
                                    tn5Var.f31275a = Long.valueOf(jM5309m);
                                    VarHandle.storeStoreFence();
                                } else if (i4 == 2) {
                                    float fM5308l = er6Var.m5308l();
                                    tn5Var = new tn5();
                                    tn5Var.f31275a = Float.valueOf(fM5308l);
                                    VarHandle.storeStoreFence();
                                } else if (i4 == 3) {
                                    tn5Var = new tn5(er6Var.m5312p());
                                } else if (i4 == 4) {
                                    tn5Var = new tn5(er6Var.m5313q());
                                } else if (i4 != 5) {
                                    if (iM5318v == 1) {
                                        str2 = "BOOL_VALUE";
                                    } else if (iM5318v == 2) {
                                        str2 = "INT_VALUE";
                                    } else if (iM5318v == 3) {
                                        str2 = "FLOAT_VALUE";
                                    } else if (iM5318v != 4) {
                                        str2 = iM5318v != 5 ? "VALUE_NOT_SET" : "BYTES_VALUE";
                                    } else {
                                        str2 = "STRING_VALUE";
                                    }
                                    throw new IllegalArgumentException("Flag value uses unknown value type ".concat(str2));
                                }
                            }
                        }
                        if (tn5Var != null) {
                            map.put((String) entry.getKey(), tn5Var);
                        }
                    }
                } catch (RuntimeException e) {
                    throw new IllegalArgumentException("Unable to resolve HTTP flag `" + ((String) entry.getKey()) + '`', e);
                }
            }
            yn5 yn5Var = new yn5();
            yn5Var.f35372a = map;
            VarHandle.storeStoreFence();
            Trace.endSection();
            return yn5Var;
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int[] m13185b(String str) {
        try {
            if (str.isEmpty()) {
                throw new IllegalArgumentException("Version string is empty");
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            int iCountTokens = stringTokenizer.countTokens();
            int[] iArr = new int[iCountTokens];
            for (int i = 0; i < iCountTokens; i++) {
                iArr[i] = Integer.parseInt(stringTokenizer.nextToken());
            }
            return iArr;
        } catch (RuntimeException e) {
            throw new IllegalArgumentException(zi4.m13617q('`', "Unable to parse HTTP flags version string: `", str), e);
        }
    }
}
