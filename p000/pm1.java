package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class pm1 {

    /* JADX INFO: renamed from: a */
    public static final bp2 f27743a = new bp2(16);

    /* JADX INFO: renamed from: b */
    public static final ThreadPoolExecutor f27744b;

    /* JADX INFO: renamed from: c */
    public static final Object f27745c;

    /* JADX INFO: renamed from: d */
    public static final x64 f27746d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new io3((byte) 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f27744b = threadPoolExecutor;
        f27745c = new Object();
        f27746d = new x64(0);
    }

    /* JADX INFO: renamed from: a */
    public static String m9569a(List list, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((lm1) list.get(i2)).f24158g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static om1 m9570b(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceM4675a;
        bp2 bp2Var = f27743a;
        Trace.beginSection("getFontSync");
        try {
            Typeface typeface = (Typeface) bp2Var.m3648c(str);
            if (typeface != null) {
                om1 om1Var = new om1(typeface);
                Trace.endSection();
                return om1Var;
            }
            try {
                li0 li0VarM7558a = km1.m7558a(context, list);
                List list2 = (List) li0VarM7558a.f24044c;
                boolean z = li0VarM7558a.f24043b;
                if (!z) {
                    zm1[] zm1VarArr = (zm1[]) list2.get(0);
                    if (zm1VarArr == null || zm1VarArr.length == 0) {
                        i2 = 1;
                    } else {
                        int length = zm1VarArr.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i4 = zm1VarArr[i3].f36181f;
                            if (i4 != 0) {
                                if (i4 >= 0) {
                                    i2 = i4;
                                    break;
                                }
                                i2 = -3;
                                break;
                            }
                            i3++;
                        }
                    }
                } else {
                    if (!z) {
                        i2 = -3;
                        break;
                    }
                    i2 = -2;
                }
                if (i2 != 0) {
                    om1 om1Var2 = new om1(i2);
                    Trace.endSection();
                    return om1Var2;
                }
                if (list2.size() > 1) {
                    i50 i50Var = ds4.f17333a;
                    Trace.beginSection("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typefaceM4675a = ds4.f17333a.m6672g(context, list2, i);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    typefaceM4675a = ds4.m4675a(context, (zm1[]) list2.get(0), i);
                }
                if (typefaceM4675a == null) {
                    om1 om1Var3 = new om1(-3);
                    Trace.endSection();
                    return om1Var3;
                }
                bp2Var.m3649d(str, typefaceM4675a);
                om1 om1Var4 = new om1(typefaceM4675a);
                Trace.endSection();
                return om1Var4;
            } catch (PackageManager.NameNotFoundException unused) {
                om1 om1Var5 = new om1(-1);
                Trace.endSection();
                return om1Var5;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }
}
