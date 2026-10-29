package com.google.android.libraries.ads.mobile.sdk.internal.offline;

import ads_mobile_sdk.C0170j0;
import ads_mobile_sdk.C0171j1;
import ads_mobile_sdk.C0248n7;
import ads_mobile_sdk.C0372v4;
import ads_mobile_sdk.ak1;
import ads_mobile_sdk.ap0;
import ads_mobile_sdk.g80;
import ads_mobile_sdk.kc1;
import ads_mobile_sdk.n00;
import ads_mobile_sdk.pe2;
import ads_mobile_sdk.re2;
import ads_mobile_sdk.sg0;
import ads_mobile_sdk.xe2;
import ads_mobile_sdk.z01;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.lang.invoke.VarHandle;
import p000.C1160sw;
import p000.am2;
import p000.as4;
import p000.bm2;
import p000.cm2;
import p000.i20;
import p000.i41;
import p000.l32;
import p000.lb5;
import p000.m41;
import p000.r50;
import p000.ub1;
import p000.um0;
import p000.wm0;
import p000.x45;
import p000.zp0;
import p000.zs0;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class OfflinePingSender extends Worker {
    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    /* JADX INFO: renamed from: a */
    public final cm2 mo3057a() {
        byte b = 16;
        wm0 wm0Var = null;
        try {
            x45.f33989a.getClass();
            pe2 pe2Var = (pe2) ((sg0) z01.m2787a()).f11286D1.get();
            pe2Var.getClass();
            lb5.m7910S(pe2Var.f8558a, null, null, new C1160sw(pe2Var, new C0248n7(pe2Var, wm0Var, b), (wm0) null), 3);
        } catch (Exception unused) {
            Object obj = this.f14681b.f14684a.f36339a.get("OFFLINE_DATABASE_VERSION");
            int iIntValue = ((Number) (obj instanceof Integer ? obj : 1)).intValue();
            Object obj2 = this.f14681b.f14684a.f36339a.get("HTTP_CLIENT_TIMEOUT");
            long jLongValue = ((Number) (obj2 instanceof Long ? obj2 : 20L)).longValue();
            Object obj3 = this.f14681b.f14684a.f36339a.get("USER_AGENT");
            String str = obj3 instanceof String ? (String) obj3 : null;
            if (str == null) {
                return new am2();
            }
            l32 l32VarM7824a = new l32("offline-ping-sender").m7824a();
            kc1 kc1Var = new kc1();
            kc1Var.f6158a = l32VarM7824a;
            n00 n00Var = new n00(kc1Var);
            um0 um0VarM13670b = zp0.m13670b(new ub1(n00Var.f7458d));
            xe2 xe2Var = new xe2();
            xe2Var.f13287a = str;
            VarHandle.storeStoreFence();
            r50 r50Var = i41.f21117b;
            as4.m3239R(jLongValue, m41.MILLISECONDS);
            Context context = this.f14680a;
            new ub1(n00Var.f7458d);
            g80 g80Var = new g80(um0VarM13670b, null, n00Var, xe2Var, context, null, null, null);
            re2 re2Var = new re2();
            re2Var.f10674a = g80Var;
            VarHandle.storeStoreFence();
            Context context2 = this.f14680a;
            Integer numValueOf = Integer.valueOf(iIntValue);
            Long lValueOf = Long.valueOf(jLongValue);
            ak1 ak1VarM286a = ak1.m286a(context2);
            ak1 ak1VarM286a2 = ak1.m286a(um0VarM13670b);
            ak1 ak1VarM286a3 = ak1.m286a(numValueOf);
            pe2 pe2Var2 = (pe2) new ap0(new C0170j0(ak1VarM286a, ak1VarM286a2, ak1VarM286a3, new ap0(i20.f21058l), new ap0(new C0171j1(ak1VarM286a, ak1VarM286a3, ak1.m286a(lValueOf), ak1.m286a(xe2Var), (byte) 1)), new ap0(new C0372v4(ak1VarM286a2, ak1.m286a(re2Var), (byte) 4)))).get();
            pe2Var2.getClass();
            lb5.m7910S(pe2Var2.f8558a, null, null, new C1160sw(pe2Var2, new C0248n7(pe2Var2, wm0Var, b), (wm0) null), 3);
        }
        zs0 zs0Var = zs0.f36338b;
        bm2 bm2Var = new bm2();
        bm2Var.f15412a = zs0Var;
        VarHandle.storeStoreFence();
        return bm2Var;
    }
}
