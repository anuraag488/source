package p000;

import ads_mobile_sdk.C0198ke;
import ads_mobile_sdk.C0388we;
import java.lang.invoke.VarHandle;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mj5 {
    /* JADX INFO: renamed from: a */
    public static void m8334a(LinkedHashMap linkedHashMap, String str, C1245v6 c1245v6, C0388we c0388we, long j) {
        r50 r50Var = i41.f21117b;
        long jM3239R = as4.m3239R(j, m41.MILLISECONDS);
        C0198ke c0198ke = new C0198ke();
        c0198ke.f6182a = c0388we;
        c0198ke.f6183b = c1245v6;
        c0198ke.f6184c = jM3239R;
        VarHandle.storeStoreFence();
        linkedHashMap.put(str, c0198ke);
    }
}
