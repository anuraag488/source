package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wn1 implements InterfaceC1355y4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f33514a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ eo1 f33515b;

    public /* synthetic */ wn1(byte b) {
        this.f33514a = b;
    }

    @Override // p000.InterfaceC1355y4
    /* JADX INFO: renamed from: b */
    public final void mo7271b(Object obj) {
        switch (this.f33514a) {
            case 0:
                Map map = (Map) obj;
                eo1 eo1Var = this.f33515b;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                ao1 ao1Var = (ao1) eo1Var.f18293F.pollFirst();
                if (ao1Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = ao1Var.f14741a;
                    if (eo1Var.f18306c.m12114A(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    }
                }
                break;
            default:
                C1318x4 c1318x4 = (C1318x4) obj;
                eo1 eo1Var2 = this.f33515b;
                ao1 ao1Var2 = (ao1) eo1Var2.f18293F.pollFirst();
                if (ao1Var2 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    String str2 = ao1Var2.f14741a;
                    int i2 = ao1Var2.f14742b;
                    pn1 pn1VarM12114A = eo1Var2.f18306c.m12114A(str2);
                    if (pn1VarM12114A == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str2);
                    } else {
                        pn1VarM12114A.m9584l(i2, c1318x4.f33968a, c1318x4.f33969b);
                    }
                }
                break;
        }
    }
}
