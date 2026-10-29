package p000;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fg6 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ mg6 f18970a;

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        mg6 mg6Var = this.f18970a;
        oa6 oa6Var = (oa6) mg6Var.f36084a;
        op5 op5Var = oa6Var.f26512d;
        d76 d76Var = oa6Var.f26514f;
        if (!op5Var.m9225E(null, e56.f17768Z0)) {
            if (Objects.equals(str, "IABTCF_TCString")) {
                oa6.m9016l(d76Var);
                d76Var.f16831L.m12504a("IABTCF_TCString change picked up in listener.");
                nd6 nd6Var = mg6Var.f24896T;
                y42.m12854a0(nd6Var);
                nd6Var.m6923b(500L);
                return;
            }
            return;
        }
        if (Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            oa6.m9016l(d76Var);
            d76Var.f16831L.m12504a("IABTCF_TCString change picked up in listener.");
            nd6 nd6Var2 = mg6Var.f24896T;
            y42.m12854a0(nd6Var2);
            nd6Var2.m6923b(500L);
        }
    }
}
