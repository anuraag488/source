package p000;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class e34 {

    /* JADX INFO: renamed from: a */
    public static final e34 f17665a = new e34();

    /* JADX INFO: renamed from: b */
    public static final w42 f17666b;

    static {
        w92 w92Var = new w92();
        w92Var.m12169b(d34.class, C0465as.f14837a);
        w92Var.m12169b(i34.class, C0502bs.f15531a);
        w92Var.m12169b(ft0.class, C1378yr.f35471a);
        w92Var.m12169b(C0533cn.class, C1341xr.f34552a);
        w92Var.m12169b(C1213ub.class, C1304wr.f33646a);
        w92Var.m12169b(dg3.class, C1415zr.f36270a);
        w92Var.f33177d = true;
        f17666b = w92Var.m12168a();
    }

    /* JADX INFO: renamed from: a */
    public static C0533cn m4915a(hg1 hg1Var) {
        Object obj;
        String processName;
        hg1Var.m6388a();
        Context context = hg1Var.f20545a;
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = String.valueOf(packageInfo.getLongVersionCode());
        hg1Var.m6388a();
        String str = hg1Var.f20547c.f31843b;
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        String str4 = packageInfo.versionName;
        if (str4 == null) {
            str4 = strValueOf;
        }
        String str5 = Build.MANUFACTURER;
        hg1Var.m6388a();
        int iMyPid = Process.myPid();
        ArrayList arrayListM3223B = as4.m3223B(context);
        int size = arrayListM3223B.size();
        int i = 0;
        do {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayListM3223B.get(i);
            i++;
        } while (((dg3) obj).f17038b != iMyPid);
        dg3 dg3Var = (dg3) obj;
        if (dg3Var == null) {
            if (Build.VERSION.SDK_INT > 33) {
                processName = Process.myProcessName();
            } else {
                processName = Application.getProcessName();
                if (processName == null && (processName = C0638f5.m5551v()) == null) {
                    processName = "";
                }
            }
            dg3Var = new dg3(processName, iMyPid, 0, false);
        }
        hg1Var.m6388a();
        ArrayList arrayListM3223B2 = as4.m3223B(context);
        C1213ub c1213ub = new C1213ub();
        c1213ub.f31762a = packageName;
        c1213ub.f31763b = str4;
        c1213ub.f31764c = strValueOf;
        c1213ub.f31765d = dg3Var;
        c1213ub.f31766e = arrayListM3223B2;
        VarHandle.storeStoreFence();
        C0533cn c0533cn = new C0533cn();
        c0533cn.f16131a = str;
        c0533cn.f16132b = c1213ub;
        VarHandle.storeStoreFence();
        return c0533cn;
    }
}
