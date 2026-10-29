package p000;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import essentials.app.EsApp;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class oa1 implements ComponentCallbacks {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ sw2 f26496a;

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        sw2 sw2Var = this.f26496a;
        Configuration configuration2 = new Configuration(configuration);
        int i = EsApp.f18450c;
        sw2Var.setValue(configuration2);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
