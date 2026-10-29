package p000;

import ads_mobile_sdk.C0079d3;
import ads_mobile_sdk.sy3;
import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class of5 extends AbstractC1350y implements ah5 {
    @Override // p000.ah5
    /* JADX INFO: renamed from: a */
    public final Object mo612a(Bundle bundle, wm0 wm0Var) {
        for (Map.Entry entry : ((Map) this.f34753b).entrySet()) {
            Bundle bundle2 = bundle;
            sy3.m2303a((zo0) this.f34752a, (t82) null, new C0079d3((String) entry.getKey(), (ua5) entry.getValue(), (wm0) null, (Object) bundle2, (byte) 20), 3);
            bundle = bundle2;
        }
        return ju4.f22634a;
    }
}
