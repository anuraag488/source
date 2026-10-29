package p000;

import ads_mobile_sdk.C0152hw;
import ads_mobile_sdk.C0414y8;
import ads_mobile_sdk.ga1;
import ads_mobile_sdk.nh1;
import ads_mobile_sdk.pt0;
import ads_mobile_sdk.yc2;
import ads_mobile_sdk.yn1;
import java.net.URL;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public interface g75 {
    /* JADX INFO: renamed from: a */
    static /* synthetic */ Object m5909a(g75 g75Var, URL url, Map map, ym0 ym0Var, int i) {
        if ((i & 4) != 0) {
            map = null;
        }
        return g75Var.mo1029a(url, map, (i & 16) != 0, ym0Var);
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ Object m5910b(g75 g75Var, ga1 ga1Var, i41 i41Var, ym0 ym0Var, int i) {
        if ((i & 2) != 0) {
            i41Var = null;
        }
        return g75Var.mo1022a(ga1Var, i41Var, null, (i & 8) == 0, (i & 16) != 0, ym0Var);
    }

    /* JADX INFO: renamed from: a */
    Object mo1020a(int i, long j, C0414y8 c0414y8);

    /* JADX INFO: renamed from: a */
    Object mo1021a(ga1 ga1Var, i41 i41Var, yc2 yc2Var);

    /* JADX INFO: renamed from: a */
    Object mo1022a(ga1 ga1Var, i41 i41Var, Map map, boolean z, boolean z2, ym0 ym0Var);

    /* JADX INFO: renamed from: a */
    Object mo1025a(yn1 yn1Var);

    /* JADX INFO: renamed from: a */
    Object mo1026a(String str, Map map, wm0 wm0Var);

    /* JADX INFO: renamed from: a */
    Object mo1028a(URL url, pt0 pt0Var, wm0 wm0Var);

    /* JADX INFO: renamed from: a */
    Object mo1029a(URL url, Map map, boolean z, ym0 ym0Var);

    /* JADX INFO: renamed from: a */
    Object mo1030a(URL url, wm0 wm0Var);

    /* JADX INFO: renamed from: a */
    void mo1032a(C0152hw c0152hw);

    /* JADX INFO: renamed from: a */
    void mo1033a(nh1 nh1Var);
}
