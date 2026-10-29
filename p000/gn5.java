package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gn5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f19982a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ wp5 f19983b;

    public /* synthetic */ gn5(byte b) {
        this.f19982a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        byte b = this.f19982a;
        wp5 wp5Var = this.f19983b;
        switch (b) {
            case 0:
                for (String str : wp5Var.f33585c.keySet()) {
                    Context context = wp5Var.f33583a;
                    synchronized (zt5.class) {
                        SharedPreferences sharedPreferences = context.getSharedPreferences("hsdp_report_cache", 0);
                        HashSet hashSet = new HashSet(sharedPreferences.getStringSet("pending_reports", new HashSet()));
                        hashSet.add(str + ":4:5");
                        sharedPreferences.edit().putStringSet("pending_reports", hashSet).apply();
                        break;
                    }
                }
                return;
            case 1:
                Context context2 = wp5Var.f33583a;
                synchronized (zt5.class) {
                    Set<String> stringSet = context2.getSharedPreferences("hsdp_report_cache", 0).getStringSet("pending_reports", new HashSet());
                    arrayList = new ArrayList();
                    Iterator<String> it = stringSet.iterator();
                    while (it.hasNext()) {
                        String[] strArrSplit = it.next().split(":", -1);
                        yx1 yx1Var = null;
                        if (strArrSplit.length == 3) {
                            try {
                                String str2 = strArrSplit[0];
                                int i = Integer.parseInt(strArrSplit[1]);
                                int i2 = Integer.parseInt(strArrSplit[2]);
                                yx1 yx1Var2 = new yx1();
                                Objects.requireNonNull(str2, "targetPackage cannot be null");
                                yx1Var2.f35581a = str2;
                                yx1Var2.f35582b = i;
                                yx1Var2.f35583c = i2;
                                VarHandle.storeStoreFence();
                                yx1Var = yx1Var2;
                            } catch (NumberFormatException unused) {
                            }
                        }
                        if (yx1Var != null) {
                            arrayList.add(yx1Var);
                        }
                        break;
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                Log.i("HsdpClientImpl", "Reporting " + arrayList.size() + " cached binding failures.");
                cw5 cw5Var = wp5Var.f33584b;
                oz5 oz5Var = new oz5((byte) 29);
                oz5Var.f27249b = wp5Var;
                oz5Var.f27250c = arrayList;
                VarHandle.storeStoreFence();
                cw5Var.m4222f(oz5Var);
                return;
            default:
                Iterator it2 = wp5Var.f33585c.values().iterator();
                while (it2.hasNext()) {
                    ((vt5) it2.next()).m11988a(4);
                    it2.remove();
                }
                Log.d("HsdpClientImpl", "HSDP overlays: empty");
                return;
        }
    }
}
