package p000;

import internal.p002J.AbstractC0768N;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wd0 {

    /* JADX INFO: renamed from: d */
    public static final wd0 f33253d = new wd0();

    /* JADX INFO: renamed from: a */
    public HashMap f33254a;

    /* JADX INFO: renamed from: b */
    public ArrayList f33255b;

    /* JADX INFO: renamed from: c */
    public volatile int f33256c;

    /* JADX INFO: renamed from: b */
    public static void m12223b(String[] strArr) {
        wd0 wd0Var = f33253d;
        synchronized (wd0Var) {
            wd0Var.f33255b = new ArrayList();
            wd0Var.f33254a = new HashMap();
            wd0Var.f33256c = 1;
            String str = strArr[0];
            ArrayList arrayList = wd0Var.f33255b;
            if (str == null) {
                arrayList.add("");
                return;
            }
            arrayList.add(str);
            char c = 1;
            boolean z = true;
            char c2 = 0;
            while (c2 <= 0) {
                String str2 = strArr[0];
                if (c <= 0) {
                    z &= !str2.equals("--");
                    if (z && str2.startsWith("--")) {
                        String[] strArrSplit = str2.split("=", 2);
                        wd0Var.m12224a(strArrSplit[0].substring(2), strArrSplit.length > 1 ? strArrSplit[1] : null);
                    } else {
                        wd0Var.f33255b.add(str2);
                    }
                }
                c2 = 1;
                c = 0;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m12224a(String str, String str2) {
        try {
            HashMap map = this.f33254a;
            if (str2 == null) {
                str2 = "";
            }
            if (map == null) {
                AbstractC0768N.MUoYiNbY(str, str2);
                return;
            }
            map.put(str, str2);
            boolean zIsEmpty = str2.isEmpty();
            String strConcat = "--".concat(str);
            if (!zIsEmpty) {
                strConcat = strConcat + '=' + str2;
            }
            ArrayList arrayList = this.f33255b;
            int i = this.f33256c;
            this.f33256c = i + 1;
            arrayList.add(i, strConcat);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m12225c() {
        if (f33253d.f33255b == null) {
            return;
        }
        AbstractC0768N.MDkrKi31(this.f33255b);
        this.f33255b = null;
        this.f33254a = null;
        rw5.m10481c("CommandLine", "Switched to native command-line", new Object[0]);
    }
}
